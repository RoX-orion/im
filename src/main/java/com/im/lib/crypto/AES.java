package com.im.lib.crypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;

public class AES {
    public static byte[] getAesKey() {
        SecureRandom secureRandom = new SecureRandom();
        // Then generate the key. Can be 128, 192 or 256 bit
        byte[] key = new byte[32];// 256 bit
        secureRandom.nextBytes(key);

        return key;
    }

    public static byte[] encrypt(byte[] data, byte[] key, byte[] iv) {
//        SecureRandom secureRandom = new SecureRandom();
        // First, create the cipher
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/CTR/NoPadding");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
        // Now generate a nonce. You can also use an ever-increasing counter, which is even more secure. NEVER REUSE A NONCE!
//        byte[] nonce = new byte[12];
//        secureRandom.nextBytes(nonce);
//
//        byte[] iv = new byte[256 >> 3];
//        System.arraycopy(nonce, 0, iv, 0, nonce.length);

        Key keySpec = new SecretKeySpec(key, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        try {
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException e) {
            throw new RuntimeException(e);
        }

        byte[] ciphertext;
        try {
            ciphertext = cipher.doFinal(data);
        } catch (IllegalBlockSizeException | BadPaddingException e) {
            throw new RuntimeException(e);
        }

        return ciphertext;
    }

    public static byte[] decrypt(byte[] key, byte[] ciphertext, byte[] iv) {
//        byte[] array = ByteBuffer.allocate(128 / 8).putLong(counter).array();

        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/CTR/NoPadding");
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
        // Use same nonce
//        byte[] iv = new byte[128 / 8];
//        System.arraycopy(nonce, 0, iv, 0, nonce.length);

        // And use same key to decrypt
        Key keySpec = new SecretKeySpec(key, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        byte[] plainData;
        try {
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
            plainData = cipher.doFinal(ciphertext);
        } catch (InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException |
                 BadPaddingException e) {
            throw new RuntimeException(e);
        }

        return plainData;
    }
}
