package com.im.lib.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.lib.entity.WsApiResult;
import com.im.lib.tl.ArgsConfig;
import com.im.lib.tl.NodeConfig;
import com.im.lib.tl.TLObject;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;

@Component
public class SerializeResponse {
    public void serialize(ByteBuf buffer, int constructorId, WsApiResult data) throws NoSuchFieldException, IllegalAccessException {
        Object response = data.getData();
        Class<?> clazz = data.getReturnType();
        String responseName = clazz.getSimpleName();
        NodeConfig nodeConfig = TLObject.getTLObject(responseName);
//        SerializedData serializedData = new SerializedData(buffer);
//        serializedData.writeInt32(constructorId);
        buffer.writeIntLE(constructorId);
        HashMap<String, ArgsConfig> argsConfig = nodeConfig.getArgsConfig();
        for (String key : argsConfig.keySet()) {
            ArgsConfig arg = argsConfig.get(key);
            if (arg.isFlag()) {
                try {
                    Field field = clazz.getDeclaredField(key);
                    field.setAccessible(true);
                    boolean flag = field.getBoolean(response);
                    if (!flag && arg.getType().equals("true")) {
                        continue;
                    }
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                    continue;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            if (arg.isVector()) {
                if (arg.getUseVectorId()) {
                    buffer.writeIntLE(0x15c4b51c);
                }
                Field vector = clazz.getDeclaredField(key);
                vector.setAccessible(true);
                Object list = vector.get(response);
                int length = Array.getLength(list);
                buffer.writeIntLE(length);
                for (int i = 0; i < length; i++) {
                    Object o = Array.get(list, i);
                    buffer = this.argToBytes(buffer, o, arg.getType());
                }
            } else if (arg.isFlagIndicator()) {
                boolean f = false;
                for (String s : argsConfig.keySet()) {
                    if (argsConfig.get(s).isFlag()) {
                        buffer.writeBytes(new byte[4]);
                        f = true;
                        break;
                    }
                }
                if (!f) {
                    int flagCalculate = 0;
                    for (String s : argsConfig.keySet()) {
                        if (argsConfig.get(s).isFlag()) {
                            try {
                                Field filed = clazz.getDeclaredField(s);
                                filed.setAccessible(true);
                                boolean flagIndicator = filed.getBoolean(response);
                                if (flagIndicator && !argsConfig.get(s).getType().equals("true")) {
                                    flagCalculate |= 1 << argsConfig.get(s).getFlagIndex();
                                }
                            } catch (NoSuchFieldException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    buffer.writeIntLE(flagCalculate);
                }
            } else {
                Field filed = clazz.getDeclaredField(key);
                filed.setAccessible(true);
                Object o = filed.get(response);
                buffer = argToBytes(buffer, o, arg.getType());

//                if (o != null && typeof this[arg].getBytes === 'function') {
//                    let boxed = (argsConfig[arg].type.charAt(argsConfig[arg].type.indexOf('.') + 1));
//                    boxed = boxed === boxed.toUpperCase();
//                    if (!boxed) {
//                        buffers.shift();
//                    }
//                }
            }
        }
    }

    public ByteBuf argToBytes(ByteBuf buffer, Object x, String type) {
        switch (type) {
            case "int": {
                return buffer.writeIntLE((int) x);
            }
            case "long":
                return toSignedLittleBuffer(buffer, x,8);
            case "int128":
                return toSignedLittleBuffer(buffer, x, 16);
            case "int256":
                return toSignedLittleBuffer(buffer, x, 32);
            case "double": {
                return buffer.writeDoubleLE((double) x);
            }
            case "string":
            case "bytes":
                return serializeBytes(buffer, x);
            case "Bool":
                return (boolean)x ? buffer.writeInt(0xb5757299) :  buffer.writeInt(0x379779bc);
            case "true":
                return buffer;
            case "date":
                return serializeDate(buffer, x);
            default:
                try {
                    return buffer.writeBytes(new ObjectMapper().writeValueAsBytes(x));
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
        }
    }

    public ByteBuf toSignedLittleBuffer(ByteBuf buffer, Object x, int number) {
        BigInteger bigNumber = new BigInteger(String.valueOf(x));
        for (int i = 0; i < number; i++) {
            buffer.writeByte(bigNumber.shiftRight(8 * i)
                    .and(BigInteger.valueOf(255)).intValue());
        }
        return buffer;
    }

    private ByteBuf serializeBytes(ByteBuf buffer, Object data) {
        int length;
        byte[] bytes = new byte[0];
        String str = null;
        if (data instanceof String) {
            str = String.valueOf(data);
            length = str.length();
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
            buffer.writeInt(length);
        } else {
            padding = length % 4;
            if (padding != 0) {
                padding = 4 - padding;
            }
            buffer.writeInt(254);
            buffer.writeInt(length % 256);
            buffer.writeInt((length >> 8) % 256);
            buffer.writeInt((length >> 16) % 256);
        }
        if (data instanceof String) {
            buffer.writeBytes(str.getBytes(StandardCharsets.UTF_8));
        } else {
            buffer.writeBytes(bytes);
        }
        buffer.writeBytes(new byte[padding]);

        return buffer;
    }

    public ByteBuf serializeDate(ByteBuf buffer, Object dt) {
        if (dt == null) {
            return buffer.writeBytes(new byte[4]);
        }
        if (dt instanceof Date date) {
            int time = (int)(date.getTime() / 1000.0);
            buffer.writeIntLE(time);
        } else {
            throw new RuntimeException("this data is not Date");
        }

        return buffer;
    }
}
