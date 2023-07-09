package com.im.lib.tl;

import com.im.lib.net.SerializedData;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-06
 */

public class MsgContainer {

    public static MTProtoApi.Msg_container read(byte[] data) {
        SerializedData stream = new SerializedData(data);
        MTProtoApi.Msg_container msgContainer = new MTProtoApi.Msg_container();
        msgContainer.readParams(stream);
        return msgContainer;
    }

    public static void write() {

    }
}
