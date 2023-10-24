package com.im.lib.net;

import com.im.lib.BinaryHelpers;
import com.im.lib.Helpers;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.entity.ConnectSession;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.RpcResult;
import com.im.lib.exception.BadRequestException;
import com.im.lib.exception.RpcError;
import com.im.lib.exception.ServerException;
import com.im.lib.exception.UnauthorizedException;
import com.im.lib.tl.*;
import com.im.redis.SessionManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Component
public class MTProto {

    private final MTProtoStateService mtprotoStateService;
    private final TcpAbridged tcpAbridged;
    private final SessionManager sessionManager;
    private final DispatcherWebsocket dispatcherWebsocket;
    private final ResultHandler resultHandler;
    private final StringRedisTemplate stringRedisTemplate;

    @Autowired
    public MTProto(final MTProtoStateService mtprotoStateService,
                   final TcpAbridged tcpAbridged,
                   final SessionManager sessionManager,
                   final DispatcherWebsocket dispatcherWebsocket,
                   final ResultHandler resultHandler,
                   final StringRedisTemplate stringRedisTemplate) {
        this.mtprotoStateService = mtprotoStateService;
        this.tcpAbridged = tcpAbridged;
        this.sessionManager = sessionManager;
        this.dispatcherWebsocket = dispatcherWebsocket;
        this.resultHandler = resultHandler;
        this.stringRedisTemplate = stringRedisTemplate;
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
            requestData.channelId = channel.id().asLongText();
            // Unencrypted data only appears during the handshake, so this case is likely to be hit.
            // encrypted data, greater than 48 bytes.
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
                storeSession(requestData, channel);
                MTProtoApi.Bad_server_salt badServerSalt = checkHeader(requestData);
                if (badServerSalt != null) {
                    rpcResult = RpcResult.ok(authKeyId, badServerSalt, requestData.sessionId, requestData.msgId, requestData.channelId);
                    sendData(rpcResult, channel);
//                    messageQueue.sendResponseToKafka(rpcResult);
                    return;
                }
                int dataLength = br.readInt32();
                int constructorId = br.readInt32();
                byte[] data = br.readBytes(dataLength - 4);
                BinaryHelpers.releaseBuffer(buffer);

                readRequestData(constructorId, data, requestData, channel);
            } else { // unencrypted data, greater than 12 bytes
                if (binaryReader.size() < 12) { // client error, ignore it.
                    log.error("unencrypted data length can't less than 12");
                    return;
                }
                binaryReader.readInt64();
                int dataLength = binaryReader.readInt32();
                int constructorId = binaryReader.readInt32();
                byte[] data = binaryReader.readBytes(dataLength - 4);
                BinaryHelpers.releaseBuffer(buffer);

                readRequestData(constructorId, data, requestData, channel);
            }
        } catch (Exception exception) {
            rpcResult = RpcResult.ok(requestData.authKeyId, null, requestData.sessionId, requestData.msgId, channel.id().asLongText());
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

    private void readRequestData(int constructorId, byte[] data, RequestData requestData, Channel channel) {
        log.debug("数据部分:{}{}", data.length, data);
        if (constructorId == 0x73f1f8dc) { // msg_container
            MTProtoApi.Msg_container msgContainer = MsgContainer.read(data);
            for (RequestData message : msgContainer.messages) {
                message.authKeyId = requestData.authKeyId;
                message.serverSalt = requestData.serverSalt;
                message.sessionId = requestData.sessionId;
                System.out.println(message.tlObject);
                dispatcherWebsocket(message, channel);
//                messageQueue.sendRequestToKafka(message);
            }
        } else {
            TLObject tlObject;
            try {
                tlObject = (TLObject) TLClassStore.getClass(constructorId).getConstructor().newInstance();
                SerializedData serializedData = new SerializedData(data);
                tlObject.readParams(serializedData);
            } catch (Exception e) {
                log.error("read null TL object({})!", Integer.toHexString(constructorId));
                return;
            }
            System.out.println(tlObject);

            requestData.constructorId = constructorId;
            requestData.tlObject = tlObject;

            dispatcherWebsocket(requestData, channel);
//            messageQueue.sendRequestToKafka(requestData);
        }
    }

    /**
     * Is it encrypted data
     * @param authKeyId authKeyId
     */
    public boolean isEncryptedData(long authKeyId) {
        return authKeyId != 0;
    }

//    @KafkaListener(topics = Constant.WS_REQUEST_TOPIC, groupId = "ws")
    public void dispatcherWebsocket(RequestData requestData, Channel channel) {
        if (channel == null) {
            log.error("未找到channel！");
            return;
        }
        log.debug("MsgId = {}, TL Object = {}", requestData.msgId, requestData.tlObject);
        RpcResult rpcResult = RpcResult.ok(requestData.authKeyId, null, requestData.sessionId, requestData.msgId, requestData.channelId);
        try {
            rpcResult = dispatcherWebsocket.dispatcherRequest(requestData, channel);
            if (rpcResult.getTlObject() != null) {
                sendData(rpcResult, channel);
            }
//            kafkaTemplate.send(Constant.WS_RESPONSE_TOPIC, rpcResult);
        } catch (RpcError exception) {
            errorHandling(exception, rpcResult, channel);
        }
    }

    public void mtprotoPlainSender(byte[] bytes, Channel channel) {
        ByteBufAllocator alloc = channel.alloc();
        long msgId = mtprotoStateService.getNewMsgId(true);
        ByteBuf byteBuf = alloc.heapBuffer(20 + bytes.length);
        byteBuf.writeLongLE(0);
        byteBuf.writeLongLE(msgId);
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

//    @KafkaListener(topics = Constant.WS_RESPONSE_TOPIC, groupId = "ws")
    public void sendData(RpcResult rpcResult, Channel channel) {
        log.debug("返回的RpcResult:{}", rpcResult);
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
                log.debug("返回对象的字节数组：{}{}", byteArray.length, Arrays.toString(byteArray));
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

    private void storeSession(RequestData requestData, Channel channel) {
        String key = String.valueOf(requestData.sessionId);
        if (!sessionManager.hasSession(key)) {
            String channelId = channel.id().asLongText();
            ConnectSession connectSession = new ConnectSession();
//            connectSession.set
            sessionManager.setSessionId(channelId, requestData.sessionId);
//            sessionManager.setSessionInfo(key, SessionManager.SERVER_SALT_EXPIRE, TimeUtil.getFeatureTimestamp(1800000)); // 30 min
//            sessionManager.setSessionInfo(key, SessionManager.CHANNEL_ID, channelId);
//            sessionManager.setSessionInfo(key, SessionManager.IS_LOGIN, Boolean.FALSE);
//            sessionManager.setSessionInfo(key, SessionManager.READY_LOGIN, Boolean.FALSE);
//            sessionManager.setSessionInfo(key, SessionManager.AUTH_KEY, sessionManager.getAuthKey(String.valueOf(requestData.authKeyId)));
//            sessionManager.setSessionInfo(key, SessionManager.SERVER_SALT, String.valueOf(requestData.serverSalt));
//            sessionManager.setSessionInfo(key, SessionManager.SEQ_NO, String.valueOf(requestData.seqNo));

            MTProtoApi.New_session_create newSessionCreate = new MTProtoApi.New_session_create();
            newSessionCreate.first_msg_id = requestData.msgId;
            newSessionCreate.unique_id = Helpers.getRandomInt64();
            newSessionCreate.server_salt = requestData.serverSalt;

            RpcResult rpcResult = RpcResult.ok(requestData.authKeyId, newSessionCreate, requestData.sessionId, requestData.msgId, requestData.channelId);
//            messageQueue.sendResponseToKafka(rpcResult);
            sendData(rpcResult, channel);
        }
//        sessionManager.setSessionInfo(key, SessionManager.SEQ_NO, String.valueOf(requestData.seqNo));
    }

    public void errorHandling(Exception exception, RpcResult rpcResult, Channel channel) {
        if (exception instanceof RpcError rpcError) {
            MTProtoApi.Rpc_error rpc_error = new MTProtoApi.Rpc_error();
            rpc_error.error_code = rpcError.errorCode;
            rpc_error.error_message = rpcError.errorMessage;
            rpcResult.setTlObject(rpc_error);
            sendData(rpcResult, channel);
        } else if (exception instanceof UnauthorizedException) {
            mtprotoSender(new byte[]{108, -2, -1, -1}, channel); // -404
        } else if (exception instanceof BadRequestException) {

        } else if (exception instanceof ServerException serverException) {

        } else {
            exception.printStackTrace();
        }

//        sendData(rpcResult, channel);
    }
}
