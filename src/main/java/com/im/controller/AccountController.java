package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AccountController {

	@WebsocketHandlerMapping(value = 3968205178L, name = "RegisterDevice")
	public Boolean registerDevice(AccountApi.RegisterDevice registerDevice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1779249670L, name = "UnregisterDevice")
	public Boolean unregisterDevice(AccountApi.UnregisterDevice unregisterDevice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2227067795L, name = "UpdateNotifySettings")
	public Boolean updateNotifySettings(AccountApi.UpdateNotifySettings updateNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 313765169L, name = "GetNotifySettings")
	public Api.PeerNotifySettings getNotifySettings(AccountApi.GetNotifySettings getNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3682473799L, name = "ResetNotifySettings")
	public Boolean resetNotifySettings(AccountApi.ResetNotifySettings resetNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2018596725L, name = "UpdateProfile")
	public Api.User updateProfile(AccountApi.UpdateProfile updateProfile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1713919532L, name = "UpdateStatus")
	public Boolean updateStatus(AccountApi.UpdateStatus updateStatus) {
		return null;
	}

	@WebsocketHandlerMapping(value = 127302966L, name = "GetWallPapers")
	public AccountApi.WallPapers getWallPapers(AccountApi.GetWallPapers getWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3317316998L, name = "ReportPeer")
	public Boolean reportPeer(AccountApi.ReportPeer reportPeer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 655677548L, name = "CheckUsername")
	public Boolean checkUsername(AccountApi.CheckUsername checkUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1040964988L, name = "UpdateUsername")
	public Api.User updateUsername(AccountApi.UpdateUsername updateUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3671837008L, name = "GetPrivacy")
	public AccountApi.PrivacyRules getPrivacy(AccountApi.GetPrivacy getPrivacy) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3388480744L, name = "SetPrivacy")
	public AccountApi.PrivacyRules setPrivacy(AccountApi.SetPrivacy setPrivacy) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1099779595L, name = "DeleteAccount")
	public Boolean deleteAccount(AccountApi.DeleteAccount deleteAccount) {
		return null;
	}

	@WebsocketHandlerMapping(value = 150761757L, name = "GetAccountTTL")
	public Api.AccountDaysTTL getAccountTTL(AccountApi.GetAccountTTL getAccountTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 608323678L, name = "SetAccountTTL")
	public Boolean setAccountTTL(AccountApi.SetAccountTTL setAccountTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2186758885L, name = "SendChangePhoneCode")
	public AuthApi.SentCode sendChangePhoneCode(AccountApi.SendChangePhoneCode sendChangePhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1891839707L, name = "ChangePhone")
	public Api.User changePhone(AccountApi.ChangePhone changePhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 954152242L, name = "UpdateDeviceLocked")
	public Boolean updateDeviceLocked(AccountApi.UpdateDeviceLocked updateDeviceLocked) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3810574680L, name = "GetAuthorizations")
	public AccountApi.Authorizations getAuthorizations(AccountApi.GetAuthorizations getAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3749180348L, name = "ResetAuthorization")
	public Boolean resetAuthorization(AccountApi.ResetAuthorization resetAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1418342645L, name = "GetPassword")
	public AccountApi.Password getPassword(AccountApi.GetPassword getPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2631199481L, name = "GetPasswordSettings")
	public AccountApi.PasswordSettings getPasswordSettings(AccountApi.GetPasswordSettings getPasswordSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2778402863L, name = "UpdatePasswordSettings")
	public Boolean updatePasswordSettings(AccountApi.UpdatePasswordSettings updatePasswordSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 457157256L, name = "SendConfirmPhoneCode")
	public AuthApi.SentCode sendConfirmPhoneCode(AccountApi.SendConfirmPhoneCode sendConfirmPhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1596029123L, name = "ConfirmPhone")
	public Boolean confirmPhone(AccountApi.ConfirmPhone confirmPhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1151208273L, name = "GetTmpPassword")
	public AccountApi.TmpPassword getTmpPassword(AccountApi.GetTmpPassword getTmpPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 405695855L, name = "GetWebAuthorizations")
	public AccountApi.WebAuthorizations getWebAuthorizations(AccountApi.GetWebAuthorizations getWebAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 755087855L, name = "ResetWebAuthorization")
	public Boolean resetWebAuthorization(AccountApi.ResetWebAuthorization resetWebAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1747789204L, name = "ResetWebAuthorizations")
	public Boolean resetWebAuthorizations(AccountApi.ResetWebAuthorizations resetWebAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2995305597L, name = "GetAllSecureValues")
	public Api.SecureValue[] getAllSecureValues(AccountApi.GetAllSecureValues getAllSecureValues) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1936088002L, name = "GetSecureValue")
	public Api.SecureValue[] getSecureValue(AccountApi.GetSecureValue getSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2308956957L, name = "SaveSecureValue")
	public Api.SecureValue saveSecureValue(AccountApi.SaveSecureValue saveSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3095444555L, name = "DeleteSecureValue")
	public Boolean deleteSecureValue(AccountApi.DeleteSecureValue deleteSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2838059386L, name = "GetAuthorizationForm")
	public AccountApi.AuthorizationForm getAuthorizationForm(AccountApi.GetAuthorizationForm getAuthorizationForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4092415091L, name = "AcceptAuthorization")
	public Boolean acceptAuthorization(AccountApi.AcceptAuthorization acceptAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2778945273L, name = "SendVerifyPhoneCode")
	public AuthApi.SentCode sendVerifyPhoneCode(AccountApi.SendVerifyPhoneCode sendVerifyPhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1305716726L, name = "VerifyPhone")
	public Boolean verifyPhone(AccountApi.VerifyPhone verifyPhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1880182943L, name = "SendVerifyEmailCode")
	public AccountApi.SentEmailCode sendVerifyEmailCode(AccountApi.SendVerifyEmailCode sendVerifyEmailCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3971627483L, name = "VerifyEmail")
	public Boolean verifyEmail(AccountApi.VerifyEmail verifyEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2398350000L, name = "InitTakeoutSession")
	public AccountApi.Takeout initTakeoutSession(AccountApi.InitTakeoutSession initTakeoutSession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 489050862L, name = "FinishTakeoutSession")
	public Boolean finishTakeoutSession(AccountApi.FinishTakeoutSession finishTakeoutSession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2413762848L, name = "ConfirmPasswordEmail")
	public Boolean confirmPasswordEmail(AccountApi.ConfirmPasswordEmail confirmPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2055154197L, name = "ResendPasswordEmail")
	public Boolean resendPasswordEmail(AccountApi.ResendPasswordEmail resendPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3251361206L, name = "CancelPasswordEmail")
	public Boolean cancelPasswordEmail(AccountApi.CancelPasswordEmail cancelPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2668087080L, name = "GetContactSignUpNotification")
	public Boolean getContactSignUpNotification(AccountApi.GetContactSignUpNotification getContactSignUpNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3488890721L, name = "SetContactSignUpNotification")
	public Boolean setContactSignUpNotification(AccountApi.SetContactSignUpNotification setContactSignUpNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1398240377L, name = "GetNotifyExceptions")
	public Api.Updates getNotifyExceptions(AccountApi.GetNotifyExceptions getNotifyExceptions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4237155306L, name = "GetWallPaper")
	public Api.WallPaper getWallPaper(AccountApi.GetWallPaper getWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3716494945L, name = "UploadWallPaper")
	public Api.WallPaper uploadWallPaper(AccountApi.UploadWallPaper uploadWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1817860919L, name = "SaveWallPaper")
	public Boolean saveWallPaper(AccountApi.SaveWallPaper saveWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4276967273L, name = "InstallWallPaper")
	public Boolean installWallPaper(AccountApi.InstallWallPaper installWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3141244932L, name = "ResetWallPapers")
	public Boolean resetWallPapers(AccountApi.ResetWallPapers resetWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1457130303L, name = "GetAutoDownloadSettings")
	public AccountApi.AutoDownloadSettings getAutoDownloadSettings(AccountApi.GetAutoDownloadSettings getAutoDownloadSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1995661875L, name = "SaveAutoDownloadSettings")
	public Boolean saveAutoDownloadSettings(AccountApi.SaveAutoDownloadSettings saveAutoDownloadSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 473805619L, name = "UploadTheme")
	public Api.Document uploadTheme(AccountApi.UploadTheme uploadTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1697530880L, name = "CreateTheme")
	public Api.Theme createTheme(AccountApi.CreateTheme createTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 737414348L, name = "UpdateTheme")
	public Api.Theme updateTheme(AccountApi.UpdateTheme updateTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4065792108L, name = "SaveTheme")
	public Boolean saveTheme(AccountApi.SaveTheme saveTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3341269819L, name = "InstallTheme")
	public Boolean installTheme(AccountApi.InstallTheme installTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2375906347L, name = "GetTheme")
	public Api.Theme getTheme(AccountApi.GetTheme getTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1913054296L, name = "GetThemes")
	public AccountApi.Themes getThemes(AccountApi.GetThemes getThemes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3044323691L, name = "SetContentSettings")
	public Boolean setContentSettings(AccountApi.SetContentSettings setContentSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2342210990L, name = "GetContentSettings")
	public AccountApi.ContentSettings getContentSettings(AccountApi.GetContentSettings getContentSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1705865692L, name = "GetMultiWallPapers")
	public Api.WallPaper[] getMultiWallPapers(AccountApi.GetMultiWallPapers getMultiWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3945483510L, name = "GetGlobalPrivacySettings")
	public Api.GlobalPrivacySettings getGlobalPrivacySettings(AccountApi.GetGlobalPrivacySettings getGlobalPrivacySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 517647042L, name = "SetGlobalPrivacySettings")
	public Api.GlobalPrivacySettings setGlobalPrivacySettings(AccountApi.SetGlobalPrivacySettings setGlobalPrivacySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4203529973L, name = "ReportProfilePhoto")
	public Boolean reportProfilePhoto(AccountApi.ReportProfilePhoto reportProfilePhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2466827803L, name = "ResetPassword")
	public AccountApi.TypeResetPasswordResult resetPassword(AccountApi.ResetPassword resetPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1284770294L, name = "DeclinePasswordReset")
	public Boolean declinePasswordReset(AccountApi.DeclinePasswordReset declinePasswordReset) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3594051209L, name = "GetChatThemes")
	public AccountApi.Themes getChatThemes(AccountApi.GetChatThemes getChatThemes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3213466272L, name = "SetAuthorizationTTL")
	public Boolean setAuthorizationTTL(AccountApi.SetAuthorizationTTL setAuthorizationTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1089766498L, name = "ChangeAuthorizationSettings")
	public Boolean changeAuthorizationSettings(AccountApi.ChangeAuthorizationSettings changeAuthorizationSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3784319624L, name = "GetSavedRingtones")
	public AccountApi.SavedRingtones getSavedRingtones(AccountApi.GetSavedRingtones getSavedRingtones) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1038768899L, name = "SaveRingtone")
	public AccountApi.SavedRingtone saveRingtone(AccountApi.SaveRingtone saveRingtone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2199552930L, name = "UploadRingtone")
	public Api.Document uploadRingtone(AccountApi.UploadRingtone uploadRingtone) {
		return null;
	}
}