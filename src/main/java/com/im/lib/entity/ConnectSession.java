package com.im.lib.entity;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.PartitionKey;
import com.datastax.driver.mapping.annotations.Table;
import lombok.Data;

import java.util.UUID;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-16
 */

@Data
@Table(keyspace = "im", name = "session",
        readConsistency = "QUORUM",
        writeConsistency = "QUORUM"
)
public class ConnectSession {
    @PartitionKey
    private UUID uuid;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "auth_key_id")
    private Long authKeyId;

    @Column(name = "channel_id")
    private String channelId;

    @Column(name = "session_id")
    private Long sessionId;

    @Column(name = "server_salt")
    private Long serverSalt;

    @Column(name = "seq_no")
    private Integer seqNo;

    private Boolean login;

    private int expire;
}
