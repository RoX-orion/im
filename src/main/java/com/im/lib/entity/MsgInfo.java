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
public class MsgInfo {
    private BigInteger msgId;

    private long seqNo;

    private long salt;
}
