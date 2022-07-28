package com.im.lib.net;

import com.im.lib.Helpers;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.springframework.stereotype.Component;

@Component
public class TCPAbridged {

    public final int header = 0x7f;

    public ByteBuf encodePacket(ByteBuf byteBuf) {
        int length = byteBuf.readableBytes() >> 2;
        ByteBuf buffer;
        if (length < 127) {
            buffer = PooledByteBufAllocator.DEFAULT.buffer(length + 1);
            buffer.writeByte(length);
            buffer.writeBytes(byteBuf);
        } else {
            buffer = PooledByteBufAllocator.DEFAULT.buffer(length + 4);
            buffer.writeByte(0x7f);
            byte[] bytes = Helpers.readBufferFromInt(length, 3, null, null);
            buffer.writeBytes(bytes);
        }
        return buffer;
    }

    public ByteBuf readPacket(ByteBuf byteBuf) {
        int length = byteBuf.readByte();
        if (length >= header) {
            byte[] bytes = new byte[3];
            byteBuf.readBytes(bytes);
            length = readLengthLE(bytes);
        }
        return byteBuf.readBytes(length << 2);
    }

    public int readLengthLE(byte[] bytes) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum |= (bytes[i] << (i * 8));
        }
        return sum;
    }
}
