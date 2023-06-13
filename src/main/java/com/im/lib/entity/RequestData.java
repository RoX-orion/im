package com.im.lib.entity;

import com.im.lib.net.TLObject;
import lombok.Data;

import java.math.BigInteger;

@Data
public class RequestData {

    private BigInteger authKeyId;

    private Object requestParam;

    private int constructorId;

    private long serverSalt;

    private long sessionId;

    private BigInteger msgId;

    private String seqNo;

    private byte[] data;

    private TLObject tlObject;
}
