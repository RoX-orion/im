package com.im;

//import com.im.entity.User;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.lib.Helpers;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.crypto.AES;
import com.im.lib.crypto.DH;
import com.im.lib.entity.MTProtoState;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.util.internal.ObjectUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.DecoderException;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.HashMap;

@Slf4j
public class TestDemo {
    @Test
    public void testDH() {
//        String str = "25342889448840415564971689590713473206898847759084779052582026594546022463853940585885215951168491965708222649399180603818074200620463776135424884632162512403163793083921641631564740959529419359595852941166848940585952337613333022396096584117954892216031229237302943701877588456738335398602461675225081791820393153757504952636234951323237820036543581047826906120927972487366805292115792231423684261262330394324750785450942589751755390156647751460719351439969059949569615302809050721500330239005077889855323917509948255722081644689442127297605422579707142646660768825302832201908302295573257427896031830742328565032949";
//        System.out.println(str.length());
        //        ObjectMapper objectMapper = new ObjectMapper();
//        String str = "{\"uid\":1,\"createTime\":1633009137000,\"updateTime\":1645278139000,\"deleteTime\":null,\"avatar\":\"https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif?imageView2/1/w/80/h/80\",\"username\":\"Ambition\",\"email\":\"528289176@qq.com\",\"gender\":1,\"birthday\":1633968000000,\"sign\":\"三十年功名尘与土，八千里路云和月\",\"status\":1,\"role\":\"super_admin\",\"token\":\"nvkjdfvbkdbv\"}";
//        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//        User user = objectMapper.readValue(str, User.class);
//        System.out.println(user);
        System.out.println("25101268440769156078847806393523459526n".length());
    }

    @Test
    public void testDecode() {
//        byte b = (byte) 10;
//        System.out.println(b);
//        System.out.println(b & 0xff);

    }

    @Test
    public void testChange() {
        String hex = "00 00 00 00 00 00 00 00 01 C8 83 1E C9 7A E5 5140 00 00 00 63 24 16 05 3E 05 49 82 8C CA 27 E966 B3 01 A4 8F EC E2 FC A5 CF 4D 33 F4 A1 1E A877 BA 4A A5 73 90 73 30 08 17 ED 48 94 1A 08 F981 00 00 00 15 C4 B5 1C 01 00 00 00 21 6B E8 6C02 2B B4 C3";
        String[] s = hex.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        int len = hex.length() / 2;
        byte[] bytes = new byte[len];
        byte high = 0;//字节高四位
        byte low = 0;//字节低四位
        for (int i = 0; i < len; i++) {
            //右移四位得到高位
            high = (byte) ((hex.indexOf(hex.charAt(2 * i))) << 4);
            low = (byte) hex.indexOf(hex.charAt(2 * i + 1));
            bytes[i] = (byte) (high | low);//高地位做或运算
        }

        System.out.println(Arrays.toString(bytes));
    }

    @Test
    public void testPrime() {
        String hex = "FFFFFFFF FFFFFFFF C90FDAA2 2168C234 C4C6628B 80DC1CD1" +
                "      29024E08 8A67CC74 020BBEA6 3B139B22 514A0879 8E3404DD" +
                "      EF9519B3 CD3A431B 302B0A6D F25F1437 4FE1356D 6D51C245" +
                "      E485B576 625E7EC6 F44C42E9 A637ED6B 0BFF5CB6 F406B7ED" +
                "      EE386BFB 5A899FA5 AE9F2411 7C4B1FE6 49286651 ECE45B3D" +
                "      C2007CB8 A163BF05 98DA4836 1C55D39A 69163FA8 FD24CF5F" +
                "      83655D23 DCA3AD96 1C62F356 208552BB 9ED52907 7096966D" +
                "      670C354E 4ABC9804 F1746C08 CA18217C 32905E46 2E36CE3B" +
                "      E39E772C 180E8603 9B2783A2 EC07A28F B5C55DF0 6F4C52C9" +
                "      DE2BCBF6 95581718 3995497C EA956AE5 15D22618 98FA0510" +
                "      15728E5A 8AACAA68 FFFFFFFF FFFFFFFF";
        StringBuilder sb = new StringBuilder();
        String[] split = hex.split("\s+");
        for (String s : split) {
            sb.append(s);
        }

        String hexStr = sb.toString();

        BigInteger bigInteger = new BigInteger("0");
        BigInteger tmp;
        for (char c : hexStr.toCharArray()) {
            if (c >= 'A' && c <= 'F') {
                tmp = new BigInteger(String.valueOf(c - 'A' + 10));
            } else {
                tmp = new BigInteger(String.valueOf(c - '0'));
            }

            bigInteger = bigInteger.multiply(new BigInteger("16")).add(tmp);
        }

        System.out.println(bigInteger);
    }

