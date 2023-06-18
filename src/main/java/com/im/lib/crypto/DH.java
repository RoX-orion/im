package com.im.lib.crypto;

import com.im.lib.Helpers;
import com.im.lib.entity.DHResult;

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
                "c71caeb9c6b1c9048e6c522f70f13f73980d40238e3e21c14934d03" +
                    "7563d930f48198a0aa7c14058229493d22530f4dbfa336f6e0ac925" +
                    "139543aed44cce7c3720fd51f69458705ac68cd4fe6b6b13abdc974" +
                    "6512969328454f18faf8c595f642477fe96bb2a941d5bcd1d4ac8cc" +
                    "49880708fa9b378e3c4f3a9060bee67cf9a4a4a695811051907e162" +
                    "753b56b0f6b410dba74d8a84b2a14b3144e0ef1284754fd17ed950d" +
                    "5965b4b9dd46582db1178d169c6bc465b0d6ff9ca3928fef5b9ae4e" +
                    "418fc15e83ebea0f87fa9ff5eed70050ded2849f47bf959d956850c" +
                    "e929851f0d8115f635b105ee2e4e15d04b2454bf6f4fadf034b1040" +
                    "3119cd8e3b92fcc5b", 16);

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
