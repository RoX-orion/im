package com.im.lib.net;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-05-17
 */

public class TLObject {

    public int networkType;

    public boolean disableFree = false;
    private static final ThreadLocal<NativeByteBuffer> sizeCalculator = ThreadLocal.withInitial(() -> new NativeByteBuffer(true));

    public TLObject() {

    }

    public void readParams(AbstractSerializedData stream) {

    }

    public void serializeToStream(AbstractSerializedData stream) {

    }

    public TLObject deserializeResponse(AbstractSerializedData stream, int constructor) {
        return null;
    }

    public void freeResources() {

    }

    public int getObjectSize() {
        NativeByteBuffer byteBuffer = sizeCalculator.get();
        byteBuffer.rewind();
        serializeToStream(sizeCalculator.get());
        return byteBuffer.length();
    }
}
