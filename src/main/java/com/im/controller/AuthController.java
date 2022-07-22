package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {

	@WebsocketHandlerMapping(value = 2792825935L, name = "SendCode")
	public AuthApi.SentCode sendCode(AuthApi.SendCode sendCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2163139623L, name = "SignUp")
	public Api.Authorization signUp(AuthApi.SignUp signUp) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3168081281L, name = "SignIn")
	public Api.Authorization signIn(AuthApi.SignIn signIn) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1047706137L, name = "LogOut")
	public AuthApi.LoggedOut logOut(AuthApi.LogOut logOut) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2678787354L, name = "ResetAuthorizations")
	public Boolean resetAuthorizations(AuthApi.ResetAuthorizations resetAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3854565325L, name = "ExportAuthorization")
	public AuthApi.ExportedAuthorization exportAuthorization(AuthApi.ExportAuthorization exportAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2776268205L, name = "ImportAuthorization")
	public Api.Authorization importAuthorization(AuthApi.ImportAuthorization importAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3453233669L, name = "BindTempAuthKey")
	public Boolean bindTempAuthKey(AuthApi.BindTempAuthKey bindTempAuthKey) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1738800940L, name = "ImportBotAuthorization")
	public Api.Authorization importBotAuthorization(AuthApi.ImportBotAuthorization importBotAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3515567382L, name = "CheckPassword")
	public Api.Authorization checkPassword(AuthApi.CheckPassword checkPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3633822822L, name = "RequestPasswordRecovery")
	public AuthApi.PasswordRecovery requestPasswordRecovery(AuthApi.RequestPasswordRecovery requestPasswordRecovery) {
		return null;
	}

	@WebsocketHandlerMapping(value = 923364464L, name = "RecoverPassword")
	public Api.Authorization recoverPassword(AuthApi.RecoverPassword recoverPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1056025023L, name = "ResendCode")
	public AuthApi.SentCode resendCode(AuthApi.ResendCode resendCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 520357240L, name = "CancelCode")
	public Boolean cancelCode(AuthApi.CancelCode cancelCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2387124616L, name = "DropTempAuthKeys")
	public Boolean dropTempAuthKeys(AuthApi.DropTempAuthKeys dropTempAuthKeys) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3084944894L, name = "ExportLoginToken")
	public AuthApi.LoginToken exportLoginToken(AuthApi.ExportLoginToken exportLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2511101156L, name = "ImportLoginToken")
	public AuthApi.LoginToken importLoginToken(AuthApi.ImportLoginToken importLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3902057805L, name = "AcceptLoginToken")
	public Api.Authorization acceptLoginToken(AuthApi.AcceptLoginToken acceptLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = 221691769L, name = "CheckRecoveryPassword")
	public Boolean checkRecoveryPassword(AuthApi.CheckRecoveryPassword checkRecoveryPassword) {
		return null;
	}
}