package com.im;

import com.im.lib.tl.TLRPC;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    // config#cc1a241e
    // default_p2p_contacts:flags.3?true
    // preload_featured_stickers:flags.4?true
    // revoke_pm_inbox:flags.6?true blocked_mode:flags.8?true
    // force_try_ipv6:flags.14?true

    // gif_search_username:flags.9?string
    // venue_search_username:flags.10?string
    // img_search_username:flags.11?string

    @Test
    public void testFlags() {
        int flags = 0;
        flags = true ? (flags | 8) : (flags &~ 8);
        flags = false ? (flags | 16) : (flags &~ 16);
        flags = true ? (flags | 64) : (flags &~ 64);
        flags = false ? (flags | 256) : (flags &~ 256);
        flags = false ? (flags | 16384) : (flags &~ 16384);
        flags = flags | 512;
        flags = flags | 1024;
        flags = flags | 2048;

        System.out.println(flags);
//        System.out.println(0xcc1a241eL & 0xffffffffL);
    }

    @Test
    public void benchmark() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        List<TLRPC.TL_config> configList = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            TLRPC.TL_config tlConfig = TLRPC.TL_config.class.getConstructor().newInstance();
            configList.add(tlConfig);
        }

        System.out.println((System.nanoTime() - start) / 1000000);
        System.out.println(configList.get(1000));
    }

    @Test
    public void subclassOfId() {
        long myId = 3542493770L;
        long subclassOfId = 0x8af52aacL;
        System.out.println(subclassOfId);
        System.out.println();
    }

    @Test
    public void pong() {
        long msgId = 72057598203698276L;
    }

    @Test
    public void constructorId() {
        System.out.println(0xf2f2330aL);
        System.out.println(Long.toHexString(4082920705L));
    }

    @Test
    public void config() {
        System.out.println(Long.toHexString(3542493770L));
    }

    @Test
    public void rpcResult() {
//        0xf35c6d01
        ByteBuf buffer = Unpooled.directBuffer(4);
        // constructor = 0xcc1a241e   0xa00e67d6
        buffer.writeIntLE(0xcc1a241e);
        byte[] bytes = new byte[4];
        buffer.readBytes(bytes);
        System.out.println(Arrays.toString(bytes));
//        ByteBuffer.allocate(4).putInt(0xf35c6d01);
    }
    /**
     * [1, 109, 92, -13, 72, 97, -2, -51, -79, 14, -97, 100, -44, 30, 36, 26, -52, 72, 14, 0, 0, -50, 102, 81, 13, -79, 61, -84, 100, 55, -105, 121, -68, 2, 0, 0, 0, 21, -60, -75, 28, 1, 0, 0, 0, 13, -95, -73, 24, 0, 0, 0, 0, 1, 0, 0, 0, 9, 49, 50, 55, 46, 48, 46, 48, 46, 49, 0, 0, 57, 48, 0, 0, 13, 97, 112, 118, 51, 46, 115, 116, 101, 108, 46, 99, 111, 109, 0, 0, -56, 0, 0, 0, 64, 13, 3, 0, 100, 0, 0, 0, 80, 52, 3, 0, -120, 19, 0, 0, 48, 117, 0, 0, -32, -109, 4, 0, 48, 117, 0, 0, -36, 5, 0, 0, 96, -22, 0, 0, 2, 0, 0, 0, 0, -93, 2, 0, -1, -1, -1, 127, -1, -1, -1, 127, 0, -22, 36, 0, -56, 0, 0, 0, -128, 58, 9, 0, 32, 78, 0, 0, -112, 95, 1, 0, 48, 117, 0, 0, 16, 39, 0, 0, 13, 104, 116, 116, 112, 115, 58, 47, 47, 116, 46, 109, 101, 47, 0, 0, 3, 103, 105, 102, 10, 102, 111, 117, 114, 115, 113, 117, 97, 114, 101, 0, 4, 98, 105, 110, 103, 0, 0, 0, 0, 4, 0, 0, 0, 16, 0, 0, 4, 0, 0, 0, 0, 0, 0]
     */
}
