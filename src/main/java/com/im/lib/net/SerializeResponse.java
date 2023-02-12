package com.im.lib.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.lib.entity.WsApiResult;
import com.im.lib.tl.ArgsConfig;
import com.im.lib.tl.NodeConfig;
import com.im.lib.tl.TLObject;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

public class SerializeResponse {
    public static void serialize(SerializedDataBak serializedData, WsApiResult data) {
        Object response = data.getData();
        Class<?> clazz = data.getReturnType();
        if (clazz.isArray()) {
            Class<?> componentType = clazz.getComponentType();
            serializedData.writeInt(0x1cb5c415);
            int length = Array.getLength(response);
            for (int i = 0; i < length; i++) {
                NodeConfig nodeConfig = TLObject.getTLObject(componentType.getSimpleName());
                serializedData.writeInt(nodeConfig.getConstructorId());
                objectToBytes(nodeConfig, serializedData, componentType, Array.get(response, i));
            }
        } else {
            if (response instanceof Boolean) {
                argToBytes(serializedData, response, "Bool");
                return;
            }
            String responseName = clazz.getSimpleName();
            NodeConfig nodeConfig = TLObject.getTLObject(responseName);
            serializedData.writeInt(nodeConfig.getConstructorId());
            objectToBytes(nodeConfig, serializedData, clazz, response);
        }
    }

    private static void objectToBytes(NodeConfig nodeConfig, SerializedDataBak serializedData,
                                      Class<?> clazz, Object response) {
        List<String> argsNames = nodeConfig.getArgsName();
        List<ArgsConfig> configs = nodeConfig.getArgsConfig();
        for (int j = 0; j < argsNames.size(); j++) {
            String argsName = argsNames.get(j);
            ArgsConfig argConfig = configs.get(j);
            if (argConfig.isFlag()) {
                try {
                    Field field = clazz.getDeclaredField(argsName);
                    field.setAccessible(true);
                    boolean flag = field.getBoolean(response);
                    if (!flag && argConfig.getType().equals("true")) {
                        continue;
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                    continue;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            if (argConfig.isVector()) {
                if (argConfig.getUseVectorId()) {
                    serializedData.writeInt(0x15c4b51c);
                }
                Object list;
                try {
                    Field vector = clazz.getDeclaredField(argsName);
                    vector.setAccessible(true);
                    list = vector.get(response);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                int length = Array.getLength(list);
                serializedData.writeInt(length);
                for (int i = 0; i < length; i++) {
                    Object o = Array.get(list, i);
                    argToBytes(serializedData, o, argConfig.getType());
                }
            } else if (argConfig.isFlagIndicator()) {
                boolean f = false;
                for (ArgsConfig config : configs) {
                    if (config.isFlag()) {
                        serializedData.writeBytes(new byte[4]);
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    int flagCalculate = 0;
                    String n;
                    ArgsConfig c;
                    for (int i = 0; i < configs.size(); i++) {
                        n = argsNames.get(i);
                        c = configs.get(i);
                        if (c.isFlag()) {
                            try {
                                Field filed = clazz.getDeclaredField(n);
                                filed.setAccessible(true);
                                boolean flagIndicator = filed.getBoolean(response);
                                if (!flagIndicator && c.getType().equals("True")) {
                                    flagCalculate |= 0;
                                } else {
                                    flagCalculate |= 1 << c.getFlagIndex();
                                }
                            } catch (NoSuchFieldException | IllegalAccessException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    serializedData.writeInt(flagCalculate);
                }
            } else {
                Object o;
                try {
                    Field filed = clazz.getDeclaredField(argsName);
                    filed.setAccessible(true);
                    o = filed.get(response);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                boolean isFunction = argToBytes(serializedData, o, argConfig.getType());

                if (o != null && isFunction) {
                    System.out.println("function");
                    char boxed = argConfig.getType().charAt(argConfig.getType().indexOf('.') + 1);
                    if (boxed >= 'a' && boxed <= 'z') {

                    }
                }
            }
        }
    }

    public static boolean argToBytes(SerializedDataBak serializedData, Object x, String type) {
        boolean isFunction = false;
        switch (type) {
            case "int" -> serializedData.writeInt((int) x);
            case "long" -> toSignedLittleserializedData(serializedData, x, 8);
            case "int128" -> toSignedLittleserializedData(serializedData, x, 16);
            case "int256" -> toSignedLittleserializedData(serializedData, x, 32);
            case "double" -> serializedData.writeDouble((double) x);
            case "string", "bytes" -> serializeBytes(serializedData, x);
            case "Bool" -> {
                if ((boolean) x) {
                    serializedData.writeInt(0xb5757299);
                } else {
                    serializedData.writeInt(0x379779bc);
                }
            }
            case "true" -> {
                return false;
            }
            case "date" -> serializeDate(serializedData, x);
            default -> {
                try {
                    serializedData.writeBytes(new ObjectMapper().writeValueAsBytes(x));
                    isFunction = true;
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return isFunction;
    }

    public static void toSignedLittleserializedData(SerializedDataBak serializedData, Object x, int number) {
        BigInteger bigNumber = new BigInteger(String.valueOf(x));
        for (int i = 0; i < number; i++) {
            serializedData.writeByte(bigNumber.shiftRight(8 * i)
                    .and(BigInteger.valueOf(255)).byteValue());
        }
    }

    public static byte[] toSignedLittleserializedData(Object x, int number) {
        BigInteger bigNumber = new BigInteger(String.valueOf(x));
        byte[] bytes = new byte[number];
        for (int i = 0; i < number; i++) {
            bytes[i] = bigNumber
                    .shiftRight(8 * i)
                    .and(BigInteger.valueOf(255))
                    .byteValue();
        }

        return bytes;
    }

    private static void serializeBytes(SerializedDataBak serializedData, Object data) {
        int length;
        byte[] bytes;
        String str = null;
        if (data instanceof String) {
            str = String.valueOf(data);
            bytes = str.getBytes(StandardCharsets.UTF_8);
        } else {
            bytes = (byte[]) data;
        }
        length = bytes.length;
        int padding;
        if (length < 254) {
            padding = (length + 1) % 4;
            if (padding != 0) {
                padding = 4 - padding;
            }
            serializedData.writeByte(length);
        } else {
            padding = length % 4;
            if (padding != 0) {
                padding = 4 - padding;
            }
            serializedData.writeByte(254);
            serializedData.writeByte(length % 256);
            serializedData.writeByte((length >> 8) % 256);
            serializedData.writeByte((length >> 16) % 256);
        }
        if (data instanceof String) {
            serializedData.writeBytes(str.getBytes(StandardCharsets.UTF_8));
        } else {
            serializedData.writeBytes(bytes);
        }
        serializedData.writeBytes(new byte[padding]);
    }

    public static void serializeDate(SerializedDataBak serializedData, Object dt) {
        if (dt == null) {
            serializedData.writeBytes(new byte[4]);
        } else {
            if (dt instanceof Date date) {
                int time = (int)(date.getTime() / 1000.0);
                serializedData.writeInt(time);
            } else {
                throw new RuntimeException("this data is not Date");
            }
        }
    }
}
