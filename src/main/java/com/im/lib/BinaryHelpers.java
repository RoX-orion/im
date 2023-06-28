package com.im.lib;

import io.netty.buffer.ByteBuf;
import io.netty.util.ReferenceCountUtil;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-24
 */

public class BinaryHelpers {

    public static byte[] readBytesLE(long value) {
        return ByteBuffer.allocate(8)
                .order(ByteOrder.LITTLE_ENDIAN)
                .putLong(value)
                .array();
    }

    public static void releaseBuffer(ByteBuf buffer) {
        ReferenceCountUtil.release(buffer);
    }
}
