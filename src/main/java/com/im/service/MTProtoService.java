package com.im.service;

import com.im.api.Api;
import com.im.entity.CreateAuthKeyState;
import com.im.lib.Helpers;
import com.im.lib.crypto.AES;
import com.im.lib.crypto.DH;
import com.im.lib.crypto.RSA;
import com.im.lib.entity.AesKeyIv;
import com.im.lib.entity.DHResult;
import com.im.lib.exception.TLException;
import com.im.lib.net.BinaryReader;
import com.im.lib.net.HandShakeDataCache;
import com.im.lib.net.SerializedData;
import com.im.lib.tl.MTProtoApi;
import com.im.lib.tl.TLClassStore;
import com.im.lib.tl.TLObject;
import com.im.lib.tl.TLRPC;
import com.im.redis.KeyPrefix;
import com.im.redis.SessionManager;
import com.im.utils.TimeUtil;
import io.netty.channel.Channel;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Date;

@Service
public class MTProtoService {

    public static final String CREATE_AUTH_KEY_STATE    = "createAuthKeyState:";

    public static final String AES_KEY_IV               = "aesKeyIv:";

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private HandShakeDataCache handShakeDataCache;

    @Resource
    private SessionManager sessionManager;

    private final DcService dcService;

    @Autowired
    public MTProtoService(final DcService dcService) {
        this.dcService = dcService;
    }

    public MTProtoApi.ResPQ reqPqMulti(MTProtoApi.ReqPqMulti reqPqMulti) {
        byte[] serverNonce = Helpers.getRandomBytes(16);

        MTProtoApi.ResPQ resPQ = new MTProtoApi.ResPQ();
        CreateAuthKeyState createAuthKeyState = RSA.getPQ();
        resPQ.nonce = reqPqMulti.nonce;
        resPQ.server_nonce = serverNonce;
        resPQ.pq = createAuthKeyState.getPq();
        resPQ.server_public_key_fingerprints = RSA.getFingerprintList();

        handShakeDataCache.store(CREATE_AUTH_KEY_STATE + Helpers.sha256Str(reqPqMulti.nonce, serverNonce),
                createAuthKeyState);
        return resPQ;
    }

