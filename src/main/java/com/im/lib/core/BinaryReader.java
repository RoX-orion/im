package com.im.lib.core;

import com.im.lib.tl.ArgsConfig;
import com.im.lib.tl.NodeConfig;
import com.im.lib.tl.TLObject;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Objects;

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

//    public boolean tgReadBool() {
//        int i = this.readInt32();
//        if (i == ApiTL.True) {
//            // boolTrue
//            return true;
//        } else if (i == ApiTL.False) {
//            // boolFalse
//            return false;
//        } else {
//            throw new RuntimeException("Invalid boolean code " + i);
//        }
//    }

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

    public Object readObject(int length/*, Class<T> clazz*/) {
//        byte[] buffer = new byte[length];
//        for (int i = 0; i < length; i++) {
//            buffer[i] = this.buf[offset++];
//        }
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        try {
////            return objectMapper.readValue(buffer, clazz);
//            return objectMapper.readValue(buffer, Object.class);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        return null;
    }

    public byte[] read(int length) {
//        byte[] result = new byte[length];
//        for (int i = 0; i < length; i++) {
//            result[i] = buf[offset++];
//        }
//        return result;
        return null;
    }

    public byte readByte() {
//        return buf[offset++] & 0xFF;
        return buf.readByte();
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
//        int firstByte = this.readByte();
//        int padding;
//        int length;
//        if (firstByte == 254) {
//            length = this.readByte() | (this.readByte() << 8) | (this.readByte() << 16);
//            padding = length % 4;
//        } else {
//            length = firstByte;
//            padding = (length + 1) % 4;
//        }
//        byte[] data = this.read(length);
//
//        if (padding > 0) {
//            padding = 4 - padding;
//            this.read(padding);
//        }
//
//        return data;
        return null;
    }

    public String tgReadString() {
        return new String(tgReadBytes(), StandardCharsets.UTF_8);
    }

    Object tgReadObject() {
        int constructorId = readInt32();
        NodeConfig clazz = tlObject.getTLObject(constructorId);
        if (clazz == null) {
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

//            clazz = TLObject.[constructorId];
//
//            if (clazz == null) {
//                // If there was still no luck, give up
//                throw new RuntimeException("Can read the Object of constructorId is " + constructorId);
//            }
        }
        HashMap<String, ArgsConfig> argsConfigs = Objects.requireNonNull(clazz).getArgsConfig();
        for (String argName : argsConfigs.keySet()) {
            ArgsConfig arg = argsConfigs.get(argName);
            if (arg.isFlag()) {
                arg.getFlagIndex() > 30 ? arg.get

            } else {
                if (arg.isFlagIndicator()) {

                }
            }
        }
        return null;
    }
}
