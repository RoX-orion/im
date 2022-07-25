package com.im.lib.core;

import com.im.config.Constant;
import com.im.lib.Helpers;
import com.im.lib.crypto.AES;
import com.im.lib.entity.AesParams;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

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



//    public long getNewMsgId() {
//        BigInteger bigInteger = new BigInteger("0");
//        long now = new Date().getTime() / 1000 + this.timeOffset;
//        long nanoseconds = Math.floor((now - Math.floor(now)) * 1e9);
//        let newMsgId = (BigInt(Math.floor(now))
//                .shiftLeft(BigInt(32))).or(BigInt(nanoseconds)
//                .shiftLeft(BigInt(2)));
//        if (this._lastMsgId.greaterOrEquals(newMsgId)) {
//            newMsgId = this._lastMsgId.add(BigInt(4));
//        }
//        this._lastMsgId = newMsgId;
//        return newMsgId;
//    }
}
