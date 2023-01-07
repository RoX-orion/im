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
	public static class TypeEmojiStatuses {}
	public static class TypeEmailVerified {}

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
		private Boolean hasRecovery;
		private Boolean hasSecureValues;
		private Boolean hasPassword;
		private Api.TypePasswordKdfAlgo currentAlgo;
		private byte[] srp_B;
		private BigInteger srpId;
		private String hint;
		private String emailUnconfirmedPattern;
		private Api.TypePasswordKdfAlgo newAlgo;
		private Api.TypeSecurePasswordKdfAlgo newSecureAlgo;
		private byte[] secureRandom;
		private int pendingResetDate;
		private String loginEmailPattern;
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
	@EqualsAndHashCode(callSuper = true)
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
	public static class EmojiStatusesNotModified {
	}

	@Data
	public static class EmojiStatuses {
		private BigInteger hash;
		private Api.TypeEmojiStatus[] statuses;
	}

	@Data
	public static class EmailVerified {
		private String email;
	}

	@Data
	public static class EmailVerifiedLogin {
		private String email;
		private AuthApi.TypeSentCode sentCode;
	}

	@Data
	public static class RegisterDevice {
		private Boolean noMuted;
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
	@EqualsAndHashCode(callSuper = true)
	public static class GetNotifySettings extends Api.TypePeerNotifySettings {
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	public static class ResetNotifySettings {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
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
	@EqualsAndHashCode(callSuper = true)
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
		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
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
	@EqualsAndHashCode(callSuper = true)
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
	@EqualsAndHashCode(callSuper = true)
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
		private Api.TypeEmailVerifyPurpose purpose;
		private String email;
	}

	@Data
	public static class VerifyEmail {
		private Api.TypeEmailVerifyPurpose purpose;
		private Api.TypeEmailVerification verification;
	}

	@Data
	public static class InitTakeoutSession {
		private Boolean contacts;
		private Boolean messageUsers;
		private Boolean messageChats;
		private Boolean messageMegagroups;
		private Boolean messageChannels;
		private Boolean files;
		private BigInteger fileMaxSize;
	}

	@Data
	public static class FinishTakeoutSession {
		private Boolean success;
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
	@EqualsAndHashCode(callSuper = true)
	public static class GetNotifyExceptions extends Api.TypeUpdates {
		private Boolean compareSound;
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetWallPaper extends Api.TypeWallPaper {
		private Api.TypeInputWallPaper wallpaper;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
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
	@EqualsAndHashCode(callSuper = true)
	public static class GetAutoDownloadSettings extends Api.TypeAutoDownloadSettings {
	}

	@Data
	public static class SaveAutoDownloadSettings {
		private Boolean low;
		private Boolean high;
		private Api.TypeAutoDownloadSettings settings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UploadTheme extends Api.TypeDocument {
		private Api.TypeInputFile file;
		private Api.TypeInputFile thumb;
		private String fileName;
		private String mimeType;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CreateTheme extends Api.TypeTheme {
		private String slug;
		private String title;
		private Api.TypeInputDocument document;
		private Api.TypeInputThemeSettings[] settings;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
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
		private Boolean dark;
		private Api.TypeInputTheme theme;
		private String format;
		private Api.TypeBaseTheme baseTheme;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetTheme extends Api.TypeTheme {
		private String format;
		private Api.TypeInputTheme theme;
	}

	@Data
	public static class GetThemes {
		private String format;
		private BigInteger hash;
	}

	@Data
	public static class SetContentSettings {
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
	@EqualsAndHashCode(callSuper = true)
	public static class GetGlobalPrivacySettings extends Api.TypeGlobalPrivacySettings {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
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
	@EqualsAndHashCode(callSuper = true)
	public static class UploadRingtone extends Api.TypeDocument {
		private Api.TypeInputFile file;
		private String fileName;
		private String mimeType;
	}

	@Data
	public static class UpdateEmojiStatus {
		private Api.TypeEmojiStatus emojiStatus;
	}

	@Data
	public static class GetDefaultEmojiStatuses {
		private BigInteger hash;
	}

	@Data
	public static class GetRecentEmojiStatuses {
		private BigInteger hash;
	}

	@Data
	public static class ClearRecentEmojiStatuses {
	}

	@Data
	public static class ReorderUsernames {
		private String[] order;
	}

	@Data
	public static class ToggleUsername {
		private String username;
		private Boolean active;
	}
}