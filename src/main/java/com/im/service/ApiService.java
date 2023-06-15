package com.im.service;

import com.im.api.Api;
import com.im.entity.CreateAuthKeyState;
import com.im.lib.Helpers;
import com.im.lib.crypto.AES;
import com.im.lib.crypto.DH;
import com.im.lib.crypto.RSA;
import com.im.lib.entity.AesKeyIv;
import com.im.lib.entity.DHResult;
import com.im.lib.entity.WsApiResult;
import com.im.lib.net.*;
import com.im.redis.KeyPrefix;
import com.im.redis.SessionManager;
import io.netty.channel.Channel;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

@Service
public class ApiService {

    public static final String CREATE_AUTH_KEY_STATE    = "create-authKey-state:";

    public static final String AES_KEY_IV               = "aes-key-iv:";

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private HandShakeDataCache handShakeDataCache;

    @Resource
    private SessionManager sessionManager;

    public Api.ResPQ reqPq(Api.ReqPq reqPq) {
        return null;
    }

    public Api.ResPQ reqPqMulti(TLRPC.TL_reqPqMulti reqPqMulti) {
        BigInteger nonce = Helpers.readBigIntegerFromBytes(reqPqMulti.nonce, true, true);
        BigInteger serverNonce = Helpers.readBigIntegerFromBytes(Helpers.getRandomBytes(16), true, true);

        Api.ResPQ resPQ = new Api.ResPQ();
        CreateAuthKeyState createAuthKeyState = RSA.getPQ();
        resPQ.setNonce(nonce);
        resPQ.setServerNonce(serverNonce);
        resPQ.setPq(createAuthKeyState.getPq().toByteArray());
        List<Long> fingerprintList = RSA.getFingerprintList();
        BigInteger[] fingerprints = new BigInteger[fingerprintList.size()];
        int i = 0;
        for (long fingerprint : fingerprintList) {
            fingerprints[i++] = new BigInteger(String.valueOf(fingerprint));
        }
        resPQ.setServerPublicKeyFingerprints(fingerprints);

        handShakeDataCache.store(CREATE_AUTH_KEY_STATE + nonce + "-" + serverNonce, createAuthKeyState);
        return resPQ;
    }

    public Api.ResPQ reqPqMultiNew(Api.ReqPqMultiNew reqPqMultiNew) {
        return null;
    }

