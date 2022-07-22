package com.im.lib.core;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.lib.Helpers;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class BinaryReader {
    private final byte[] data;
    private int offset;

    public BinaryReader(byte[] data) {
        this.data = data;
        this.offset = 0;
    }

    /**
     * 读取小端字节序的int64
     * @return int64
     */
    public BigInteger readInt64() {
        byte[] buffer = new byte[8];
        for (int i = 0; i < 8; i++) {
            buffer[i] = data[offset++];
        }

        return Helpers.readBigIntegerFromBytes(buffer, true);
    }

    /**
     * 读取小端字节序的int32
     * @return int32
     */
    public int readInt32() {
        int[] buffer = new int[4];
        int result = 0;
        for (int i = 0; i < 4; i++) {
            buffer[i] = data[offset++] & 0xff;
        }

        for (int i = buffer.length - 1; i >= 0; i--) {
            result = result << 8 | buffer[i];
        }

        return result;
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
        byte[] buffer = new byte[length];
        for (int i = 0; i < length; i++) {
            buffer[i] = data[offset++];
        }

        ObjectMapper objectMapper = new ObjectMapper();
        try {
//            return objectMapper.readValue(buffer, clazz);
            return objectMapper.readValue(buffer, Object.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public byte[] read(int length) {
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = data[offset++];
        }
        return result;
    }

    public int readByte() {
        return data[offset++] & 0xFF;
    }

    public byte[] readBytes(int length) {
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = data[offset++];
        }
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

//    tgReadObject() {
//        int constructorId = readInt32();
//        let clazz = tlobjects[constructorId];
//        if (clazz === undefined) {
//            /**
//             * The class was None, but there's still a
//             * chance of it being a manually parsed value like bool!
//             */
//            const value = constructorId;
//            if (value === 0x997275b5) {
//                // boolTrue
//                return true;
//            } else if (value === 0xbc799737) {
//                // boolFalse
//                return false;
//            } else if (value === 0x1cb5c415) {
//                // Vector
//                const temp = [];
//                const length = this.readInt();
//                for (let i = 0; i < length; i++) {
//                    temp.push(this.tgReadObject());
//                }
//                return temp;
//            }
//
//            clazz = coreObjects[constructorId];
//
//            if (clazz === undefined) {
//                // If there was still no luck, give up
//                this.seek(-4); // Go back
//                const pos = this.tellPosition();
//                const error = new TypeNotFoundError(constructorId, this.read());
//                this.setPosition(pos);
//                throw error;
//            }
//        }
//        return clazz.fromReader(this);
//    }
}
