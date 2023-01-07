package com.im;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.im.api.Api;
import com.im.lib.Helpers;
import com.im.lib.core.MTProtoStateService;
import com.im.lib.crypto.AES;
import com.im.lib.crypto.RSA;
import com.im.vo.TestArray;
import org.junit.Test;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Date;

public class TestApplication {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSha1() {
        byte[] bytes = new byte[]{
                -125, 74, 12, -111, 125, 35, -26, 124
        };

        int[] data = new int[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            data[i] = bytes[i] & 0xff;
        }

//        for (int i = data.length - 1; i >= 0; i--) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(data[i])));
//        }

//        for (int i = 0; i < data.length; i++) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(data[i])));
//
//        }
        /*
         * 7682667135076515389
         *
         *
         */
//        for (int i = 0; i < bytes.length; i++) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(bytes[i])));
//
//        }
//        for (int i = bytes.length - 1; i >= 0; i--) {
//            result = result.shiftLeft(8).or(new BigInteger(String.valueOf(bytes[i])));
//        }

//        BinaryReader<Object> binaryReader = new BinaryReader<>(bytes);
//        BigInteger bigInteger = binaryReader.readInt64();
//        System.out.println(bigInteger);
    }

    @Test
    public void testCurrentHashMap() {
        BigInteger nonce = new BigInteger("-131702988089768771318311448323908457173");
        byte[] bytes = new byte[16];
        for (int i = 0; i < 16; i++) {
            bytes[i] = (nonce.shiftRight(8 * i)
                    .and(BigInteger.valueOf(255)).byteValue());
        }
        System.out.println(Arrays.toString(bytes));
        //4602934577132210591
        // [52, 54, 48, 50, 57, 51, 52, 53, 55, 55, 49, 51, 50, 50, 49, 48, 53, 57, 49]
        int[] bytes1 = new int[]{28, 181, 196, 21};
        long result = 0;
        for (int i = bytes1.length - 1; i >= 0; i--) {
            result = result << 8 | bytes1[i];
        }
        System.out.println(result);
        System.out.println(0x15c4b51c);

//        BigInteger result = BigInteger.ZERO;
//        for (int i = 0; i < 16; i++) {
//            result = result.shiftLeft(8).or(BigInteger.valueOf(bytes[i]));
//        }

    }

    @Test
    public void testRSA() {
        BigInteger base = new BigInteger(
                "10143462730380424841936274521726413941084579108026491223719876548761019320221721159194969841173" +
                        "25537726740863942453129135868762767946191154434303718341269534253673160785527437789688128222845355452" +
                        "42525322106717784649836239557623070840305629223039168984170697361900374429149751054202867744214104479" +
                        "35916889220211530157509280543190432644419243303082866369539586655459565546001298851048855494493205422" +
                        "12545827417394580502180206412291"
        );
        BigInteger b1 = new BigInteger(
                "2937959817066933702298617714945612856538843112005886376816255642404751219133084745514657634448776440866"
                        + "1701890505066208632169112269581063774293102577308490531282748465986139880977280302242772832972539403531"
                        + "3160108704012876427630091361567343395380424193887227773571344877461690935390938502512438971889287359033"
                        + "8945177273024525306296338410881284207988753897636046529094613963869149149606209957083647645485599631919"
                        + "2747663615955633778034897140982517446405334423701359108810182097749467210509584293428076654573384828809"
                        + "574217079944388301239431309115013843331317877374435868468779972014486325557807783825502498215169806323"
        );

        BigInteger b2 = new BigInteger(
                "2534288944884041556497168959071347320689884775908477905258202659454602246385394058588521595116849196570"
                        + "8222649399180603818074200620463776135424884632162512403163793083921641631564740959529419359595852941166"
                        + "8489405859523376133330223960965841179548922160312292373029437018775884567383353986024616752250817918203"
                        + "9315375750495263623495132323782003654358104782690612092797248736680529211579223142368426126233039432475"
                        + "0785450942589751755390156647751460719351439969059949569615302809050721500330239005077889855323917509948"
                        + "255722081644689442127297605422579707142646660768825302832201908302295573257427896031830742328565032949"
        );
//        System.out.println(base.toString().length());
//        System.out.println(b1.toString().length());
//        System.out.println(b2.toString().length());
        /**
         * 3566151907508090281339497165011676433572607964150825052314229790956071746725366314700303758495983216998338502026130974432186609238062063279781229943189972716925869351040610895745483742207062779091736793897949040720656853343342277112275850483911101888726836705885114349409781288836602561860752481879291635853995365244769326644420237400550428330315867133202691052494715391332381544327942251772065661604371239692399975571230346772995
         *
         */
        RSA rsa = new RSA();
        String s = new BigInteger("00C75AB65394B07E516393DB6D38DEB0621792F16AD7CAF2085B95DC37AFEDAACF01E7629EC00210772CA113009C27520ED5E61546BCEC64A5490BA4037CB626B681B6514C1EDFDCF624FB620801F5AD07AEA5209E71B24F94D00232AAA4CA8725C6BA1AE42F19FDC9B0B450C5ADAA03103185E8D31ECD252D830F017DCFC4CDC82F94BDF667DB7F1F783804BEAE4F121D46F4972FB859A5AC516FB8EEBC6D975E833975D651C253CD4925DBFB6A2E5A825838D561EC4C967216CB9D8903E47728061C5A87941373BE4DEF819E71B665BF3BC9AC4E920954E9E86E64BE8D887453296E7B8038695DD4BF5420C8FA59B19E0BF61EA9E21BADFE13DDEA6B826BB245", 16).toString(10);
        String str = "25166154547577320487560884743239870369518737027959267500434592729511045611058190284727476479351132001123194008972864820951598652952134389752607186334345476484977464981661370307168607730402336053908541991993231561008738551590873642689381992247601133017545013397263713765438669287370875707280635525167083138720818152187566408254347466796604911135542352307816702370309522810670910011947441005023948152866901077077676114228107073687393173698937969052917992116307248022428732471805062856200568831160128041631640865999348060925685254715860158622981177835376104134731650198791337653473282087148269529686000072709829796016709";
        System.out.println(s.length());

        //30bytes
        String s1 = new BigInteger("b65394b07e516393db6d38deb0621792f16ad7caf2085b95dc37afedaacf01e7629ec00210772ca113009c27520ed5e61546bcec64a5490ba4037cb626b681b6514c1edfdcf624fb620801f5ad07aea5209e71b24f94d00232aaa4ca8725c6ba1ae42f19fdc9b0b450c5adaa03103185e8d31ecd252d830f017dcfc4cdc82f94bdf667db7f1f783804beae4f121d46f4972fb859a5ac516fb8eebc6d975e833975d651c253cd4925dbfb6a2e5a825838d561ec4c967216cb9d8903e47728061c5a87941373be4def819e71b665bf3bc9ac4e920954e9e86e64be8d887453296e7b8038695dd4bf5420c8fa59b19e0bf61ea9e21badfe13ddea6b826bb2450203", 16).toString(10);
//        System.out.println(s1);
    }

