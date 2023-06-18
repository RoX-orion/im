package com.im.lib.entity;

import com.im.lib.tl.TLObject;
import lombok.Data;

import java.math.BigInteger;

@Data
public class RpcResult {

    private BigInteger authKeyId;
    private TLObject response;
    private long sessionId;

    private RpcResult(BigInteger authKeyId, TLObject response, long sessionId) {
        this.authKeyId = authKeyId;
        this.response = response;
        this.sessionId = sessionId;
    }

    public static RpcResult ok(BigInteger authKeyId, TLObject response, long sessionId) {
        return new RpcResult(authKeyId, response, sessionId);
    }

    public static RpcResult ok(TLObject response) {
        return new RpcResult(BigInteger.ZERO, response, 0);
    }

//    public static RpcResult ok(BigInteger authKeyId, TLObject response, Object data) {
//        return new RpcResult(authKeyId, response, data);
//    }
}
