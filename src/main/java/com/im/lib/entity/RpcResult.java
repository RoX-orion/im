package com.im.lib.entity;

import com.im.lib.tl.TLObject;
import lombok.Data;

@Data
public class RpcResult {

    private long authKeyId;
    private TLObject tlObject;
    private long sessionId;
    private long msgId;
    private String channelId;

    private RpcResult(long authKeyId, TLObject tlObject, long sessionId, long msgId, String channelId) {
        this.authKeyId = authKeyId;
        this.tlObject = tlObject;
        this.sessionId = sessionId;
        this.msgId = msgId;
    }

    public static RpcResult ok(long authKeyId, TLObject response, long sessionId, long msgId, String channelId) {
        return new RpcResult(authKeyId, response, sessionId, msgId, channelId);
    }

    public static RpcResult ok(TLObject response, String channelId) {
        return new RpcResult(0, response, 0, 0, channelId);
    }

//    public static RpcResult ok(BigInteger authKeyId, TLObject response, Object data) {
//        return new RpcResult(authKeyId, response, data);
//    }
}
