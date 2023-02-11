package com.im.lib.crypto;

import com.im.lib.Helpers;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.util.Arrays;

public class AES {

    public static final int GCM_TAG_LENGTH = 16;

    public static final int AES_BLOCK_SIZE = 16;

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

    public static byte[] igeDecrypt(final byte[] data, final byte[] key, final byte[] iv) {

        final Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "AES"));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }

        final int blockSize = cipher.getBlockSize();

        byte[] xPrev = Arrays.copyOfRange(iv, 0, blockSize);
        byte[] yPrev = Arrays.copyOfRange(iv, blockSize, iv.length);

        byte[] decrypted = new byte[0];

        byte[] y, x;
        for (int i = 0; i < data.length; i += blockSize) {
            x = Arrays.copyOfRange(data, i, i + blockSize);
            try {
                y = Helpers.xorByteArray(cipher.doFinal(Helpers.xorByteArray(x, yPrev)), xPrev);
            } catch (IllegalBlockSizeException | BadPaddingException e) {
                throw new RuntimeException(e);
            }
            xPrev = x;
            yPrev = y;

            decrypted = Helpers.concat(decrypted, y);
        }

        return decrypted;
    }

    public static byte[] igeEncrypt(byte[] data, byte[] key, byte[] iv) {
        final Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/ECB/NoPadding");
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "AES"));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }

        int blockSize = cipher.getBlockSize();
        byte[] c = Arrays.copyOfRange(iv, 0, blockSize);
        byte[] m = Arrays.copyOfRange(iv, blockSize, iv.length);

        byte[] result = new byte[data.length];
        for (int i = 0; i < data.length; i += blockSize) {
            byte[] tmp = Arrays.copyOfRange(data, i, i + blockSize);
            byte[] bytes = Helpers.xorByteArray(tmp, c);
            byte[] b;
            try {
                b = cipher.doFinal(bytes);
            } catch (IllegalBlockSizeException | BadPaddingException e) {
                throw new RuntimeException(e);
            }
            Helpers.setBytes(result, b, i, i + blockSize);
            byte[] xor = Helpers.xorByteArray(b, m);
            Helpers.setBytes(result, xor, i, i + blockSize);

            c = xor;
            m = Arrays.copyOfRange(data, i, i + blockSize);
        }

        return result;
