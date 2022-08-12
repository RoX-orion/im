package com.im.lib.net;

import com.im.lib.Helpers;
import com.im.lib.exception.ParamBindException;
import com.im.lib.tl.ArgsConfig;
import com.im.lib.tl.NodeConfig;
import com.im.lib.tl.TLHelpers;
import com.im.lib.tl.TLObject;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class BinaryReader {

    @Resource
    private TLObject tlObject;

    private final ByteBuf buf;
//    private int offset;

    public BinaryReader(ByteBuf buf) {
        this.buf = buf;
//        this.offset = 0;
    }

    public BinaryReader(byte[] bytes) {
        this.buf = Unpooled.wrappedBuffer(bytes);
    }

    /**
     * 读取小端字节序的int64
     * @return int64
     */
    public long readInt64() {
        return buf.readLongLE();
    }

    /**
     * 读取小端字节序的int32
     * @return int32
     */
    public int readInt32() {
//        int[] buffer = new int[4];
//        int result = 0;
//        for (int i = 0; i < 4; i++) {
//            buffer[i] = this.buf[offset++] & 0xff;
//        }
//
//        for (int i = buffer.length - 1; i >= 0; i--) {
//            result = result << 8 | buffer[i];
//        }
//
//        return result;
        return buf.readIntLE();
    }

    public boolean tgReadBool() {
        long value = buf.readUnsignedIntLE();
        if (value == 0x997275b5) {
            // boolTrue
            return true;
        } else if (value == 0xbc799737) {
            // boolFalse
            return false;
        } else {
            throw new RuntimeException("Invalid boolean");
        }
    }

    /**
     * 读取length长度字节的字符串
     * @param length 字节长度
     */
//    public String readString(int length) {
//        byte[] buffer = new byte[length];
//        Byte b;
//        for (int i = 0; i < length; i++) {
//            b = data.poll();
//            if (b == null) {
//                throw new NullPointerException("Read String is null, already read " + i + 1 + " bytes");
//            }
//            buffer[i] = b;
//        }
//
//        return new String(buffer);
//    }

    public byte[] read(int length) {
        if (length == -1) {
            length = buf.readableBytes();
        }
        byte[] result = new byte[length];
        buf.readBytes(result);
//        this._last = result;
        return result;
    }

    public int readByte() {
        return buf.readByte() & 0xff;
    }

    public byte[] readBytes(int length) {
        byte[] result = new byte[length];
//        for (int i = 0; i < length; i++) {
//            result[i] = buf[offset++];
//        }
//        return result;
        buf.readBytes(result);
        return result;
    }

    public byte[] readAll() {
        int i = buf.readableBytes();
        byte[] result = new byte[i];
        buf.readBytes(result);
        return result;
    }

    public byte[] tgReadBytes() {
        int firstByte = this.readByte();
        int padding;
        int length;
        if (firstByte == 254) {
            length = this.readByte() | (this.readByte() << 8) | (this.readByte() << 16);
            padding = length % 4;
        } else {
            length = firstByte;
            padding = (length + 1) % 4;
        }
        byte[] data = this.read(length);

        if (padding > 0) {
            padding = 4 - padding;
            this.read(padding);
        }

        return data;
    }

    public String tgReadString() {
        return new String(tgReadBytes(), StandardCharsets.UTF_8);
    }

    public Date tgReadDate() {
        int value = buf.readIntLE();
        return new Date(value * 1000L);
    }

    public Object tgReadObject(int constructorId) {
        // 当前方法的参数
        NodeConfig paramsConfig = TLObject.getTLObject(constructorId);
        if (paramsConfig == null) {
            /*
             * The class was None, but there's still a
             * chance of it being a manually parsed value like bool!
             */
            if (constructorId == 0x997275b5) {
                // boolTrue
                return true;
            } else if (constructorId == 0xbc799737) {
                // boolFalse
                return false;
            } else if (constructorId == 0x1cb5c415) {
                // Vector
//                const temp = [];
//                const length = this.readInt();
//                for (let i = 0; i < length; i++) {
//                    temp.push(this.tgReadObject());
//                }
//                return temp;
            }
            throw new RuntimeException();
//            clazz = TLObject.[constructorId];
//
//            if (clazz == null) {
//                // If there was still no luck, give up
//                throw new RuntimeException("Can read the Object of constructorId is " + constructorId);
//            }
        }
        List<String> argsNames = paramsConfig.getArgsName();
        List<ArgsConfig> argsConfigs = paramsConfig.getArgsConfig();
//        HashMap<String, ArgsConfig> argsConfigs = paramsConfig.getArgsConfig();
        HashMap<String, Object> args = new HashMap<>();
        for (int i = 0; i < argsConfigs.size(); i++) {
            String argName = argsNames.get(i);
            ArgsConfig arg = argsConfigs.get(i);
            if (arg.isFlag()) {
                int flagValue = arg.getFlagIndex() > 30 ?
                        (int) args.get("flags2") & (1 << arg.getFlagIndex() - 31)
                        : (int) args.get("flags") & (1 << arg.getFlagIndex());
                if (arg.getType().equals("True")) {
                    args.put(argName, flagValue != 0);
                    continue;
                }
                if (flagValue != 0) {
                    args.put(argName, getArgFromReader(buf, arg));
                } else {
                    args.put(argName, null);
                }
            } else {
                if (arg.isFlagIndicator()) {
                    args.put("name", "flags");
                }
                args.put(argName, getArgFromReader(buf, arg));
            }
        }
        System.out.println(args);
        String clazzName = paramsConfig.getName();
        // 当前参数实体类的class
        Class<?> clazz = TLObject.getClazz(clazzName);
        if (clazz == null) {
            throw new ParamBindException("can't find the request param '" + clazzName + "'");
        }
        Object buildObject;
        try {
            buildObject = clazz.getConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        for (Field declaredField : clazz.getDeclaredFields()) {
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            Class<?> type = declaredField.getType();
            Object paramObject = args.get(name);
            if (paramObject == null) {
                throw new ParamBindException("there isn't a param which name is '" + name + "' in request");
            }
            try {
                System.out.println(name + ":" + type.getSimpleName() + ":" + paramObject);
                if (TLHelpers.AUTH_KEY_TYPES.contains(constructorId) && type.getSimpleName().equals("String")) {

                    if (!(paramObject instanceof byte[])) {
                        throw new RuntimeException("can not read BigInteger from bytes");
                    }
                    BigInteger bigInteger = this.readBigInteger((byte[]) paramObject);
                    declaredField.set(buildObject, bigInteger);
                } else {
                    declaredField.set(buildObject, paramObject);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return buildObject;
    }

    private Object getArgFromReader(ByteBuf buf, ArgsConfig arg) {
        if (arg.isVector()) {
            if (arg.getUseVectorId()) {
                buf.readInt();
            }
        List<Object> temp = new ArrayList<>();
        int len = buf.readInt();
        arg.setVector(false);
            for (int i = 0; i < len; i++) {
                temp.add(getArgFromReader(buf, arg));
            }
            arg.setVector(true);
            return temp;
        } else if (arg.isFlagIndicator()) {
            return buf.readInt();
        } else {
            switch (arg.getType()) {
                case "int":
                    return buf.readInt();
                case "long":
                    return buf.readLong();
                case "int128":
                    return readBigInteger(buf, 16);
                case "int256":
                    return readBigInteger(buf, 32);
                case "double":
                    return buf.readDouble();
                case "string":
                    return this.tgReadString();
                case "Bool":
                    return this.tgReadBool();
                case "true":
                    return true;
                case "bytes":
                    return this.tgReadBytes();
                case "date":
                    return this.tgReadDate();
                default:
                    if (!arg.isSkipConstructorId()) {
                        int constructorId = this.readInt32();
                        return this.tgReadObject(constructorId);
                    } else {
                        throw new RuntimeException("Unknown type");
                    }
            }
        }
    }

    /**
     * 从ByteBuf读取BigInteger，小端字节序，有符号
     * @param buf ByteBuf
     * @param length 从ByteBuf读取数据的长度
     */
    public BigInteger readBigInteger(ByteBuf buf, int length) {
        byte[] bytes = new byte[length];
        buf.readBytes(bytes);
        return Helpers.readBigIntegerFromBytes(bytes, true, true);
    }

    public BigInteger readBigInteger(byte[] bytes) {
        return Helpers.readBigIntegerFromBytes(bytes, false, false);
    }
}
