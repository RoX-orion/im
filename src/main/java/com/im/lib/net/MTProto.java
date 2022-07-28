package com.im.lib.net;

import com.im.lib.core.BinaryReader;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.entity.RequestData;
import com.im.lib.exception.RequestIncompleteException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

@Component
public class MTProto {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private MTProtoStateService mtprotoStateService;

    @Resource
    private TCPAbridged tcpAbridged;

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
            return readRequestData(binaryReader, dataLength);
        } else {// 加密数据
            byte[] msgKey = binaryReader.readBytes(16);
            byte[] bytes = binaryReader.readAll();
            byte[] payload = mtprotoStateService.decryptData(msgKey, bytes, channel);
            System.out.println("解密后的数据:" + payload.length + Arrays.toString(payload));
            BinaryReader br = new BinaryReader(payload);
            long salt = br.readInt64();
            long sessionId = br.readInt64();
            long msgId = br.readInt64();
            int seqNo = br.readInt32();
            int dataLength = br.readInt32();

            return readRequestData(br, dataLength);
        }
    }

    private RequestData readRequestData(BinaryReader binaryReader, int dataLength) {
        int constructorId = binaryReader.readInt32();
        Object requestParam = binaryReader.tgReadObject(constructorId);
        System.out.println("数据部分:" + requestParam);
        RequestData requestData = new RequestData();
        requestData.setConstructorId(constructorId);
        requestData.setRequestParam(requestParam);

        return requestData;
    }

    /**
     * 判断是否是加密数据
     * @param authKeyId 授权密钥id
     */
    public boolean isEncryptedData(long authKeyId) {
        return authKeyId != 0;
    }

    public ByteBuf mtprotoPlainSender(ByteBuf buffer) {
//        long msgId = mtprotoStateService.getNewMsgId();
//        buffer.writeBytes(new byte[8]);
//        buffer.writeByte()
        return buffer;
    }
}
