package com.im.lib.net;

public abstract class AbstractSerializedData {

    public abstract void writeInt32(int x);

    public abstract void writeInt64(long x);

    public abstract void writeBool(boolean value);

    public abstract void writeBytes(byte[] b);

    public abstract void writeBytes(byte[] b, int offset, int count);

    public abstract void writeByte(int i);

    public abstract void writeByte(byte b);

    public abstract void writeString(String s);

    public abstract void writeByteArray(byte[] b, int offset, int count);

    public abstract void writeByteArray(byte[] b);

    public abstract void writeDouble(double d);

    public abstract void writeByteBuffer(NativeByteBuffer buffer);

    public abstract int readInt32();

    public abstract boolean readBool();

    public abstract long readInt64();

    public abstract void readBytes(byte[] b);

    public abstract byte[] readData(int count);

    public abstract String readString();

    public abstract byte[] readByteArray();

    public abstract NativeByteBuffer readByteBuffer();

    public abstract double readDouble();

    public abstract int length();

    public abstract void skip(int count);

    public abstract int getPosition();

    public abstract int remaining();
}
