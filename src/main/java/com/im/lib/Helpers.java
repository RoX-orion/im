package com.im.lib;

import io.netty.buffer.ByteBuf;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Helpers {

    //compute a^b mod p fastly
    public static BigInteger fastMod(BigInteger a, BigInteger b, BigInteger p) {
        a = a.remainder(p);
        BigInteger x = a;
        BigInteger result = BigInteger.ONE;
        while (!b.equals(BigInteger.ZERO)) {
            if (b.remainder(BigInteger.TWO).equals(BigInteger.ONE)) {
                result = result.multiply(x).remainder(p);
            }
            x = x.multiply(x).remainder(p);
            b = b.divide(BigInteger.TWO);
        }

        return result;
    }

    public static byte[] SHA1(byte[] data) {
        return sha("SHA").digest(data);
    }

    public static byte[] SHA256(byte[] data) {
        return sha("SHA-256").digest(data);
    }

    private static MessageDigest sha(String type) {
        try {
            return MessageDigest.getInstance(type);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String md5(String input) {
        MessageDigest md5;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        md5.update(input.getBytes());
        byte[] byteArray = md5.digest();

        BigInteger integer = new BigInteger(1, byteArray);
        // 参数16表示16进制
        StringBuilder result = new StringBuilder(integer.toString(16));
        // 不足32位高位补零
        while(result.length() < 32) {
            result.insert(0, "0");
        }
        return result.toString();
    }

    /**
     * 获取min(包括) - max(包括)之间的随机数
     * @param min 最小值
     * @param max 最大值
     */
    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * 获取给定长度的随机二进制数字-128-127
     */
    public static byte[] getRandomBytes(int length) {
        byte[] result = new byte[length];
        for (int i = 0; i < length; i++) {
            result[i] = (byte) (getRandomInt(0, 255) - 128);
        }
        return result;
    }

    public static BigInteger binaryStringToBigInteger(String binaryString) {
        BigInteger result = new BigInteger("0");
        BigInteger tmp;
        for (char c : binaryString.toCharArray()) {
            tmp = c == '1' ? new BigInteger("1") : new BigInteger("0");

            result = result.multiply(new BigInteger("2")).add(tmp);
        }

        return result;
    }

    public static String byteArrayToHexString(byte[] digest) {
        StringBuilder hs = new StringBuilder();
        String tmp;
        for (int n = 0; digest != null && n < digest.length; n++) {
            tmp = Integer.toHexString(digest[n] & 0XFF);
            if (tmp.length() == 1)
                hs.append('0');
            hs.append(tmp);
        }

        return hs.toString().toLowerCase();
    }

    public static byte[] hexStringToByteArray(String hex) {
        int length = hex.length();
        byte[] key = new byte[length >> 1];
        for (int i = 0; i < length; i += 2) {
            key[i >> 1] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }

        return key;
    }

    public static synchronized byte[] slice(byte[] bytes, int ...opt) {
        int length = opt.length;
        int start, end;
        if (length == 0) {
            throw new RuntimeException("slice must include an index!");
        } else if (length == 1) {
            end = bytes.length;
        } else if (length == 2) {
            end = opt[1];
        } else {
            throw new RuntimeException("slice can include at most two index!");
        }
        start = opt[0];
        byte[] result = new byte[end - start];
        if (end - start >= 0) System.arraycopy(bytes, start, result, 0, end - start);

        return result;
    }

    public static synchronized byte[] concat(byte[] ...bytes) {
        int length = 0;

        for (byte[] b : bytes) {
            for (int j = 0; j < b.length; j++) {
                length++;
            }
        }

        int i = 0;
        byte[] result = new byte[length];
        for (byte[] b : bytes) {
            for (byte value : b) {
                result[i++] = value;
            }
        }

        return result;
    }

    public static byte[] getByteArray(BigInteger bigInteger) {
//        var bits = bigInteger.toString(2).length();
//        int byteLength = (int) Math.floor((bits + 8 - 1) >> 2);
        byte[] array = bigInteger.toByteArray();
        if (array[0] == 0) {
            byte[] tmp = new byte[array.length - 1];
            System.arraycopy(array, 1, tmp, 0, tmp.length);
            return tmp;
        }
        return array;
    }

    /**
     * 从字节数组中读取BigInteger
     * @param bytes 字节数组
     * @param little 给定字节数组是小端字节序
     */
    public static BigInteger readBigIntegerFromBytes(byte[] bytes, boolean little, boolean signed) {
        int length = bytes.length;
        int[] buffer = new int[length];
        for (int i = 0; i < length; i++) {
            buffer[i] = bytes[i] & 0xff;
        }
        BigInteger result = new BigInteger("0");

        if(little){
            for (int i = buffer.length - 1; i >= 0; i--) {
                result = result.shiftLeft(8).or(new BigInteger(String.valueOf(buffer[i])));
            }
        } else {
            for (int b : buffer) {
                result = result.shiftLeft(8).or(new BigInteger(String.valueOf(b)));
            }
        }
        if (signed && (result.toString(2).length() >> 3) >= length) {
            result = result.subtract(BigInteger.TWO.pow(length * 8));
        }

        return result;
    }

    public static int[] toUnsignedInt(byte[] bytes) {
        int length = bytes.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = bytes[i] & 0xff;
        }

        return result;
    }

    public static int byteArrayToInt(byte[] bytes) {
        int result = 0;
        for (byte b : bytes) {
            result = result << 8 | (b & 0xff);
        }
        return result;
    }

    public static int mod(int n, int m) {
        return ((n % m) + m) % m;
    }

    /**
     * 获取给定数量的随机字节数组
     * @param count 随机字节数组数量
     */
    public static byte[] generateRandomBytes(int count) {
        byte[] result = new byte[count];
        for (int i = 0; i < count; i++) {
            result[i] = (byte) Helpers.getRandomInt(-128, 127);
        }
        return result;
    }

    public static int[] byteArrayToUnsignedArray(byte[] bytes) {
        int length = bytes.length;
        int[] result = new int[length];
        for (int i = 0; i < bytes.length; i++) {
            result[i] = bytes[i] & 0xff;
        }
        return result;
    }

    public static byte[] readBytesFromInt(int value) {
        byte[] result = new byte[4];
        result[3] =  (byte) ((value>>24) & 0xFF);
        result[2] =  (byte) ((value>>16) & 0xFF);
        result[1] =  (byte) ((value>>8) & 0xFF);
        result[0] =  (byte) (value & 0xFF);
        return result;
    }

    public static void printByteBuf(ByteBuf byteBuf) {
        int length = byteBuf.readableBytes();
        for (int i = 0; i < length; i++) {
            System.out.print(byteBuf.readByte() + " ");
        }
        byteBuf.resetReaderIndex();
        System.out.println("\n" + length);
    }

    /**
     * 将BigInteger转为字节数组
     * @param bytesNumber 字节数
     * @param little 小端字节序，默认true
     * @param signed 有符号，默认false
     */
    public static byte[] readBufferFromInt(int number, int bytesNumber, Boolean little, Boolean signed) {
        if (little == null) little = true;
        if (signed == null) signed = false;
//        int bitLength = bigInt.bitLength();
//
//        int bytes = (int)Math.ceil(bitLength / 8.0);
//        if (bytesNumber < bytes) {
//            throw new RuntimeException("OverflowError: int too big to convert");
//        }
//        if (!signed && bigInt.compareTo(BigInteger.ZERO) < 0) {
//            throw new RuntimeException("Cannot convert to unsigned");
//        }
//        boolean below = false;
//        if (bigInt.compareTo(BigInteger.ZERO) < 0) {
//            below = true;
//            bigInt = bigInt.abs();
//        }
//        Integer integer = Integer.valueOf(number);
        if (!signed && number < 0) {
            throw new RuntimeException("Cannot convert to unsigned");
        }
        Stack<Byte> stack = new Stack<>();
        int mod;
        while (number != 0) {
            mod = number % 128;
            stack.push((byte) mod);
            number = number >> 8;
        }
        if (stack.size() > bytesNumber) {
            throw new RuntimeException("OverflowError: int too big to convert");
        }
        byte[] bytes = new byte[bytesNumber];
        int i = 0;
        for (; i < stack.size(); i++) {
            bytes[i] = stack.pop();
        }
        if (stack.size() < bytesNumber) {
            int padding = bytesNumber - stack.size();
            for (int j = 0; j < padding; j++) {
                bytes[i++] = 0;
            }
        }
        return bytes;
    }
}
