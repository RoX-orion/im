package com.im.utils;

public class EncryptionUtil {

//    /**
//     * 获取256位的AES密钥(16进制)
//     */
//    public static byte[] getAESKey() {
//        try {
//            KeyGenerator instance = KeyGenerator.getInstance("AES");
//            instance.init(256);
//            SecretKey secretKey = instance.generateKey();
//            return secretKey.getEncoded();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

//    public static String encode(byte[] aesKey, String data) {
//        try {
//            // 转换KEY
//            Key key = new SecretKeySpec(aesKey, "AES");
//            // 加密
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.ENCRYPT_MODE, key);
//            byte[] result = cipher.doFinal(data.getBytes());
//            return new String(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    /**
//     * AES解密
//     */
//    public static String decode(byte[] aesKey, String data) {
//        try {
//            // 转换KEY
//            Key key = new SecretKeySpec(aesKey, "AES");
//            // 解密
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.DECRYPT_MODE, key);
//            byte[] result = cipher.doFinal(Hex.decodeHex(data.toCharArray()));
//            return new String(result);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }
}
