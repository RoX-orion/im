package com.im.lib.net;

import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.charset.StandardCharsets;

@Slf4j
public class SerializedDataBak {
    protected boolean isOut = true;
    private ByteArrayOutputStream outBuffer;
    private DataOutputStream out;
    private boolean justCalc = false;
    private int len;

    public SerializedDataBak() {
        outBuffer = new ByteArrayOutputStream();
        out = new DataOutputStream(outBuffer);
    }

    public SerializedDataBak(boolean calculate) {
        if (!calculate) {
            outBuffer = new ByteArrayOutputStream();
            out = new DataOutputStream(outBuffer);
        }
        justCalc = calculate;
        len = 0;
    }

    public SerializedDataBak(int size) {
        outBuffer = new ByteArrayOutputStream(size);
        out = new DataOutputStream(outBuffer);
    }

    public void cleanup() {
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

    public void writeInt(int i) {
        writeInt32(i, out);
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
                writeInt32(0x997275b5, out);
            } else {
                writeInt32(0xbc799737, out);
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
            writeInt32(Float.floatToIntBits(d), out);
        } catch (Exception e) {
            log.error("write float error");
            e.printStackTrace();
        }
    }

    public byte[] toByteArray() {
        return outBuffer.toByteArray();
    }
}
