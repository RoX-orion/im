package com.im.lib;

import org.junit.Test;

import java.math.BigInteger;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-29
 */

public class TestMTProto {

    @Test
    public void msgId() {
//        double now = System.currentTimeMillis() / 1000.0;
//        System.out.println(now);
//        System.out.println(Math.floor(now));
//        System.out.println(now - Math.floor(now));
        System.out.println(new BigInteger("7250137457934424313").shiftRight(32));
    }
}
