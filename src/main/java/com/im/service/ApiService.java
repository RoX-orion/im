package com.im.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.api.Api;
import com.im.config.Constant;
import com.im.entity.CreateAuthKeyState;
import com.im.lib.Helpers;
import com.im.lib.crypto.DH;
import com.im.lib.crypto.RSA;
import com.im.lib.entity.DHResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class ApiService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public Api.ResPQ reqPq(Api.ReqPq reqPq) throws JsonProcessingException {
        return null;
    }

    public Api.ResPQ reqPqMulti(Api.ReqPqMulti reqPqMulti) throws JsonProcessingException {
        BigInteger nonce = reqPqMulti.getNonce();
        BigInteger serverNonce = Helpers.readBigIntegerFromBytes(Helpers.getRandomBytes(16), true);

        Api.ResPQ resPQ = new Api.ResPQ();
        CreateAuthKeyState createAuthKeyState = RSA.getPQ();
        resPQ.setNonce(nonce);
        resPQ.setServerNonce(serverNonce);
        resPQ.setPq(createAuthKeyState.getPq());
        List<String> fingerprintList = RSA.getFingerprintList();
        BigInteger[] fingerprints = new BigInteger[fingerprintList.size()];
        int i = 0;
        for (String fingerprint : fingerprintList) {
            fingerprints[i++] = new BigInteger(fingerprint);
        }
        resPQ.setServerPublicKeyFingerprints(fingerprints);

        String s = new ObjectMapper().writeValueAsString(createAuthKeyState);
        stringRedisTemplate.opsForValue().set(
                Constant.CREATE_AUTH_KEY_STATE + nonce + "-" + serverNonce,
                s
        );

        return resPQ;
    }

    public Api.ResPQ reqPqMultiNew(Api.ReqPqMultiNew reqPqMultiNew) {
        return null;
    }

    public Api.TypeServer_DH_Params reqDHParams(Api.ReqDHParams reqDHParams) throws Exception {
        BigInteger nonce = reqDHParams.getNonce();
        BigInteger serverNonce = reqDHParams.getServerNonce();
        String p = reqDHParams.getP();
        String q = reqDHParams.getQ();
        BigInteger publicKeyFingerprint = reqDHParams.getPublicKeyFingerprint();
        String encryptedData = reqDHParams.getEncryptedData();
        byte[] pqInnerDataBytes = RSA.privateDecrypt(
                encryptedData.getBytes(StandardCharsets.UTF_8),
                RSA.getPrivateKey(publicKeyFingerprint.toString())
        );
        ObjectMapper objectMapper = new ObjectMapper();
        Api.PQInnerData pqInnerData = objectMapper.readValue(pqInnerDataBytes, Api.PQInnerData.class);
        if (Boolean.FALSE.equals(stringRedisTemplate.hasKey(Constant.CREATE_AUTH_KEY_STATE + nonce + "-" + serverNonce))) {
            return serverDHParamsFail(nonce, serverNonce, pqInnerData.getNewNonce());
        }
        CreateAuthKeyState createAuthKeyState = objectMapper.readValue(
                stringRedisTemplate.opsForValue().get(Constant.CREATE_AUTH_KEY_STATE + nonce + "-" + serverNonce),
                CreateAuthKeyState.class
        );
        if (!p.equals(createAuthKeyState.getP().toString())
                || !q.equals(createAuthKeyState.getQ().toString())
                || !p.equals(pqInnerData.getP())
                || !q.equals(pqInnerData.getQ())
                || !pqInnerData.getPq().equals(createAuthKeyState.getPq())) {
            return serverDHParamsFail(nonce, serverNonce, pqInnerData.getNewNonce());
        }
        createAuthKeyState.setNewNonce(pqInnerData.getNewNonce());
        String s = objectMapper.writeValueAsString(createAuthKeyState);
        stringRedisTemplate.opsForValue().set(Constant.CREATE_AUTH_KEY_STATE + nonce + "-" + serverNonce, s);

        byte[] randomBytes = Helpers.getRandomBytes(32);
        BigInteger index = Helpers.readBigIntegerFromBytes(randomBytes, false);
        DHResult result = DH.getResult(Constant.DH_BASE, index, Constant.DH_PRIME);

        Api.ServerDHInnerData serverDHInnerData = new Api.ServerDHInnerData();
        serverDHInnerData.setNonce(nonce);
        serverDHInnerData.setServerNonce(serverNonce);
        serverDHInnerData.setG(Constant.DH_BASE.intValue());
        serverDHInnerData.setDhPrime(Constant.DH_PRIME.toString());
        serverDHInnerData.setServerTime((int) (System.currentTimeMillis()));
        serverDHInnerData.setGA(result.getResult().toString());
        Api.ServerDHParamsOk server_dh_params_ok = new Api.ServerDHParamsOk();
        server_dh_params_ok.setNonce(nonce);
        server_dh_params_ok.setServerNonce(serverNonce);
        server_dh_params_ok.setEncryptedAnswer(objectMapper.writeValueAsString(serverDHInnerData));

        return server_dh_params_ok;
    }

    public Api.ServerDHParamsFail serverDHParamsFail(BigInteger nonce, BigInteger serverNonce, BigInteger newNonce) {
        Api.ServerDHParamsFail serverDHParamsFail = new Api.ServerDHParamsFail();
        serverDHParamsFail.setNonce(nonce);
        serverDHParamsFail.setServerNonce(serverNonce);
        byte[] slice = Helpers.slice(
                Helpers.SHA1(Helpers.getByteArray(newNonce)),
                4, 20
        );
        serverDHParamsFail.setNewNonceHash(Helpers.readBigIntegerFromBytes(slice, false));

        return serverDHParamsFail;
    }

    public Api.TypeSet_client_DH_params_answer setClientDHParams(Api.SetClientDHParams setClientDHParams) {
        return null;
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

    public Api.Pong pingDelayDisconnect(Api.PingDelayDisconnect pingDelayDisconnect) {
        return null;
    }

    public Api.TypeDestroySessionRes destroySession(Api.DestroySession destroySession) {
        return null;
    }

    public Api.X invokeAfterMsg(Api.InvokeAfterMsg invokeAfterMsg) {
        return null;
    }

    public Api.X invokeAfterMsgs(Api.InvokeAfterMsgs invokeAfterMsgs) {
        return null;
    }

    public Api.X initConnection(Api.InitConnection initConnection) {
        return null;
    }

    public Api.X invokeWithLayer(Api.InvokeWithLayer invokeWithLayer) {
        return null;
    }

    public Api.X invokeWithoutUpdates(Api.InvokeWithoutUpdates invokeWithoutUpdates) {
        return null;
    }

    public Api.X invokeWithMessagesRange(Api.InvokeWithMessagesRange invokeWithMessagesRange) {
        return null;
    }

    public Api.X invokeWithTakeout(Api.InvokeWithTakeout invokeWithTakeout) {
        return null;
    }
}