    @Test
    public void testBinary() throws JsonProcessingException, IllegalAccessException {
        String str = "{\"type\":\"dh\",\"gap\":\"256\"}";
        new ObjectMapper();
//        HashMap<String, String> map = new HashMap<>();
//        map.put("age", "10");
//        map.put("name", "Jack");
//        BigInteger bigInteger = new BigInteger("7125461004117455568");
//        System.out.println(bigInteger.divide(new BigInteger("4")));
//        System.out.println(new BigInteger("1781365251029363892").multiply(new BigInteger("4")));
//        System.out.println(bigInteger.shiftLeft(32));
        //

//        double now = System.currentTimeMillis() / 1000.0;
//        System.out.println(now);
//        System.out.println(Math.floor(now));
//        System.out.println(now - Math.floor(now));
//        double floor = Math.floor((now - Math.floor(now)) * 1e9);
//        System.out.println(floor);
        System.out.println(new MTProtoStateService().getNewMsgId());
    }

    @Test
    public void testDe() throws Exception {
        int[] bytes = new int[]{165, 232, 81, 90, 18, 245, 96, 33, 75, 165, 34, 12, 42, 20, 190, 91, 182, 164, 144, 223, 192, 81, 39, 145, 240, 81, 209, 139, 63, 10, 23, 150, 62, 217, 108, 55, 102, 212, 93, 61, 46, 229, 181, 255, 112, 219, 80, 189, 6, 170, 212, 56, 94, 133, 140, 117, 3, 120, 230, 247, 177, 11, 248, 173, 35, 40, 85, 193, 191, 95, 247, 87, 62, 59, 31, 149, 193, 23, 76, 124, 220, 192, 24, 39, 140, 14, 129, 136, 35, 48, 214, 91, 104, 125, 220, 219, 209, 114, 172, 167, 97, 135, 63, 195, 163, 166, 162, 168, 241, 75, 69, 56, 164, 33, 13, 70, 66, 214, 219, 153, 221, 138, 14, 42, 222, 203, 38, 22, 82, 191, 129, 51, 230, 60, 136, 63, 182, 167, 247, 17, 202, 177, 52, 111, 165, 24, 144, 167, 28, 81, 29, 32, 67, 23, 231, 83, 16, 180, 19, 214, 105, 206, 212, 93, 112, 1, 219, 178, 216, 143, 24, 170, 104, 90, 158, 63, 102, 252, 169, 78, 208, 180, 122, 193, 105, 182, 231, 76, 55, 16, 109, 123, 77, 176, 204, 108, 233, 218, 191, 17, 179, 127, 249, 50, 43, 54, 61, 246, 211, 143, 16, 182, 178, 187, 116, 84};
        byte[] b = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            b[i] = (byte) bytes[i];
        }
        byte[] key = new byte[]{48, -18, -66, -39, -2, -10, 4, 60, 126, -21, 23, 117, 99, -128, -116, -17, 52, -111, -78, 62, 106, -119, -21, -22, 2, 30, 3, -88, -66, 30, -3, -9};
        System.out.println(key.length);

