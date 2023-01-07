package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class AuthController {

	@WebsocketHandlerMapping(value = 0xa677244f, name = "SendCode")
	public AuthApi.SentCode sendCode(AuthApi.SendCode sendCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x80eee427, name = "SignUp")
	public Api.Authorization signUp(AuthApi.SignUp signUp) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8d52a951, name = "SignIn")
	public Api.Authorization signIn(AuthApi.SignIn signIn) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3e72ba19, name = "LogOut")
	public AuthApi.LoggedOut logOut(AuthApi.LogOut logOut) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9fab0d1a, name = "ResetAuthorizations")
	public Boolean resetAuthorizations(AuthApi.ResetAuthorizations resetAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe5bfffcd, name = "ExportAuthorization")
	public AuthApi.ExportedAuthorization exportAuthorization(AuthApi.ExportAuthorization exportAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa57a7dad, name = "ImportAuthorization")
	public Api.Authorization importAuthorization(AuthApi.ImportAuthorization importAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xcdd42a05, name = "BindTempAuthKey")
	public Boolean bindTempAuthKey(AuthApi.BindTempAuthKey bindTempAuthKey) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x67a3ff2c, name = "ImportBotAuthorization")
	public Api.Authorization importBotAuthorization(AuthApi.ImportBotAuthorization importBotAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd18b4d16, name = "CheckPassword")
	public Api.Authorization checkPassword(AuthApi.CheckPassword checkPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd897bc66, name = "RequestPasswordRecovery")
	public AuthApi.PasswordRecovery requestPasswordRecovery(AuthApi.RequestPasswordRecovery requestPasswordRecovery) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x37096c70, name = "RecoverPassword")
	public Api.Authorization recoverPassword(AuthApi.RecoverPassword recoverPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3ef1a9bf, name = "ResendCode")
	public AuthApi.SentCode resendCode(AuthApi.ResendCode resendCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1f040578, name = "CancelCode")
	public Boolean cancelCode(AuthApi.CancelCode cancelCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8e48a188, name = "DropTempAuthKeys")
	public Boolean dropTempAuthKeys(AuthApi.DropTempAuthKeys dropTempAuthKeys) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb7e085fe, name = "ExportLoginToken")
	public AuthApi.LoginToken exportLoginToken(AuthApi.ExportLoginToken exportLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x95ac5ce4, name = "ImportLoginToken")
	public AuthApi.LoginToken importLoginToken(AuthApi.ImportLoginToken importLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe894ad4d, name = "AcceptLoginToken")
	public Api.Authorization acceptLoginToken(AuthApi.AcceptLoginToken acceptLoginToken) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd36bf79, name = "CheckRecoveryPassword")
	public Boolean checkRecoveryPassword(AuthApi.CheckRecoveryPassword checkRecoveryPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2db873a9, name = "ImportWebTokenAuthorization")
	public Api.Authorization importWebTokenAuthorization(AuthApi.ImportWebTokenAuthorization importWebTokenAuthorization) {
		return null;
	}
}