    public MTProtoApi.Server_DH_params reqDHParams(MTProtoApi.ReqDHParams reqDHParams) throws Exception {
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

        TLObject tlObject = TLClassStore.getTLObject(dataPadBytes);
        if (!(tlObject instanceof MTProtoApi.P_q_inner_data p_q_inner_data)) {
            throw new TLException("object must be MTProtoApi.P_q_inner_data!");
        }
        String nonceServerNonceKey = Helpers.sha256Str(reqDHParams.nonce, reqDHParams.server_nonce);
        String key = CREATE_AUTH_KEY_STATE + nonceServerNonceKey;
        if (!handShakeDataCache.hasKey(key)) {
            return new MTProtoApi.Server_DH_params_fail(
                    reqDHParams.nonce, reqDHParams.server_nonce, p_q_inner_data.new_nonce
            );
        }
        CreateAuthKeyState createAuthKeyState = (CreateAuthKeyState) handShakeDataCache.get(key);
        if (!Arrays.equals(p, createAuthKeyState.getP())
                && !Arrays.equals(q, createAuthKeyState.getQ())
                && !Arrays.equals(p, p_q_inner_data.p)
                && !Arrays.equals(q, p_q_inner_data.q)
                && !Arrays.equals(p_q_inner_data.pq, createAuthKeyState.getPq())) {
            return new MTProtoApi.Server_DH_params_fail(reqDHParams.nonce, reqDHParams.server_nonce, p_q_inner_data.new_nonce);
        }

        byte[] randomBytes = Helpers.getRandomBytes(32);
        BigInteger a = Helpers.readBigIntegerFromBytes(randomBytes, false, false);
        DHResult result = DH.getResult(DH.DH_BASE, a, DH.DH_PRIME);

        MTProtoApi.Server_DH_inner_data serverDHInnerData = new MTProtoApi.Server_DH_inner_data();
        serverDHInnerData.nonce = reqDHParams.nonce;
        serverDHInnerData.server_nonce = reqDHParams.server_nonce;
        serverDHInnerData.g = DH.DH_BASE.intValue();
        serverDHInnerData.dh_prime = Helpers.getByteArray(DH.DH_PRIME);
        serverDHInnerData.g_a = Helpers.getByteArray(result.getResult());
        serverDHInnerData.server_time = (int) (System.currentTimeMillis() / 1000);

        MTProtoApi.Server_DH_params_ok server_dh_params_ok = new MTProtoApi.Server_DH_params_ok();
        server_dh_params_ok.nonce = reqDHParams.nonce;
        server_dh_params_ok.server_nonce = reqDHParams.server_nonce;

        AesKeyIv aesKeyIv = Helpers.generateKeyDataFromNonce(reqDHParams.server_nonce, p_q_inner_data.new_nonce);

        SerializedData stream = new SerializedData();
        serverDHInnerData.serializeToStream(stream);
        byte[] answer = stream.toByteArray();
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
        handShakeDataCache.store(AES_KEY_IV + nonceServerNonceKey, s);

        server_dh_params_ok.encrypted_answer = encryptedAnswer;

        createAuthKeyState.setA(a);
        createAuthKeyState.setNewNonce(p_q_inner_data.new_nonce);
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

    public MTProtoApi.Set_client_DH_params_answer setClientDHParams(MTProtoApi.SetClientDHParams setClientDHParams, Channel channel) {
        String nonceServerNonceKey = Helpers.sha256Str(setClientDHParams.nonce, setClientDHParams.server_nonce);
        String createAuthKeyStateKey = CREATE_AUTH_KEY_STATE + nonceServerNonceKey;
        if (!handShakeDataCache.hasKey(createAuthKeyStateKey)) {
            return new  MTProtoApi.DH_gen_fail(setClientDHParams.nonce, setClientDHParams.server_nonce, Helpers.SHA1(setClientDHParams.nonce));
        }
        String s = (String) handShakeDataCache.get(AES_KEY_IV + nonceServerNonceKey);
        if (!StringUtils.hasText(s)) {
            return new MTProtoApi.DH_gen_fail(setClientDHParams.nonce, setClientDHParams.server_nonce, Helpers.SHA1(setClientDHParams.nonce));
        }
        String[] split = s.split(":");
        byte[] key = new BigInteger(split[0]).toByteArray();
        byte[] iv = new BigInteger(split[1]).toByteArray();
        byte[] bytes = AES.igeDecrypt(setClientDHParams.encrypted_data, key, iv);


        TLObject tlObject = TLClassStore.getTLObject(Arrays.copyOfRange(bytes, 20, bytes.length));
        if (!(tlObject instanceof MTProtoApi.Client_DH_inner_data clientDhInnerData)) {
            throw new TLException("object must be MTProtoApi.Client_DH_inner_data!");
        }
        if (!Arrays.equals(clientDhInnerData.nonce, setClientDHParams.nonce)
                && !Arrays.equals(clientDhInnerData.server_nonce, setClientDHParams.server_nonce)) {
            return new MTProtoApi.DH_gen_fail(setClientDHParams.nonce, setClientDHParams.server_nonce, Helpers.SHA1(setClientDHParams.nonce));
        }
        CreateAuthKeyState createAuthKeyState = (CreateAuthKeyState) handShakeDataCache.get(createAuthKeyStateKey);

        BigInteger gb = Helpers.readBigIntegerFromBytes(clientDhInnerData.g_b, false, false);
        BigInteger gab = Helpers.fastMod(gb, createAuthKeyState.getA(), DH.DH_PRIME);

        handShakeDataCache.removeKey(AES_KEY_IV + Helpers.sha256Str(setClientDHParams.nonce, setClientDHParams.server_nonce));
        handShakeDataCache.removeKey(createAuthKeyStateKey);

        MTProtoApi.DH_gen_ok dhGenOk = new MTProtoApi.DH_gen_ok();

        dhGenOk.nonce = setClientDHParams.nonce;
        dhGenOk.server_nonce = setClientDHParams.server_nonce;

        byte[] newNonce = createAuthKeyState.getNewNonce();
        byte[] hash = Helpers.SHA1(Helpers.getByteArray(gab));
        BinaryReader br = new BinaryReader(hash);
        BigInteger auxHash = br.readLargeInt(64, false);
        br.read(4);
//        BigInteger authKeyId = br.readLargeInt(64, false);
        long authKeyId = br.readInt64();

        byte[] n = new byte[]{1};
        dhGenOk.new_nonce_hash1 = Arrays.copyOfRange(
                Helpers.SHA1(newNonce, n, Helpers.toSignedLittleBuffer(auxHash, 8)), 4, 20
        );

        String authKeyIdKey = String.valueOf(authKeyId);
        sessionManager.setSessionInfo(authKeyIdKey, "authKey", gab.toString());
        sessionManager.setSessionInfo(authKeyIdKey, "channelId", channel.id().asLongText());
        sessionManager.setSessionInfo(authKeyIdKey, "isLogin", Boolean.FALSE);
        sessionManager.setSessionInfo(authKeyIdKey, "readyLogin", Boolean.FALSE);

        stringRedisTemplate
                .opsForValue()
                .set(KeyPrefix.CHANNEL_ID_AUTH_KEY_ID + channel.id().asLongText(), authKeyIdKey);

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

    public MTProtoApi.Pong pingDelayDisconnect(MTProtoApi.Ping_delay_disconnect pingDelayDisconnect, long msgId) {
        System.out.println(msgId);
        MTProtoApi.Pong pong = new MTProtoApi.Pong();
        pong.msg_id = msgId;
        pong.ping_id = pingDelayDisconnect.ping_id;

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
    public Object invokeWithLayer(TLRPC.TL_invokeWithLayer invokeWithLayer) {
        TLRPC.TL_config config = new TLRPC.TL_config();
        config.default_p2p_contacts = true;
        config.preload_featured_stickers = false;
        config.revoke_pm_inbox = true;
        config.blocked_mode = false;
        config.force_try_ipv6 = false;
        config.date = (int) new Date().getTime();
        config.expires = TimeUtil.getTheTimeAfterNDays(10);
        config.test_mode = false;
        config.this_dc = 2;
        config.dc_options = dcService.getDcOptionList();
        config.dc_txt_domain_name = "apv3.stel.com";
        config.chat_size_max = 200;
        config.megagroup_size_max = 200000;
        config.forwarded_count_max = 100;
        config.online_update_period_ms = 210000;
        config.offline_blur_timeout_ms = 5000;
        config.offline_idle_timeout_ms = 30000;
        config.online_cloud_timeout_ms = 300000;
        config.notify_cloud_delay_ms = 30000;
        config.notify_default_delay_ms = 1500;
        config.push_chat_period_ms = 60000;
        config.push_chat_limit = 2;
        config.edit_time_limit = 172800;
        config.revoke_time_limit = 2147483647;
        config.revoke_pm_time_limit = 2147483647;
        config.rating_e_decay = 2419200;
        config.stickers_recent_limit = 200;
        config.channels_read_media_period = 604800;
//        config.tmp_sessions =
        config.call_receive_timeout_ms = 20000;
        config.call_ring_timeout_ms = 90000;
        config.call_connect_timeout_ms = 30000;
        config.call_packet_timeout_ms = 10000;
        config.me_url_prefix = "https://t.me/";
//        config.autoupdate_url_prefix =
        config.gif_search_username = "gif";
        config.venue_search_username = "foursquare";
        config.img_search_username = "bing";
//        config.static_maps_provider =
        config.caption_length_max = 1024;
        config.message_length_max = 4096;
        config.webfile_dc_id = 4;
        config.flags = TLRPC.FLAG_9 | TLRPC.FLAG_10 | TLRPC.FLAG_11;
//        config.suggested_lang_code =
//        config.lang_pack_version =
//        config.base_lang_pack_version =
//        config.reactions_default =
//        config.autologin_token =

        return config;
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