        System.out.println(new String(b));
        byte[] decrypt = DH.decrypt(b, key);
        System.out.println(Arrays.toString(decrypt));
    }

    @Test
    public void testAES() {
//        System.out.println(EncryptionUtil.getAESKey());
        byte[] aesKey = AES.getAesKey();
        System.out.println(Arrays.toString(aesKey));
        String strKey = Helpers.byteArrayToHexString(aesKey);
        System.out.println(strKey);
        System.out.println(Arrays.toString(Helpers.hexStringToByteArray(strKey)));
//        System.out.println(Arrays.toString(key));
//        char[] charArr = strKey.toCharArray();
//        int index = 0;
//        for (int i = 0; i < charArr.length; i++) {
//            int highBit = strKey.indexOf(charArr[i]);
//            int lowBit = strKey.indexOf(charArr[++i]);
//            key[index++] = (byte) (highBit << 4 | lowBit);
//        }
//
//        System.out.println(Arrays.toString(key));
        /*
         * byte->hex
         * 1    2
         * 32*8=256  64*4
         *
         *
         */

//        String str = "Hello 你好";
//        AesWrapper aesWrapper = AES.encrypt(aesKey, str.getBytes(StandardCharsets.UTF_8));
//
//        SecureRandom secureRandom = new SecureRandom();
//        byte[] nonce = new byte[12];
//        secureRandom.nextBytes(nonce);
//
//        String decrypt = AES.decrypt(aesKey, aesWrapper.getCiphertext(), aesWrapper.getNonce());
//        System.out.println(decrypt);
    }

    @Test
    public void testSerializable() {
//        String msgId = "7113996906779743340";
//        String xxxxx = "7113996906779743340";
//        int[] array = new int[]{
//                108, 148, 213, 193, 126, 254, 185, 98
//        };
//        BigInteger res = new BigInteger("0");
//        for (int i = array.length - 1; i >= 0; i--) {
//            res = res.multiply(new BigInteger("256")).add(new BigInteger(String.valueOf(array[i])));
//        }
////        for (int i : array) {
////            res = res.multiply(new BigInteger("256")).add(new BigInteger(String.valueOf(i)));
////        }
//        System.out.println(res);


//        int[] array = new int[]{
//                123, 34, 116, 121, 112, 101, 34, 58, 34, 228, 189, 160, 229, 165, 189, 34, 44, 34, 103, 97, 112, 34, 58, 34, 57, 56, 54, 52, 55, 56, 52, 56, 54, 55, 49, 50, 53, 51, 49, 52, 55, 53, 52, 51, 55, 57, 53, 56, 55, 49, 50, 52, 54, 56, 50, 52, 57, 52, 50, 56, 48, 48, 50, 57, 52, 54, 53, 55, 54, 50, 52, 52, 51, 53, 53, 49, 48, 54, 54, 54, 50, 49, 52, 55, 56, 55, 56, 57, 49, 50, 52, 52, 52, 52, 56, 52, 54, 48, 53, 56, 48, 57, 51, 48, 48, 51, 51, 49, 55, 48, 48, 48, 53, 54, 50, 57, 56, 50, 57, 55, 48, 48, 49, 53, 57, 57, 49, 55, 49, 54, 56, 56, 57, 50, 54, 50, 56, 54, 53, 50, 56, 53, 56, 50, 54, 53, 50, 52, 53, 57, 55, 50, 53, 57, 49, 56, 50, 56, 48, 54, 48, 56, 57, 54, 56, 48, 54, 52, 50, 53, 52, 50, 56, 54, 52, 50, 52, 54, 55, 54, 49, 51, 51, 48, 48, 50, 51, 52, 52, 48, 51, 49, 48, 51, 54, 50, 50, 55, 54, 52, 54, 49, 49, 55, 49, 53, 49, 54, 48, 51, 51, 51, 53, 52, 51, 54, 52, 57, 55, 56, 53, 49, 54, 56, 51, 57, 49, 53, 53, 48, 51, 48, 54, 48, 52, 52, 48, 50, 57, 48, 50, 54, 56, 52, 50, 56, 50, 53, 51, 48, 48, 51, 52, 55, 50, 51, 50, 55, 57, 55, 51, 54, 49, 56, 56, 54, 53, 54, 49, 55, 56, 53, 52, 54, 55, 53, 48, 51, 51, 48, 56, 48, 52, 50, 51, 55, 56, 52, 50, 56, 53, 49, 56, 51, 57, 53, 55, 49, 52, 52, 51, 49, 51, 54, 57, 52, 53, 50, 53, 54, 53, 51, 55, 49, 49, 51, 49, 56, 53, 50, 57, 50, 54, 55, 53, 52, 54, 52, 57, 57, 48, 48, 50, 51, 54, 48, 51, 54, 55, 50, 57, 57, 57, 57, 48, 56, 50, 55, 49, 49, 50, 52, 55, 48, 51, 56, 55, 51, 48, 52, 53, 48, 56, 56, 57, 50, 48, 49, 52, 56, 56, 50, 48, 53, 51, 52, 55, 52, 57, 49, 50, 48, 56, 54, 57, 52, 52, 50, 51, 56, 56, 55, 48, 50, 56, 51, 50, 57, 56, 49, 54, 50, 51, 52, 55, 55, 50, 56, 49, 48, 57, 51, 53, 50, 51, 55, 50, 54, 53, 48, 55, 52, 49, 52, 57, 54, 56, 56, 51, 56, 57, 54, 56, 52, 50, 50, 54, 51, 57, 56, 53, 49, 52, 53, 51, 56, 50, 48, 48, 48, 52, 56, 50, 52, 53, 50, 53, 57, 52, 56, 56, 51, 48, 56, 50, 49, 51, 53, 56, 50, 53, 52, 51, 50, 52, 54, 56, 48, 55, 48, 51, 53, 50, 48, 49, 50, 51, 54, 56, 56, 49, 48, 52, 48, 53, 57, 51, 50, 48, 48, 51, 49, 53, 52, 57, 48, 51, 50, 49, 49, 54, 50, 53, 49, 57, 54, 52, 52, 51, 50, 51, 50, 48, 56, 52, 56, 54, 55, 54, 52, 52, 50, 51, 56, 50, 51, 52, 50, 53, 51, 57, 51, 56, 54, 49, 57, 48, 52, 54, 51, 48, 52, 57, 55, 51, 50, 53, 51, 50, 48, 52, 48, 48, 51, 56, 50, 49, 50, 57, 52, 52, 54, 50, 53, 52, 52, 49, 50, 48, 57, 51, 56, 51, 51, 57, 50, 56, 57, 50, 57, 55, 48, 49, 57, 52, 48, 49, 57, 55, 53, 52, 53, 50, 57, 50, 54, 55, 49, 56, 51, 56, 54, 51, 57, 50, 51, 53, 50, 49, 49, 49, 54, 54, 56, 57, 50, 55, 56, 48, 57, 53, 54, 48, 53, 54, 49, 55, 50, 52, 56, 34, 125
//        };

        /*
         * msg_id: 7114336688816465080
         *         7114336688816465080
         * data_length: 642
         */
//        byte[] array = new byte[]{
//                0, 0, 0, 0, 0, 0, 0, 0,
//                4, 12, -117, 0, 125, 47, -69, 98, -125, 2, 0, 0, 123, 34, 116, 121, 112, 101, 34, 58, 34, -28, -67,
//                -96, -27, -91, -67, 34, 44, 34, 103, 97, 112, 34, 58, 34, 51, 49, 50, 51, 54, 52, 49, 51, 52, 53, 54, 53, 49, 48, 55, 55, 52,
//                52, 49, 54, 57, 51, 50, 53, 54, 48, 55, 49, 55, 52, 51, 56, 52, 50, 56, 48, 56, 54, 48, 51, 49, 57, 50, 53, 49, 54, 52, 50, 53, 49, 48, 52, 52, 48, 56, 57, 49, 53, 51, 53, 49, 53, 54, 54, 53, 57, 52, 54, 48, 55, 50, 48, 54, 52, 49, 54, 57, 53, 57, 52, 48, 54, 49, 50, 50, 48, 57, 53, 55, 55, 48, 56, 50, 56, 53, 49, 57, 51, 57, 50, 53, 53, 51, 51, 54, 56, 48, 52, 48, 53, 51, 51, 57, 56, 52, 52, 54, 52, 55, 56, 53, 54, 57, 55, 55, 51, 54, 54, 48, 54, 57, 53, 56, 55, 50, 51, 54, 51, 56, 51, 56, 48, 48, 53, 50, 49, 52, 53, 49, 56, 50, 48, 53, 50, 51, 50, 56, 50, 49, 52, 50, 49, 53, 54, 57, 49, 56, 50, 53, 48, 50, 51, 53, 57, 56, 50, 54, 51, 48, 52, 53, 54, 54, 57, 56, 55, 57, 53, 53, 52, 57, 57, 51, 57, 52, 49, 49, 56, 55, 54, 49, 55, 55, 48, 49, 48, 51, 57, 57, 48, 57, 55, 56, 49, 52, 54, 54, 50, 55, 51, 49, 52, 53, 48, 49, 54, 54, 49, 54, 54, 50, 49, 55, 55, 56, 57, 57, 53, 57, 50, 50, 49, 50, 54, 55, 55, 52, 56, 57, 54, 52, 52, 56, 53, 57, 57, 57, 48, 48, 50, 49, 52, 56, 50, 50, 50, 53, 57, 56, 54, 51, 49, 49, 51, 52, 53, 56, 54, 51, 48, 51, 53, 53, 48, 54, 53, 57, 52, 48, 56, 54, 49, 49, 50, 50, 53, 56, 52, 50, 50, 57, 57, 57, 50, 54, 57, 48, 52, 52, 52, 52, 56, 51, 52, 55, 51, 54, 52, 50, 54, 50, 56, 57, 54, 51, 48, 54, 56, 54, 54, 55, 56, 54, 55, 56, 52, 57, 57, 51, 56, 49, 56, 57, 54, 52, 48, 57, 57, 53, 53, 52, 49, 52, 57, 53, 56, 49, 49, 55, 56, 49, 51, 49, 57, 50, 57, 49, 52, 56, 53, 49, 50, 57, 54, 51, 54, 50, 51, 48, 52, 51, 54, 48, 51, 52, 53, 56, 54, 48, 54, 50, 52, 48, 48, 57, 54, 49, 52, 50, 53, 48, 53, 52, 52, 52, 51, 50, 53, 56, 49, 53, 52, 54, 53, 50, 56, 53, 50, 52, 53, 51, 49, 48, 52, 52, 57, 53, 56, 53, 55, 55, 53, 56, 50, 56, 51, 51, 53, 48, 50, 49, 50, 50, 53, 55, 53, 54, 48, 56, 49, 52, 52, 51, 49, 56, 52, 50, 52, 56, 52, 55, 57, 56, 49, 48, 48, 56, 51, 57, 52, 52, 50, 50, 53, 50, 55, 51, 48, 52, 49, 55, 54, 50, 54, 54, 57, 49, 56, 52, 54, 57, 51, 54, 57, 52, 50, 52, 52, 56, 53, 52, 53, 50, 54, 55, 49, 48, 49, 49, 56, 57, 51, 55, 48, 49, 48, 57, 52, 51, 53, 53, 50, 54, 51, 53, 54, 49, 51, 52, 57, 55, 51, 48, 54, 49, 52, 50, 50, 57, 52, 50, 48, 52, 48, 50, 49, 51, 57, 57, 49, 51, 55, 54, 49, 57, 50, 48, 48, 56, 51, 51, 57, 55, 55, 57, 57, 51, 55, 56, 50, 54, 51, 51, 54, 49, 48, 54, 56, 52, 53, 49, 53, 52, 53, 48, 57, 57, 56, 53, 52, 53, 54, 54, 54, 54, 50, 53, 51, 56, 54, 48, 49, 55, 51, 56, 54, 54, 56, 48, 54, 49, 54, 49, 52, 57, 49, 49, 34, 125
//        };
        byte[] array = new byte[]{
                /*-72, 36, 111, 109, -122, 51, -69, 98*/ -126, 2, 0, 0
        };
//        StringBuilder sb = new StringBuilder();
//        for (int i : array) {
//            sb.append((char) i);
//        }

//        int[] buffer = new int[8];
//        for (int i = 0; i < array.length; i++) {
//            buffer[i] = array[i] & 0xff;
//        }


//        BigInteger result = new BigInteger("0");
//
//        for (int i = buffer.length - 1; i >= 0; i--) {
//            result = result.multiply(new BigInteger("256")).add(new BigInteger(String.valueOf(buffer[i])));
//        }
//        System.out.println(result);
    }

    @Test
    public void testSha256() throws DecoderException {
//        byte[] bytes = Hex.decodeHex("8caff8ee81705c6103fe62ec1ba4045377e5601f28d6eddaab7d1424a10b6303");
//        for (byte b : bytes) {
//            System.out.print((b & 0xff) + " ");
//        }
//        String str = "13519038105158845934495351092731775726668196595308543941087056195627162172358800505011612494197233792380199927025661741531238303644266280661094754717201808821956500653572561841447860233585300605980082474957699426633960666133263388972217171532015468922937386997750542923851949481582158043623338350939168272260588153889085628177291461832808272620919888881250666127102488064601342372463833747756914601489743590947633538785737611502770795066489729742490717031944154802300556446808429116530596422329627168909590380690548519981257195786299994365400301646388935625150872817454063792729212303633432564869902333521721516834605";
//        byte[] byteArray = Helpers.getByteArray(new BigInteger(str));
//        System.out.println(Arrays.toString(byteArray) + "\n" + byteArray.length);
        /*
         * -64654894613046732540530579709925746176
         * 11247970177723790606651524946746773895
         */
        int[] a = new int[]{
                /*241, 142, 126, 190,*/ 0, 154, 104, 2, 177, 167,
                83, 91, 247, 141, 244, 239, 148, 235, 91, 207
        };

        byte[] b = new byte[20];
        for (int i = 0; i < a.length; i++) {
            b[i] = (byte) a[i];
        }
        BigInteger bigInteger = Helpers.readBigIntegerFromBytes(b, false);
        System.out.println(bigInteger + ":" + Arrays.toString(bigInteger.toByteArray()));
    }

    @Test
    public void testTL() throws NoSuchAlgorithmException, InvalidKeySpecException, FileNotFoundException {
//        int a = 2936858557;
//        System.out.println(Long.parseLong("83C95aEc", 16));
//        System.out.println(TLHelpers.hexToLong("05162463"));// 85337187
//        System.out.println(TLHelpers.hexToLong("83C95aEc"));// 2211011308
        // 4  1byte = 2hex
//        String a = "a";
//        TCPAbridged tcpAbridged = new TCPAbridged();
//        byte[] bytes = new byte[]{
//                2, 3, 2
//        };
//        System.out.println(tcpAbridged.readLengthLE(bytes));
//        int b = 0xb55aba82;
//        int c = b;
//        BigInteger bigInteger = new BigInteger("2937959817066933702298617714945612856538843112005886376816255642404751219133084745514657634448776440866"
//                + "1701890505066208632169112269581063774293102577308490531282748465986139880977280302242772832972539403531"
//                + "3160108704012876427630091361567343395380424193887227773571344877461690935390938502512438971889287359033"
//                + "8945177273024525306296338410881284207988753897636046529094613963869149149606209957083647645485599631919"
//                + "2747663615955633778034897140982517446405334423701359108810182097749467210509584293428076654573384828809"
//                + "574217079944388301239431309115013843331317877374435868468779972014486325557807783825502498215169806323");
//        byte[] bytes = Helpers.SHA1(bigInteger.toString().getBytes());
//        System.out.println(Arrays.toString(bytes));
//        byte[] b = new byte[8];
//        for (int i = 19; i > 11; i--) {
//            b[19 - i] = bytes[i];
//        }


//        System.out.println(Helpers.readBigIntegerFromBytes(b, true));
//        RSA.PublicKeyNE publicKeyNE = RSA.SERVER_KEYS.get("-3414540481677951611");
//        PublicKey RsaKey = RSA.getPublicKey(publicKeyNE.getN(), publicKeyNE.getE());
//        byte[] encoded = RsaKey.getEncoded();
//        byte[] sha1 = Helpers.SHA1(encoded);
//        byte[] bytes = new byte[8];
//        byte[] b = new byte[8];
//        for (int i = 12; i < 20; i++) {
//            bytes[i - 12] = sha1[i];
//        }
//        for (int i = 19; i > 11; i--) {
//            b[19 - i] = sha1[i];
//        }
//        /*
//         * -3414540481677951611
//         * -5595554452916591101
//         *
//         */
//        System.out.println(RsaKey.getAlgorithm());
//        System.out.println(Helpers.readBigIntegerFromBytes(bytes, false));
//        System.out.println(Helpers.readBigIntegerFromBytes(b, false));
//        byte[] decode = Base64.getDecoder().decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnhaoXj7nQDo0Q6bVZHGB" +
//                "2lYYCoeK2McTYJkFoKgnppkoSFdDqGWT7sSbMzZPHJwXP/88+uu0E1zcBELyUjto" +
//                "mZnJJUns8HhzfMrcjB2ZgwIvYxMjdRqYiQj+SjN4bYH2J/6dTp9zXToc6R48mxBK" +
//                "x1sETREJ8z62AF3/UCYq/UqOIWBvcbQkP9LL7pnelvZF2ao1G5slBb8g7D4rl+/t" +
//                "Nvl9A0l0tExN12GC/gVPXuxkh8k/i4VjScdLJK1gKAoNUoZL23OrwLIyrfnzuLCz" +
//                "G1/Klfzesn05CAMDpGg8SR1bqMd4prKFIrEHJLhXRlwK537cuuO8VoquPBN9BHGI" +
//                "EwIDAQAB");
//        System.out.println(Helpers.byteArrayToHexString(Helpers.slice(decode, 0, 112)));
//        System.out.println(Helpers.byteArrayToHexString(decode));

//        String publicKey;
//        try {
//            publicKey = Objects.requireNonNull(RSA.class.getClassLoader().getResource("rsa/RsaKey")).getFile();
//        } catch (Exception e) {
//            throw new Error("Can load RSA file, you must config it!");
//        }
//
//        try(FileInputStream publicKeyInputStream = new FileInputStream(publicKey)) {
//            byte[] bytes = publicKeyInputStream.readAllBytes();
//            String s = new String(bytes);
//            String[] split = s.split(RSA.PRIVATE_KEY_END);
//            for (String s1 : split) {
//                StringBuilder builder = new StringBuilder();
//                String[] lines = s1.split("\n");
//                for (String line : lines) {
//                    builder.append(line.trim());
//                }
//                String source = builder.toString();
//                if (StringUtils.hasLength(source)) {
//                    String publicKeyBase64 = source.substring(
//                            source.indexOf(RSA.PUBLIC_KEY_BEGIN) + RSA.PUBLIC_KEY_BEGIN.length(),
//                            source.indexOf(RSA.PUBLIC_KEY_END)
//                    ).trim();
//                    byte[] decode = Base64.getDecoder().decode(publicKeyBase64);
//                    String n = Helpers.readBigIntegerFromBytes(
//                            Helpers.slice(decode, 112, 291),
//                            false
//                    ).toString();
//
//                    String e = Helpers.readBigIntegerFromBytes(
//                            Helpers.slice(decode, 291, 294),
//                            false
//                    ).toString();
//
//                    RSA.PublicKeyNE publicKeyNE = new RSA.PublicKeyNE(n, e);
//                    log.info("RSA info:\n fingerprint = {}\n n = {}\n e = {}",
//                            Helpers.readBigIntegerFromBytes(Helpers.slice(Helpers.SHA1(decode), 12, 20), false),
//                            publicKeyNE.getN(),
//                            publicKeyNE.getE()
//                    );
//                    String privateKeyBase64 = source.substring(
//                            source.indexOf(RSA.PRIVATE_KEY_BEGIN) + RSA.PRIVATE_KEY_BEGIN.length()
//                    ).trim();
//                }
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(-1099002127 & 0xffffffffL);
    }
}
