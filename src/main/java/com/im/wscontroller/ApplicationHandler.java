package com.im.wscontroller;

import com.im.entity.InitConnection;
import com.im.lib.entity.WsApiResult;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class ApplicationHandler {

//    @WebsocketHandlerMapping("initConnection")
    public WsApiResult initConnection(InitConnection initConnection) {
        System.out.println(initConnection);

        return WsApiResult.ok("initConnection", null);
    }
}
