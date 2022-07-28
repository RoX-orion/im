package com.im.wscontroller;

import com.im.api.Api;
import com.im.lib.entity.Response;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.entity.WsApiResult;
import com.im.service.AuthService;
import io.netty.channel.Channel;

import javax.annotation.Resource;
import java.math.BigInteger;

@WebsocketHandler
public class AuthHandler {

    @Resource
    private AuthService authService;

//    @WebsocketHandlerMapping("dh")
    public WsApiResult getAuthKey(Channel channel) {
//        BigInteger gbp = authService.getAuthKey(dh, channel);
        Response.DH dhResponse = new Response.DH();
//        dhResponse.setGbp(gbp.toString());
        return null;
//        return WsApiResult.ok(1, dhResponse);
    }

//    @WebsocketHandlerMapping("login")
    public WsApiResult sendCheckCode(@WebsocketRequestParam String email) {
        authService.sendCheckCode(email);
        return null;
//        return WsApiResult.ok(1, null);
    }

//    @WebsocketHandlerMapping("authentication")
    public WsApiResult authentication(@WebsocketRequestParam String code,
                                      @WebsocketRequestParam String email) {
        return authService.authentication(code, email);
    }
}
