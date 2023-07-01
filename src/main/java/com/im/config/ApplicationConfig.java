package com.im.config;

import com.im.lib.crypto.RSA;
import com.im.lib.net.ChannelManager;
import com.im.redis.SessionManager;
import io.netty.channel.group.ChannelGroup;
import jakarta.annotation.PreDestroy;
import jakarta.annotation.Resource;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
public class ApplicationConfig implements ApplicationRunner {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    private final ChannelManager channelManager;

    private final SessionManager sessionManager;

    public ApplicationConfig(final ChannelManager channelManager,
                             final SessionManager sessionManager) {
        this.channelManager = channelManager;
        this.sessionManager = sessionManager;
    }

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

//        deleteAllSession();

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
        redisTemplate.delete(SessionManager.SESSION + "*");
    }

    @PreDestroy
    public void destroyAllConnection() {
        ChannelGroup channelGroup = channelManager.getChannelGroup();
        channelGroup.forEach((e -> sessionManager.destroySessionInfo(e.id().asLongText())));
    }
}
