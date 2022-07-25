package com.im.service;

import com.im.config.Constant;
import com.im.entity.User;
import com.im.lib.Helpers;
import com.im.lib.crypto.DH;
import com.im.lib.entity.Api;
import com.im.lib.entity.DHResult;
import com.im.lib.entity.WsApiResult;
import com.im.utils.CommonUtil;
import io.netty.channel.Channel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

@Service
public class AuthService {

    public static byte[] key;

    @Value("${spring.mail.username}")
    private String from;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private JavaMailSender javaMailSender;

    @Resource
    private UserService userService;

    public void sendCheckCode(String email) {


        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        String code = CommonUtil.getSixLengthNumberCheckCode();

        stringRedisTemplate.opsForValue().set(
                Constant.CHECK_CODE_PREFIX + email,
                code, 15, TimeUnit.MINUTES
        );
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(email);
        simpleMailMessage.setSubject("验证码");
        simpleMailMessage.setText(code);

        javaMailSender.send(simpleMailMessage);
    }

    public WsApiResult authentication(String checkCode, String email) {
        String code = stringRedisTemplate.opsForValue().get(Constant.CHECK_CODE_PREFIX + email);
        // 验证码过期
        if (!StringUtils.hasLength(code)) {
            return WsApiResult.fail("authentication", "验证码过期");
        }
        // 验证码错误
        if (!checkCode.equals(code)) {
            return WsApiResult.fail("authentication", "验证码错误");
        }

        User user = userService.getUserByEmail(email);
        // 不存在创建用户
        if (user == null) {
            user = userService.createUser(email);
        }
        // 存在直接创建Token

//        DHResult result = DH.getResult(Constant.DH_BASE);
//        BigInteger key = Helpers.fastMod(clientResult, result.getIndex(), Constant.DH_PRIME);
//        String token = DH.createSecretKey(key);
        /*
         * uid:authKey
         * AES(uid + authKey)
         */
        String authKey = stringRedisTemplate.opsForValue().get(Constant.UID_AUTH_KEY + user.getUid());
        String originalToken = user.getUid() + ":" + authKey;

        String token = null;
//        try {
//            stringRedisTemplate.opsForValue().set(
//                    Constant.TOKEN_PREFIX + token,
//                    new ObjectMapper().writeValueAsString(user)
//            );
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }

        return WsApiResult.ok("authentication", null);
    }

    public BigInteger getAuthKey(Api.DH dh, Channel channel) {
        // 获取256位指数
        byte[] randomBytes = Helpers.getRandomBytes(32);
        BigInteger index = Helpers.readBigIntegerFromBytes(randomBytes, false);
        DHResult result1 = DH.getResult(Constant.DH_BASE, index, Constant.DH_PRIME);
        BigInteger gbp = result1.getResult();

        DHResult result = DH.getResult(new BigInteger(dh.getGap()), index, Constant.DH_PRIME);
        byte[] authKey = Helpers.getByteArray(result.getResult());
        String authKeyId = Helpers.readBigIntegerFromBytes(
                Helpers.slice(Helpers.SHA1(authKey), 0, 8), true
        ).toString();

        stringRedisTemplate.opsForValue().set(
                Constant.CHANNEL_ID_AUTH_KEY + channel.id().asShortText(),
                Helpers.byteArrayToHexString(authKey)
        );

        return gbp;
    }
}
