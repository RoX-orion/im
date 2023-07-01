package com.im.lib.entity;

import lombok.Data;

import java.math.BigInteger;

/**
 * Copyright (c) 2022 Aix Lina. All rights reserved.
 *
 * @author: Aix Lina
 * @date: 2023-01-04
 */

@Data
public class SessionInfo {

    public static final String AUTH_KEY = "authKey";

    public static final String SESSION_ID = "sessionId";

    public static final String SEQ_NO = "seqNo";

    public static final String SERVER_SALT = "serverSalt";

    public static final String SERVER_SALT_EXPIRE = "expire";

    public static final String IS_LOGIN = "isLogin";

    public static final String READY_LOGIN = "readyLogin";

    public static final String CHANNEL_ID = "channelId";

    private BigInteger authKey; // gab

    private long sessionId;

    private String seqNo;

    private String salt;

    private boolean isLogin;

    private boolean readyLogin;

    private String channelId;
}
