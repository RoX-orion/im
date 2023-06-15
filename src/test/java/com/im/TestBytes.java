package com.im;

import com.im.lib.Helpers;
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
}
