package com.im.entity;

import lombok.Data;

import java.math.BigInteger;

@Data
public class MTProtoState {
    private long timeOffset;
    private long salt;
    private long sequence;
    private BigInteger lastMsgId;
}
