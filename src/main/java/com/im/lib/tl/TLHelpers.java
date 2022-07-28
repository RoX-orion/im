package com.im.lib.tl;

import java.util.*;

public class TLHelpers {
    public static Set<Long> CORE_TYPES = new HashSet<>(Arrays.asList(
            0xbc799737L, // boolFalse#bc799737 = Bool;
            0x997275b5L, // boolTrue#997275b5 = Bool;
            0x3fedd339L, // true#3fedd339 = True;
            0xc4b9f9bbL, // error#c4b9f9bb code:int text:string = Error;
            0x56730bccL  // null#56730bcc = Null;
    ));
    public static Set<Integer> AUTH_KEY_TYPES = new HashSet<>(Arrays.asList(
            0xbe7e8ef1, // req_pq_multi
            0x05162463, // resPQ,
            0x83c95aec, // p_q_inner_data
            0xa9f55f95, // p_q_inner_data_dc
            0x3c6a84d4, // p_q_inner_data_temp
            0x56fddf88, // p_q_inner_data_temp_dc
            0xd0e8075c, // server_DH_params_ok
            0xb5890dba, // server_DH_inner_data
            0x6643b654, // client_DH_inner_data
            0xd712e4be, // req_DH_params
            0xf5045f1f, // set_client_DH_params
            0x3072cfa1  // gzip_packed
    ));

    public static Set<String> BASE_TYPE = new HashSet<>(Arrays.asList(
            "String", "Boolean", "boolean", "int",
            "Integer", "Long", "long", "BigInteger",
            "double", "byte", "Bool"
    ));

    public static Map<Integer, String> CORE_TYPE = new HashMap<>();
    static {
        CORE_TYPE.put(0xf35c6d01, "RPCResult");
        CORE_TYPE.put(0x3072cfa1, "GZIPPacked");
        CORE_TYPE.put(0x73f1f8dc, "MessageContainer");
    }

    public static Set<String> CONFLICTING_FIELD = new HashSet<>(Arrays.asList(
            "long", "default", "static", "public", "final", "private"
    ));
    public static final String suffix = "Suffix";
    private static int[] crcTable;

    public static long hexToLong(String hexString) {
        long result = 0;
        char c;
        for (int i = 0; i < hexString.length(); i++) {
            c = hexString.charAt(i);
            if (c >= '0' && c <= '9') {
                result = result << 4 | c - '0';
            } else if (c >= 'A' && c <= 'F') {
                result = result << 4 | c - 'A' + 10;
            } else if (c >= 'a' && c <= 'f') {
                result = result << 4 | c - 'a' + 10;
            } else {
                throw new RuntimeException("Illegal hex string!");
            }
        }

        return result;
    }

    public static int[] makeCRCTable() {
        int c;
        int[] crcTable = new int[256];
        for (int n = 0; n < 256; n++) {
            c = n;
            for (int k = 0; k < 8; k++) {
                c = ((c & 1) == 1 ? (0xEDB88320 ^ (c >>> 1)) : (c >>> 1));
            }
            crcTable[n] = c;
        }
        return crcTable;
    }

    public static int crc32(String buf) {
        if (crcTable == null) {
            crcTable = makeCRCTable();
        }

        byte[] buffer = buf.getBytes();
        int crc = -1;
        for (byte b : buffer) {
            crc = crcTable[(crc ^ b) & 0xff] ^ crc >>> 8;
        }
        return ~crc;
    }
}
