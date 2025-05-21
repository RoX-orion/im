package com.im.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-23
 */

@Data
//@Configuration
//@ConfigurationProperties(prefix = "scylla")
public class ScyllaConfig {

    private String host;

    private int port;

    private String datacenter;

    private String keyspace;

    private Session session;

    private Cluster cluster;

    @PostConstruct
    public Cluster buildCluster() {
        cluster = Cluster.builder()
                .addContactPoint(host)
                .withPort(port)
                .build();
        return cluster;
    }

    @Bean("session")
    public Session buildCqlSession() {
        session = cluster.connect(keyspace);
        return session;
    }
}
