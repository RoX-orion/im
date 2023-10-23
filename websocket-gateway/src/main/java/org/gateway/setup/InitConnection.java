package org.gateway.setup;

import io.netty.channel.group.ChannelGroup;
import jakarta.annotation.PreDestroy;
import org.gateway.net.ChannelManager;
import org.gateway.net.SessionManager;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-10-23
 */

@Configuration
public class InitConnection implements ApplicationRunner {

    private final ChannelManager channelManager;

    private final SessionManager sessionManager;

    public InitConnection(final ChannelManager channelManager,
                          final SessionManager sessionManager) {
        this.channelManager = channelManager;
        this.sessionManager = sessionManager;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    @PreDestroy
    public void destroyAllConnection() {
        ChannelGroup channelGroup = channelManager.getChannelGroup();
        channelGroup.forEach((e -> sessionManager.destroySessionInfo(e.id().asLongText())));
    }
}
