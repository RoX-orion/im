package com.im;

import com.im.lib.net.TLRPC;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-07
 */

public class TestTLRPC {

    @Test
    public void getAllClass() throws IllegalAccessException {
        System.out.println("AX:" + 0xef7ff916);
        Class<TLRPC> tlrpcClass = TLRPC.class;
        Class<?>[] declaredClasses = tlrpcClass.getDeclaredClasses();
        for (Class<?> declaredClass : declaredClasses) {
            Field constructor = null;
            try {
                constructor = declaredClass.getDeclaredField("constructor");
            } catch (NoSuchFieldException e) {

            }
            if (constructor != null) {
                System.out.println(declaredClass.getSimpleName() + constructor.getInt(null));
            }
        }
    }
}
