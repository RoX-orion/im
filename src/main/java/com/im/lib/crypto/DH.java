package com.im.lib.crypto;

import com.im.lib.Helpers;
import com.im.lib.entity.DHResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.math.BigInteger;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.LinkedHashMap;

public class DH {

    private byte[] secretKey;

    private final LinkedHashMap<String, BigInteger> privateKeyMap = new LinkedHashMap<>();

    public static final BigInteger DH_BASE = new BigInteger("3");

    public static final BigInteger DH_PRIME = new BigInteger(
            "32317006071311007300338913926423828248817941241140239112842009" +
                "7514007417066343542226196894173635693471179017379097041917" +
                "5460587320919502885375898618562215321217541251490177452027" +
                "0235796078236248884246189477587641105928646099411723245426" +
                "6225221932305409190376805242355191256797158701170010580558" +
                "7765103886184728025797605490356973256152616708133936179954" +
                "1336476559160368317896729073178384589680639671900977202194" +
                "1686472258710314113364293195361934716365332097170774482279" +
                "8858856536920864529663607725026895550592836275112117409697" +
                "2998068410554359584866583291642136218231078990999448652468" +
                "262416972035911852507045361090559"
    );


    // 生成本地KeyPair(RsaKey + privateKey)
    public synchronized static KeyPair generateKeyPair() {
        try {
            KeyPairGenerator kpGen = KeyPairGenerator.getInstance("DH");
            kpGen.initialize(512);

            return kpGen.generateKeyPair();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    //根据对方公钥生成本地密钥
    public synchronized static byte[] generateSecretKey(byte[] receivedPubKeyBytes, Key selfPrivateKey) {
        try {

            // 从byte[]恢复PublicKey
            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(receivedPubKeyBytes);
            KeyFactory kf = KeyFactory.getInstance("DH");
            PublicKey receivedPublicKey = kf.generatePublic(keySpec);
            DHParameterSpec params = ((DHPublicKey) receivedPublicKey).getParams();
            // 生成本地密钥
            KeyAgreement keyAgreement = KeyAgreement.getInstance("DH");
            // 自己的PrivateKey
            keyAgreement.init(selfPrivateKey);
            // 对方的PublicKey
            keyAgreement.doPhase(receivedPublicKey, true);
            // 生成SecretKey密钥
            return keyAgreement.generateSecret();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }

    public static KeyPair initKey() throws Exception{
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("DH");
        kpg.initialize(512);
        return kpg.generateKeyPair();
    }

    public static KeyPair initKey(byte[] key) throws Exception {

        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(key);
        KeyFactory keyFactory = KeyFactory.getInstance("DH");
        PublicKey pubKey = keyFactory.generatePublic(x509EncodedKeySpec);
        DHParameterSpec dhParameterSpec = ((DHPublicKey)pubKey).getParams();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(keyFactory.getAlgorithm());
        keyPairGenerator.initialize(dhParameterSpec);

        return keyPairGenerator.genKeyPair();
    }

    public static byte[] getSecretKey(byte[] publicKey, byte[] privateKey) throws  Exception{
        KeyFactory keyFactory = KeyFactory.getInstance("DH");
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(publicKey);
        PublicKey pubKey = keyFactory.generatePublic(x509KeySpec);
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKey);
        PrivateKey priKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        KeyAgreement keyAgreement = KeyAgreement.getInstance(keyFactory.getAlgorithm());
        keyAgreement.init(priKey);
        keyAgreement.doPhase(pubKey, true);

        SecretKey secretKey = keyAgreement.generateSecret("AES");
        return secretKey.getEncoded();
    }

    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(secretKey.getAlgorithm());
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        return cipher.doFinal(data);
    }

    public static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        SecretKey secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance(secretKey.getAlgorithm());
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        return cipher.doFinal(data);
    }

    /**
     * get g ^ a % p
     * @param base 底数g
     * @return 指数index以及g^a % p结果result
     */
    public static DHResult getResult(BigInteger base, BigInteger index, BigInteger prime) {

        BigInteger result = Helpers.fastMod(base, index, prime);

        DHResult dhResult = new DHResult();
        dhResult.setIndex(new BigInteger(index.toString()));
        dhResult.setResult(result);

        return dhResult;
    }

    public static String createSecretKey(BigInteger key) {
//        return EncryptionUtil.SHA256(key.toString());
        return null;
    }
}
