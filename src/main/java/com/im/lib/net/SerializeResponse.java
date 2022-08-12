package com.im.lib.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.lib.entity.WsApiResult;
import com.im.lib.tl.ArgsConfig;
import com.im.lib.tl.NodeConfig;
import com.im.lib.tl.TLObject;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

@Component
public class SerializeResponse {
    public void serialize(SerializedData serializedData, int constructorId, WsApiResult data) throws NoSuchFieldException, IllegalAccessException {
        Object response = data.getData();
        Class<?> clazz = data.getReturnType();
        String responseName = clazz.getSimpleName();
        NodeConfig nodeConfig = TLObject.getTLObject(responseName);
        serializedData.writeInt(nodeConfig.getConstructorId());
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
                Field vector = clazz.getDeclaredField(argsName);
                vector.setAccessible(true);
                Object list = vector.get(response);
                int length = Array.getLength(list);
                serializedData.writeInt(length);
                for (int i = 0; i < length; i++) {
                    Object o = Array.get(list, i);
                    this.argToBytes(serializedData, o, argConfig.getType());
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
                                if (flagIndicator && !c.getType().equals("true")) {
                                    flagCalculate |= 1 << c.getFlagIndex();
                                }
                            } catch (NoSuchFieldException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    serializedData.writeInt(flagCalculate);
                }
            } else {
                Field filed = clazz.getDeclaredField(argsName);
                filed.setAccessible(true);
                Object o = filed.get(response);
                boolean isFunction =  argToBytes(serializedData, o, argConfig.getType());

                if (o != null && isFunction) {
                    System.out.println("function");
                    char boxed = argConfig.getType().charAt(argConfig.getType().indexOf('.') + 1);
                    if (boxed >= 'a' && boxed <= 'z') {

                    }
                }
            }
        }
    }

    public boolean argToBytes(SerializedData serializedData, Object x, String type) {
        boolean isFunction = false;
        switch (type) {
            case "int": {
                serializedData.writeInt((int) x);break;
            }
            case "long":
                toSignedLittleserializedData(serializedData, x,8);break;
            case "int128":
                toSignedLittleserializedData(serializedData, x, 16);break;
            case "int256":
                toSignedLittleserializedData(serializedData, x, 32);break;
            case "double": {
                serializedData.writeDouble((double) x);break;
            }
            case "string":
            case "bytes":
                serializeBytes(serializedData, x);break;
            case "Bool":
                if ((boolean) x) {
                    serializedData.writeInt(0xb5757299);
                } else {
                    serializedData.writeInt(0x379779bc);
                }
                break;
            case "true":
                return false;
            case "date":
                serializeDate(serializedData, x);break;
            default:
                try {
                    serializedData.writeBytes(new ObjectMapper().writeValueAsBytes(x));
                    isFunction = true;
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
        }
        return isFunction;
    }

    public void toSignedLittleserializedData(SerializedData serializedData, Object x, int number) {
        BigInteger bigNumber = new BigInteger(String.valueOf(x));
        for (int i = 0; i < number; i++) {
            serializedData.writeByte(bigNumber.shiftRight(8 * i)
                    .and(BigInteger.valueOf(255)).byteValue());
        }
    }

    private void serializeBytes(SerializedData serializedData, Object data) {
        int length;
        byte[] bytes;
        String str = null;
        if (data instanceof String) {
            str = String.valueOf(data);
            bytes = str.getBytes(StandardCharsets.UTF_8);
            length = bytes.length;
        } else {
            bytes = (byte[]) data;
            length = bytes.length;
        }
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
            serializedData.writeInt(254);
            serializedData.writeInt(length % 256);
            serializedData.writeInt((length >> 8) % 256);
            serializedData.writeInt((length >> 16) % 256);
        }
        if (data instanceof String) {
            serializedData.writeBytes(str.getBytes(StandardCharsets.UTF_8));
        } else {
            serializedData.writeBytes(bytes);
        }
        serializedData.writeBytes(new byte[padding]);
    }

    public void serializeDate(SerializedData serializedData, Object dt) {
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
