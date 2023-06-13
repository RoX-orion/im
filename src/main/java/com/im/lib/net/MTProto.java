package com.im.lib.net;

import com.im.api.Api;
import com.im.lib.Helpers;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.SessionInfo;
import com.im.lib.entity.WsApiResult;
import com.im.lib.exception.RequestIncompleteException;
import com.im.lib.exception.ResponseException;
import com.im.redis.SessionManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
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
    private SessionManager sessionManager;

    public RequestData getRequestData(ByteBuf byteBuf, Channel channel) {
        if (byteBuf.capacity() == 0) {
            throw new RequestIncompleteException("Websocket request can't be null");
        }

        ByteBuf buffer = tcpAbridged.readPacket(byteBuf);
        BinaryReader binaryReader = new BinaryReader(buffer);
        byte[] authKeyBytes = binaryReader.readBytes(8);
        BigInteger authKeyId = Helpers.readBigIntegerFromBytes(authKeyBytes, true, false);
//        BigInteger bigInteger = new BigInteger(authKeyBytes);
        RequestData requestData = new RequestData();
        requestData.setAuthKeyId(authKeyId);
        if (!isEncryptedData(authKeyId)) {// 未加密数据
            long msgId = binaryReader.readInt64();
//            requestData.setMsgId(msgId);
            int dataLength = binaryReader.readInt32();
            byte[] data = binaryReader.readBytes(dataLength);
//            requestData.setMsgId(msgId);
            return readRequestData(data, dataLength, requestData);
        } else {// 加密数据
            byte[] msgKey = binaryReader.readBytes(16);
            byte[] bytes = binaryReader.readAll();
            byte[] payload = mtprotoStateService.decryptData(msgKey, bytes, authKeyId);
            log.info("解密后的数据:{} {}", payload.length, Arrays.toString(payload));
//            System.out.println("解密后的数据:" + payload.length + Arrays.toString(payload));
            BinaryReader br = new BinaryReader(payload);
            mtprotoStateService.checkEncryptedData(br, requestData);
            checkHeader(requestData);
            int dataLength = br.readInt32();
            byte[] data = br.readBytes(dataLength);

            return readRequestData(data, dataLength, requestData);
        }
    }

    private void checkHeader(RequestData requestData) {
        long serverSalt = requestData.getServerSalt();
        if (serverSalt == 0) {
            Api.BadServerSalt badServerSalt = new Api.BadServerSalt();
            badServerSalt.setNewServerSalt(mtprotoStateService.getNewServerSalt());
//            badServerSalt.setBadMsgId();
//            WsApiResult ok = WsApiResult.ok(requestData.getAuthKeyId(), Api.BadServerSalt.class, );
        }
    }

    private RequestData readRequestData(byte[] data, int dataLength, RequestData requestData) {
        BinaryReader binaryReader = new BinaryReader(data);
        int constructorId = binaryReader.readInt32();
        Class<?> clazz = TLClassStore.getClass(constructorId);
        TLObject tlObject = null;
        if (clazz != null) {
            try {
                tlObject = (TLObject) clazz.getConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
        if (tlObject != null) {
            SerializedData serializedData = new SerializedData(data);
            tlObject.readParams(serializedData);
        }
        System.out.println(tlObject);
        Object requestParam = binaryReader.tgReadObject(constructorId);
        log.info("数据部分:{}", data);

        requestData.setConstructorId(constructorId);
        requestData.setData(data);
        requestData.setRequestParam(requestParam);
        requestData.setAuthKeyId(requestData.getAuthKeyId());
        requestData.setTlObject(tlObject);

        if (constructorId == 0xda9b0d0d) {
            storeSession(requestData);
        }

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
        log.info("mtprotoPlainSender返回数据:{}", response.getData());
        ByteBufAllocator alloc = channel.alloc();
        SerializedDataBak serializedData = new SerializedDataBak();
        SerializeResponse.serialize(serializedData, response);
        byte[] bytes = serializedData.toByteArray();
        log.info("mtprotoPlainSender返回Object：{} {}", bytes.length, Arrays.toString(bytes));
//        System.out.println(bytes.length + Arrays.toString(bytes));
        BigInteger msgId = mtprotoStateService.getNewMsgId(true);
        ByteBuf byteBuf = alloc.heapBuffer(20 + bytes.length);
        byteBuf.writeLongLE(0);
        byteBuf.writeLongLE(msgId.longValue());
        byteBuf.writeIntLE(bytes.length);
        byteBuf.writeBytes(bytes);

        byte[] prefix = tcpAbridged.encodePacket(byteBuf.readableBytes());
        ByteBuf buffer = alloc.directBuffer(prefix.length + byteBuf.capacity());
        buffer.writeBytes(prefix);
        buffer.writeBytes(byteBuf);

        channel.writeAndFlush(new BinaryWebSocketFrame(buffer));

        byteBuf.release();
    }


    public void mtprotoSender(WsApiResult response, Channel channel) {
        log.info("返回的WsApiResult:{}", response);
        SerializedDataBak serializedData = new SerializedDataBak();
        SerializeResponse.serialize(serializedData, response);
        log.info("返回对象的字节数组：{}", Arrays.toString(serializedData.toByteArray()));
        int len = serializedData.getLen();
        byte[] randomBytes = Helpers.getRandomBytes(16 - Helpers.mod(len, 16));
        serializedData.writeBytes(randomBytes);
        byte[] data = serializedData.toByteArray();

        byte[] encryptData = mtprotoStateService.encryptData(data, response.getAuthKeyId(), response.getSessionId());
        byte[] prefix = tcpAbridged.encodePacket(encryptData.length);

        ByteBufAllocator alloc = channel.alloc();
        ByteBuf byteBuf = alloc.directBuffer(prefix.length + encryptData.length);
        byteBuf.writeBytes(Helpers.concat(prefix, encryptData));

        channel.writeAndFlush(new BinaryWebSocketFrame(byteBuf));
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

    private void storeSession(RequestData requestData) {
        sessionManager.setSessionInfo(requestData.getAuthKeyId().toString(), SessionInfo.SESSION_ID, requestData.getSessionId());
        sessionManager.setSessionInfo(requestData.getAuthKeyId().toString(), SessionInfo.SEQ_NO, requestData.getSeqNo());
        sessionManager.setSessionInfo(requestData.getAuthKeyId().toString(), SessionInfo.SERVER_SALT, requestData.getServerSalt());
    }
}
