package com.im.lib.net;

import com.im.lib.Helpers;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.RpcResult;
import com.im.lib.entity.SessionInfo;
import com.im.lib.exception.BadRequestException;
import com.im.lib.exception.ResponseException;
import com.im.lib.exception.TLException;
import com.im.lib.exception.UnauthorizedException;
import com.im.lib.tl.MTProtoApi;
import com.im.lib.tl.TLClassStore;
import com.im.lib.tl.TLHelpers;
import com.im.lib.tl.TLObject;
import com.im.redis.SessionManager;
import com.im.utils.TimeUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.util.Arrays;

@Slf4j
@Component
public class MTProto {

    private final MTProtoStateService mtprotoStateService;
    private final TcpAbridged tcpAbridged;
    private final SessionManager sessionManager;
    private final DispatcherWebsocket dispatcherWebsocket;
    private final ResultHandler resultHandler;

    @Autowired
    public MTProto(final MTProtoStateService mtprotoStateService,
                   final TcpAbridged tcpAbridged,
                   final SessionManager sessionManager,
                   final DispatcherWebsocket dispatcherWebsocket,
                   ResultHandler resultHandler) {
        this.mtprotoStateService = mtprotoStateService;
        this.tcpAbridged = tcpAbridged;
        this.sessionManager = sessionManager;
        this.dispatcherWebsocket = dispatcherWebsocket;
        this.resultHandler = resultHandler;
    }

    public void processRequest(ByteBuf byteBuf, Channel channel) {
        RpcResult rpcResult;
        RequestData requestData = new RequestData();
        try {
            if (byteBuf.capacity() < 8) {
                log.error("Websocket request's length < 8");
                return; // client error, ignore it.
            }
            ByteBuf buffer = tcpAbridged.readPacket(byteBuf);
            BinaryReader binaryReader = new BinaryReader(buffer);
            long authKeyId = binaryReader.readInt64();
            requestData.authKeyId = authKeyId;
            /*
              Unencrypted data only appears during the handshake, so this case is likely to be hit
              encrypted data, greater than 48 bytes
             */
            if (isEncryptedData(authKeyId)) {
                if (binaryReader.size() < 48) { // client error, ignore it.
                    log.error("unencrypted data length can't less than 48");
                    return;
                }
                byte[] msgKey = binaryReader.readBytes(16);
                byte[] bytes = binaryReader.readAll();
                byte[] payload = mtprotoStateService.decryptData(msgKey, bytes, authKeyId);
//            log.info("解密后的数据:{} {}", payload.length, Arrays.toString(payload));
                System.out.println("解密后的数据:" + payload.length + Arrays.toString(payload));
                BinaryReader br = new BinaryReader(payload);
                mtprotoStateService.readEncryptedDataHeader(br, requestData);
                storeSession(requestData);
                MTProtoApi.Bad_server_salt badServerSalt = checkHeader(requestData);
                if (badServerSalt != null) {
                    sendData(RpcResult.ok(authKeyId, badServerSalt, requestData.sessionId, requestData.msgId), channel);
                    return;
                }
                int dataLength = br.readInt32();
                int constructorId = br.readInt32();
                byte[] data = br.readBytes(dataLength - 4);

                readRequestData(constructorId, data, requestData);
            } else { // unencrypted data, greater than 12 bytes
                if (binaryReader.size() < 12) { // client error, ignore it.
                    log.error("unencrypted data length can't less than 12");
                    return;
                }
                binaryReader.readInt64();
                int dataLength = binaryReader.readInt32();
                int constructorId = binaryReader.readInt32();
                byte[] data = binaryReader.readBytes(dataLength - 4);
                readRequestData(constructorId, data, requestData);
            }

            rpcResult = dispatcherWebsocket.dispatcherRequest(requestData, channel);
            this.sendData(rpcResult, channel);
        } catch (Exception exception) {
            rpcResult = RpcResult.ok(requestData.authKeyId, null, requestData.sessionId, requestData.msgId);
            errorHandling(exception, rpcResult, channel);
        }
    }

    private MTProtoApi.Bad_server_salt checkHeader(RequestData requestData) {
        if (requestData.serverSalt == 0) {
            MTProtoApi.Bad_server_salt badServerSalt = new MTProtoApi.Bad_server_salt();
            badServerSalt.bad_msg_id = requestData.msgId;
            badServerSalt.bad_msg_seqno = requestData.seqNo;
            badServerSalt.error_code = ErrorInfo.BAD_SERVER_SALT.code;
            badServerSalt.new_server_salt = mtprotoStateService.getNewServerSalt();

            return badServerSalt;
        }
        return null;
    }

