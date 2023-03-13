package com.im.config;

import com.im.lib.crypto.RSA;
import com.im.redis.KeyPrefix;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ApplicationConfig implements ApplicationRunner {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    @Bean
    public Executor asyncServiceExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(16);
        threadPoolTaskExecutor.setMaxPoolSize(32);
        threadPoolTaskExecutor.setQueueCapacity(0xFFFF);// 65535
        threadPoolTaskExecutor.setAllowCoreThreadTimeOut(false);
        threadPoolTaskExecutor.setThreadNamePrefix("async-service");
        threadPoolTaskExecutor.setKeepAliveSeconds(20);
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

    @Override
    public void run(ApplicationArguments args) {
        RSA.computeRSAInfo();
//        removeAllConnection();

        deleteAllSession();

        // set all users state
//        List<User> users = userMapper.selectList(null);
//        for (User user : users) {
//            stringRedisTemplate.opsForValue().set(
//                    Constant.USER + user.getUid(),
//                    Constant.OFFLINE
//            );
//        }
    }

    private void deleteAllSession() {
        redisTemplate.delete(KeyPrefix.SESSION + "*");
        stringRedisTemplate.delete(KeyPrefix.CHANNEL_ID_AUTH_KEY_ID + "*");
    }

    @PreDestroy
    public void destroyAllConnection() {
        removeAllConnection();
    }

    public void removeAllConnection() {

//        Set<String> channelIdUid = stringRedisTemplate.keys(Constant.CHANNEL_ID_UID + "*");
//        if (channelIdUid != null) {
//            stringRedisTemplate.delete(channelIdUid);
//        }
//
//        Set<String> uidChannelIds = stringRedisTemplate.keys(Constant.UID_CHANNEL_ID + "*");
//        if (uidChannelIds != null) {
//            stringRedisTemplate.delete(uidChannelIds);
//        }
//
//        Set<String> userState = stringRedisTemplate.keys(Constant.USER + "*");
//        if (userState != null) {
//            stringRedisTemplate.delete(userState);
//        }
    }
}
