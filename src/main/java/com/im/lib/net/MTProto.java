package com.im.lib.net;

import com.im.lib.Helpers;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.WsApiResult;
import com.im.lib.exception.RequestIncompleteException;
import com.im.lib.exception.ResponseException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Arrays;

@Slf4j
@Component
public class MTProto {

    @Resource
    private MTProtoStateService mtprotoStateService;

    @Resource
    private TcpAbridged tcpAbridged;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public RequestData getRequestData(ByteBuf byteBuf, Channel channel) {
        if (byteBuf.capacity() == 0) {
            throw new RequestIncompleteException("Websocket request can't be null");
        }

        ByteBuf buffer = tcpAbridged.readPacket(byteBuf);
        BinaryReader binaryReader = new BinaryReader(buffer);
        byte[] authKeyBytes = binaryReader.readBytes(8);
        BigInteger authKeyId = Helpers.readBigIntegerFromBytes(authKeyBytes, true, false);
        RequestData requestData = new RequestData();
        if (!isEncryptedData(authKeyId)) {// 未加密数据
            long msgId = binaryReader.readInt64();
//            requestData.setMsgId(msgId);
            int dataLength = binaryReader.readInt32();
            byte[] data = binaryReader.readBytes(dataLength);
//            requestData.setMsgId(msgId);
            return readRequestData(data, dataLength, authKeyId, requestData);
        } else {// 加密数据
            byte[] msgKey = binaryReader.readBytes(16);
            byte[] bytes = binaryReader.readAll();
            byte[] payload = mtprotoStateService.decryptData(msgKey, bytes, authKeyId);
            log.info("解密后的数据:{} {}", payload.length, Arrays.toString(payload));
//            System.out.println("解密后的数据:" + payload.length + Arrays.toString(payload));
            BinaryReader br = new BinaryReader(payload);
            mtprotoStateService.checkEncryptedData(br, requestData);
            int dataLength = br.readInt32();
            byte[] data = br.readBytes(dataLength);

            return readRequestData(data, dataLength, authKeyId, requestData);
        }
    }

    private RequestData readRequestData(byte[] data, int dataLength, BigInteger authKeyId, RequestData requestData) {
        BinaryReader binaryReader = new BinaryReader(data);
        int constructorId = binaryReader.readInt32();
        Object requestParam = binaryReader.tgReadObject(constructorId);
        log.info("数据部分:{}", data);

        requestData.setConstructorId(constructorId);
        requestData.setData(data);
        requestData.setRequestParam(requestParam);
        requestData.setAuthKeyId(authKeyId);

        return requestData;
    }

    /**
     * 判断是否是加密数据
     * @param authKeyId 授权密钥id
     */
    public boolean isEncryptedData(BigInteger authKeyId) {
        return authKeyId.compareTo(BigInteger.ZERO) != 0;
    }

    public void mtprotoPlainSender(WsApiResult response, Channel channel) {
        System.out.println(response.getData());
        ByteBufAllocator alloc = channel.alloc();
        SerializedDataBak serializedData = new SerializedDataBak();
        SerializeResponse.serialize(serializedData, response);
        byte[] bytes = serializedData.toByteArray();
        log.info("返回数据：{} {}", bytes.length, Arrays.toString(bytes));
//        System.out.println(bytes.length + Arrays.toString(bytes));
        BigInteger msgId = mtprotoStateService.getNewMsgId(true);
        ByteBuf byteBuf = alloc.heapBuffer(20 + bytes.length);
        byteBuf.writeLongLE(0);
        byteBuf.writeLongLE(msgId.longValue());
        byteBuf.writeIntLE(bytes.length);
        byteBuf.writeBytes(bytes);

        System.out.println(byteBuf.capacity() + ":" + byteBuf.readableBytes());
        byte[] prefix = tcpAbridged.encodePacket(byteBuf.readableBytes());
        ByteBuf buffer = alloc.directBuffer(prefix.length + byteBuf.capacity());
        buffer.writeBytes(prefix);
        buffer.writeBytes(byteBuf);

        channel.writeAndFlush(new BinaryWebSocketFrame(buffer));

        byteBuf.release();
    }


    public void mtprotoSender(WsApiResult response, Channel channel) {
        System.out.println(response);
        int constructorId = response.getConstructorId();
        SerializedDataBak serializedData = new SerializedDataBak();
        SerializeResponse.serialize(serializedData, response);
        System.out.println(Arrays.toString(serializedData.toByteArray()));
        BigInteger msgId = mtprotoStateService.getNewMsgId(true);
        BigInteger authKeyId = response.getAuthKeyId();

    }

    public void sendData(WsApiResult response, Channel channel) {
        if (response == null) {
            throw new ResponseException("response can't be null");
        }
        try {
            if (response.getAuthKeyId().compareTo(BigInteger.ZERO) != 0) { // 加密数据
                this.mtprotoSender(response, channel);
            } else {// 未加密数据
                this.mtprotoPlainSender(response, channel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
