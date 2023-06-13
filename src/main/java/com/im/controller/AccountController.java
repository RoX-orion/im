package com.im.controller;

import com.im.api.AccountApi;
import com.im.api.Api;
import com.im.api.AuthApi;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.service.AccountService;
import jakarta.annotation.Resource;

@WebsocketHandler
public class AccountController {

	@Resource
	private AccountService accountService;

	@WebsocketHandlerMapping(value = 0xec86017a, name = "RegisterDevice")
	public Boolean registerDevice(AccountApi.RegisterDevice registerDevice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6a0d3206, name = "UnregisterDevice")
	public Boolean unregisterDevice(AccountApi.UnregisterDevice unregisterDevice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x84be5b93, name = "UpdateNotifySettings")
	public Boolean updateNotifySettings(AccountApi.UpdateNotifySettings updateNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x12b3ad31, name = "GetNotifySettings")
	public Api.PeerNotifySettings getNotifySettings(AccountApi.GetNotifySettings getNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdb7e1747, name = "ResetNotifySettings")
	public Boolean resetNotifySettings(AccountApi.ResetNotifySettings resetNotifySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x78515775, name = "UpdateProfile")
	public Api.User updateProfile(AccountApi.UpdateProfile updateProfile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6628562c, name = "UpdateStatus")
	public Boolean updateStatus(AccountApi.UpdateStatus updateStatus) {
		return accountService.updateStatus(updateStatus);
	}

