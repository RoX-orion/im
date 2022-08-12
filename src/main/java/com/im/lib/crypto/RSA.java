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
//        PublicKeyNE publicKeyNE1 = new PublicKeyNE(
//                new BigInteger("2937959817066933702298617714945612856538843112005886376816255642404751219133084745514657634448776440866"
//                        + "1701890505066208632169112269581063774293102577308490531282748465986139880977280302242772832972539403531"
//                        + "3160108704012876427630091361567343395380424193887227773571344877461690935390938502512438971889287359033"
//                        + "8945177273024525306296338410881284207988753897636046529094613963869149149606209957083647645485599631919"
//                        + "2747663615955633778034897140982517446405334423701359108810182097749467210509584293428076654573384828809"
//                        + "574217079944388301239431309115013843331317877374435868468779972014486325557807783825502498215169806323"),
//                new BigInteger("65537")
//        );
//        PublicKeyNE publicKeyNE2 = new PublicKeyNE(
//                new BigInteger("2534288944884041556497168959071347320689884775908477905258202659454602246385394058588521595116849196570"
//                        + "8222649399180603818074200620463776135424884632162512403163793083921641631564740959529419359595852941166"
//                        + "8489405859523376133330223960965841179548922160312292373029437018775884567383353986024616752250817918203"
//                        + "9315375750495263623495132323782003654358104782690612092797248736680529211579223142368426126233039432475"
//                        + "0785450942589751755390156647751460719351439969059949569615302809050721500330239005077889855323917509948"
//                        + "255722081644689442127297605422579707142646660768825302832201908302295573257427896031830742328565032949"),
//                new BigInteger("65537")
//        );
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
