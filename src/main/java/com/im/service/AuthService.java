package com.im.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.im.entity.User;
import com.im.lib.Helpers;
import com.im.lib.exception.RpcError;
import com.im.lib.net.Errors;
import com.im.lib.tl.TLRPC;
import com.im.mapper.UserMapper;
import com.im.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-01
 */

@Service
public class AuthService {

    private final StringRedisTemplate stringRedisTemplate;

    private final String PHONE_CODE = "phone-code:";

    private final UserMapper userMapper;

    @Autowired
    public AuthService(
            final StringRedisTemplate stringRedisTemplate,
            final UserMapper userMapper) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.userMapper = userMapper;
    }

    public TLRPC.TL_auth_loginToken exportLoginToken(TLRPC.TL_auth_exportLoginToken exportLoginToken) {
        TLRPC.TL_auth_loginToken authLoginToken = new TLRPC.TL_auth_loginToken();
//        authLoginToken.token = ;
        authLoginToken.expires = (int) ((System.currentTimeMillis() / 1000) + 30);
        authLoginToken.token = Helpers.getRandomBytes(34);

        return authLoginToken;
    }

    public TLRPC.TL_auth_sentCode sendCode(TLRPC.TL_auth_sendCode sendCode, long authKeyId) {
//        stringRedisTemplate.opsForValue().getAndExpire(key, -1, TimeUnit.SECONDS);
        TLRPC.TL_auth_sentCode sentCode = new TLRPC.TL_auth_sentCode();
        byte[] bytes = Helpers.SHA1(sendCode.phone_number.getBytes(StandardCharsets.UTF_8),
                String.valueOf(Helpers.getRandomInt64()).getBytes(StandardCharsets.UTF_8)
        );
        sentCode.phone_code_hash = Helpers.byteArrayToHexString(bytes).substring(0, 18);
        sentCode.type = new TLRPC.TL_auth_sentCodeTypeApp();
        sentCode.timeout = (int) (TimeUtil.getFeatureTimestamp(300000) / 1000);

        stringRedisTemplate.opsForValue()
                .set(PHONE_CODE + sentCode.phone_code_hash, Helpers.getRandomCode(5), 5, TimeUnit.MINUTES);

        return sentCode;
    }

    public TLRPC.auth_Authorization signIn(TLRPC.TL_auth_signIn signIn) {
        if (!StringUtils.hasText(signIn.phone_code)) {

        }
//        TLRPC.TL_auth_authorizationSignUpRequired authorizationSignUpRequired = new TLRPC.TL_auth_authorizationSignUpRequired();
//        TLRPC.TL_help_termsOfService termsOfService = new TLRPC.TL_help_termsOfService();
//        TLRPC.TL_dataJSON dataJSON = new TLRPC.TL_dataJSON();
//        dataJSON.data = "0xFFFFFF";
//        TLRPC.TL_messageEntityTextUrl messageEntityTextUrl = new TLRPC.TL_messageEntityTextUrl();
//        messageEntityTextUrl.language = "ZN-CN";
//        messageEntityTextUrl.url = "https://google.com";
//        messageEntityTextUrl.offset = 2;
//        messageEntityTextUrl.length = 10;
//        termsOfService.setPopup(true);
//        termsOfService.id = dataJSON;
//        termsOfService.text = "您必须同意我们的服务许可才能使用TelegramX";
//        termsOfService.entities = List.of(messageEntityTextUrl);
//        termsOfService.setMin_age_confirm(12);
//        authorizationSignUpRequired.setTerms_of_service(termsOfService);
        User user = userMapper.selectOne(
                new QueryWrapper<User>().eq("phone", signIn.phone_number)
        );
        if (user == null) {
            throw new RpcError(Errors.PHONE_NUMBER_UNOCCUPIED);
        }
        String phoneCode = stringRedisTemplate.opsForValue()
                .get(PHONE_CODE + signIn.phone_code_hash);
        TLRPC.TL_auth_authorization authorization = new TLRPC.TL_auth_authorization();
        authorization.setup_password_required = user.isSetupPasswordRequired();

        TLRPC.TL_user tlUser = new TLRPC.TL_user();
        tlUser.id = user.getId();
        tlUser.first_name = user.getFirstName();
        tlUser.last_name = user.getLastName();
        tlUser.phone = user.getPhone();
        tlUser.bot = user.isBot();
        tlUser.username = user.getUsername();
        tlUser.verified = true;

        authorization.user = tlUser;
        /**
 *         public long access_hash;
 *         public UserProfilePhoto photo;
 *         public UserStatus status;
 *         public int flags;
 *         public int flags2;
 *         public boolean self;
 *         public boolean contact;
 *         public boolean mutual_contact;
 *         public boolean deleted;
 *         public boolean bot_chat_history;
 *         public boolean bot_nochats;
 *         public boolean restricted;
 *         public boolean min;
 *         public boolean bot_inline_geo;
 *         public boolean support;
 *         public boolean scam;
 *         public boolean apply_min_photo;
 *         public boolean fake;
 *         public boolean premium;
 *         public int bot_info_version;
 *         public String bot_inline_placeholder;
 *         public String lang_code;
 *         public boolean inactive;
 *         public boolean explicit_content;
 *         public List<TL_restrictionReason> restriction_reason = new ArrayList<>();
 *         public boolean bot_attach_menu;
 *         public boolean bot_menu_webview;
 *         public boolean attach_menu_enabled;
 *         public EmojiStatus emoji_status;
 *         public List<TL_username> usernames = new ArrayList<>();
         */

        return authorization;
    }
}
