package com.im.service;

import com.im.config.Constant;
import com.im.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class StateService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void inGroup(String channelId, User user) {
        /*
         * 设置channelId-uid表
         * 1:1
         */
//        stringRedisTemplate.opsForValue().set(
//                Constant.CHANNEL_ID_UID + channelId,
//                String.valueOf(user.getUid())
//        );

        /*
         * 设置uid-channelId表
         * uid------channelId
         *      1:1
         */
//        stringRedisTemplate.opsForValue().set(
//                Constant.UID_CHANNEL_ID + user.getUid(), channelId
//        );

//        stringRedisTemplate.opsForValue().set(Constant.USER + user.getUid(), Constant.ONLINE);
    }

    public void outGroup(String uid, String channelId) {
        if (StringUtils.hasLength(uid)) {

            /*
             * 删除channelId-uid表项
             */
            stringRedisTemplate.delete(Constant.CHANNEL_ID_UID + channelId);

            /*
             * 删除uid-channelId表项
             */
            stringRedisTemplate.delete(Constant.UID_CHANNEL_ID + uid);
        }
    }
}
