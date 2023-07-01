package com.im.lib.net;

import com.im.lib.tl.MTProtoApi;
import com.im.lib.tl.TLHelpers;
import com.im.lib.tl.TLObject;
import org.springframework.stereotype.Component;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-30
 */

@Component
public class ResultHandler {

    public byte[] rpcResultHandling(long msgId, TLObject tlObject) {
        MTProtoApi.Rpc_result rpcResult = new MTProtoApi.Rpc_result();
        rpcResult.req_msg_id = msgId;
        rpcResult.result = TLHelpers.getBytes(tlObject);

        return TLHelpers.getBytes(rpcResult);
    }
}
