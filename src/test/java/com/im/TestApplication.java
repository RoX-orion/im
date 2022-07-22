package com.im;

import com.im.lib.Helpers;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;

public class TestApplication {

    @Test
    public void testSha1() {
        byte[] bytes = new byte[]{
                -125, 74, 12, -111, 125, 35, -26, 124
        };

        int[] data = new int[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            data[i] = bytes[i] & 0xff;
        }

        System.out.println(Arrays.toString(data));
        System.out.println("8999919927557900931");
        System.out.println(Helpers.readBigIntegerFromBytes(bytes, false));
        System.out.println(Helpers.readBigIntegerFromBytes(bytes, true));
        BigInteger result = new BigInteger("0");

//        for (int i = data.length - 1; i >= 0; i--) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(data[i])));
//        }

//        for (int i = 0; i < data.length; i++) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(data[i])));
//
//        }
        /*
         * 7682667135076515389
         *
         *
         */
//        for (int i = 0; i < bytes.length; i++) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(bytes[i])));
//
//        }
//        for (int i = bytes.length - 1; i >= 0; i--) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(bytes[i])));
//        }

        System.out.println(result);

//        BinaryReader<Object> binaryReader = new BinaryReader<>(bytes);
//        BigInteger bigInteger = binaryReader.readInt64();
//        System.out.println(bigInteger);
    }

    @Test
    public void testCurrentHashMap() {
//        int timeOffset = 1657046137 - Math.floor(System.currentTimeMillis() / 1000);
//        long now = System.currentTimeMillis() / 1000 + timeOffset;
//        System.out.println((now - Math.floor(now)) * 1e9);
//
//        System.out.println(Math.floor((now - Math.floor(now)) * 1e9));
        for (int i = 0; i < 64; i++) {
            System.out.print(i + " ");
        }
    }
}