    private void readRequestData(int constructorId, byte[] data, RequestData requestData) {
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
        log.info("数据部分:{}{}", data.length, data);

        requestData.constructorId = constructorId;
        requestData.data = data;
        requestData.tlObject = tlObject;
    }

    /**
     * 判断是否是加密数据
     * @param authKeyId 授权密钥id
     */
    public boolean isEncryptedData(long authKeyId) {
        return authKeyId != 0;
    }

    public void mtprotoPlainSender(byte[] bytes, Channel channel) {
        ByteBufAllocator alloc = channel.alloc();
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


    public void mtprotoSender(byte[] bytes, Channel channel, long authKeyId, long sessionId) {
        byte[] encryptData = mtprotoStateService.encryptData(bytes, authKeyId, sessionId);
        byte[] prefix = tcpAbridged.encodePacket(encryptData.length);

        ByteBufAllocator alloc = channel.alloc();
        ByteBuf byteBuf = alloc.directBuffer(prefix.length + encryptData.length);
        byteBuf.writeBytes(Helpers.concat(prefix, encryptData));

        channel.writeAndFlush(new BinaryWebSocketFrame(byteBuf));
    }

    public void mtprotoSender(byte[] bytes, Channel channel) {
        byte[] packet = tcpAbridged.encodePacket(bytes.length);

        ByteBufAllocator alloc = channel.alloc();
        ByteBuf byteBuf = alloc.directBuffer(packet.length + bytes.length);
        byteBuf.writeBytes(packet);
        byteBuf.writeBytes(bytes);

        channel.writeAndFlush(new BinaryWebSocketFrame(byteBuf));
    }

    public void sendData(RpcResult rpcResult, Channel channel) {
        if (rpcResult == null) {
            throw new ResponseException("response can't be null");
        }
        log.info("返回的RpcResult:{}", rpcResult);
        try {
            if (isEncryptedData(rpcResult.getAuthKeyId())) { // Encrypted data
                SerializedData stream = new SerializedData();
                if (!TLHelpers.handlerSet.contains(rpcResult.getTlObject().getClass())) {
                    byte[] bytes = resultHandler.rpcResultHandling(rpcResult.getMsgId(), rpcResult.getTlObject());
                    System.out.println("RPCResult Bytes: " + Arrays.toString(bytes));
                    stream.writeBytes(bytes);
                } else {
                    rpcResult.getTlObject().serializeToStream(stream);
                }

                byte[] randomBytes = Helpers.getRandomBytes(16 - Helpers.mod(stream.length(), 16));
                stream.writeBytes(randomBytes);
                byte[] byteArray = stream.toByteArray();
                log.info("返回对象的字节数组：{}{}", byteArray.length, Arrays.toString(byteArray));
                this.mtprotoSender(byteArray, channel, rpcResult.getAuthKeyId(), rpcResult.getSessionId());
            } else { // Unencrypted data
                TLObject tlObject = rpcResult.getTlObject();
                byte[] byteArray = TLHelpers.getBytes(tlObject);
                this.mtprotoPlainSender(byteArray, channel);
            }
        } catch (Exception e) {
            e.printStackTrace();
            errorHandling(e, rpcResult, channel);
        }
    }

    private void storeSession(RequestData requestData) {
        String key = String.valueOf(requestData.sessionId);
        if (!sessionManager.hasSession(key)) {
            sessionManager.setSessionInfo(key, SessionInfo.SALT_EXPIRE, TimeUtil.getTimestampOfAfterHalfAnHour());
        }
        sessionManager.setSessionInfo(key, SessionInfo.SEQ_NO, String.valueOf(requestData.seqNo));
        sessionManager.setSessionInfo(key, SessionInfo.SERVER_SALT, String.valueOf(requestData.serverSalt));
    }

    public void errorHandling(Exception exception, RpcResult rpcResult, Channel channel) {
        MTProtoApi.Rpc_error rpcError = new MTProtoApi.Rpc_error();
        if (exception instanceof UnauthorizedException) {
            mtprotoSender(new byte[]{108, -2, -1, -1}, channel); // -404
            return;
        } else if (exception instanceof BadRequestException) {

        } else {
            exception.printStackTrace();
        }

        rpcResult.setTlObject(rpcError);
//        sendData(rpcResult, channel);
    }
}