    public Api.TypeServer_DH_Params reqDHParams(TLRPC.TL_reqDHParams reqDHParams) throws Exception {
        BigInteger nonce = Helpers.readBigIntegerFromBytes(reqDHParams.nonce, true, true);
        BigInteger serverNonce = Helpers.readBigIntegerFromBytes(reqDHParams.server_nonce, true, true);
        byte[] p = reqDHParams.p;
        byte[] q = reqDHParams.q;
        long publicKeyFingerprint = reqDHParams.public_key_fingerprint;
        byte[] encryptedData = reqDHParams.encrypted_data;
        BigInteger bigInteger = Helpers.readBigIntegerFromBytes(encryptedData, false, false);
        BigInteger d = RSA.getD(publicKeyFingerprint);
        BigInteger keyAesEncryptedInt = Helpers.fastMod(
                bigInteger,
                d,
                new BigInteger(RSA.getN(publicKeyFingerprint))
        );
        byte[] bytes = Helpers.getByteArray(keyAesEncryptedInt);

        byte[] tempKeyXor = new byte[32];
        System.arraycopy(bytes, 0, tempKeyXor, 0, 32);
        byte[] aesEncrypted = new byte[224];
        System.arraycopy(bytes, 32, aesEncrypted, 0, 224);
        byte[] tempKey = Helpers.xorByteArray(tempKeyXor, Helpers.SHA256(aesEncrypted));
        byte[] iv = new byte[32];
        byte[] dataWithHash = AES.igeDecrypt(aesEncrypted, tempKey, iv);
        byte[] dataPadBytes = Arrays.copyOfRange(dataWithHash, 0, 192);
        Helpers.reverse(dataPadBytes);
        BinaryReader binaryReader = new BinaryReader(dataPadBytes);
        int constructorId = binaryReader.readInt32();
        Object o = binaryReader.tgReadObject(constructorId);
        if (!(o instanceof Api.PQInnerData pqInnerData)) {
            throw new RuntimeException("obj must be Api.PQInnerData!");
        }
        String key = CREATE_AUTH_KEY_STATE + nonce + "-" + serverNonce;
        if (!handShakeDataCache.hasKey(key)) {
            return serverDHParamsFail(nonce, serverNonce, pqInnerData.getNewNonce());
        }
        CreateAuthKeyState createAuthKeyState = (CreateAuthKeyState) handShakeDataCache.get(key);
        if (!Arrays.equals(p, Helpers.getByteArray(createAuthKeyState.getP()))
                && !Arrays.equals(q, Helpers.getByteArray(createAuthKeyState.getQ()))
                && !Arrays.equals(p, pqInnerData.getP())
                && !Arrays.equals(q, pqInnerData.getQ())
                && !Arrays.equals(pqInnerData.getPq(), Helpers.getByteArray(createAuthKeyState.getPq()))) {
            return serverDHParamsFail(nonce, serverNonce, pqInnerData.getNewNonce());
        }

        byte[] randomBytes = Helpers.getRandomBytes(32);
        BigInteger a = Helpers.readBigIntegerFromBytes(randomBytes, false, false);
        DHResult result = DH.getResult(DH.DH_BASE, a, DH.DH_PRIME);

        Api.ServerDHInnerData serverDHInnerData = new Api.ServerDHInnerData();
        serverDHInnerData.setNonce(nonce);
        serverDHInnerData.setServerNonce(serverNonce);
        serverDHInnerData.setG(DH.DH_BASE.intValue());
        serverDHInnerData.setDhPrime(Helpers.getByteArray(DH.DH_PRIME));
        serverDHInnerData.setServerTime((int) (System.currentTimeMillis()));
        serverDHInnerData.setGA(Helpers.getByteArray(result.getResult()));

        Api.ServerDHParamsOk server_dh_params_ok = new Api.ServerDHParamsOk();
        server_dh_params_ok.setNonce(nonce);
        server_dh_params_ok.setServerNonce(serverNonce);

        AesKeyIv aesKeyIv = Helpers.generateKeyDataFromNonce(serverNonce, pqInnerData.getNewNonce());
        SerializedDataBak serializedData = new SerializedDataBak();
        WsApiResult response = WsApiResult.ok(BigInteger.ZERO, Api.ServerDHInnerData.class, serverDHInnerData);
        SerializeResponse.serialize(serializedData, response);
        byte[] answer = serializedData.toByteArray();
        byte[] answerSHA1 = Helpers.SHA1(answer);
        int padding = 16 - ((answerSHA1.length + answer.length) % 16);
        byte[] answerWithHash = Helpers.concat(
                answerSHA1,
                answer,
                Helpers.getRandomBytes(padding)
        );
        byte[] encryptedAnswer = AES.igeEncrypt(answerWithHash, aesKeyIv.getKey(), aesKeyIv.getIv());
        BigInteger igeKey = Helpers.readBigIntegerFromBytes(aesKeyIv.getKey(), false, true);
        BigInteger igeIv = Helpers.readBigIntegerFromBytes(aesKeyIv.getIv(), false, true);
        String s = igeKey + ":" + igeIv;
        handShakeDataCache.store(AES_KEY_IV + nonce + "-" + serverNonce, s);

        server_dh_params_ok.setEncryptedAnswer(encryptedAnswer);

        createAuthKeyState.setA(a);
        createAuthKeyState.setNewNonce(pqInnerData.getNewNonce());
        handShakeDataCache.store(key, createAuthKeyState);

        return server_dh_params_ok;
    }

    public Api.ServerDHParamsFail serverDHParamsFail(BigInteger nonce, BigInteger serverNonce, BigInteger newNonce) {
        Api.ServerDHParamsFail serverDHParamsFail = new Api.ServerDHParamsFail();
        serverDHParamsFail.setNonce(nonce);
        serverDHParamsFail.setServerNonce(serverNonce);
        byte[] slice = Arrays.copyOfRange(
                Helpers.SHA1(Helpers.getByteArray(newNonce)),
                4, 20
        );
        serverDHParamsFail.setNewNonceHash(Helpers.readBigIntegerFromBytes(slice, false, true));

        return serverDHParamsFail;
    }

