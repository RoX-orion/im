package com.im.lib.entity;

import com.im.lib.tl.TLObject;
import lombok.Data;

@Data
public class RequestData {

    private long authKeyId;

//    private Object requestParam;

    private int constructorId;

    private long serverSalt;

    private long sessionId;

    private long msgId;

    private String seqNo;

    private byte[] data;

    private TLObject tlObject;
}
