package com.im.lib.entity;

import com.im.lib.tl.TLObject;
import lombok.Data;

@Data
public class RpcResult {

    private long authKeyId;
    private TLObject response;
    private long sessionId;

    private RpcResult(long authKeyId, TLObject response, long sessionId) {
        this.authKeyId = authKeyId;
        this.response = response;
        this.sessionId = sessionId;
    }

    public static RpcResult ok(long authKeyId, TLObject response, long sessionId) {
        return new RpcResult(authKeyId, response, sessionId);
    }

    public static RpcResult ok(TLObject response) {
        return new RpcResult(0, response, 0);
    }

//    public static RpcResult ok(BigInteger authKeyId, TLObject response, Object data) {
//        return new RpcResult(authKeyId, response, data);
//    }
}
