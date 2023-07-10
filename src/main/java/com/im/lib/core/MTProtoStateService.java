package com.im.lib.core;

import com.im.lib.BinaryHelpers;
import com.im.lib.Helpers;
import com.im.lib.crypto.AES;
import com.im.lib.crypto.KDF;
import com.im.lib.entity.AesKeyIv;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.SessionInfo;
import com.im.lib.exception.UnauthorizedException;
import com.im.lib.net.BinaryReader;
import com.im.lib.net.ErrorInfo;
import com.im.redis.SessionManager;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.Arrays;

@Slf4j
@Component
public class MTProtoStateService {

    @Resource
    private SessionManager sessionManager;

    private final boolean isCall = false;

    private final boolean isOutgoing = false;

    /**
     *
     * @param msgKey msgKey
     * @param encryptData Encrypt data
     * @param authKeyId authKeyId
     */
    public byte[] decryptData(byte[] msgKey, byte[] encryptData, long authKeyId) {
        String authKey = sessionManager.getAuthKey(String.valueOf(authKeyId));
//        String s = stringRedisTemplate.opsForValue().get(Constant.AUTH_KEY + authKeyId.toString());
        if (!StringUtils.hasText(authKey)) {
            throw new UnauthorizedException(ErrorInfo.AUTH_KEY_UNREGISTERED.code, ErrorInfo.AUTH_KEY_UNREGISTERED.name());
        }
        byte[] authKeyBytes = Helpers.getByteArray(new BigInteger(authKey));

        AesKeyIv aesKeyIv = KDF.kdf(authKeyBytes, msgKey, true, isCall, isOutgoing);
        return AES.igeDecrypt(encryptData, aesKeyIv.getKey(), aesKeyIv.getIv());
    }

    public byte[] encryptData(byte[] data, long authKeyId, long sessionId) {
        /*
         * auth_key_id  msg_key encrypted_data(salt session_id  msg_id  seq_no  msg_length  data  padding)
         */
        String sessionIdKey = String.valueOf(sessionId);
        long msgId = this.getNewMsgId(true);
        String authKey = sessionManager.getAuthKey(String.valueOf(authKeyId));
        if (!StringUtils.hasText(authKey)) {
            throw new UnauthorizedException(ErrorInfo.AUTH_KEY_UNREGISTERED.code, ErrorInfo.AUTH_KEY_UNREGISTERED.name());
        }
        // TODO
        long seqNo = Long.parseLong((String) sessionManager.getSessionInfo(sessionIdKey, SessionInfo.SEQ_NO));
        long serverSalt = Long.parseLong((String) sessionManager.getSessionInfo(sessionIdKey, SessionInfo.SERVER_SALT));

        byte[] authKeyBytes = Helpers.getByteArray(new BigInteger(authKey));
        byte[] msgLength = Helpers.readBytesFromInt(data.length);

        byte[] sessionIdBytes = Helpers.toSignedLittleserializedData(sessionId, 8);
        byte[] seqNoBytes = Helpers.toSignedLittleserializedData(seqNo, 4);
        byte[] saltBytes = Helpers.toSignedLittleserializedData(serverSalt, 8);
        System.out.println("msgId: " + msgId);
        data = Helpers.concat(saltBytes, sessionIdBytes, BinaryHelpers.readBytesLE(msgId), seqNoBytes, msgLength, data);
        byte[] msgKeyLarge = Helpers.SHA256(Helpers.slice(authKeyBytes, 96, 96 + 32), data);
        byte[] msgKey = Helpers.slice(msgKeyLarge, 8, 24);
        AesKeyIv aesKeyIv = KDF.kdf(authKeyBytes, msgKey, false, false, false);
        log.info("返回数据加密前数据:{}", Arrays.toString(data));
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
//        System.out.println("key:iv->" + Arrays.toString(key) + "\n" + Arrays.toString(iv));
        byte[] authKeyIdBytes = BinaryHelpers.readBytesLE(authKeyId);
//        byte[] authKeyIdIdBytes = Helpers.getByteArray(authKeyId);
        return Helpers.concat(
                authKeyIdBytes,
                msgKey,
                AES.igeEncrypt(data, key, iv));
    }

    public long getNewMsgId(boolean isClientResponse) {
        double now = System.currentTimeMillis() / 1000.0;
        long nanoseconds = (long) Math.floor((now - Math.floor(now)) * 1e9);
        long newMsgId = BigInteger.valueOf((long) Math.floor(now))
                .shiftLeft(32)
                .or(BigInteger.valueOf(nanoseconds * 4)).longValue();

        return isClientResponse ? newMsgId + 1 : newMsgId + 3;
    }

    public long getNewServerSalt() {
        return Helpers.getRandomInt64();
    }

    public void readEncryptedDataHeader(BinaryReader br, RequestData requestData) {
        long salt = br.readInt64();
        long sessionId = br.readInt64();
        log.info("sessionId: {}", sessionId);
        long msgId = br.readInt64();
        int seqNo = br.readInt32();

        requestData.serverSalt = salt;
        requestData.seqNo = seqNo;
        requestData.sessionId = sessionId;
        requestData.msgId = msgId;
    }
}
