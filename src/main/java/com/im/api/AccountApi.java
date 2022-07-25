package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class AccountApi {

	public static class TypePrivacyRules {}
	public static class TypeAuthorizations {}
	public static class TypePassword {}
	public static class TypePasswordSettings {}
	public static class TypePasswordInputSettings {}
	public static class TypeTmpPassword {}
	public static class TypeWebAuthorizations {}
	public static class TypeAuthorizationForm {}
	public static class TypeSentEmailCode {}
	public static class TypeTakeout {}
	public static class TypeWallPapers {}
	public static class TypeAutoDownloadSettings {}
	public static class TypeThemes {}
	public static class TypeContentSettings {}
	public static class TypeResetPasswordResult {}
	public static class TypeSavedRingtones {}
	public static class TypeSavedRingtone {}

	@Data
	public static class PrivacyRules {
		private Api.TypeChat[] chats;
		private Api.TypePrivacyRule[] rules;
		private Api.TypeUser[] users;
	}

	@Data
	public static class Authorizations {
		private int authorizationTtlDays;
		private Api.TypeAuthorization[] authorizations;
	}

	@Data
	public static class Password {
		private Api.TypePasswordKdfAlgo newAlgo;
		private Api.TypePasswordKdfAlgo currentAlgo;
		private BigInteger srpId;
		private byte srpB;
		private Boolean hasPassword;
		private Api.TypeSecurePasswordKdfAlgo newSecureAlgo;
		private int pendingResetDate;
		private String emailUnconfirmedPattern;
		private byte secureRandom;
		private String hint;
		private Boolean hasRecovery;
		private Boolean hasSecureValues;
	}

	@Data
	public static class PasswordSettings {
		private Api.TypeSecureSecretSettings secureSettings;
		private String email;
	}

	@Data
	public static class PasswordInputSettings {
		private Api.TypePasswordKdfAlgo newAlgo;
		private Api.TypeSecureSecretSettings newSecureSettings;
		private String hint;
		private byte newPasswordHash;
		private String email;
	}

	@Data
	public static class TmpPassword {
		private byte tmpPassword;
		private int validUntil;
	}

	@Data
	public static class WebAuthorizations {
		private Api.TypeWebAuthorization[] authorizations;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AuthorizationForm {
		private Api.TypeSecureRequiredType[] requiredTypes;
		private Api.TypeSecureValue[] values;
		private String privacyPolicyUrl;
		private Api.TypeSecureValueError[] errors;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SentEmailCode {
		private String emailPattern;
		private int length;
	}

	@Data
	public static class Takeout {
		private BigInteger id;
	}

	@Data
	public static class WallPapersNotModified {
	}

	@Data
	public static class WallPapers {
		private Api.TypeWallPaper[] wallpapers;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AutoDownloadSettings extends Api.TypeAutoDownloadSettings {
		private Api.TypeAutoDownloadSettings high;
		private Api.TypeAutoDownloadSettings low;
		private Api.TypeAutoDownloadSettings medium;
	}

	@Data
	public static class ThemesNotModified {
	}

	@Data
	public static class Themes {
		private Api.TypeTheme[] themes;
		private BigInteger hash;
	}

	@Data
	public static class ContentSettings {
		private Boolean sensitiveEnabled;
		private Boolean sensitiveCanChange;
	}

	@Data
	public static class ResetPasswordFailedWait {
		private int retryDate;
	}

	@Data
	public static class ResetPasswordRequestedWait {
		private int untilDate;
	}

	@Data
	public static class ResetPasswordOk {
	}

	@Data
	public static class SavedRingtonesNotModified {
	}

	@Data
	public static class SavedRingtones {
		private Api.TypeDocument[] ringtones;
		private BigInteger hash;
	}

	@Data
	public static class SavedRingtone {
	}

	@Data
	public static class SavedRingtoneConverted {
		private Api.TypeDocument document;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RegisterDevice extends Api.TypeBool {
		private Boolean noMuted;
		private Boolean appSandbox;
		private BigInteger[] otherUids;
		private byte secret;
		private int tokenType;
		private String token;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UnregisterDevice extends Api.TypeBool {
		private BigInteger[] otherUids;
		private int tokenType;
		private String token;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateNotifySettings extends Api.TypeBool {
		private Api.TypeInputPeerNotifySettings settings;
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetNotifySettings extends Api.TypePeerNotifySettings {
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetNotifySettings extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateProfile extends Api.TypeUser {
		private String firstName;
		private String lastName;
		private String about;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateStatus extends Api.TypeBool {
		private Boolean offline;
	}

	@Data
	public static class GetWallPapers {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReportPeer extends Api.TypeBool {
		private Api.TypeReportReason reason;
		private Api.TypeInputPeer peer;
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CheckUsername extends Api.TypeBool {
		private String username;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateUsername extends Api.TypeUser {
		private String username;
	}

	@Data
	public static class GetPrivacy {
		private Api.TypeInputPrivacyKey key;
	}

	@Data
	public static class SetPrivacy {
		private Api.TypeInputPrivacyRule[] rules;
		private Api.TypeInputPrivacyKey key;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteAccount extends Api.TypeBool {
		private String reason;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAccountTTL extends Api.TypeAccountDaysTTL {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetAccountTTL extends Api.TypeBool {
		private Api.TypeAccountDaysTTL ttl;
	}

	@Data
	public static class SendChangePhoneCode {
		private Api.TypeCodeSettings settings;
		private String phoneNumber;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ChangePhone extends Api.TypeUser {
		private String phoneNumber;
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateDeviceLocked extends Api.TypeBool {
		private int period;
	}

	@Data
	public static class GetAuthorizations {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetAuthorization extends Api.TypeBool {
		private BigInteger hash;
	}

	@Data
	public static class GetPassword {
	}

	@Data
	public static class GetPasswordSettings {
		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdatePasswordSettings extends Api.TypeBool {
		private Api.TypeInputCheckPasswordSRP password;
		private AccountApi.TypePasswordInputSettings newSettings;
	}

	@Data
	public static class SendConfirmPhoneCode {
		private Api.TypeCodeSettings settings;
		private String hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ConfirmPhone extends Api.TypeBool {
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class GetTmpPassword {
		private Api.TypeInputCheckPasswordSRP password;
		private int period;
	}

	@Data
	public static class GetWebAuthorizations {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetWebAuthorization extends Api.TypeBool {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetWebAuthorizations extends Api.TypeBool {
	}

	@Data
	public static class GetAllSecureValues {
	}

	@Data
	public static class GetSecureValue {
		private Api.TypeSecureValueType[] types;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveSecureValue extends Api.TypeSecureValue {
		private Api.TypeInputSecureValue value;
		private BigInteger secureSecretId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteSecureValue extends Api.TypeBool {
		private Api.TypeSecureValueType[] types;
	}

	@Data
	public static class GetAuthorizationForm {
		private String scope;
		private BigInteger botId;
		private String publicKey;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptAuthorization extends Api.TypeBool {
		private Api.TypeSecureCredentialsEncrypted credentials;
		private String scope;
		private Api.TypeSecureValueHash[] valueHashes;
		private BigInteger botId;
		private String publicKey;
	}

	@Data
	public static class SendVerifyPhoneCode {
		private Api.TypeCodeSettings settings;
		private String phoneNumber;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class VerifyPhone extends Api.TypeBool {
		private String phoneNumber;
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class SendVerifyEmailCode {
		private String email;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class VerifyEmail extends Api.TypeBool {
		private String code;
		private String email;
	}

	@Data
	public static class InitTakeoutSession {
		private Boolean messageChats;
		private BigInteger fileMaxSize;
		private Boolean files;
		private Boolean messageUsers;
		private Boolean messageMegagroups;
		private Boolean contacts;
		private Boolean messageChannels;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class FinishTakeoutSession extends Api.TypeBool {
		private Boolean success;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ConfirmPasswordEmail extends Api.TypeBool {
		private String code;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResendPasswordEmail extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CancelPasswordEmail extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetContactSignUpNotification extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetContactSignUpNotification extends Api.TypeBool {
		private Boolean silent;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetNotifyExceptions extends Api.TypeUpdates {
		private Boolean compareSound;
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetWallPaper extends Api.TypeWallPaper {
		private Api.TypeInputWallPaper wallpaper;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadWallPaper extends Api.TypeWallPaper {
		private Api.TypeWallPaperSettings settings;
		private Api.TypeInputFile file;
		private String mimeType;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveWallPaper extends Api.TypeBool {
		private Api.TypeWallPaperSettings settings;
		private Api.TypeInputWallPaper wallpaper;
		private Boolean unsave;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class InstallWallPaper extends Api.TypeBool {
		private Api.TypeWallPaperSettings settings;
		private Api.TypeInputWallPaper wallpaper;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetWallPapers extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAutoDownloadSettings extends Api.TypeAutoDownloadSettings {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveAutoDownloadSettings extends Api.TypeBool {
		private Api.TypeAutoDownloadSettings settings;
		private Boolean high;
		private Boolean low;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadTheme extends Api.TypeDocument {
		private String fileName;
		private Api.TypeInputFile file;
		private Api.TypeInputFile thumb;
		private String mimeType;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CreateTheme extends Api.TypeTheme {
		private Api.TypeInputThemeSettings[] settings;
		private Api.TypeInputDocument document;
		private String title;
		private String slug;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateTheme extends Api.TypeTheme {
		private Api.TypeInputThemeSettings[] settings;
		private Api.TypeInputDocument document;
		private String format;
		private Api.TypeInputTheme theme;
		private String title;
		private String slug;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveTheme extends Api.TypeBool {
		private Api.TypeInputTheme theme;
		private Boolean unsave;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class InstallTheme extends Api.TypeBool {
		private Api.TypeBaseTheme baseTheme;
		private Boolean dark;
		private String format;
		private Api.TypeInputTheme theme;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetTheme extends Api.TypeTheme {
		private String format;
		private Api.TypeInputTheme theme;
		private BigInteger documentId;
	}

	@Data
	public static class GetThemes {
		private String format;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetContentSettings extends Api.TypeBool {
		private Boolean sensitiveEnabled;
	}

	@Data
	public static class GetContentSettings {
	}

	@Data
	public static class GetMultiWallPapers {
		private Api.TypeInputWallPaper[] wallpapers;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetGlobalPrivacySettings extends Api.TypeGlobalPrivacySettings {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetGlobalPrivacySettings extends Api.TypeGlobalPrivacySettings {
		private Api.TypeGlobalPrivacySettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReportProfilePhoto extends Api.TypeBool {
		private Api.TypeReportReason reason;
		private Api.TypeInputPeer peer;
		private Api.TypeInputPhoto photoId;
		private String message;
	}

	@Data
	public static class ResetPassword {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeclinePasswordReset extends Api.TypeBool {
	}

	@Data
	public static class GetChatThemes {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetAuthorizationTTL extends Api.TypeBool {
		private int authorizationTtlDays;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ChangeAuthorizationSettings extends Api.TypeBool {
		private Boolean encryptedRequestsDisabled;
		private Boolean callRequestsDisabled;
		private BigInteger hash;
	}

	@Data
	public static class GetSavedRingtones {
		private BigInteger hash;
	}

	@Data
	public static class SaveRingtone {
		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadRingtone extends Api.TypeDocument {
		private String fileName;
		private Api.TypeInputFile file;
		private String mimeType;
	}
}