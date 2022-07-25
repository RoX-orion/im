package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {

	@WebsocketHandlerMapping(value = -326762118, name = "RegisterDevice")
	public Boolean registerDevice(AccountApi.RegisterDevice registerDevice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1779249670, name = "UnregisterDevice")
	public Boolean unregisterDevice(AccountApi.UnregisterDevice unregisterDevice) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2067899501, name = "UpdateNotifySettings")
	public Boolean updateNotifySettings(AccountApi.UpdateNotifySettings updateNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 313765169, name = "GetNotifySettings")
	public Api.PeerNotifySettings getNotifySettings(AccountApi.GetNotifySettings getNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = -612493497, name = "ResetNotifySettings")
	public Boolean resetNotifySettings(AccountApi.ResetNotifySettings resetNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2018596725, name = "UpdateProfile")
	public Api.User updateProfile(AccountApi.UpdateProfile updateProfile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1713919532, name = "UpdateStatus")
	public Boolean updateStatus(AccountApi.UpdateStatus updateStatus) {
		return null;
	}

	@WebsocketHandlerMapping(value = 127302966, name = "GetWallPapers")
	public AccountApi.WallPapers getWallPapers(AccountApi.GetWallPapers getWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -977650298, name = "ReportPeer")
	public Boolean reportPeer(AccountApi.ReportPeer reportPeer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 655677548, name = "CheckUsername")
	public Boolean checkUsername(AccountApi.CheckUsername checkUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1040964988, name = "UpdateUsername")
	public Api.User updateUsername(AccountApi.UpdateUsername updateUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = -623130288, name = "GetPrivacy")
	public AccountApi.PrivacyRules getPrivacy(AccountApi.GetPrivacy getPrivacy) {
		return null;
	}

	@WebsocketHandlerMapping(value = -906486552, name = "SetPrivacy")
	public AccountApi.PrivacyRules setPrivacy(AccountApi.SetPrivacy setPrivacy) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1099779595, name = "DeleteAccount")
	public Boolean deleteAccount(AccountApi.DeleteAccount deleteAccount) {
		return null;
	}

	@WebsocketHandlerMapping(value = 150761757, name = "GetAccountTTL")
	public Api.AccountDaysTTL getAccountTTL(AccountApi.GetAccountTTL getAccountTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 608323678, name = "SetAccountTTL")
	public Boolean setAccountTTL(AccountApi.SetAccountTTL setAccountTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2108208411, name = "SendChangePhoneCode")
	public AuthApi.SentCode sendChangePhoneCode(AccountApi.SendChangePhoneCode sendChangePhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1891839707, name = "ChangePhone")
	public Api.User changePhone(AccountApi.ChangePhone changePhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 954152242, name = "UpdateDeviceLocked")
	public Boolean updateDeviceLocked(AccountApi.UpdateDeviceLocked updateDeviceLocked) {
		return null;
	}

	@WebsocketHandlerMapping(value = -484392616, name = "GetAuthorizations")
	public AccountApi.Authorizations getAuthorizations(AccountApi.GetAuthorizations getAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = -545786948, name = "ResetAuthorization")
	public Boolean resetAuthorization(AccountApi.ResetAuthorization resetAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1418342645, name = "GetPassword")
	public AccountApi.Password getPassword(AccountApi.GetPassword getPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1663767815, name = "GetPasswordSettings")
	public AccountApi.PasswordSettings getPasswordSettings(AccountApi.GetPasswordSettings getPasswordSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1516564433, name = "UpdatePasswordSettings")
	public Boolean updatePasswordSettings(AccountApi.UpdatePasswordSettings updatePasswordSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 457157256, name = "SendConfirmPhoneCode")
	public AuthApi.SentCode sendConfirmPhoneCode(AccountApi.SendConfirmPhoneCode sendConfirmPhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1596029123, name = "ConfirmPhone")
	public Boolean confirmPhone(AccountApi.ConfirmPhone confirmPhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1151208273, name = "GetTmpPassword")
	public AccountApi.TmpPassword getTmpPassword(AccountApi.GetTmpPassword getTmpPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 405695855, name = "GetWebAuthorizations")
	public AccountApi.WebAuthorizations getWebAuthorizations(AccountApi.GetWebAuthorizations getWebAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 755087855, name = "ResetWebAuthorization")
	public Boolean resetWebAuthorization(AccountApi.ResetWebAuthorization resetWebAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1747789204, name = "ResetWebAuthorizations")
	public Boolean resetWebAuthorizations(AccountApi.ResetWebAuthorizations resetWebAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1299661699, name = "GetAllSecureValues")
	public Api.SecureValue[] getAllSecureValues(AccountApi.GetAllSecureValues getAllSecureValues) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1936088002, name = "GetSecureValue")
	public Api.SecureValue[] getSecureValue(AccountApi.GetSecureValue getSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1986010339, name = "SaveSecureValue")
	public Api.SecureValue saveSecureValue(AccountApi.SaveSecureValue saveSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1199522741, name = "DeleteSecureValue")
	public Boolean deleteSecureValue(AccountApi.DeleteSecureValue deleteSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1456907910, name = "GetAuthorizationForm")
	public AccountApi.AuthorizationForm getAuthorizationForm(AccountApi.GetAuthorizationForm getAuthorizationForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = -202552205, name = "AcceptAuthorization")
	public Boolean acceptAuthorization(AccountApi.AcceptAuthorization acceptAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1516022023, name = "SendVerifyPhoneCode")
	public AuthApi.SentCode sendVerifyPhoneCode(AccountApi.SendVerifyPhoneCode sendVerifyPhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1305716726, name = "VerifyPhone")
	public Boolean verifyPhone(AccountApi.VerifyPhone verifyPhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1880182943, name = "SendVerifyEmailCode")
	public AccountApi.SentEmailCode sendVerifyEmailCode(AccountApi.SendVerifyEmailCode sendVerifyEmailCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = -323339813, name = "VerifyEmail")
	public Boolean verifyEmail(AccountApi.VerifyEmail verifyEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1896617296, name = "InitTakeoutSession")
	public AccountApi.Takeout initTakeoutSession(AccountApi.InitTakeoutSession initTakeoutSession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 489050862, name = "FinishTakeoutSession")
	public Boolean finishTakeoutSession(AccountApi.FinishTakeoutSession finishTakeoutSession) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1881204448, name = "ConfirmPasswordEmail")
	public Boolean confirmPasswordEmail(AccountApi.ConfirmPasswordEmail confirmPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2055154197, name = "ResendPasswordEmail")
	public Boolean resendPasswordEmail(AccountApi.ResendPasswordEmail resendPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1043606090, name = "CancelPasswordEmail")
	public Boolean cancelPasswordEmail(AccountApi.CancelPasswordEmail cancelPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1626880216, name = "GetContactSignUpNotification")
	public Boolean getContactSignUpNotification(AccountApi.GetContactSignUpNotification getContactSignUpNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = -806076575, name = "SetContactSignUpNotification")
	public Boolean setContactSignUpNotification(AccountApi.SetContactSignUpNotification setContactSignUpNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1398240377, name = "GetNotifyExceptions")
	public Api.Updates getNotifyExceptions(AccountApi.GetNotifyExceptions getNotifyExceptions) {
		return null;
	}

	@WebsocketHandlerMapping(value = -57811990, name = "GetWallPaper")
	public Api.WallPaper getWallPaper(AccountApi.GetWallPaper getWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = -578472351, name = "UploadWallPaper")
	public Api.WallPaper uploadWallPaper(AccountApi.UploadWallPaper uploadWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1817860919, name = "SaveWallPaper")
	public Boolean saveWallPaper(AccountApi.SaveWallPaper saveWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = -18000023, name = "InstallWallPaper")
	public Boolean installWallPaper(AccountApi.InstallWallPaper installWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1153722364, name = "ResetWallPapers")
	public Boolean resetWallPapers(AccountApi.ResetWallPapers resetWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1457130303, name = "GetAutoDownloadSettings")
	public AccountApi.AutoDownloadSettings getAutoDownloadSettings(AccountApi.GetAutoDownloadSettings getAutoDownloadSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1995661875, name = "SaveAutoDownloadSettings")
	public Boolean saveAutoDownloadSettings(AccountApi.SaveAutoDownloadSettings saveAutoDownloadSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 473805619, name = "UploadTheme")
	public Api.Document uploadTheme(AccountApi.UploadTheme uploadTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1697530880, name = "CreateTheme")
	public Api.Theme createTheme(AccountApi.CreateTheme createTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 737414348, name = "UpdateTheme")
	public Api.Theme updateTheme(AccountApi.UpdateTheme updateTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = -229175188, name = "SaveTheme")
	public Boolean saveTheme(AccountApi.SaveTheme saveTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = -953697477, name = "InstallTheme")
	public Boolean installTheme(AccountApi.InstallTheme installTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1919060949, name = "GetTheme")
	public Api.Theme getTheme(AccountApi.GetTheme getTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1913054296, name = "GetThemes")
	public AccountApi.Themes getThemes(AccountApi.GetThemes getThemes) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1250643605, name = "SetContentSettings")
	public Boolean setContentSettings(AccountApi.SetContentSettings setContentSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1952756306, name = "GetContentSettings")
	public AccountApi.ContentSettings getContentSettings(AccountApi.GetContentSettings getContentSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1705865692, name = "GetMultiWallPapers")
	public Api.WallPaper[] getMultiWallPapers(AccountApi.GetMultiWallPapers getMultiWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -349483786, name = "GetGlobalPrivacySettings")
	public Api.GlobalPrivacySettings getGlobalPrivacySettings(AccountApi.GetGlobalPrivacySettings getGlobalPrivacySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 517647042, name = "SetGlobalPrivacySettings")
	public Api.GlobalPrivacySettings setGlobalPrivacySettings(AccountApi.SetGlobalPrivacySettings setGlobalPrivacySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = -91437323, name = "ReportProfilePhoto")
	public Boolean reportProfilePhoto(AccountApi.ReportProfilePhoto reportProfilePhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1828139493, name = "ResetPassword")
	public AccountApi.TypeResetPasswordResult resetPassword(AccountApi.ResetPassword resetPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1284770294, name = "DeclinePasswordReset")
	public Boolean declinePasswordReset(AccountApi.DeclinePasswordReset declinePasswordReset) {
		return null;
	}

	@WebsocketHandlerMapping(value = -700916087, name = "GetChatThemes")
	public AccountApi.Themes getChatThemes(AccountApi.GetChatThemes getChatThemes) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1081501024, name = "SetAuthorizationTTL")
	public Boolean setAuthorizationTTL(AccountApi.SetAuthorizationTTL setAuthorizationTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1089766498, name = "ChangeAuthorizationSettings")
	public Boolean changeAuthorizationSettings(AccountApi.ChangeAuthorizationSettings changeAuthorizationSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = -510647672, name = "GetSavedRingtones")
	public AccountApi.SavedRingtones getSavedRingtones(AccountApi.GetSavedRingtones getSavedRingtones) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1038768899, name = "SaveRingtone")
	public AccountApi.SavedRingtone saveRingtone(AccountApi.SaveRingtone saveRingtone) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2095414366, name = "UploadRingtone")
	public Api.Document uploadRingtone(AccountApi.UploadRingtone uploadRingtone) {
		return null;
	}
}