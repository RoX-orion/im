package com.im.lib.crypto;

import com.im.entity.CreateAuthKeyState;
import com.im.lib.Helpers;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.crypto.Cipher;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.*;
import java.util.*;

@Slf4j
public class RSA {
    @Data
    @AllArgsConstructor
    private static class RSAKeyPair {
        private byte[] publicKey;
        private byte[] privateKey;
    }

    private static final String PUBLIC_KEY_BEGIN = "-----BEGIN PUBLIC KEY-----";

    private static final String PUBLIC_KEY_END = "-----END PUBLIC KEY-----";

    private static final String PRIVATE_KEY_BEGIN = "-----BEGIN PRIVATE KEY-----";

    private static final String PRIVATE_KEY_END = "-----END PRIVATE KEY-----";

    private static final HashMap<Long, RSAKeyPair> RSAKey = new HashMap<>();

    static {
        String publicKeyPath;
        try {
            publicKeyPath = Objects.requireNonNull(RSA.class.getClassLoader().getResource("rsa")).getFile();
        } catch (Exception e) {
            throw new Error("Can load RSA file, you must config it!");
        }

        try(FileInputStream publicKeyInputStream = new FileInputStream(publicKeyPath)) {
            byte[] bytes = publicKeyInputStream.readAllBytes();
            String s = new String(bytes);
            String[] split = s.split(RSA.PRIVATE_KEY_END);
            for (String s1 : split) {
                StringBuilder builder = new StringBuilder();
                String[] lines = s1.split("\n");
                for (String line : lines) {
                    builder.append(line.trim());
                }
                String source = builder.toString();
                if (StringUtils.hasLength(source)) {
                    String publicKeyBase64 = source.substring(
                            source.indexOf(RSA.PUBLIC_KEY_BEGIN) + RSA.PUBLIC_KEY_BEGIN.length(),
                            source.indexOf(RSA.PUBLIC_KEY_END)
                    ).trim();
                    byte[] publicKey = Base64.getDecoder().decode(publicKeyBase64);
                    String n = Helpers.readBigIntegerFromBytes(
                            Helpers.slice(publicKey, 33, 289),
                            false, false
                    ).toString();

                    String e = Helpers.readBigIntegerFromBytes(
                            Helpers.slice(publicKey, 291, 294),
                            false, false
                    ).toString();
                    BigInteger fingerprint = Helpers.readBigIntegerFromBytes(Helpers.slice(Helpers.SHA1(publicKey), 12, 20), false, true);
                    log.info("RSA info:\n fingerprint = {}\n n = {}\n e = {}", fingerprint, n, e);
                    String privateKeyBase64 = source.substring(
                            source.indexOf(RSA.PRIVATE_KEY_BEGIN) + RSA.PRIVATE_KEY_BEGIN.length()
                    ).trim();
                    byte[] privateKey = Base64.getDecoder().decode(privateKeyBase64);
                    RSAKeyPair rsaKeyPair = new RSAKeyPair(publicKey, privateKey);
                    RSAKey.put(fingerprint.longValue(), rsaKeyPair);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] publicEncrypt(byte[] data, byte[] publicKey) throws Exception {
        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(publicKey));
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        return cipher.doFinal(data);
    }

    public static byte[] privateDecrypt(byte[] data, byte[] privateKey) throws Exception {
        RSAPrivateKey priKey = (RSAPrivateKey) KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(privateKey));
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, priKey);
        return cipher.doFinal(data);
    }

    public static CreateAuthKeyState getPQ() {
        byte[] pBytes;
        BigInteger p;
        do {
            pBytes = Helpers.getRandomBytes(4);
            p = Helpers.readBigIntegerFromBytes(pBytes, false, false);
        } while (!p.isProbablePrime(4));

        BigInteger q;
        byte[] qBytes;
        while (true) {
            qBytes = Helpers.getRandomBytes(4);
            q = Helpers.readBigIntegerFromBytes(qBytes, false, false);
            if (p.compareTo(q) >= 0) {
                continue;
            }
            if (q.isProbablePrime(4)) {
                break;
            }
        }

        CreateAuthKeyState createAuthKeyState = new CreateAuthKeyState();
        createAuthKeyState.setP(p);
        createAuthKeyState.setQ(q);
        createAuthKeyState.setPq(p.multiply(q).toString());
        return createAuthKeyState;
    }

    public static PublicKey getPublicKey(BigInteger n, BigInteger e) throws NoSuchAlgorithmException, InvalidKeySpecException {
        RSAPublicKeySpec keySpec = new RSAPublicKeySpec(n, e);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(keySpec);
    }

    public static byte[] getPrivateKey(long key) {
        return RSAKey.get(key).getPrivateKey();
    }

    public static List<Long> getFingerprintList() {
        return new ArrayList<>(RSAKey.keySet());
    }
}
