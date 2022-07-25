package com.im.lib.net;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NativeByteBuffer {

//    protected long address;
//
//    public ByteBuf buffer;
//    private boolean justCalc;
//    private int len;
//    public boolean reused = true;
//
//    private static final ThreadLocal<LinkedList<NativeByteBuffer>> wrappers = ThreadLocal.withInitial(LinkedList::new);
//
//    public static NativeByteBuffer wrap(long address) {
//        if (address != 0) {
//            LinkedList<NativeByteBuffer> queue = wrappers.get();
//            NativeByteBuffer result = queue.poll();
//            if (result == null) {
//                result = new NativeByteBuffer(0, true);
//            }
//            result.reused = false;
//            result.buffer = Unpooled.directBuffer();/* native_getJavaByteBuffer(address);*/
////            result.buffer.limit(native_limit(address));
////            int position = native_position(address);
////            if (position <= result.buffer.limit()) {
////                result.buffer.position(position);
////            }
////            result.buffer.order(ByteOrder.LITTLE_ENDIAN);
//            return result;
//        } else {
//            return null;
//        }
//    }
//
//    private NativeByteBuffer(int address, boolean wrap) {
//
//    }
//
//    public NativeByteBuffer(int size) {
//        buffer = Unpooled.directBuffer();
//
////        buffer.position(0);
////        buffer.limit(size);
//        buffer.order(ByteOrder.LITTLE_ENDIAN);
//    }
//
//    public NativeByteBuffer(boolean calculate) {
//        justCalc = calculate;
//    }
//
//    public int position() {
//        return buffer.position();
//    }
//
//    public void position(int position) {
//        buffer.position(position);
//    }
//
//    public int capacity() {
//        return buffer.capacity();
//    }
//
//    public int limit() {
//        return buffer.limit();
//    }
//
//    public void limit(int limit) {
//        buffer.capacity(limit);
//    }
//
// /*   public void put(ByteBuf buff) {
//        buffer.setBytes(buff.readbytes);
//    }*/
//
//    public void rewind() {
//        if (justCalc) {
//            len = 0;
//        } else {
//            buffer.rewind();
//        }
//    }
//
//    public void compact() {
//        buffer.compact();
//    }
//
//    public boolean hasRemaining() {
//        return buffer.hasRemaining();
//    }
//
//    public void writeInt32(int x) {
//        try {
//            if (!justCalc) {
//                buffer.writeInt(x);
//            } else {
//                len += 4;
//            }
//        } catch (Exception e) {
//            log.error("write int32 error");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeInt64(long x) {
//        try {
//            if (!justCalc) {
//                buffer.writeLong(x);
//            } else {
//                len += 8;
//            }
//        } catch (Exception e) {
//            log.error("write int64 error");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeBool(boolean value) {
//        if (!justCalc) {
//            if (value) {
//                writeInt32(0x997275b5);
//            } else {
//                writeInt32(0xbc799737);
//            }
//        } else {
//            len += 4;
//        }
//    }
//
//    public void writeBytes(byte[] b) {
//        try {
//            if (!justCalc) {
//                buffer.writeBytes(b);
//            } else {
//                len += b.length;
//            }
//        } catch (Exception e) {
//            log.error("write raw error");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeBytes(byte[] b, int offset, int count) {
//        try {
//            if (!justCalc) {
//                buffer.writeBytes(b, offset, count);
//            } else {
//                len += count;
//            }
//        } catch (Exception e) {
//            log.error("write raw error");
//        }
//    }
//
//    public void writeByte(int i) {
//        writeByte((byte) i);
//    }
//
//    public void writeByte(byte b) {
//        try {
//            if (!justCalc) {
//                buffer.writeByte(b);
//            } else {
//                len += 1;
//            }
//        } catch (Exception e) {
//            log.error("write byte error");
//        }
//    }
//
//    public void writeString(String s) {
//        try {
//            writeByteArray(s.getBytes(StandardCharsets.UTF_8));
//        } catch (Exception e) {
//            log.error("write string error");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeByteArray(byte[] b, int offset, int count) {
//        try {
//            if (count <= 253) {
//                if (!justCalc) {
//                    buffer.put((byte) count);
//                } else {
//                    len += 1;
//                }
//            } else {
//                if (!justCalc) {
//                    buffer.put((byte) 254);
//                    buffer.put((byte) count);
//                    buffer.put((byte) (count >> 8));
//                    buffer.put((byte) (count >> 16));
//                } else {
//                    len += 4;
//                }
//            }
//            if (!justCalc) {
//                buffer.put(b, offset, count);
//            } else {
//                len += count;
//            }
//            int i = count <= 253 ? 1 : 4;
//            while ((count + i) % 4 != 0) {
//                if (!justCalc) {
//                    buffer.put((byte) 0);
//                } else {
//                    len += 1;
//                }
//                i++;
//            }
//        } catch (Exception e) {
//            log.error("write byte array error");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeByteArray(byte[] b) {
//        try {
//            if (b.length <= 253) {
//                if (!justCalc) {
//                    buffer.writeByte((byte) b.length);
//                } else {
//                    len += 1;
//                }
//            } else {
//                if (!justCalc) {
//                    buffer.writeByte((byte) 254);
//                    buffer.writeByte((byte) b.length);
//                    buffer.writeByte((byte) (b.length >> 8));
//                    buffer.writeByte((byte) (b.length >> 16));
//                } else {
//                    len += 4;
//                }
//            }
//            if (!justCalc) {
//                buffer.writeByte(b);
//            } else {
//                len += b.length;
//            }
//            int i = b.length <= 253 ? 1 : 4;
//            while ((b.length + i) % 4 != 0) {
//                if (!justCalc) {
//                    buffer.writeByte((byte) 0);
//                } else {
//                    len += 1;
//                }
//                i++;
//            }
//        } catch (Exception e) {
//            log.error("write byte array error");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeDouble(double d) {
//        try {
//            writeInt64(Double.doubleToRawLongBits(d));
//        } catch (Exception e) {
//            log.error("write double error");
//            e.printStackTrace();
//        }
//    }
//
//    public void writeByteBuffer(NativeByteBuffer b) {
//        try {
//            int l = b.limit();
//            if (l <= 253) {
//                if (!justCalc) {
//                    buffer.writeByte((byte) l);
//                } else {
//                    len += 1;
//                }
//            } else {
//                if (!justCalc) {
//                    buffer.writeByte((byte) 254);
//                    buffer.writeByte((byte) l);
//                    buffer.writeByte((byte) (l >> 8));
//                    buffer.writeByte((byte) (l >> 16));
//                } else {
//                    len += 4;
//                }
//            }
//            if (!justCalc) {
//                b.rewind();
//                buffer.writeByte(b.buffer);
//            } else {
//                len += l;
//            }
//            int i = l <= 253 ? 1 : 4;
//            while ((l + i) % 4 != 0) {
//                if (!justCalc) {
//                    buffer.writeByte((byte) 0);
//                } else {
//                    len += 1;
//                }
//                i++;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void writeBytes(NativeByteBuffer b) {
//        if (justCalc) {
//            len += b.limit();
//        } else {
//            b.rewind();
//            buffer.writeBytes(b.buffer);
//        }
//    }
//
//    public int getIntFromByte(byte b) {
//        return b & 0xFF;
//    }
//
//    public int length() {
//        if (!justCalc) {
//            return buffer.capacity();
//        }
//        return len;
//    }
//
//    public void skip(int count) {
////        if (count == 0) {
////            return;
////        }
////        if (!justCalc) {
////            buffer.position(buffer.position() + count);
////        } else {
////            len += count;
////        }
//    }
//
//    public int getPosition() {
//        return buffer.readerIndex();
////        return buffer.position();
//    }
//
//    public int readInt32(boolean exception) {
//        try {
//            return buffer.getInt();
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read int32 error", e);
//            } else {
//                log.error("read int32 error");
//                e.printStackTrace();
//            }
//        }
//        return 0;
//    }
//
//    public boolean readBool(boolean exception) {
//        int consructor = readInt32(exception);
//        if (consructor == 0x997275b5) {
//            return true;
//        } else if (consructor == 0xbc799737) {
//            return false;
//        }
//        if (exception) {
//            throw new RuntimeException("Not bool value!");
//        } else {
//            log.error("Not bool value!");
//        }
//        return false;
//    }
//
//    public long readInt64(boolean exception) {
//        try {
//            return buffer.readLong();
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read int64 error", e);
//            } else {
//                log.error("read int64 error");
//            }
//        }
//        return 0;
//    }
//
//    public void readBytes(byte[] b, boolean exception) {
//        try {
//            buffer.readBytes(b);
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read raw error", e);
//            } else {
//                log.error("read raw error");
//            }
//        }
//    }
//
//    public void readBytes(byte[] b, int offset, int count, boolean exception) {
//        try {
//            buffer.readBytes(b, offset, count);
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read raw error", e);
//            } else {
//                log.error("read raw error");
//            }
//        }
//    }
//
//    public byte[] readData(int count, boolean exception) {
//        byte[] arr = new byte[count];
//        readBytes(arr, exception);
//        return arr;
//    }
//
//    public String readString(boolean exception) {
//        int startReadPosition = getPosition();
//        try {
//            int sl = 1;
//            int l = getIntFromByte(buffer.readByte());
//            if (l >= 254) {
//                l = getIntFromByte(
//                        buffer.readByte())
//                        | (getIntFromByte(buffer.readByte()) << 8)
//                        | (getIntFromByte(buffer.readByte()) << 16
//                );
//                sl = 4;
//            }
//            byte[] b = new byte[l];
//            buffer.readBytes(b);
//            int i = sl;
//            while ((l + i) % 4 != 0) {
//                buffer.readByte();
//                i++;
//            }
//            return new String(b, StandardCharsets.UTF_8);
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read string error", e);
//            } else {
//                log.error("read string error");
//            }
//            position(startReadPosition);
//        }
//        return "";
//    }
//
//    public byte[] readByteArray(boolean exception) {
//        try {
//            int sl = 1;
//            int l = getIntFromByte(buffer.readByte());
//            if (l >= 254) {
//                l = getIntFromByte(
//                        buffer.readByte())
//                        | (getIntFromByte(buffer.readByte()) << 8)
//                        | (getIntFromByte(buffer.readByte()) << 16
//                );
//                sl = 4;
//            }
//            byte[] b = new byte[l];
//            buffer.readBytes(b);
//            int i = sl;
//            while ((l + i) % 4 != 0) {
//                buffer.readByte();
//                i++;
//            }
//            return b;
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read byte array error", e);
//            } else {
//                log.error("read byte array error");
//            }
//        }
//        return new byte[0];
//    }
//
//    public NativeByteBuffer readByteBuffer(boolean exception) {
//        try {
//            int sl = 1;
//            int l = getIntFromByte(buffer.readByte());
//            if (l >= 254) {
//                l = getIntFromByte(
//                        buffer.readByte())
//                        | (getIntFromByte(buffer.readByte()) << 8)
//                        | (getIntFromByte(buffer.readByte()) << 16
//                );
//                sl = 4;
//            }
//            NativeByteBuffer b = new NativeByteBuffer(l);
//            int old = buffer.limit();
//            buffer.limit(buffer.position() + l);
//            b.buffer.put(buffer);
//            buffer.limit(old);
//            b.buffer.position(0);
//            int i = sl;
//            while ((l + i) % 4 != 0) {
//                buffer.get();
//                i++;
//            }
//            return b;
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read byte array error", e);
//            } else {
//                log.error("read byte array error");
//            }
//        }
//        return null;
//    }
//
//    public double readDouble(boolean exception) {
//        try {
//            return Double.longBitsToDouble(readInt64(exception));
//        } catch (Exception e) {
//            if (exception) {
//                throw new RuntimeException("read double error", e);
//            } else {
//                log.error("read double error");
//            }
//        }
//        return 0;
//    }
//
//    public void reuse() {
//        if (address != 0) {
//            wrappers.get().add(this);
//            reused = true;
//            native_reuse(address);
//        }
//    }
//
//    @Override
//    public int remaining() {
//        return 0;
////        return buffer.remaining();
//    }
//
//    public static native long native_getFreeBuffer(int length);
//    public static native ByteBuffer native_getJavaByteBuffer(long address);
//    public static native int native_limit(long address);
//    public static native int native_position(long address);
//    public static native void native_reuse(long address);
}
