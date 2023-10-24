package com.im.lib.tl;

import com.im.TLParser;
import com.im.lib.net.AbstractSerializedData;
import com.im.lib.net.SerializedData;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class TLHelpers {
    public static Set<Integer> CORE_TYPES = new HashSet<>(Arrays.asList(
            0xbc799737, // boolFalse#bc799737 = Bool;
            0x997275b5, // boolTrue#997275b5 = Bool;
            0x3fedd339, // true#3fedd339 = True;
            0xc4b9f9bb, // error#c4b9f9bb code:int text:string = Error;
            0x56730bcc  // null#56730bcc = Null;
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
            "double", "byte", "Bool", "byte[]"
    ));

    public static Map<Integer, String> CORE_TYPE = new HashMap<>();
    static {
        CORE_TYPE.put(0xf35c6d01, "RPCResult");
        CORE_TYPE.put(0x3072cfa1, "GZIPPacked");
        CORE_TYPE.put(0x73f1f8dc, "MessageContainer");
    }

    public static Set<String> CONFLICTING_FIELD = new HashSet<>(Arrays.asList(
            "long", "default", "static", "public", "final", "private", "short"
    ));
    public static final String suffix = "Suffix";
    private static int[] crcTable;

    public static final HashSet<Class<?>> handlerSet = new HashSet<>(Arrays.asList(
            MTProtoApi.Pong.class, MTProtoApi.Bad_server_salt.class
    ));


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

    public static TLObject getTLObject(byte[] data) {
        SerializedData stream = new SerializedData(data);
        try {
            TLObject tlObject = (TLObject) TLClassStore.getClass(stream.readInt32()).getConstructor().newInstance();
            tlObject.readParams(stream);
            return tlObject;
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] getBytes(TLObject tlObject) {
        SerializedData stream = new SerializedData();
        tlObject.serializeToStream(stream);
        return stream.toByteArray();
    }

    public static int checkVector(AbstractSerializedData stream) {
        int magic = stream.readInt32();
        if (magic != 0x1cb5c415) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", magic));
        }
        return stream.readInt32();
    }

    public static void checkConstructor() {
        List<String> typeList = new ArrayList<>();
        Set<String> constructorSet = new HashSet<>();
        readTLFile("api.tl", typeList);
        readTLFile("schema.tl", typeList);
        for (String type : typeList) {
            int index = type.indexOf('#');
            if (index == -1) continue;
            String constructorId = type.substring(index + 1, index + 9);
            constructorSet.add(constructorId);
        }

        for (Map.Entry<Integer, Class<?>> entry : TLClassStore.getAllClass().entrySet()) {
            Field constructor;
            try {
                constructor = entry.getValue().getDeclaredField("constructor");
                String constructorId = Integer.toHexString(constructor.getInt(null));
                if (!constructorSet.contains(constructorId)) {
                    System.out.println(entry.getValue().getSimpleName() + ":" + constructorId);
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void readTLFile(String fileName, List<String> typeList) {
        File file = new File(Objects.requireNonNull(TLParser.class.getClassLoader().getResource("tl/" + fileName)).getFile());
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (StringUtils.hasText(line)) {
                    typeList.add(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
