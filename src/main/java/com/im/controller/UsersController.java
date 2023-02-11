package com.im.controller;

import com.im.api.Api;
import com.im.api.UsersApi;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class UsersController {

	@WebsocketHandlerMapping(value = 0xd91a548, name = "GetUsers")
	public Api.User[] getUsers(UsersApi.GetUsers getUsers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb60f5918, name = "GetFullUser")
	public UsersApi.UserFull getFullUser(UsersApi.GetFullUser getFullUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x90c894b5, name = "SetSecureValueErrors")
	public Boolean setSecureValueErrors(UsersApi.SetSecureValueErrors setSecureValueErrors) {
		return null;
	}
}