    @Test
    public void testSetBigInteger() {
        BigInteger p = new BigInteger("11507591");
        BigInteger q = new BigInteger("15081037");
        System.out.println(p.multiply(q));
//        long begin = System.currentTimeMillis();
//        System.out.println(p.isProbablePrime(5));
//        System.out.println(System.currentTimeMillis() - begin);
    }

    @Test
    public void testBytes() throws Exception {
//        System.out.println(127 + (-82 & 0xff) * 256);
        BigInteger bigInteger = new BigInteger("8273283975129431674");
        byte[] bytes = Helpers.toSignedLittleBuffer(bigInteger, 8);
        System.out.println(Arrays.toString(bytes));
    }

    @Test
    public void testTL() throws JsonProcessingException {
//        AesParams aesParams = new AesParams(new byte[10], new byte[10]);
//        System.out.println(aesParams);
        int[] ints = new int[]{96, 9, 190, 148, 132, 12, 83, 187};
        byte[] bytes = new byte[8];
        for (int i = 0; i < ints.length; i++) {
            bytes[i] = (byte) ints[i];
        }
//        ByteBuf byteBuf = Unpooled.wrappedBuffer(bytes);
//        System.out.println(byteBuf.readLongLE());
//        BigInteger bigInteger = Helpers.readBigIntegerFromBytes(bytes, true, false);
//        System.out.println(bigInteger);
//        System.out.println(bigInteger.longValue());
        System.out.println(0xc1cd5ea9);

//        Class<com.im.api.Test> clazz = com.im.api.Test.class;
//        Field[] declaredFields = clazz.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            Class<?> type = declaredField.getType();
//            System.out.println(type.getSimpleName());
//        }

    }

    @Test
    public void testAesGCM() {
        byte[] key = new byte[32];
        byte[] iv = new byte[32];
        String str = "hello";
        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));
        byte[] bytes = AES.gcmEncrypt(key, iv, str.getBytes(StandardCharsets.UTF_8));
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(AES.gcmDecrypt(key, iv, bytes)));
    }

    @Test
    public void testArray() throws IllegalAccessException {

//        Class<TestArray> clazz = TestArray.class;
//        Field[] declaredFields = clazz.getDeclaredFields();
//        TestArray testArray = new TestArray();
//        String[] str = new String[]{"hello", "world"};
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//            declaredField.set(testArray, str);
//            System.out.println(declaredField.getType());
//        }
//        System.out.println(testArray);
//        Class clazz = String.class;
//        Object o = Array.newInstance(clazz, 5);
//        for (int i = 0; i < 3; i++) {
//            Array.set(o, i, String.valueOf(i));
//        }
//
//        System.out.println(Arrays.toString((String[])o));
//        Object o = Array.newInstance(, 1);
//        Array.set(o, 0, "hello");
//        String[] strings;
//        strings = (String[]) o;
//        System.out.println(Arrays.toString(strings));

        String[][] array = new String[1][];
        System.out.println(array.getClass().getComponentType().getComponentType());
//        stringRedisTemplate.opsForList().indexOf();
    }

    @Test
    public void testMsgId() {
        MTProtoStateService mtProtoStateService = new MTProtoStateService();
        BigInteger mod = mtProtoStateService.getNewMsgId(true);
        BigInteger divide = mod.divide(new BigInteger("4294967296"));
//        Date date = new Date();
//        System.out.println(date);
        System.out.println(new Date(divide.longValue() * 1000));
        System.out.println(new Date());
    }
}
