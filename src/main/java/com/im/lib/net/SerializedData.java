package com.im.lib.net;

import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

@Slf4j
public class SerializedData extends AbstractSerializedData {
    protected boolean isOut = true;
    private ByteArrayOutputStream outBuffer;
    private DataOutputStream out;
    private ByteArrayInputStream inBuffer;
    private DataInputStream in;
    private boolean justCalc = false;
    private int len;

    public SerializedData() {
        outBuffer = new ByteArrayOutputStream();
        out = new DataOutputStream(outBuffer);
    }

    public SerializedData(boolean calculate) {
        if (!calculate) {
            outBuffer = new ByteArrayOutputStream();
            out = new DataOutputStream(outBuffer);
        }
        justCalc = calculate;
        len = 0;
    }

    public SerializedData(int size) {
        outBuffer = new ByteArrayOutputStream(size);
        out = new DataOutputStream(outBuffer);
    }

    public SerializedData(byte[] data) {
        isOut = false;
        inBuffer = new ByteArrayInputStream(data);
        in = new DataInputStream(inBuffer);
        len = 0;
    }

    public void cleanup() {
        try {
            if (inBuffer != null) {
                inBuffer.close();
                inBuffer = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (in != null) {
                in.close();
                in = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (outBuffer != null) {
                outBuffer.close();
                outBuffer = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            if (out != null) {
                out.close();
                out = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SerializedData(File file) throws Exception {
        FileInputStream is = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        new DataInputStream(is).readFully(data);
        is.close();

        isOut = false;
        inBuffer = new ByteArrayInputStream(data);
        in = new DataInputStream(inBuffer);
    }

    public void writeInt32(int x) {
        if (!justCalc) {
            writeInt32(x, out);
        } else {
            len += 4;
        }
    }

    private void writeInt32(int x, DataOutputStream out) {
        try {
            for (int i = 0; i < 4; i++) {
                out.write(x >> (i * 8));
            }
        } catch (Exception e) {
            log.error("write int32 error");
            e.printStackTrace();
        }
    }

    public void writeInt64(long i) {
        if (!justCalc) {
            writeInt64(i, out);
        } else {
            len += 8;
        }
    }

    private void writeInt64(long x, DataOutputStream out) {
        try {
            for (int i = 0; i < 8; i++) {
                out.write((int) (x >> (i * 8)));
            }
        } catch (Exception e) {
            log.error("write int64 error");
            e.printStackTrace();
        }
    }

    public void writeBool(boolean value) {
        if (!justCalc) {
            if (value) {
                writeInt32(0x997275b5);
            } else {
                writeInt32(0xbc799737);
            }
        } else {
            len += 4;
        }
    }

    public void writeBytes(byte[] b) {
        try {
            if (!justCalc) {
                out.write(b);
            } else {
                len += b.length;
            }
        } catch (Exception e) {
            log.error("write raw error");
            e.printStackTrace();
        }
    }

    public void writeBytes(byte[] b, int offset, int count) {
        try {
            if (!justCalc) {
                out.write(b, offset, count);
            } else {
                len += count;
            }
        } catch (Exception e) {
            log.error("write bytes error");
            e.printStackTrace();
        }
    }

    public void writeByte(int i) {
        try {
            if (!justCalc) {
                out.writeByte((byte) i);
            } else {
                len += 1;
            }
        } catch (Exception e) {
            log.error("write byte error");
            e.printStackTrace();
        }
    }

    public void writeByte(byte b) {
        try {
            if (!justCalc) {
                out.writeByte(b);
            } else {
                len += 1;
            }
        } catch (Exception e) {
            log.error("write byte error");
            e.printStackTrace();
        }
    }

    public void writeByteArray(byte[] b) {
        try {
            if (b.length <= 253) {
                if (!justCalc) {
                    out.write(b.length);
                } else {
                    len += 1;
                }
            } else {
                if (!justCalc) {
                    out.write(254);
                    out.write(b.length);
                    out.write(b.length >> 8);
                    out.write(b.length >> 16);
                } else {
                    len += 4;
                }
            }
            if (!justCalc) {
                out.write(b);
            } else {
                len += b.length;
            }
            int i = b.length <= 253 ? 1 : 4;
            while ((b.length + i) % 4 != 0) {
                if (!justCalc) {
                    out.write(0);
                } else {
                    len += 1;
                }
                i++;
            }
        } catch (Exception e) {
            log.error("write byte array error");
            e.printStackTrace();
        }
    }

    public void writeString(String s) {
        try {
            writeByteArray(s.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            log.error("write string error");
            e.printStackTrace();
        }
    }

    public void writeByteArray(byte[] b, int offset, int count) {
        try {
            if (count <= 253) {
                if (!justCalc) {
                    out.write(count);
                } else {
                    len += 1;
                }
            } else {
                if (!justCalc) {
                    out.write(254);
                    out.write(count);
                    out.write(count >> 8);
                    out.write(count >> 16);
                } else {
                    len += 4;
                }
            }
            if (!justCalc) {
                out.write(b, offset, count);
            } else {
                len += count;
            }
            int i = count <= 253 ? 1 : 4;
            while ((count + i) % 4 != 0) {
                if (!justCalc) {
                    out.write(0);
                } else {
                    len += 1;
                }
                i++;
            }
        } catch (Exception e) {
            log.error("write byte array error");
            e.printStackTrace();
        }
    }

    public void writeDouble(double d) {
        try {
            writeInt64(Double.doubleToRawLongBits(d));
        } catch (Exception e) {
            log.error("write double error");
            e.printStackTrace();
        }
    }

    public void writeFloat(float d) {
        try {
            writeInt32(Float.floatToIntBits(d));
        } catch (Exception e) {
            log.error("write float error");
            e.printStackTrace();
        }
    }

    public int length() {
        if (!justCalc) {
            return isOut ? outBuffer.size() : inBuffer.available();
        }
        return len;
    }

    protected void set(byte[] newData) {
        isOut = false;
        inBuffer = new ByteArrayInputStream(newData);
        in = new DataInputStream(inBuffer);
    }

    public byte[] toByteArray() {
        return outBuffer.toByteArray();
    }

    public void skip(int count) {
        if (count == 0) {
            return;
        }
        if (!justCalc) {
            if (in != null) {
                try {
                    in.skipBytes(count);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            len += count;
        }
    }

    public int getPosition() {
        return len;
    }

    public boolean readBool(boolean exception) {
        int consructor = readInt32(exception);
        if (consructor == 0x997275b5) {
            return true;
        } else if (consructor == 0xbc799737) {
            return false;
        }
        if (exception) {
            throw new RuntimeException("Not bool value!");
        } else {
            log.error("Not bool value!");
        }
        return false;
    }

    public byte readByte(boolean exception) {
        try {
            byte result = in.readByte();
            len += 1;
            return result;
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read byte error", e);
            } else {
                log.error("read byte error");
            }
        }
        return 0;
    }

    public void readBytes(byte[] b, boolean exception) {
        try {
            int read = in.read(b);
            len += b.length;
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read bytes error", e);
            } else {
                log.error("read bytes error");
                e.printStackTrace();
            }
        }
    }

    public byte[] readData(int count, boolean exception) {
        byte[] arr = new byte[count];
        readBytes(arr, exception);
        return arr;
    }

    public String readString(boolean exception) {
        try {
            int sl = 1;
            int l = in.read();
            len++;
            if (l >= 254) {
                l = in.read() | (in.read() << 8) | (in.read() << 16);
                len += 3;
                sl = 4;
            }
            byte[] b = new byte[l];
            in.read(b);
            len++;
            int i = sl;
            while ((l + i) % 4 != 0) {
                in.read();
                len++;
                i++;
            }
            return new String(b, StandardCharsets.UTF_8);
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read string error", e);
            } else {
                log.error("read string error");
                e.printStackTrace();
            }
        }
        return null;
    }

    public byte[] readByteArray(boolean exception) {
        try {
            int sl = 1;
            int l = in.read();
            len++;
            if (l >= 254) {
                l = in.read() | (in.read() << 8) | (in.read() << 16);
                len += 3;
                sl = 4;
            }
            byte[] b = new byte[l];
            in.read(b);
            len++;
            int i = sl;
            while ((l + i) % 4 != 0) {
                in.read();
                len++;
                i++;
            }
            return b;
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read byte array error", e);
            } else {
                log.error("read byte array error");
                e.printStackTrace();
            }
        }
        return null;
    }

    public double readDouble(boolean exception) {
        try {
            return Double.longBitsToDouble(readInt64(exception));
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read double error", e);
            } else {
                log.error("read double error");
                e.printStackTrace();
            }
        }
        return 0;
    }

    public float readFloat(boolean exception) {
        try {
            return Float.intBitsToFloat(readInt32(exception));
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read float error", e);
            } else {
                log.error("read float error");
                e.printStackTrace();
            }
        }
        return 0;
    }

    public int readInt32(boolean exception) {
        try {
            int i = 0;
            for (int j = 0; j < 4; j++) {
                i |= (in.read() << (j * 8));
                len++;
            }
            return i;
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read int32 error", e);
            } else {
                log.error("read int32 error");
                e.printStackTrace();
            }
        }
        return 0;
    }

    public long readInt64(boolean exception) {
        try {
            long i = 0;
            for (int j = 0; j < 8; j++) {
                i |= ((long) in.read() << (j * 8));
                len++;
            }
            return i;
        } catch (Exception e) {
            if (exception) {
                throw new RuntimeException("read int64 error", e);
            } else {
                log.error("read int64 error");
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public void writeByteBuffer(NativeByteBuffer buffer) {

    }

    @Override
    public NativeByteBuffer readByteBuffer(boolean exception) {
        return null;
    }

    @Override
    public int remaining() {
        try {
            return in.available();
        } catch (Exception e) {
            return Integer.MAX_VALUE;
        }
    }

    @Override
    public String toString() {
        return "SerializedData{" +
                "isOut=" + isOut +
                ", outbuf=" + outBuffer +
                ", out=" + out +
                ", inbuf=" + inBuffer +
                ", in=" + in +
                ", justCalc=" + justCalc +
                ", len=" + len +
                '}';
    }
}
