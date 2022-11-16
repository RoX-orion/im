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
	public static class RegisterDevice {
		private Api.True noMuted;
		private int tokenType;
		private String token;
		private Boolean appSandbox;
		private byte[] secret;
		private BigInteger[] otherUids;
	}

	@Data
	public static class UnregisterDevice {
		private int tokenType;
		private String token;
		private BigInteger[] otherUids;
	}

	@Data
	public static class UpdateNotifySettings {
		private Api.TypeInputNotifyPeer peer;
		private Api.TypeInputPeerNotifySettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetNotifySettings extends Api.TypePeerNotifySettings {
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	public static class ResetNotifySettings {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateProfile extends Api.TypeUser {
		private String firstName;
		private String lastName;
		private String about;
	}

	@Data
	public static class UpdateStatus {
		private Boolean offline;
	}

	@Data
	public static class GetWallPapers {
		private BigInteger hash;
	}

	@Data
	public static class ReportPeer {
		private Api.TypeInputPeer peer;
		private Api.TypeReportReason reason;
		private String message;
	}

	@Data
	public static class CheckUsername {
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
	public static class DeleteAccount {
		private String reason;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAccountTTL extends Api.TypeAccountDaysTTL {
	}

	@Data
	public static class SetAccountTTL {
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
	public static class UpdateDeviceLocked {
		private int period;
	}

	@Data
	public static class GetAuthorizations {
	}

	@Data
	public static class ResetAuthorization {
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
	public static class UpdatePasswordSettings {
		private Api.TypeInputCheckPasswordSRP password;
		private AccountApi.TypePasswordInputSettings newSettings;
	}

	@Data
	public static class SendConfirmPhoneCode {
		private String hash;
		private Api.TypeCodeSettings settings;
	}

	@Data
	public static class ConfirmPhone {
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
	public static class ResetWebAuthorization {
		private BigInteger hash;
	}

	@Data
	public static class ResetWebAuthorizations {
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
	public static class DeleteSecureValue {
		private Api.TypeSecureValueType[] types;
	}

	@Data
	public static class GetAuthorizationForm {
		private BigInteger botId;
		private String scope;
		private String publicKey;
	}

	@Data
	public static class AcceptAuthorization {
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
	public static class VerifyPhone {
		private String phoneNumber;
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class SendVerifyEmailCode {
		private String email;
	}

	@Data
	public static class VerifyEmail {
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
	public static class FinishTakeoutSession {
		private Api.True success;
	}

	@Data
	public static class ConfirmPasswordEmail {
		private String code;
	}

	@Data
	public static class ResendPasswordEmail {
	}

	@Data
	public static class CancelPasswordEmail {
	}

	@Data
	public static class GetContactSignUpNotification {
	}

	@Data
	public static class SetContactSignUpNotification {
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
	public static class SaveWallPaper {
		private Api.TypeInputWallPaper wallpaper;
		private Boolean unsave;
		private Api.TypeWallPaperSettings settings;
	}

	@Data
	public static class InstallWallPaper {
		private Api.TypeInputWallPaper wallpaper;
		private Api.TypeWallPaperSettings settings;
	}

	@Data
	public static class ResetWallPapers {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAutoDownloadSettings extends Api.TypeAutoDownloadSettings {
	}

	@Data
	public static class SaveAutoDownloadSettings {
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
	public static class SaveTheme {
		private Api.TypeInputTheme theme;
		private Boolean unsave;
	}

	@Data
	public static class InstallTheme {
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
	public static class SetContentSettings {
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
	public static class ReportProfilePhoto {
		private Api.TypeInputPeer peer;
		private Api.TypeInputPhoto photoId;
		private Api.TypeReportReason reason;
		private String message;
	}

	@Data
	public static class ResetPassword {
	}

	@Data
	public static class DeclinePasswordReset {
	}

	@Data
	public static class GetChatThemes {
		private BigInteger hash;
	}

	@Data
	public static class SetAuthorizationTTL {
		private int authorizationTtlDays;
	}

	@Data
	public static class ChangeAuthorizationSettings {
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