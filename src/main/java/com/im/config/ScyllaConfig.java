package com.im.config;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.internal.core.metadata.DefaultEndPoint;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-23
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "scylla")
public class ScyllaConfig {

    private String host;

    private int port;

    private String datacenter;

    private String keyspace;

    private CqlSession cqlSession;

    @Bean
    public CqlSession buildCqlSession() {
         cqlSession = CqlSession.builder()
                .addContactEndPoint(new DefaultEndPoint(new InetSocketAddress(host, port)))
                .withLocalDatacenter(datacenter)
                .build();
        init();
        return cqlSession;
    }

    private void init() {
        cqlSession.execute("use " + keyspace);
    }
}