    public Api.TypeSet_client_DH_params_answer setClientDHParams(Api.SetClientDHParams setClientDHParams, Channel channel) {
        BigInteger nonce = setClientDHParams.getNonce();
        BigInteger serverNonce = setClientDHParams.getServerNonce();
        String createAuthKeyStateKey = CREATE_AUTH_KEY_STATE + nonce + "-" + serverNonce;
        if (!handShakeDataCache.hasKey(createAuthKeyStateKey)) {
            return new Api.DhGenFail();
        }
        String s = (String) handShakeDataCache.get(AES_KEY_IV + nonce + "-" + serverNonce);
        if (!StringUtils.hasText(s)) {
            return new Api.DhGenFail();
        }
        String[] split = s.split(":");
        byte[] key = new BigInteger(split[0]).toByteArray();
        byte[] iv = new BigInteger(split[1]).toByteArray();
        byte[] bytes = AES.igeDecrypt(setClientDHParams.getEncryptedData(), key, iv);
        BinaryReader binaryReader = new BinaryReader(Arrays.copyOfRange(bytes, 20, bytes.length));
        int constructorId = binaryReader.readInt32();
        Object o = binaryReader.tgReadObject(constructorId);
        if (!(o instanceof Api.ClientDHInnerData clientDHInnerData)) {
            throw new RuntimeException("obj must be Api.ClientDHInnerData!");
        }
        if (!clientDHInnerData.getNonce().equals(setClientDHParams.getNonce())
                && !clientDHInnerData.getServerNonce().equals(setClientDHParams.getServerNonce())) {
            return new Api.DhGenFail();
        }
        CreateAuthKeyState createAuthKeyState = (CreateAuthKeyState) handShakeDataCache.get(createAuthKeyStateKey);

        byte[] gbBytes = clientDHInnerData.getGB();

        BigInteger gb = Helpers.readBigIntegerFromBytes(gbBytes, false, false);
        BigInteger gab = Helpers.fastMod(gb, createAuthKeyState.getA(), DH.DH_PRIME);

        handShakeDataCache.removeKey(AES_KEY_IV + nonce + "-" + serverNonce);
        handShakeDataCache.removeKey(createAuthKeyStateKey);

        Api.DhGenOk dhGenOk = new Api.DhGenOk();
        dhGenOk.setNonce(nonce);
        dhGenOk.setServerNonce(serverNonce);

        BigInteger newNonce = createAuthKeyState.getNewNonce();
        byte[] newNonceBuffer = Helpers.toSignedLittleBuffer(newNonce, 32);
        byte[] hash = Helpers.SHA1(Helpers.getByteArray(gab));
        BinaryReader br = new BinaryReader(hash);
        BigInteger auxHash = br.readLargeInt(64, false);
        br.read(4);
        BigInteger authKeyId = br.readLargeInt(64, false);

        byte[] n = new byte[1];
        n[0] = 1;
        byte[] data = Helpers.concat(
                newNonceBuffer,
                Helpers.concat(n, Helpers.toSignedLittleBuffer(auxHash, 8))
        );
        byte[] shaData = Arrays.copyOfRange(Helpers.SHA1(data), 4, 20);
        BigInteger newNonceHash1 = Helpers.readBigIntegerFromBytes(shaData, true, true);
        dhGenOk.setNewNonceHash1(newNonceHash1);

//        stringRedisTemplate.opsForValue().set(Constant.AUTH_KEY_ID + authKeyId, s);
//        stringRedisTemplate.opsForValue().set(Constant.AUTH_KEY + authKeyId, gab.toString());

        sessionManager.setSessionInfo(authKeyId.toString(), "authKey", gab.toString());
        sessionManager.setSessionInfo(authKeyId.toString(), "channelId", channel.id().asLongText());
        sessionManager.setSessionInfo(authKeyId.toString(), "isLogin", Boolean.FALSE);
        sessionManager.setSessionInfo(authKeyId.toString(), "readyLogin", Boolean.FALSE);

        stringRedisTemplate
                .opsForValue()
                .set(KeyPrefix.CHANNEL_ID_AUTH_KEY_ID + channel.id().asLongText(), authKeyId.toString());

        return dhGenOk;
    }

    public Api.TypeDestroyAuthKeyRes destroyAuthKey(Api.DestroyAuthKey destroyAuthKey) {
        return null;
    }

    public Api.TypeRpcDropAnswer rpcDropAnswer(Api.RpcDropAnswer rpcDropAnswer) {
        return null;
    }

    public Api.FutureSalts getFutureSalts(Api.GetFutureSalts getFutureSalts) {
        return null;
    }

    public Api.Pong ping(Api.Ping ping) {
        return null;
    }

    public Api.Pong pingDelayDisconnect(Api.PingDelayDisconnect pingDelayDisconnect, BigInteger msgId) {
        System.out.println(msgId);
        Api.Pong pong = new Api.Pong();
        pong.setMsgId(msgId);
        pong.setPingId(pingDelayDisconnect.getPingId());

        return pong;
    }

    public Api.TypeDestroySessionRes destroySession(Api.DestroySession destroySession) {
        return null;
    }

//    public Object invokeAfterMsg(Api.InvokeAfterMsg invokeAfterMsg) {
//        return null;
//    }
//
//    public Object invokeAfterMsgs(Api.InvokeAfterMsgs invokeAfterMsgs) {
//        return null;
//    }
//
//    public Object initConnection(Api.InitConnection initConnection) {
//        return null;
//    }
//
    public Object invokeWithLayer(Api.InvokeWithLayer invokeWithLayer) {
        System.out.println(invokeWithLayer);

        return true;
    }
//
//    public Api.X invokeWithoutUpdates(Api.InvokeWithoutUpdates invokeWithoutUpdates) {
//        return null;
//    }
//
//    public Api.X invokeWithMessagesRange(Api.InvokeWithMessagesRange invokeWithMessagesRange) {
//        return null;
//    }
//
//    public Api.X invokeWithTakeout(Api.InvokeWithTakeout invokeWithTakeout) {
//        return null;
//    }
}
