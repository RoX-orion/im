package com.im.lib.tl;

import com.im.TLParser;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class TLObject {
    private static final ConcurrentHashMap<Integer, NodeConfig> allTLObject = new ConcurrentHashMap<>();

    private static final ConcurrentHashMap<String, NodeConfig> nameTLObject = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, Class<?>> classContainer = new ConcurrentHashMap<>();

    public ConcurrentHashMap<Integer, String> coreTLObject = new ConcurrentHashMap<>(TLHelpers.CORE_TYPE);

    static {
        List<NodeConfig> c1;
        List<NodeConfig> c2;
        try {
            c1 = TLParser.parseTL("schema.tl");
            c2 = TLParser.parseTL("api.tl");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        c1.addAll(c2);
        System.out.println(c1);
        for (NodeConfig nodeConfig : c1) {
            allTLObject.put(
                    nodeConfig.getConstructorId(),
                    nodeConfig
            );

            nameTLObject.put(
                    nodeConfig.getName(),
                    nodeConfig
            );
        }
        String path = System.getProperty("user.dir") + "/src/main/java/com/im/api";

        File file = new File(path);
        File[] files = file.listFiles();
        String packageName = "com.im.api.";
        if (files != null) {
            for (File f : files) {
                String name = f.getName();
                try {
                    Class<?> clazz = Class.forName(packageName + name.substring(0, name.length() - 5));
                    Class<?>[] declaredClasses = clazz.getDeclaredClasses();
                    for (Class<?> declaredClass : declaredClasses) {
                        String clazzName = declaredClass.getSimpleName();
                        classContainer.put(clazzName, declaredClass);
                    }
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static NodeConfig getTLObject(int constructorId) {
        return allTLObject.get(constructorId);
    }

    public static NodeConfig getTLObject(String name) {
        return nameTLObject.get(name);
    }

    public static Class<?> getClazz(String name) {
        return classContainer.get(name);
    }

//    public NodeConfig getCoreTLObject(int constructorId) {
//        return coreTLObject.get(constructorId);
//    }
}
