package com.im.controller;

import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.tl.TLRPC;
import com.im.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@WebsocketHandler
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(final UserService userService) {
        this.userService = userService;
    }

//	@WebsocketHandlerMapping(value = 0xd91a548, name = "GetUsers")
//	public TLRPC.User[] getUsers(UsersApi.GetUsers getUsers) {
//		return null;
//	}
//
	@WebsocketHandlerMapping(value = 0xb60f5918, name = "GetFullUser")
	public TLRPC.TL_userFull getFullUser(TLRPC.TL_users_getFullUser getFullUser) {
		return userService.getFullUser(getFullUser);
	}
//
//	@WebsocketHandlerMapping(value = 0x90c894b5, name = "SetSecureValueErrors")
//	public Boolean setSecureValueErrors(UsersApi.SetSecureValueErrors setSecureValueErrors) {
//		return null;
//	}
}
