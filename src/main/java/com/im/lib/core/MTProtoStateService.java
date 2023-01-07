package com.im.lib.core;

import com.im.config.Constant;
import com.im.lib.Helpers;
import com.im.lib.crypto.AES;
import com.im.lib.crypto.KDF;
import com.im.lib.entity.AesParams;
import com.im.lib.entity.RequestData;
import com.im.lib.net.BinaryReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.Arrays;

@Component
public class MTProtoStateService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    private final boolean isCall = false;

    private final boolean isOutgoing = false;

    private final BigInteger THREE = new BigInteger("3");

    private final BigInteger ONE = new BigInteger("1");

    public byte[] decryptData(byte[] msgKey, byte[] bytes, BigInteger authKeyId) {
//        String strAuthKey = stringRedisTemplate.opsForValue().get(Constant.AUTH_KEY_ID + authKeyId);
//        String[] split = strAuthKey.split(":");
//
        String s = stringRedisTemplate.opsForValue().get(Constant.AUTH_KEY + authKeyId.toString());
        byte[] authKey = Helpers.getByteArray(new BigInteger(s));

        AesParams aesParams = KDF.kdf(authKey, msgKey, true, isCall, isOutgoing);
//        byte[] data = Helpers.slice(bytes, 24);
        return AES.igeDecrypt(bytes, aesParams.getKey(), aesParams.getIv());
    }

    public byte[] encryptData(byte[] data, byte[] authKey) {
        /*
         * auth_key_id  msg_key encrypted_data(salt session_id  msg_id  seq_no  msg_length  data  padding)
         */
        byte[] salt = new byte[8];
        byte[] sessionId = new byte[8];
        byte[] keyId = new byte[8];
        byte[] msgId = new byte[8];
        byte[] seqNo = new byte[4];
        byte[] msgLength = Helpers.readBytesFromInt(data.length);
        System.out.println("msgLength:" + data.length);
        data = Helpers.concat(salt, sessionId, msgId, seqNo, msgLength, data);
        byte[] padding = Helpers.generateRandomBytes(Helpers.mod(-(data.length + 12), 16) + 12);
        byte[] msgKeyLarge = Helpers.SHA256(
                Helpers.concat(Arrays.copyOfRange(authKey, 96, 96 + 32), data, padding)
        );
        byte[] msgKey = Arrays.copyOfRange(msgKeyLarge, 8, 24);
        System.out.println("msgKey: " + Arrays.toString(msgKey) + "\n"
                + "padding length: " + padding.length);
        AesParams aesParams = KDF.kdf(authKey, msgKey, false, isCall, isOutgoing);
        byte[] key = aesParams.getKey();
        byte[] iv = aesParams.getIv();
        System.out.println("key:iv->" + Arrays.toString(key) + "\n" + Arrays.toString(iv));
        return Helpers.concat(
                keyId,
                msgKey,
                AES.igeEncrypt(Helpers.concat(data, padding), key, iv));
    }

    public BigInteger getNewMsgId(boolean isClientResponse) {
        long now = System.currentTimeMillis() / 1000;
        long nanoseconds = (long) Math.floor((now - Math.floor(now)) * 1e9);
        BigInteger newMsgId = (new BigInteger(String.valueOf((long) Math.floor(now))).shiftLeft(32))
                .or(new BigInteger(String.valueOf(nanoseconds)).shiftLeft(2));
        return isClientResponse ? newMsgId.add(ONE) : newMsgId.add(THREE);
    }

    public void checkEncryptedData(BinaryReader br, RequestData requestData) {
        long salt = br.readInt64();
        long sessionId = br.readInt64();
        BigInteger msgId = BigInteger.valueOf(br.readInt64())
                                    .and(new BigInteger("4294967295"));
        long seqNo = br.readInt32() & 0xffffffffL;

        requestData.setSalt(salt);
        requestData.setSessionId(sessionId);
        requestData.setMsgId(msgId);
        requestData.setSeqNo(seqNo);
    }
}
