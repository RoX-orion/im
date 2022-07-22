package com.im.wscontroller;

import com.im.lib.annotation.WebsocketHandler;

@WebsocketHandler
public class ChangeDHKey {

//    private LinkedHashMap<String, BigInteger> privateKeyMap = new LinkedHashMap<>();
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    public void getPublicKey(Long uid) {
//        Random random = new Random();
//        StringBuilder privateKey = new StringBuilder("1");
//        for (int i = 0; i < 127; i++) {
//            privateKey.append(random.nextInt(10));
//        }
//
//        BigInteger publicKey = Helpers.fastMod(Constant.DH_G, new BigInteger(privateKey.toString()), Constant.DH_P);
//        System.out.println(publicKey);
//    }
//
//    public void createSecretKey(String publicKey, Long uid) {
//        BigInteger pk = new BigInteger(publicKey);
//        BigInteger result = pk.multiply(privateKeyMap.get(uid));
//        String secretKey = EncryptionUtil.SHA256(result.toString());
//    }
}
