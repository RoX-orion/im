package com.im;

import com.im.lib.tl.ArgsConfig;
import com.im.lib.tl.NodeConfig;
import com.im.lib.tl.TLHelpers;
import com.im.utils.StringUtil;
import org.springframework.util.StringUtils;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TLParser {

    public static int count = 0;
    // 存储父类型
    public static Map<String, Boolean> map = new HashMap<>();
    public static Set<String> superClass = new HashSet<>();
    public static Map<String, StringBuilder> np = new HashMap<>();

    public static Map<String, String> position = new HashMap<>();


    public static void main(String[] args) throws IOException {
        boolean flag = true;
        List<NodeConfig> c1 = parseTL("schema.tl");
        List<NodeConfig> c2 = parseTL("api.tl");
        c1.addAll(c2);
        for (NodeConfig nodeConfig : c1) {
            System.out.println(nodeConfig);
        }
        System.out.println("即将生成类型，是否继续？[y/n]:");
        if (flag) {
            return;
        }
        List<NodeConfig> constructors = new LinkedList<>();
        List<NodeConfig> functions = new LinkedList<>();
        for (NodeConfig nodeConfig : c1) {
            if (nodeConfig.getIsFunction()) {
                functions.add(nodeConfig);
            } else {
                constructors.add(nodeConfig);
            }
        }

//        for (NodeConfig constructor : constructors) {
//            System.out.println(constructor);
//        }
        //=======================构建类型==========================
        String path = System.getProperty("user.dir") + "/src/main/java/com/im/api/";
        String header = """
                package com.im.api;

                import lombok.Data;
                import lombok.EqualsAndHashCode;

                import java.math.BigInteger;""";
        String prefix = """
                package com.im.api;

                import lombok.Data;
                import lombok.EqualsAndHashCode;

                import java.math.BigInteger;
                import java.util.HashMap;

                public class Api {
                
                    @Data
                    public static class True {
                        private boolean value = true;
                    }""";
        StringBuilder builder = new StringBuilder(prefix);

        // 将需要构建父类的类型存储起来
        for (NodeConfig constructor : constructors) {
            String result = constructor.getResult();
            map.put(result, false);
            String[] split = result.split("\\.");
            superClass.add(split[split.length - 1]);
        }

        // 构建父类，实现TL语言的多态
        for (NodeConfig constructor : constructors) {
            String r = constructor.getResult();
            String result = constructor.getResult();
            String namespace = constructor.getNamespace();

            // 直接在Api.java中构建
            if (namespace == null) {
                if (!map.get(result) && map.containsKey(result)) {
                    builder.append("\n\t");
                    builder.append("public static class ").append("Type").append(result).append(" {}");
                    position.put("Type" + result, "Api");
                }
            } else {
                if (!map.get(result) && map.containsKey(result)) {
                    String[] split = result.split("\\.");
                    result = split[1];
                    // 已经定义了namespace
                    if (np.containsKey(namespace)) {
                        StringBuilder b = np.get(namespace);
                        b.append("\n\tpublic static class ").append("Type").append(result).append(" {}");
                        np.put(namespace, b);
                    } else {
                        StringBuilder b = new StringBuilder(header + "\n\n" + "public class " + namespace.substring(0, 1).toUpperCase() + namespace.substring(1) + "Api {\n");
                        b.append("\n\tpublic static class ").append("Type").append(result).append(" {}");
                        np.put(namespace, b);
                    }
                    position.put("Type" + result, namespace.substring(0, 1).toUpperCase() + namespace.substring(1));
                }
            }
            map.put(r, true);
        }
        builder.append("\n\n");
        for (NodeConfig constructor : constructors) {
            String namespace = constructor.getNamespace();
            String name = constructor.getName();
            if (name.equals("True")) {
                continue;
            }
            StringBuilder b = np.get(namespace);
            String s = name.substring(0, 1).toUpperCase() + name.substring(1);
            if (namespace == null) {
                b = addClass(builder, constructor);
                position.put(s, "Api");
            } else {
                b = addClass(b, constructor);
                position.put(
                        s,
                        namespace.substring(0, 1).toUpperCase() + namespace.substring(1)
                );
            }
            np.put(namespace, b);
        }
        System.out.println("类型构建完成！");
//        if (flag) {
//            return;
//        }
        //=======================构建方法======================
        System.out.println("开始构建方法！");
        for (NodeConfig function : functions) {
            String namespace = function.getNamespace();
            if (namespace == null) {
                addClass(builder, function);
            } else {
                StringBuilder b = np.get(namespace);
                if (b == null) {
                    b = new StringBuilder(header + "\n\n" + "public class " + namespace.substring(0, 1).toUpperCase() + namespace.substring(1) + "Api {\n");
                    np.put(namespace, b);
                }
                addClass(b, function);
            }
        }

        for (String namespace : np.keySet()) {
            StringBuilder b = np.get(namespace);
            b.append("\n}");
            np.put(namespace, b);
        }

        //========================写入文件====================
        for (String namespace : np.keySet()) {
            if (namespace == null) {
                namespace = "Api";
            }
            File f;
            if (namespace.equals("Api")) {
                f = new File(path + "Api.java");
            } else {
                f = new File(
                        path + namespace.substring(0, 1).toUpperCase()
                                + namespace.substring(1) + "Api.java"
                );
            }

            if (!f.exists()) {
                f.createNewFile();
            }
            StringBuilder b;
            if (namespace.equals("Api")) {
                b = builder;
            } else {
                b = np.get(namespace);
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(f)) {
                fileOutputStream.write(b.toString().getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("方法构建完成！");
        // ===========================构建API控制器=============================
        Scanner input = new Scanner(System.in);
        System.out.println("接下来的操作将会创建控制器，如果你已经对相关文件进行了更改，那么执行此操作将会覆盖掉你的更改，请谨慎操作！\n同意继续请输入[I know the result]，否则将结束执行:");
        String agree = input.nextLine();
        if (!agree.equals("I know the result")) {
            System.out.println("未构建控制器，程序结束...");
            return;
        }
        String controllerPrefix = """
                package com.im.controller;
                                
                import com.im.api.*;
                import com.im.lib.annotation.WebsocketHandler;
                import com.im.lib.annotation.WebsocketHandlerMapping;
                                
                @WebsocketHandler
                public class\040""";
        Map<String, StringBuilder> controller = new HashMap<>();
        StringBuilder apiBuilder = new StringBuilder(controllerPrefix + "ApiController {\n");
        controller.put("Api", apiBuilder);

        for (NodeConfig function : functions) {
            String namespace = function.getNamespace();
            if (namespace == null) {
                apiBuilder = addFunction(apiBuilder, function, "Api");
                controller.put("Api", apiBuilder);
            } else {
                StringBuilder b = controller.get(namespace);
                if (b == null) {
                    b = new StringBuilder(controllerPrefix + namespace.substring(0, 1).toUpperCase() + namespace.substring(1) + "Controller {\n");
                }
                b = addFunction(b, function, namespace);
                controller.put(namespace, b);
            }
        }

        for (String key : controller.keySet()) {
            StringBuilder b = controller.get(key);
            b.append("}");
        }

        String controllerPath = System.getProperty("user.dir") + "/src/main/java/com/im/controller/";
        // ===================将控制器写入文件======================
        for (String key : controller.keySet()) {
            StringBuilder b = controller.get(key);
            File file = new File(controllerPath + key.substring(0, 1).toUpperCase() + key.substring(1) + "Controller.java");
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
                fileOutputStream.write(b.toString().getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (String key : position.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println("控制器构建完成！");
    }

    private static StringBuilder addFunction(StringBuilder b, NodeConfig function, String namespace) {
        b.append("\n\t");
        String arg;
        boolean resultIsVector = false;
        boolean hasNamespace = false;
        Integer constructorId = function.getConstructorId();
        String name = function.getName();
        if (name.contains(".")) {
            String[] split = name.split("\\.");
            name = split[1];
        }
        String result = function.getResult();
        if (result.startsWith("Vector")) {
            resultIsVector = true;
            result = result.substring(7, result.length() - 1);
        }

        if (result.contains(".")) {
            String[] split = result.split("\\.");
//            namespace = split[0];
            result = split[1];
            hasNamespace = true;
        }
        if (!TLHelpers.BASE_TYPE.contains(result)) {
            if (hasNamespace) {
                if (position.containsKey(result)) {
                    result = position.get(result).equals("Api") ?
                            "Api." + result : position.get(result) + "Api." + result;
                } else if (position.containsKey("Type" + result)) {
                    System.out.println(result);
                    result = namespace.substring(0, 1).toUpperCase()
                            + namespace.substring(1)
                            + "Api." + "Type" + result;
                } else {
//                    System.out.println(function);
                }
            } else {
                if (position.containsKey(result)) {
                    result = position.get(result).equals("Api") ?
                            "Api." + result : position.get(result) + "Api." + result;
                } else if(position.containsKey("Type" + result)) {
                    result = position.get("Type" + result).equals("Api") ?
                            "Api.Type" + result : position.get("Type" + result) + ".Type" + result;
                } else if (result.equals("X")) {
                    result = "Object";
                } else {
                    System.out.println(function);
                }
            }

        }

        String prefix = namespace.substring(0, 1).toUpperCase() + namespace.substring(1);
        if (!namespace.equals("Api")) {
            arg = prefix + "Api." + name.substring(0, 1).toUpperCase() + name.substring(1);
        } else {
            arg = prefix + "." + name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        if (resultIsVector) {
            result = result + "[]";
        }
        if ("Bool".equals(result)) {
            result = "Boolean";
        }
        String functionName = name.substring(0, 1).toLowerCase() + name.substring(1);
        String mapping = "0x" + Integer.toHexString(constructorId);
        b.append("@WebsocketHandlerMapping(value = ")
                .append(mapping)
                .append(", name = \"")
                .append(name).append("\")\n\t")// WebsocketRequestMapping
                .append("public ")
                .append(result)// 返回值
                .append(" ")
                .append(functionName)// 方法名
                .append("(")
                .append(arg)// 参数类型
                .append(" ")
                .append(functionName)// 参数
                .append(") {\n\t\t")
                .append("return null;\n\t")
                .append("}\n");
        return b;
    }

    /**
     * 向文件中添加类
     */
    private static StringBuilder addClass(StringBuilder builder, NodeConfig constructor) {
        String[] s1 = constructor.getResult().split("\\.");
        String name = constructor.getName();
        String result = s1[s1.length - 1];
        int constructorId = constructor.getConstructorId();
        // result在类型列表中，需要继承
        if (map.containsKey(result)/* && !result.equals(name)*/) {
            builder.append("\n\n\t@Data\n\t@EqualsAndHashCode(callSuper = true)\n")
                    .append("\t" + "public static class ")
                    .append(name.substring(0, 1).toUpperCase())
                    .append(name.substring(1))
                    .append(" extends ")
                    .append("Api.Type")
                    .append(result).append(" {")
                    .append("\n");
            setArgs(builder, constructor, name);
        } else {
            builder.append("\n\n\t@Data\n")
                    .append("\t" + "public static class ")
                    .append(name.substring(0, 1).toUpperCase())
                    .append(name.substring(1))
                    .append(" {")
                    .append("\n");
            setArgs(builder, constructor, name);
        }

        return builder;
    }

    private static void setArgs(StringBuilder builder, NodeConfig nodeConfig, String name) {
//        Integer constructorId = nodeConfig.getConstructorId();
//        Boolean isFunction = nodeConfig.getIsFunction();
//        long subclassOfId = nodeConfig.getSubclassOfId();
        List<String> argsNames = nodeConfig.getArgsName();
        List<ArgsConfig> argsConfigs = nodeConfig.getArgsConfig();

//        builder.append("private final long constructorId = ").append(constructorId).append("L;\n\t\t");
//        builder.append("private final long subclassOfId = ").append(subclassOfId).append("L;\n\t\t");
//        builder.append("private final Boolean isFunction = ").append(isFunction).append(";\n\n");
        for (int i = 0; i < argsNames.size(); i++) {
            String argsName = argsNames.get(i);
            ArgsConfig argsConfig = argsConfigs.get(i);
            String type = argsConfig.getType();
            if (argsName.equals("flags") || argsName.equals("flags2")) {
                continue;
            }
            boolean vector = argsConfig.isVector();

            if (type != null) {
                if (TLHelpers.AUTH_KEY_TYPES.contains(nodeConfig.getConstructorId()) && "string".equals(type)) {
                    type = "bytes";
                }
                switch (type) {
                    case "string" -> type = "String";
                    case "bytes" -> type = "byte[]";
                    case "Bool", "true", "false" -> type = "Boolean";
                    case "long", "int128", "int256" -> type = "BigInteger";
                    default -> {
                    }
                }
                if (type.contains(".")) {
                    String[] split = type.split("\\.");
                    type = split[0].substring(0, 1).toUpperCase() + split[0].substring(1) + "Api.Type" + split[1].substring(0, 1).toUpperCase() + split[1].substring(1);
                } else if (superClass.contains(type) && !type.equals("True")) {
                    type = "Api.Type" + type;
                } else if ("X".equals(type)) {
                    type = "Object";
                } else if (!TLHelpers.BASE_TYPE.contains(type)) {
                    type = "Api." + type;
                }
            }
            if (vector) {
                type = type + "[]";
            }
            if (TLHelpers.CONFLICTING_FIELD.contains(argsName)) {
                argsName = argsName + TLHelpers.suffix;
            }

            builder.append("\t\tprivate ").append(type).append(" ").append(argsName).append(";\n");
        }
        builder.append("\t").append("}");
    }

    public static List<NodeConfig> parseTL(String fileName) throws IOException {
        List<NodeConfig> nodeConfigs = new LinkedList<>();
        File file = new File(Objects.requireNonNull(TLParser.class.getClassLoader().getResource("tl/" + fileName)).getFile());
        Reader reader;
        reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String text;
        Pattern pattern = Pattern.compile("---(\\w+)---");
        boolean isFunction = false;

        flag:
        while ((text = bufferedReader.readLine()) != null) {
            int i1 = text.indexOf("//");
            if (i1 != -1) {
                text = text.substring(0, i1);
            }
            text = text.trim();
            // 如果是注释直接跳过
            if (!StringUtils.hasLength(text)) {
                continue;
            }
            // 判断程序是否是方法
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                isFunction = matcher.group().equals("---functions---");
                continue flag;
            }
            NodeConfig nodeConfig = fromLine(text, isFunction);
            if (nodeConfig == null || TLHelpers.CORE_TYPES.contains(nodeConfig.getConstructorId())) {
                continue;
            }
            nodeConfigs.add(nodeConfig);
        }

        for (NodeConfig nodeConfig : nodeConfigs) {
            if (TLHelpers.AUTH_KEY_TYPES.contains(nodeConfig.getConstructorId())) {
                List<ArgsConfig> argsConfig = nodeConfig.getArgsConfig();
                for (ArgsConfig config : argsConfig) {
                    if (config.getType().equals("string")) {
                        config.setType("bytes");
                    }
                }
            }
        }

        return nodeConfigs;
    }

    private static NodeConfig fromLine(String text, boolean isFunction) {
        String regex = "(\\{)?(\\w+):([\\w\\d<>#.?!]+)}?";
        Pattern compile = Pattern.compile(regex);
        // 得到所有形参
//        System.out.println("asd:" + findAll(compile, text, list));
        List<String> list = findAll(compile, text);
        /*
         * ([\w.]+)：匹配数字、字母、下划线和点
         * (?:#([\da-fA-F]+))? 匹配# + 十六进制字符串
         * (?:\s\{?\w+:[\w\d<>#.?!]+}?)*
         * \s=\s([\w\d<>#.?]+);$ 匹配n个空格+等号+n个空格+[数字字母下划线+数字+<>+#+小于等于一个.] + ;结尾
         */
        Pattern match = Pattern.compile("([\\w.]+)(?:#([0-9a-fA-F]+))?(?:\\s\\{?\\w+:[\\w\\d<>#.?!]+}?)*\\s=\\s([\\w\\d<>#.?]+);$");
        Matcher m = match.matcher(text);
        NodeConfig currentConfig = new NodeConfig();
        currentConfig.setArgsConfig(new ArrayList<>());
        if (m.find()) {
            currentConfig.setName(m.group(1));
            String constructorId = m.group(2);
            if (constructorId != null) {
                currentConfig.setConstructorId(Integer.parseUnsignedInt(constructorId, 16));
            }
            currentConfig.setSubclassOfId(TLHelpers.crc32(m.group(3)));
            currentConfig.setResult(m.group(3));
            currentConfig.setIsFunction(isFunction);
        } else {
//            System.out.println("unMatch:" + text);
            return null;
        }
        if (currentConfig.getConstructorId() == null) {
            String representation = currentConfig.getName() + " = " + currentConfig.getResult();
            currentConfig.setConstructorId(TLHelpers.crc32(representation));
        }

        String name;
        String argType;
        for (String p : list) {
            if (p.charAt(0) != '{') {
                String[] split = p.split(":");
                name = split[0];
                argType = split[1];
                currentConfig.getArgsName().add(variableSnakeToCamelCase(name));
                currentConfig.getArgsConfig().add(buildArgConfig(name, argType));
            }
        }
//        if (TLHelpers.AUTH_KEY_TYPES.contains(currentConfig.getConstructorId())) {
//            List<ArgsConfig> argsConfig = currentConfig.getArgsConfig();
//            for (ArgsConfig config : argsConfig) {
//                if (config.getType().equals("string")) {
//                    config.setType("bytes");
//                }
//            }
//            currentConfig.setArgsConfig(argsConfig);
//        }
        if (currentConfig.getName().indexOf('.') != -1) {
            String[] split = currentConfig.getName().split("\\.");
            currentConfig.setNamespace(split[0]);
            currentConfig.setName(split[1]);
        }
        currentConfig.setName(snakeToCamelCase(currentConfig.getName()));
        return currentConfig;
    }

    private static String snakeToCamelCase(String name) {
        String[] s = name.split("_");
        StringBuilder builder = new StringBuilder();
        for (String s1 : s) {
            builder.append(s1.substring(0, 1).toUpperCase()).append(s1.substring(1));
        }
        return builder.toString();
    }

    private static List<String> findAll(Pattern regex, String text) {
        List<String> list = new ArrayList<>();
        while (StringUtils.hasLength(text)) {
            Matcher matcher = regex.matcher(text);
            if (matcher.find()) {
                list.add(matcher.group());
                text = text.substring(text.indexOf(matcher.group()) + matcher.group().length());
            } else {
                break;
            }
        }
        return list;
    }

    private static ArgsConfig buildArgConfig(String name, String argType) {
        // Default values

        ArgsConfig currentConfig = new ArgsConfig();
        currentConfig.setArgName(name);
        // The type can be an indicator that other arguments will be flags
        if (!argType.equals("#")) {
            currentConfig.setFlagIndicator(false);
            // Strip the exclamation mark always to have only the name
            currentConfig.setType(argType.replaceAll("^!+", ""));
//            argType.replace();

            // The type may be a flag (flags.IDX?REAL_TYPE)
            // Note that 'flags' is NOT the flags name; this
            // is determined by a previous argument
            // However, we assume that the argument will always be called 'flags'
            Pattern compile = Pattern.compile("flags(\\d*)\\.(\\d+)\\?([\\w<>.]+)");
            Matcher matcher = compile.matcher(currentConfig.getType());

            if (matcher.find()) {
//                System.out.println(matcher.group() + "\n" + matcher.group(1) + "\n"
//                        + matcher.group(2) + "\n" + matcher.group(3));
//                System.out.println("\n\n");
                currentConfig.setFlag(true);
                String group = matcher.group(1);
                if (StringUtil.isEmpty(group)) {
                    currentConfig.setFlagGroup(1);
                } else {
                    currentConfig.setFlagGroup(Integer.parseInt(group));
                }
                currentConfig.setFlagIndex(Integer.parseUnsignedInt(matcher.group(2)));
                // Update the type to match the exact type, not the "flagged" one
                currentConfig.setType(matcher.group(3));
            }

            // Then check if the type is a Vector<REAL_TYPE>
            Pattern p1 = Pattern.compile("[Vv]ector<([\\w\\d.]+)>");
            Matcher vectorMatch = p1.matcher(currentConfig.getType());

            if (vectorMatch.find()) {
                currentConfig.setVector(true);

                // If the type's first letter is not uppercase, then
                // it is a constructor and we use (read/write) its ID.
                currentConfig.setUseVectorId(currentConfig.getType().charAt(0) == 'V');

                // Update the type to match the one inside the vector
                currentConfig.setType(vectorMatch.group(1));
            }

            // See use_vector_id. An example of such case is ipPort in
            // help.configSpecial
            String[] split = currentConfig.getType().split("\\.");
            Pattern p2 = Pattern.compile("^[a-z]$");
            Matcher m2 = p2.matcher(String.valueOf(split[split.length - 1].charAt(0)));
            if (m2.find()) {
                currentConfig.setSkipConstructorId(true);
            }
        }

        return currentConfig;
    }

    public static String variableSnakeToCamelCase(String name) {
        Pattern compile = Pattern.compile("([-_][a-z])");
        Matcher matcher1 = compile.matcher(name);
        while (matcher1.find()) {
            name = name.replace(
                    matcher1.group(),
                    matcher1.group()
                            .toUpperCase()
                            .replace("_", "")
                            .replace("-", "")
            );
        }
        return name;
    }
}
