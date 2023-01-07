package com.im.lib.entity;

import lombok.Data;

import java.math.BigInteger;
import java.util.Set;

@Data
public class MTProtoState {
    private BigInteger msgId;
    private BigInteger lastMsgId;
    private long timeOffset;
    private BigInteger salt;
    private BigInteger session;
    private Set<Long> ackList;
}
