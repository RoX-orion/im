package com.im.lib.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.lib.entity.RequestData;
import com.im.lib.core.BinaryReader;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.exception.RequestIncompleteException;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;

@Component
public class ParseParameter {

//    private final String EXT = "\"ext\"";
//    private final String PARAMS = "\"params\"";
//
//    private final String EMPTY_DATA = "{}";
    /*
     * --------------------
     * |  type  |  data  |
     * --------------------
     *
     */

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private MTProtoStateService mtProtoStateService;

    public RequestData getRequestData(byte[] bytes, Channel channel) {

        if (bytes.length == 0) {
            throw new RequestIncompleteException("Websocket请求不能为空");
        }

        if (!isEncryptedData(bytes)) {// 未加密数据
            System.out.println("接收到的未加密数据: " + new String(bytes));
            BinaryReader binaryReader = new BinaryReader(bytes);
            binaryReader.readInt64();
            BigInteger msgId = binaryReader.readInt64();
            return readRequestData(binaryReader);
        } else {// 加密数据
            byte[] data = mtProtoStateService.decryptData(bytes, channel);
            System.out.println("解密后的数据:" + data.length +  Arrays.toString(data));
            BinaryReader binaryReader = new BinaryReader(data);
            BigInteger salt = binaryReader.readInt64();
            BigInteger sessionId = binaryReader.readInt64();
            BigInteger msgId = binaryReader.readInt64();
            int seqNo = binaryReader.readInt32();

            return readRequestData(binaryReader);
        }
    }

    private RequestData readRequestData(BinaryReader binaryReader) {
//        BigInteger msgId = binaryReader.readInt64();
        int msgLength = binaryReader.readInt32();
        String msg = binaryReader.tgReadString();
        System.out.println("数据部分:" + msg);
        RequestData requestData = new RequestData();
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap<String, Object> map;
        try {
            map = objectMapper.readValue(msg, HashMap.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        Object type = map.get("type");
        if (map.get("type") == null) {
            throw new RequestIncompleteException("必须指定请求的type属性");
        }
        requestData.setType(String.valueOf(type));
        map.remove("type");
        requestData.setData(map);

        return requestData;
    }

    /**
     * 判断是否是加密数据
     * @param bytes 请求数据
     */
    public boolean isEncryptedData(byte[] bytes) {
        for (int i = 0; i < 8; i++) {
            if (bytes[i] != 0) {
                return true;
            }
        }
        return false;
    }
}
