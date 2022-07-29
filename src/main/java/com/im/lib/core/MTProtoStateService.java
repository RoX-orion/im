package com.im.lib.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.config.Constant;
import com.im.lib.Helpers;
import com.im.lib.crypto.AES;
import com.im.lib.entity.AesParams;
import com.im.lib.entity.MTProtoState;
import com.im.lib.net.BinaryReader;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;

@Component
public class MTProtoStateService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public byte[] decryptData(byte[] msgKey, byte[] bytes, Channel channel) {
        String channelId = channel.id().asShortText();
        String strAuthKey = stringRedisTemplate.opsForValue().get(Constant.CHANNEL_ID_AUTH_KEY + channelId);
        byte[] authKey = Helpers.hexStringToByteArray(Objects.requireNonNull(strAuthKey));
        System.out.println("AuthKey:" + Arrays.toString(Helpers.toUnsignedInt(authKey)) + "\n"
                + Arrays.toString(Helpers.byteArrayToUnsignedArray(msgKey)));

        AesParams aesParams = this.calcKey(authKey, msgKey, true);
        byte[] data = Helpers.slice(bytes, 24);
        return AES.decrypt(aesParams.getKey(), data, aesParams.getIv());
    }

    public byte[] encryptData(byte[] data, byte[] authKey) {
        // TODO
        /*
         * auth_key_id  msg_key encrypted_data(salt session_id  msg_id  seq_no  msg_length  data  padding)
         */
        byte[] salt = new byte[8];
        byte[] sessionId = new byte[8];
        byte[] keyId = new byte[8];
//        data = Helpers.concat();
        byte[] msgId = new byte[8];
        byte[] seqNo = new byte[4];
        byte[] msgLength = Helpers.readBytesFromInt(data.length);
        System.out.println("msgLength:" + data.length);
        data = Helpers.concat(salt, sessionId, msgId, seqNo, msgLength, data);
        byte[] padding = Helpers.generateRandomBytes(Helpers.mod(-(data.length + 12), 16) + 12);
        byte[] msgKeyLarge = Helpers.SHA256(
                Helpers.concat(Helpers.slice(authKey, 96, 96 + 32), data, padding)
        );
        byte[] msgKey = Helpers.slice(msgKeyLarge, 8, 24);
        System.out.println("msgKey: " + Arrays.toString(msgKey) + "\n"
                + "padding length: " + padding.length);
        AesParams aesParams = this.calcKey(authKey, msgKey, false);
        byte[] key = aesParams.getKey();
        byte[] iv = aesParams.getIv();
        System.out.println("key:iv->" + Arrays.toString(key) + "\n" + Arrays.toString(iv));
        return Helpers.concat(
                keyId,
                msgKey,
                AES.encrypt(Helpers.concat(data, padding), key, iv));
    }

    public AesParams calcKey(byte[] authKey, byte[] msgKey, boolean client) {
        int x = client ? 0 : 8;
        byte[] sha256a = Helpers.SHA256(Helpers.concat(msgKey, Helpers.slice(authKey, x, x + 36)));
        byte[] sha256b = Helpers.SHA256(Helpers.concat(Helpers.slice(authKey, x + 40, x + 76), msgKey));

        byte[] key = Helpers.concat(
                Helpers.slice(sha256a, 0, 8),
                Helpers.slice(sha256b, 8, 24),
                Helpers.slice(sha256a, 24, 32)
        );
        byte[] iv = Helpers.concat(
                Helpers.slice(sha256b, 0, 4),
                Helpers.slice(sha256a, 4, 12),
                Helpers.slice(sha256b, 12, 16)
        );
        return new AesParams(key, iv);
    }



    public BigInteger getNewMsgId() {
        long now = System.currentTimeMillis() / 1000;
        long nanoseconds = (long) Math.floor((now - Math.floor(now)) * 1e9);
        BigInteger newMsgId = (new BigInteger(String.valueOf((long) Math.floor(now))).shiftLeft(32))
                .or(new BigInteger(String.valueOf(nanoseconds)).shiftLeft(2));
        return newMsgId.add(BigInteger.ONE);
    }

    public void checkEncryptedData(BinaryReader br, long authKeyId) {
        long salt = br.readInt64();
        long sessionId = br.readInt64();
        BigInteger msgId = BigInteger.valueOf(br.readInt64())
                                    .and(new BigInteger("0xffffffff"));
        long seqNo = br.readInt32() & 0xffffffffL;
        String state = stringRedisTemplate.opsForValue().get(String.valueOf(authKeyId));
        if (state != null) {
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                MTProtoState mtProtoState = objectMapper.readValue(state, MTProtoState.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
