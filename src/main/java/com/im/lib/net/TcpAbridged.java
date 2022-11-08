package com.im.lib.net;

import com.im.lib.Helpers;
import io.netty.buffer.ByteBuf;
import org.springframework.stereotype.Component;

@Component
public class TcpAbridged {

    public final int header = 0x7f;

    public byte[] encodePacket(int length) {
        length = length >> 2;
        byte[] bytes;
        if (length < 127) {
            bytes = new byte[1];
            bytes[0] = (byte) length;
        } else {
            bytes = new byte[4];
            bytes[0] = 0x7f;
            byte[] b = Helpers.readBufferFromInt(length, 3, null, null);
            System.arraycopy(b, 0, bytes, 1, b.length);
        }
        return bytes;
    }

    public ByteBuf readPacket(ByteBuf byteBuf) {
        int length = byteBuf.readByte() & 0xff;
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
