package com.im.lib.net;

import com.im.api.Api;
import com.im.lib.Helpers;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.RpcResult;
import com.im.lib.entity.SessionInfo;
import com.im.lib.exception.RequestIncompleteException;
import com.im.lib.exception.ResponseException;
import com.im.lib.exception.TLException;
import com.im.lib.tl.TLClassStore;
import com.im.lib.tl.TLObject;
import com.im.redis.SessionManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

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
        if (!isEncryptedData(authKeyId)) { // 未加密数据
            long msgId = binaryReader.readInt64();
//            requestData.setMsgId(msgId);
            int dataLength = binaryReader.readInt32();
            int constructorId = binaryReader.readInt32();
            byte[] data = binaryReader.readBytes(dataLength - 4);
//            requestData.setMsgId(msgId);
            return readRequestData(constructorId, data, dataLength, requestData);
        } else { // 加密数据
            byte[] msgKey = binaryReader.readBytes(16);
            byte[] bytes = binaryReader.readAll();
            byte[] payload = mtprotoStateService.decryptData(msgKey, bytes, authKeyId);
            log.info("解密后的数据:{} {}", payload.length, Arrays.toString(payload));
//            System.out.println("解密后的数据:" + payload.length + Arrays.toString(payload));
            BinaryReader br = new BinaryReader(payload);
            mtprotoStateService.checkEncryptedData(br, requestData);
            checkHeader(requestData);
            int dataLength = br.readInt32();
            int constructorId = br.readInt32();
            byte[] data = br.readBytes(dataLength - 4);

            return readRequestData(constructorId, data, dataLength, requestData);
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

    private RequestData readRequestData(int constructorId, byte[] data, int dataLength, RequestData requestData) {
        BinaryReader binaryReader = new BinaryReader(data);
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
        } else {
            System.out.println(Integer.toHexString(constructorId));
            throw new TLException("read null TL object!");
        }
        System.out.println(tlObject);
//        Object requestParam = binaryReader.tgReadObject(constructorId);
        log.info("数据部分:{}{}", data.length, data);

        requestData.setConstructorId(constructorId);
        requestData.setData(data);
//        requestData.setRequestParam(requestParam);
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

    public void mtprotoPlainSender(byte[] bytes, Channel channel) {
        ByteBufAllocator alloc = channel.alloc();
//        SerializedDataBak serializedData = new SerializedDataBak();
//        SerializeResponse.serialize(serializedData, response);
//        byte[] bytes = serializedData.toByteArray();
//        log.info("mtprotoPlainSender返回Object：{} {}", bytes.length, Arrays.toString(bytes));
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


    public void mtprotoSender(byte[] bytes, Channel channel, BigInteger authKeyId, long sessionId) {
//        SerializedDataBak serializedData = new SerializedDataBak();
//        SerializeResponse.serialize(serializedData, response);
//        int len = serializedData.getLen();
//        byte[] randomBytes = Helpers.getRandomBytes(16 - Helpers.mod(bytes.length, 16));
//        serializedData.writeBytes(randomBytes);
//        byte[] data = serializedData.toByteArray();

        byte[] encryptData = mtprotoStateService.encryptData(bytes, authKeyId, sessionId);
        byte[] prefix = tcpAbridged.encodePacket(encryptData.length);

        ByteBufAllocator alloc = channel.alloc();
        ByteBuf byteBuf = alloc.directBuffer(prefix.length + encryptData.length);
        byteBuf.writeBytes(Helpers.concat(prefix, encryptData));

        channel.writeAndFlush(new BinaryWebSocketFrame(byteBuf));
    }

    public void sendData(RpcResult response, Channel channel) {
        if (response == null) {
            throw new ResponseException("response can't be null");
        }
        log.info("返回的RpcResult:{}", response);
        SerializedData stream = new SerializedData();
        response.getResponse().serializeToStream(stream);

        byte[] randomBytes = Helpers.getRandomBytes(16 - Helpers.mod(stream.length(), 16));
        stream.writeBytes(randomBytes);
        byte[] byteArray = stream.toByteArray();
        log.info("返回对象的字节数组：{}{}", byteArray.length, Arrays.toString(byteArray));
        try {
            if (response.getAuthKeyId().compareTo(BigInteger.ZERO) != 0) { // Encrypted data
                this.mtprotoSender(byteArray, channel, response.getAuthKeyId(), response.getSessionId());
            } else { // Unencrypted data
                this.mtprotoPlainSender(byteArray, channel);
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