	@WebsocketHandlerMapping(value = 0x7967d36, name = "GetWallPapers")
	public AccountApi.WallPapers getWallPapers(AccountApi.GetWallPapers getWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc5ba3d86, name = "ReportPeer")
	public Boolean reportPeer(AccountApi.ReportPeer reportPeer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2714d86c, name = "CheckUsername")
	public Boolean checkUsername(AccountApi.CheckUsername checkUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3e0bdd7c, name = "UpdateUsername")
	public Api.User updateUsername(AccountApi.UpdateUsername updateUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdadbc950, name = "GetPrivacy")
	public AccountApi.PrivacyRules getPrivacy(AccountApi.GetPrivacy getPrivacy) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc9f81ce8, name = "SetPrivacy")
	public AccountApi.PrivacyRules setPrivacy(AccountApi.SetPrivacy setPrivacy) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa2c0cf74, name = "DeleteAccount")
	public Boolean deleteAccount(AccountApi.DeleteAccount deleteAccount) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8fc711d, name = "GetAccountTTL")
	public Api.AccountDaysTTL getAccountTTL(AccountApi.GetAccountTTL getAccountTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2442485e, name = "SetAccountTTL")
	public Boolean setAccountTTL(AccountApi.SetAccountTTL setAccountTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x82574ae5, name = "SendChangePhoneCode")
	public AuthApi.SentCode sendChangePhoneCode(AccountApi.SendChangePhoneCode sendChangePhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x70c32edb, name = "ChangePhone")
	public Api.User changePhone(AccountApi.ChangePhone changePhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x38df3532, name = "UpdateDeviceLocked")
	public Boolean updateDeviceLocked(AccountApi.UpdateDeviceLocked updateDeviceLocked) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe320c158, name = "GetAuthorizations")
	public AccountApi.Authorizations getAuthorizations(AccountApi.GetAuthorizations getAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdf77f3bc, name = "ResetAuthorization")
	public Boolean resetAuthorization(AccountApi.ResetAuthorization resetAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x548a30f5, name = "GetPassword")
	public AccountApi.Password getPassword(AccountApi.GetPassword getPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9cd4eaf9, name = "GetPasswordSettings")
	public AccountApi.PasswordSettings getPasswordSettings(AccountApi.GetPasswordSettings getPasswordSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa59b102f, name = "UpdatePasswordSettings")
	public Boolean updatePasswordSettings(AccountApi.UpdatePasswordSettings updatePasswordSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1b3faa88, name = "SendConfirmPhoneCode")
	public AuthApi.SentCode sendConfirmPhoneCode(AccountApi.SendConfirmPhoneCode sendConfirmPhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5f2178c3, name = "ConfirmPhone")
	public Boolean confirmPhone(AccountApi.ConfirmPhone confirmPhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x449e0b51, name = "GetTmpPassword")
	public AccountApi.TmpPassword getTmpPassword(AccountApi.GetTmpPassword getTmpPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x182e6d6f, name = "GetWebAuthorizations")
	public AccountApi.WebAuthorizations getWebAuthorizations(AccountApi.GetWebAuthorizations getWebAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2d01b9ef, name = "ResetWebAuthorization")
	public Boolean resetWebAuthorization(AccountApi.ResetWebAuthorization resetWebAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x682d2594, name = "ResetWebAuthorizations")
	public Boolean resetWebAuthorizations(AccountApi.ResetWebAuthorizations resetWebAuthorizations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb288bc7d, name = "GetAllSecureValues")
	public Api.SecureValue[] getAllSecureValues(AccountApi.GetAllSecureValues getAllSecureValues) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x73665bc2, name = "GetSecureValue")
	public Api.SecureValue[] getSecureValue(AccountApi.GetSecureValue getSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x899fe31d, name = "SaveSecureValue")
	public Api.SecureValue saveSecureValue(AccountApi.SaveSecureValue saveSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb880bc4b, name = "DeleteSecureValue")
	public Boolean deleteSecureValue(AccountApi.DeleteSecureValue deleteSecureValue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa929597a, name = "GetAuthorizationForm")
	public AccountApi.AuthorizationForm getAuthorizationForm(AccountApi.GetAuthorizationForm getAuthorizationForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf3ed4c73, name = "AcceptAuthorization")
	public Boolean acceptAuthorization(AccountApi.AcceptAuthorization acceptAuthorization) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa5a356f9, name = "SendVerifyPhoneCode")
	public AuthApi.SentCode sendVerifyPhoneCode(AccountApi.SendVerifyPhoneCode sendVerifyPhoneCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4dd3a7f6, name = "VerifyPhone")
	public Boolean verifyPhone(AccountApi.VerifyPhone verifyPhone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x98e037bb, name = "SendVerifyEmailCode")
	public AccountApi.SentEmailCode sendVerifyEmailCode(AccountApi.SendVerifyEmailCode sendVerifyEmailCode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x32da4cf, name = "VerifyEmail")
	public AccountApi.EmailVerified verifyEmail(AccountApi.VerifyEmail verifyEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8ef3eab0, name = "InitTakeoutSession")
	public AccountApi.Takeout initTakeoutSession(AccountApi.InitTakeoutSession initTakeoutSession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1d2652ee, name = "FinishTakeoutSession")
	public Boolean finishTakeoutSession(AccountApi.FinishTakeoutSession finishTakeoutSession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8fdf1920, name = "ConfirmPasswordEmail")
	public Boolean confirmPasswordEmail(AccountApi.ConfirmPasswordEmail confirmPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7a7f2a15, name = "ResendPasswordEmail")
	public Boolean resendPasswordEmail(AccountApi.ResendPasswordEmail resendPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc1cbd5b6, name = "CancelPasswordEmail")
	public Boolean cancelPasswordEmail(AccountApi.CancelPasswordEmail cancelPasswordEmail) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9f07c728, name = "GetContactSignUpNotification")
	public Boolean getContactSignUpNotification(AccountApi.GetContactSignUpNotification getContactSignUpNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xcff43f61, name = "SetContactSignUpNotification")
	public Boolean setContactSignUpNotification(AccountApi.SetContactSignUpNotification setContactSignUpNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x53577479, name = "GetNotifyExceptions")
	public Api.Updates getNotifyExceptions(AccountApi.GetNotifyExceptions getNotifyExceptions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfc8ddbea, name = "GetWallPaper")
	public Api.WallPaper getWallPaper(AccountApi.GetWallPaper getWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdd853661, name = "UploadWallPaper")
	public Api.WallPaper uploadWallPaper(AccountApi.UploadWallPaper uploadWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6c5a5b37, name = "SaveWallPaper")
	public Boolean saveWallPaper(AccountApi.SaveWallPaper saveWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfeed5769, name = "InstallWallPaper")
	public Boolean installWallPaper(AccountApi.InstallWallPaper installWallPaper) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbb3b9804, name = "ResetWallPapers")
	public Boolean resetWallPapers(AccountApi.ResetWallPapers resetWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x56da0b3f, name = "GetAutoDownloadSettings")
	public AccountApi.AutoDownloadSettings getAutoDownloadSettings(AccountApi.GetAutoDownloadSettings getAutoDownloadSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x76f36233, name = "SaveAutoDownloadSettings")
	public Boolean saveAutoDownloadSettings(AccountApi.SaveAutoDownloadSettings saveAutoDownloadSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1c3db333, name = "UploadTheme")
	public Api.Document uploadTheme(AccountApi.UploadTheme uploadTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x652e4400, name = "CreateTheme")
	public Api.Theme createTheme(AccountApi.CreateTheme createTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2bf40ccc, name = "UpdateTheme")
	public Api.Theme updateTheme(AccountApi.UpdateTheme updateTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf257106c, name = "SaveTheme")
	public Boolean saveTheme(AccountApi.SaveTheme saveTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc727bb3b, name = "InstallTheme")
	public Boolean installTheme(AccountApi.InstallTheme installTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3a5869ec, name = "GetTheme")
	public Api.Theme getTheme(AccountApi.GetTheme getTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7206e458, name = "GetThemes")
	public AccountApi.Themes getThemes(AccountApi.GetThemes getThemes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb574b16b, name = "SetContentSettings")
	public Boolean setContentSettings(AccountApi.SetContentSettings setContentSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8b9b4dae, name = "GetContentSettings")
	public AccountApi.ContentSettings getContentSettings(AccountApi.GetContentSettings getContentSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x65ad71dc, name = "GetMultiWallPapers")
	public Api.WallPaper[] getMultiWallPapers(AccountApi.GetMultiWallPapers getMultiWallPapers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xeb2b4cf6, name = "GetGlobalPrivacySettings")
	public Api.GlobalPrivacySettings getGlobalPrivacySettings(AccountApi.GetGlobalPrivacySettings getGlobalPrivacySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1edaaac2, name = "SetGlobalPrivacySettings")
	public Api.GlobalPrivacySettings setGlobalPrivacySettings(AccountApi.SetGlobalPrivacySettings setGlobalPrivacySettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfa8cc6f5, name = "ReportProfilePhoto")
	public Boolean reportProfilePhoto(AccountApi.ReportProfilePhoto reportProfilePhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9308ce1b, name = "ResetPassword")
	public AccountApi.TypeResetPasswordResult resetPassword(AccountApi.ResetPassword resetPassword) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4c9409f6, name = "DeclinePasswordReset")
	public Boolean declinePasswordReset(AccountApi.DeclinePasswordReset declinePasswordReset) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd638de89, name = "GetChatThemes")
	public AccountApi.Themes getChatThemes(AccountApi.GetChatThemes getChatThemes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbf899aa0, name = "SetAuthorizationTTL")
	public Boolean setAuthorizationTTL(AccountApi.SetAuthorizationTTL setAuthorizationTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x40f48462, name = "ChangeAuthorizationSettings")
	public Boolean changeAuthorizationSettings(AccountApi.ChangeAuthorizationSettings changeAuthorizationSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe1902288, name = "GetSavedRingtones")
	public AccountApi.SavedRingtones getSavedRingtones(AccountApi.GetSavedRingtones getSavedRingtones) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3dea5b03, name = "SaveRingtone")
	public AccountApi.SavedRingtone saveRingtone(AccountApi.SaveRingtone saveRingtone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x831a83a2, name = "UploadRingtone")
	public Api.Document uploadRingtone(AccountApi.UploadRingtone uploadRingtone) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfbd3de6b, name = "UpdateEmojiStatus")
	public Boolean updateEmojiStatus(AccountApi.UpdateEmojiStatus updateEmojiStatus) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd6753386, name = "GetDefaultEmojiStatuses")
	public AccountApi.EmojiStatuses getDefaultEmojiStatuses(AccountApi.GetDefaultEmojiStatuses getDefaultEmojiStatuses) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf578105, name = "GetRecentEmojiStatuses")
	public AccountApi.EmojiStatuses getRecentEmojiStatuses(AccountApi.GetRecentEmojiStatuses getRecentEmojiStatuses) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x18201aae, name = "ClearRecentEmojiStatuses")
	public Boolean clearRecentEmojiStatuses(AccountApi.ClearRecentEmojiStatuses clearRecentEmojiStatuses) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xef500eab, name = "ReorderUsernames")
	public Boolean reorderUsernames(AccountApi.ReorderUsernames reorderUsernames) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x58d6b376, name = "ToggleUsername")
	public Boolean toggleUsername(AccountApi.ToggleUsername toggleUsername) {
		return null;
	}
}
