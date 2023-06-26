package com.im;

import com.im.lib.Helpers;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;

import java.math.BigInteger;

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

    @Test
    public void testPq() {
        int[] ints = new int[]{152, 130, 61};
        byte[] bytes = new byte[ints.length];
        for (int i = 0; i < ints.length; i++) {
            bytes[i] = (byte) ints[i];
        }
        BigInteger bigInteger = Helpers.readBigIntegerFromBytes(bytes, false, false);
        System.out.println(bigInteger);
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
}
