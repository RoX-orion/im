package com.im;

import com.im.lib.Helpers;
import com.im.lib.tl.TLRPC;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
        System.out.println(Long.toHexString(1945237724L));
        System.out.println(Long.toHexString(4082920705L)); // rpc_result
        System.out.println(Long.toHexString(558156313L)); // rpc_error
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

    @Test
    public void sendCode() {
        byte[] bytes = Helpers.SHA1(new byte[45], String.valueOf(Helpers.getRandomInt64()).getBytes(StandardCharsets.UTF_8));
        String s = Helpers.byteArrayToHexString(bytes).substring(0, 18);
        System.out.println(s);
        String hash = "4bafc882f1374e3fac";
        System.out.println(hash.length());
    }

    @Test
    public void testUnsigned() {
        byte i = -10;
        System.out.println(i & 0xff);
    }

    @Test
    public void msgId() {
        BigInteger msgId = new BigInteger("7253496314389424196");
        System.out.println(new Date(msgId.shiftRight(32).multiply(BigInteger.valueOf(1000)).longValue()));
    }
}
