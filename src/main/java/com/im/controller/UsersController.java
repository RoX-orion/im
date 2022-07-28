package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class UsersController {

	@WebsocketHandlerMapping(value = 227648840, name = "GetUsers")
	public Api.User[] getUsers(UsersApi.GetUsers getUsers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1240508136, name = "GetFullUser")
	public UsersApi.UserFull getFullUser(UsersApi.GetFullUser getFullUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1865902923, name = "SetSecureValueErrors")
	public Boolean setSecureValueErrors(UsersApi.SetSecureValueErrors setSecureValueErrors) {
		return null;
	}
}