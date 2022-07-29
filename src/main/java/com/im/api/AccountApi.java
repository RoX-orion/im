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
		private Api.TypePrivacyRule[] rules;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class Authorizations {
		private int authorizationTtlDays;
		private Api.TypeAuthorization[] authorizations;
	}

	@Data
	public static class Password {
		private Api.True hasRecovery;
		private Api.True hasSecureValues;
		private Api.True hasPassword;
		private Api.TypePasswordKdfAlgo currentAlgo;
		private byte[] srp_B;
		private BigInteger srpId;
		private String hint;
		private String emailUnconfirmedPattern;
		private Api.TypePasswordKdfAlgo newAlgo;
		private Api.TypeSecurePasswordKdfAlgo newSecureAlgo;
		private byte[] secureRandom;
		private int pendingResetDate;
	}

	@Data
	public static class PasswordSettings {
		private String email;
		private Api.TypeSecureSecretSettings secureSettings;
	}

	@Data
	public static class PasswordInputSettings {
		private Api.TypePasswordKdfAlgo newAlgo;
		private byte[] newPasswordHash;
		private String hint;
		private String email;
		private Api.TypeSecureSecretSettings newSecureSettings;
	}

	@Data
	public static class TmpPassword {
		private byte[] tmpPassword;
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
		private Api.TypeSecureValueError[] errors;
		private Api.TypeUser[] users;
		private String privacyPolicyUrl;
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
		private BigInteger hash;
		private Api.TypeWallPaper[] wallpapers;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AutoDownloadSettings extends Api.TypeAutoDownloadSettings {
		private Api.TypeAutoDownloadSettings low;
		private Api.TypeAutoDownloadSettings medium;
		private Api.TypeAutoDownloadSettings high;
	}

	@Data
	public static class ThemesNotModified {
	}

	@Data
	public static class Themes {
		private BigInteger hash;
		private Api.TypeTheme[] themes;
	}

	@Data
	public static class ContentSettings {
		private Api.True sensitiveEnabled;
		private Api.True sensitiveCanChange;
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
		private BigInteger hash;
		private Api.TypeDocument[] ringtones;
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
		private Api.True noMuted;
		private int tokenType;
		private String token;
		private Boolean appSandbox;
		private byte[] secret;
		private BigInteger[] otherUids;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UnregisterDevice extends Api.TypeBool {
		private int tokenType;
		private String token;
		private BigInteger[] otherUids;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateNotifySettings extends Api.TypeBool {
		private Api.TypeInputNotifyPeer peer;
		private Api.TypeInputPeerNotifySettings settings;
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
		private Api.TypeInputPeer peer;
		private Api.TypeReportReason reason;
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
		private Api.TypeInputPrivacyKey key;
		private Api.TypeInputPrivacyRule[] rules;
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
		private String phoneNumber;
		private Api.TypeCodeSettings settings;
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
		private String hash;
		private Api.TypeCodeSettings settings;
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
		private BigInteger botId;
		private String scope;
		private String publicKey;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptAuthorization extends Api.TypeBool {
		private BigInteger botId;
		private String scope;
		private String publicKey;
		private Api.TypeSecureValueHash[] valueHashes;
		private Api.TypeSecureCredentialsEncrypted credentials;
	}

	@Data
	public static class SendVerifyPhoneCode {
		private String phoneNumber;
		private Api.TypeCodeSettings settings;
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
		private String email;
		private String code;
	}

	@Data
	public static class InitTakeoutSession {
		private Api.True contacts;
		private Api.True messageUsers;
		private Api.True messageChats;
		private Api.True messageMegagroups;
		private Api.True messageChannels;
		private Api.True files;
		private BigInteger fileMaxSize;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class FinishTakeoutSession extends Api.TypeBool {
		private Api.True success;
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
		private Api.True compareSound;
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
		private Api.TypeInputFile file;
		private String mimeType;
		private Api.TypeWallPaperSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveWallPaper extends Api.TypeBool {
		private Api.TypeInputWallPaper wallpaper;
		private Boolean unsave;
		private Api.TypeWallPaperSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class InstallWallPaper extends Api.TypeBool {
		private Api.TypeInputWallPaper wallpaper;
		private Api.TypeWallPaperSettings settings;
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
		private Api.True low;
		private Api.True high;
		private Api.TypeAutoDownloadSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadTheme extends Api.TypeDocument {
		private Api.TypeInputFile file;
		private Api.TypeInputFile thumb;
		private String fileName;
		private String mimeType;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CreateTheme extends Api.TypeTheme {
		private String slug;
		private String title;
		private Api.TypeInputDocument document;
		private Api.TypeInputThemeSettings[] settings;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateTheme extends Api.TypeTheme {
		private String format;
		private Api.TypeInputTheme theme;
		private String slug;
		private String title;
		private Api.TypeInputDocument document;
		private Api.TypeInputThemeSettings[] settings;
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
		private Api.True dark;
		private Api.TypeInputTheme theme;
		private String format;
		private Api.TypeBaseTheme baseTheme;
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
		private Api.True sensitiveEnabled;
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
		private Api.TypeInputPeer peer;
		private Api.TypeInputPhoto photoId;
		private Api.TypeReportReason reason;
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
		private BigInteger hash;
		private Boolean encryptedRequestsDisabled;
		private Boolean callRequestsDisabled;
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
		private Api.TypeInputFile file;
		private String fileName;
		private String mimeType;
	}
}