package com.im.config;

import com.im.entity.User;
import com.im.lib.crypto.RSA;
import com.im.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ApplicationConfig implements ApplicationRunner {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private UserMapper userMapper;

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
        removeAllConnection();

        // set all users state
//        List<User> users = userMapper.selectList(null);
//        for (User user : users) {
//            stringRedisTemplate.opsForValue().set(
//                    Constant.USER + user.getUid(),
//                    Constant.OFFLINE
//            );
//        }
    }

    @PreDestroy
    public void destroyAllConnection() {
        removeAllConnection();
    }

    public void removeAllConnection() {

        Set<String> channelIdUid = stringRedisTemplate.keys(Constant.CHANNEL_ID_UID + "*");
        if (channelIdUid != null) {
            stringRedisTemplate.delete(channelIdUid);
        }

        Set<String> uidChannelIds = stringRedisTemplate.keys(Constant.UID_CHANNEL_ID + "*");
        if (uidChannelIds != null) {
            stringRedisTemplate.delete(uidChannelIds);
        }

        Set<String> userState = stringRedisTemplate.keys(Constant.USER + "*");
        if (userState != null) {
            stringRedisTemplate.delete(userState);
        }
    }
}
