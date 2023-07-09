package com.im.lib.net;

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
            this.readLengthLE(length, bytes);
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
        for (int i = 0; i < 3; i++) {
            sum |= ((bytes[i] & 0xff) << (i * 8));
        }
        return sum;
    }

    private void readLengthLE(int length, byte[] bytes) {
        bytes[1] = (byte) (length % 0xff);
        length >>>= 8;
        bytes[2] = (byte) (length % 0xff);
        length >>>= 8;
        bytes[3] = (byte) length;
    }
}
