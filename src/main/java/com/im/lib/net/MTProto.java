package com.im.lib.net;

import com.im.lib.core.MTProtoStateService;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.WsApiResult;
import com.im.lib.exception.RequestIncompleteException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

@Slf4j
@Component
public class MTProto {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private MTProtoStateService mtprotoStateService;

    @Resource
    private TcpAbridged tcpAbridged;

    @Resource
    private SerializeResponse serializeResponse;

    public RequestData getRequestData(ByteBuf byteBuf, Channel channel) {

        if (byteBuf.capacity() == 0) {
            throw new RequestIncompleteException("Websocket请求不能为空");
        }

        ByteBuf buffer = tcpAbridged.readPacket(byteBuf);
        BinaryReader binaryReader = new BinaryReader(buffer);
        long authKeyId = binaryReader.readInt64();
        if (!isEncryptedData(authKeyId)) {// 未加密数据
            long msgId = binaryReader.readInt64();
            int dataLength = binaryReader.readInt32();

            return readRequestData(binaryReader, dataLength, authKeyId);
        } else {// 加密数据
            byte[] msgKey = binaryReader.readBytes(16);
            byte[] bytes = binaryReader.readAll();
            byte[] payload = mtprotoStateService.decryptData(msgKey, bytes, channel);
            log.info("解密后的数据:{} {}", payload.length, Arrays.toString(payload));
//            System.out.println("解密后的数据:" + payload.length + Arrays.toString(payload));
            BinaryReader br = new BinaryReader(payload);
            mtprotoStateService.checkEncryptedData(br, authKeyId);
            int dataLength = br.readInt32();
            return readRequestData(br, dataLength, authKeyId);
        }
    }

    private RequestData readRequestData(BinaryReader binaryReader, int dataLength, long authKeyId) {
        int constructorId = binaryReader.readInt32();
        Object requestParam = binaryReader.tgReadObject(constructorId);
        log.info("数据部分:{}", requestParam);
//        System.out.println("数据部分:" + requestParam);
        RequestData requestData = new RequestData();
        requestData.setConstructorId(constructorId);
        requestData.setRequestParam(requestParam);
        requestData.setAuthKeyId(authKeyId);

        return requestData;
    }

    /**
     * 判断是否是加密数据
     * @param authKeyId 授权密钥id
     */
    public boolean isEncryptedData(long authKeyId) {
        return authKeyId != 0;
    }

    public void mtprotoPlainSender(WsApiResult response, Channel channel) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(response.getData());
        ByteBufAllocator alloc = channel.alloc();
        SerializedData serializedData = new SerializedData();
        serializeResponse.serialize(serializedData, response.getConstructorId(), response);
        byte[] bytes = serializedData.toByteArray();
        log.info("返回数据：{} {}", bytes.length, Arrays.toString(bytes));
//        System.out.println(bytes.length + Arrays.toString(bytes));
        BigInteger msgId = mtprotoStateService.getNewMsgId();
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


    public void writeResponse(WsApiResult response, Channel channel) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(response);
        int constructorId = response.getConstructorId();
        SerializedData serializedData = new SerializedData();
        serializeResponse.serialize(serializedData, constructorId, response);
        System.out.println(Arrays.toString(serializedData.toByteArray()));
//        Helpers.printByteBuf(buffer);
        BigInteger msgId = mtprotoStateService.getNewMsgId();

//        DataOutputStream dataOutputStream = new DataOutputStream();

//        Helpers.printByteBuf(byteBuf);
//        channel.writeAndFlush(new BinaryWebSocketFrame(byteBuf));

//        if (TLHelpers.AUTH_KEY_TYPES.contains(constructorId)) {
//
//            buffer = buffer.readBytes(buffer.readableBytes());
//            System.out.println(buffer.capacity());
//            Helpers.printByteBuf(buffer);
//            buffer.resetReaderIndex();
//            channel.writeAndFlush(new BinaryWebSocketFrame(buffer));
//        } else {
//            System.out.println("加密");
//        }
//            if (!data.getType().equals("dh")) {
//                byte[] authKey = Helpers.hexStringToByteArray(
//                        Objects.requireNonNull(stringRedisTemplate.opsForValue().get(Constant.CHANNEL_ID_AUTH_KEY + channel.id().asShortText()))
//                );
//                System.out.println("未加密字节数组:" + resp.length + Arrays.toString(resp));
//                resp = mtProtoStateService.encryptData(resp, authKey);
//                System.out.println("返回加密密文: " + resp.length + Arrays.toString(resp));
//                ByteBuf binaryData = Unpooled.wrappedBuffer(resp);
//                channel.writeAndFlush(new BinaryWebSocketFrame(binaryData));
//            } else {
//                WriteData.write(channel, response);
//            }
    }
}
