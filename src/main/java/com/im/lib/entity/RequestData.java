package com.im.lib.entity;

import lombok.Data;

import java.math.BigInteger;

@Data
public class RequestData {

    private BigInteger authKeyId;

    private Object requestParam;

    private int constructorId;

    private long salt;

    private long sessionId;

    private BigInteger msgId;

    private long seqNo;

    private byte[] data;
}
