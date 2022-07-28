package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class AuthController {

	@WebsocketHandlerMapping(value = -1502141361, name = "SendCode")
	public AuthApi.SentCode sendCode(AuthApi.SendCode sendCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2131827673, name = "SignUp")
	public Api.Authorization signUp(AuthApi.SignUp signUp) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1126886015, name = "SignIn")
	public Api.Authorization signIn(AuthApi.SignIn signIn) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1047706137, name = "LogOut")
	public AuthApi.LoggedOut logOut(AuthApi.LogOut logOut) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1616179942, name = "ResetAuthorizations")
	public Boolean resetAuthorizations(AuthApi.ResetAuthorizations resetAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = -440401971, name = "ExportAuthorization")
	public AuthApi.ExportedAuthorization exportAuthorization(AuthApi.ExportAuthorization exportAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1518699091, name = "ImportAuthorization")
	public Api.Authorization importAuthorization(AuthApi.ImportAuthorization importAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = -841733627, name = "BindTempAuthKey")
	public Boolean bindTempAuthKey(AuthApi.BindTempAuthKey bindTempAuthKey) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1738800940, name = "ImportBotAuthorization")
	public Api.Authorization importBotAuthorization(AuthApi.ImportBotAuthorization importBotAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = -779399914, name = "CheckPassword")
	public Api.Authorization checkPassword(AuthApi.CheckPassword checkPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = -661144474, name = "RequestPasswordRecovery")
	public AuthApi.PasswordRecovery requestPasswordRecovery(AuthApi.RequestPasswordRecovery requestPasswordRecovery) {
		return null;
	}

	@WebsocketHandlerMapping(value = 923364464, name = "RecoverPassword")
	public Api.Authorization recoverPassword(AuthApi.RecoverPassword recoverPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1056025023, name = "ResendCode")
	public AuthApi.SentCode resendCode(AuthApi.ResendCode resendCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 520357240, name = "CancelCode")
	public Boolean cancelCode(AuthApi.CancelCode cancelCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1907842680, name = "DropTempAuthKeys")
	public Boolean dropTempAuthKeys(AuthApi.DropTempAuthKeys dropTempAuthKeys) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1210022402, name = "ExportLoginToken")
	public AuthApi.LoginToken exportLoginToken(AuthApi.ExportLoginToken exportLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1783866140, name = "ImportLoginToken")
	public AuthApi.LoginToken importLoginToken(AuthApi.ImportLoginToken importLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = -392909491, name = "AcceptLoginToken")
	public Api.Authorization acceptLoginToken(AuthApi.AcceptLoginToken acceptLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = 221691769, name = "CheckRecoveryPassword")
	public Boolean checkRecoveryPassword(AuthApi.CheckRecoveryPassword checkRecoveryPassword) {
		return null;
	}
}