package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController {

	@WebsocketHandlerMapping(value = 227648840L, name = "GetUsers")
	public Api.User[] getUsers(UsersApi.GetUsers getUsers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3054459160L, name = "GetFullUser")
	public UsersApi.UserFull getFullUser(UsersApi.GetFullUser getFullUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2429064373L, name = "SetSecureValueErrors")
	public Boolean setSecureValueErrors(UsersApi.SetSecureValueErrors setSecureValueErrors) {
		return null;
	}
}