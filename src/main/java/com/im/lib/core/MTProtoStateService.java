package com.im.lib.core;

import com.im.lib.Helpers;
import com.im.lib.crypto.AES;
import com.im.lib.crypto.KDF;
import com.im.lib.entity.AesKeyIv;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.SessionInfo;
import com.im.lib.net.BinaryReader;
import com.im.lib.net.SerializeResponse;
import com.im.redis.SessionManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Arrays;

@Slf4j
@Component
public class MTProtoStateService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private SessionManager sessionManager;

    private final boolean isCall = false;

    private final boolean isOutgoing = false;

    private final BigInteger THREE = new BigInteger("3");

    private final BigInteger ONE = BigInteger.ONE;

    /**
     *
     * @param msgKey msgKey
     * @param encryptData Encrypt data
     * @param authKeyId authKeyId
     */
    public byte[] decryptData(byte[] msgKey, byte[] encryptData, BigInteger authKeyId) {
        String authKey = (String) sessionManager.getSessionInfo(authKeyId.toString(), SessionInfo.AUTH_KEY);
//        String s = stringRedisTemplate.opsForValue().get(Constant.AUTH_KEY + authKeyId.toString());
        byte[] authKeyBytes = Helpers.getByteArray(new BigInteger(authKey));

        AesKeyIv aesKeyIv = KDF.kdf(authKeyBytes, msgKey, true, isCall, isOutgoing);
        return AES.igeDecrypt(encryptData, aesKeyIv.getKey(), aesKeyIv.getIv());
    }

    public byte[] encryptData(byte[] data, BigInteger authKeyId, long sessionId) {
        /*
         * auth_key_id  msg_key encrypted_data(salt session_id  msg_id  seq_no  msg_length  data  padding)
         */
        BigInteger msgId = this.getNewMsgId(true);
        String authKey = (String) sessionManager.getSessionInfo(authKeyId.toString(), SessionInfo.AUTH_KEY);
        if (authKey == null) {
            // TODO process exception
            throw new RuntimeException("授权密钥不能为空");
        }
        long seqNo = Long.parseLong((String) sessionManager.getSessionInfo(authKeyId.toString(), SessionInfo.SEQ_NO));
        long salt = Long.parseLong((String) sessionManager.getSessionInfo(authKeyId.toString(), SessionInfo.SALT));

        byte[] authKeyBytes = Helpers.getByteArray(new BigInteger(authKey));
        byte[] msgLength = Helpers.readBytesFromInt(data.length);

        byte[] sessionIdBytes = SerializeResponse.toSignedLittleserializedData(sessionId, 8);
        byte[] seqNoBytes = SerializeResponse.toSignedLittleserializedData(seqNo, 8);
        byte[] saltBytes = SerializeResponse.toSignedLittleserializedData(salt, 8);

        data = Helpers.concat(saltBytes, sessionIdBytes, Helpers.getByteArray(msgId), seqNoBytes, msgLength, data);
        byte[] msgKeyLarge = Helpers.SHA256(
                Helpers.concat(Helpers.slice(authKeyBytes, 96, 96 + 32), data)
        );
        byte[] msgKey = Helpers.slice(msgKeyLarge, 8, 24);
        AesKeyIv aesKeyIv = KDF.kdf(authKeyBytes, msgKey, false, false, false);
        System.out.println("返回数据解密前数据" + Arrays.toString(data));
//        byte[] padding = Helpers.generateRandomBytes(Helpers.mod(-(data.length + 12), 16) + 12);
//        byte[] msgKeyLarge = Helpers.SHA256(
//                Helpers.concat(Arrays.copyOfRange(authKey, 96, 96 + 32), data, padding)
//        );
//        byte[] msgKey = Arrays.copyOfRange(msgKeyLarge, 8, 24);
//        System.out.println("msgKey: " + Arrays.toString(msgKey) + "\n"
//                + "padding length: " + padding.length);
//        AesParams aesParams = KDF.kdf(authKey, msgKey, false, isCall, isOutgoing);
        byte[] key = aesKeyIv.getKey();
        byte[] iv = aesKeyIv.getIv();
        System.out.println("key:iv->" + Arrays.toString(key) + "\n" + Arrays.toString(iv));
        byte[] authKeyIdBytes = Helpers.getByteArray(authKeyId);
        Helpers.reverse(authKeyIdBytes);
        return Helpers.concat(
                authKeyIdBytes,
                msgKey,
                AES.igeEncrypt(Helpers.concat(data), key, iv));
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
        log.info("sessionId: {}", sessionId);
        System.out.println("sessionId:" + sessionId);
        BigInteger msgId = BigInteger.valueOf(br.readInt64())
                                    .and(new BigInteger("4294967295"));
        long seqNo = br.readInt32() & 0xffffffffL;

        requestData.setSalt(String.valueOf(salt));
        requestData.setSeqNo(String.valueOf(seqNo));
        requestData.setSessionId(sessionId);
        requestData.setMsgId(msgId);
    }
}
