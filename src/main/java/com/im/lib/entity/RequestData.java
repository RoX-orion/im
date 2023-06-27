package com.im.lib.entity;

import com.im.lib.tl.TLObject;

public class RequestData {

    public long authKeyId = -1;

    public int constructorId;

    public long serverSalt;

    public long sessionId = -1;

    public long msgId;

    public int seqNo;

    public byte[] data;

    public TLObject tlObject;
}