//        for o := 0; o < len(src); o += b {
//            xor(dst[o:o+b], src[o:o+b], c)
//            i.block.Encrypt(dst[o:o+b], dst[o:o+b])
//            xor(dst[o:o+b], dst[o:o+b], m)
//
//            c = dst[o : o+b]
//            m = src[o : o+b]
//        }
    }

    public static byte[] gcmEncrypt(byte[] key, byte[] iv, byte[] data) {
        // Get Cipher Instance
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            // Create SecretKeySpec
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            // Create GCMParameterSpec
            GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH * 8, iv);
            // Initialize Cipher for ENCRYPT_MODE
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmParameterSpec);
            // Perform Encryption
            return cipher.doFinal(data);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidAlgorithmParameterException |
                 IllegalBlockSizeException | BadPaddingException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] gcmDecrypt(byte[] key, byte[] iv, byte[] data) {
        // Get Cipher Instance
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            // Create SecretKeySpec
            SecretKeySpec keySpec = new SecretKeySpec(key, "AES");
            // Create GCMParameterSpec
            GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(GCM_TAG_LENGTH << 3, iv);
            // Initialize Cipher for DECRYPT_MODE
            cipher.init(Cipher.DECRYPT_MODE, keySpec, gcmParameterSpec);
            // Perform Decryption
            return cipher.doFinal(data);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidAlgorithmParameterException |
                 IllegalBlockSizeException | BadPaddingException | InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

//    public byte[] igeEncrypt(byte[] plainBytes) {
//        return process(plainBytes, true);
//    }
//
//    public byte[] igeDecrypt(byte[] cipherBytes) {
//        return process(cipherBytes, false);
//    }

//    private static byte[] process(byte[] inputBytes, boolean encrypt) {
//        checkInputByteArray(inputBytes);
//
//        int blocksCount = inputBytes.length / AES_BLOCK_SIZE;
//        byte[] result = new byte[inputBytes.length];
//
//        initCipher(encrypt);
//
//        byte[] iv1 = extractBlock(mIVRaw, encrypt ? 0 : 1);
//        byte[] iv2 = extractBlock(mIVRaw, encrypt ? 1 : 0);
//
//        byte[] inputBlock;
//        byte[] outputBlock = createBlock();
//
//        for (int i = 0; i < blocksCount; i++) {
//            inputBlock = extractBlock(inputBytes, i);
//
//            xorBlocks(inputBlock, iv1, outputBlock);
//            outputBlock = applyCipher(outputBlock);
//            xorBlocks(outputBlock, iv2, outputBlock);
//
//            copyBlock(outputBlock, result, i);
//
//            iv1 = outputBlock;
//            iv2 = inputBlock;
//        }
//
//        return result;
//    }
//
//    /*
//     * Methods to interact with internal cipher
//     */
//
//    private void initCipher(boolean encrypt) {
//        try {
//            mInternalCipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE, mSecretKey);
//        } catch (Exception exception) {
//            exception.printStackTrace();
//            throw new RuntimeException(exception.getMessage());
//        }
//    }
//
//    private byte[] applyCipher(byte[] block) {
//        try {
//            return mInternalCipher.doFinal(block);
//        } catch (Exception exception) {
//            exception.printStackTrace();
//            throw new RuntimeException(exception.getMessage());
//        }
//    }
//
//    /*
//     * Methods to manipulate with blocks
//     */
//
//    private static byte[] extractBlock(byte[] bytes, int blockPosition) {
//        byte[] blockBytes = new byte[mBlockSize];
//        System.arraycopy(bytes, mBlockSize * blockPosition, blockBytes, 0, mBlockSize);
//        return blockBytes;
//    }
//
//    private void copyBlock(byte[] block, byte[] resultBytes, int blockPosition) {
//        System.arraycopy(block, 0, resultBytes, mBlockSize * blockPosition, mBlockSize);
//    }
//
//    private byte[] createBlock() {
//        return createBlocks(1);
//    }
//
//    private byte[] createBlocks(int blocksCount) {
//        return new byte[mBlockSize * blocksCount];
//    }
//
//    private static void xorBlocks(byte[] block1, byte[] block2, byte[] resultBlock) {
//        for (int i = 0; i < mBlockSize; i++) {
//            resultBlock[i] = (byte) (block1[i] ^ block2[i]);
//        }
//    }
//
//    /*
//     * Validation methods
//     */
//
//    private void checkSecretKey(byte[] secretKeyRaw) {
//        if (secretKeyRaw == null) {
//            throw new NullPointerException("Secret key byte array can't be null!");
//        }
//        int length = secretKeyRaw.length;
//        if (length != 16 && length != 24 && length != 32) {
//            throw new IllegalArgumentException("Secret key length must be 128, 192 or 256 bit!");
//        }
//    }
//
//    private static void checkIV(byte[] ivRaw) {
//        if (ivRaw == null) {
//            throw new NullPointerException("Initialization vector byte array can't be null!");
//        }
//        int validLength = mBlockSize * 2;
//        if (ivRaw.length != validLength) {
//            throw new IllegalArgumentException("IV length must be " + validLength + " bytes!");
//        }
//    }
//
//    private static void checkInputByteArray(byte[] byteArray) {
//        if (byteArray == null) {
//            throw new NullPointerException("Input byte array can't be null!");
//        }
//        if (byteArray.length % mBlockSize != 0) {
//            throw new IllegalArgumentException("Input byte array length must be a multiple of the block size!");
//        }
//    }
}
