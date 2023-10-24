package com.im;

import com.im.lib.Helpers;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-15
 */

public class TestBytes {

    /**
     * be7e8ef1
     * -63923831852013935644601506553901097449n
     * -19198543138513450751535336264988390851
     */
    @Test
    public void testNonce() {
        int[] ints = new int[]{246, 26, 148, 69, 127, 75, 188, 199, 72, 78, 105, 172, 122, 127, 180, 244};
        byte[] bytes = new byte[ints.length];
        for (int i = 0; i < ints.length; i++) {
            bytes[i] = (byte) ints[i];
        }
        BigInteger bigInteger = Helpers.readBigIntegerFromBytes(bytes, true, true);
        System.out.println(bigInteger);
    }

    // [-91, 14, -83, -91, 35, 1]
    @Test
    public void testPq() {
        byte[] bytes = new byte[]{0, -91, 14, -83, -91, 35, 1};
        int[] unsignedInt = Helpers.toUnsignedInt(bytes);
        System.out.println(Arrays.toString(unsignedInt));

        BigInteger bigInteger = Helpers.readBigIntegerFromBytes(bytes, false, true);

        System.out.println(bigInteger);
        System.out.println(Arrays.toString(Helpers.getByteArray(new BigInteger("181482461405953"))));
        System.out.println(Arrays.toString(new BigInteger("181482461405953").toByteArray()));
    }

    @Test
    public void dhPrime() {
        String hex = "c71caeb9c6b1c9048e6c522f70f13f73980d40238e3e21c14934d037563d930f48198a0aa7c14058229493d22530f4dbfa336f6e0ac925139543aed44cce7c3720fd51f69458705ac68cd4fe6b6b13abdc9746512969328454f18faf8c595f642477fe96bb2a941d5bcd1d4ac8cc49880708fa9b378e3c4f3a9060bee67cf9a4a4a695811051907e162753b56b0f6b410dba74d8a84b2a14b3144e0ef1284754fd17ed950d5965b4b9dd46582db1178d169c6bc465b0d6ff9ca3928fef5b9ae4e418fc15e83ebea0f87fa9ff5eed70050ded2849f47bf959d956850ce929851f0d8115f635b105ee2e4e15d04b2454bf6f4fadf034b10403119cd8e3b92fcc5b";
        BigInteger dhPrime = new BigInteger(hex, 16);
        System.out.println(dhPrime);
        System.out.println(dhPrime.isProbablePrime(5));
    }

    @Test
    public void byteBuf() {
        ByteBuf buffer = Unpooled.buffer(12);
        buffer.writeBytes(new byte[12]);
        System.out.println(buffer.capacity());
        buffer.readIntLE();
        System.out.println(buffer.readableBytes());
        System.out.println(buffer.capacity());
    }

    public static double calculateEntropy(byte[] data) {
        // 统计每个字节的出现频率
        Map<Byte, Integer> frequencyMap = new HashMap<>();
        for (byte b : data) {
            frequencyMap.put(b, frequencyMap.getOrDefault(b, 0) + 1);
        }

        // 计算香农熵
        double entropy = 0.0;
        int totalBytes = data.length;
        for (int frequency : frequencyMap.values()) {
            double probability = (double) frequency / totalBytes;
            entropy -= probability * Math.log(probability) / Math.log(2);
        }

        return entropy;
    }

    public static void main(String[] args) {
        byte[] data = {0, 23, 45, 122, 1, 67, 1, 4}; // 示例数据
        double entropy = calculateEntropy(data);
        System.out.println("Entropy: " + entropy);
    }
}
