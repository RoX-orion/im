package com.im.lib;

import com.im.entity.CreateAuthKeyState;
import com.im.lib.crypto.RSA;
import org.junit.Test;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-28
 */

public class TestRSA {
    @Test
    public void testPq() {
        CreateAuthKeyState pq = RSA.getPQ();
        System.out.println(pq);
    }
}
