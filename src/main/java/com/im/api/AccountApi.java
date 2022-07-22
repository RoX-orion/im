package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class AccountApi {

	public static class TypePasswordInputSettings {}
	public static class TypeResetPasswordResult {}

	@Data
	public static class PrivacyRules {
		private final Long constructorId = 1352683077L;
		private final long subclassOfId = 3042622082L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypePrivacyRule[] rules;
		private Api.TypeUser[] users;
	}

	@Data
	public static class Authorizations {
		private final Long constructorId = 1275039392L;
		private final long subclassOfId = 200663295L;
		private final Boolean isFunction = false;

		private int authorizationTtlDays;
		private Api.TypeAuthorization[] authorizations;
	}

	@Data
	public static class Password {
		private final Long constructorId = 408623183L;
		private final long subclassOfId = 1403130275L;
		private final Boolean isFunction = false;

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
		private final Long constructorId = 2589733861L;
		private final long subclassOfId = 3527389304L;
		private final Boolean isFunction = false;

		private Api.TypeSecureSecretSettings secureSettings;
		private String email;
	}

	@Data
	public static class PasswordInputSettings {
		private final Long constructorId = 3258394569L;
		private final long subclassOfId = 205679782L;
		private final Boolean isFunction = false;

		private Api.TypePasswordKdfAlgo newAlgo;
		private Api.TypeSecureSecretSettings newSecureSettings;
		private String hint;
		private byte newPasswordHash;
		private String email;
	}

	@Data
	public static class TmpPassword {
		private final Long constructorId = 3680828724L;
		private final long subclassOfId = 2959382829L;
		private final Boolean isFunction = false;

		private byte tmpPassword;
		private int validUntil;
	}

	@Data
	public static class WebAuthorizations {
		private final Long constructorId = 3981887996L;
		private final long subclassOfId = 2587253554L;
		private final Boolean isFunction = false;

		private Api.TypeWebAuthorization[] authorizations;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AuthorizationForm {
		private final Long constructorId = 2905480408L;
		private final long subclassOfId = 2013567636L;
		private final Boolean isFunction = false;

		private Api.TypeSecureRequiredType[] requiredTypes;
		private Api.TypeSecureValue[] values;
		private String privacyPolicyUrl;
		private Api.TypeSecureValueError[] errors;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SentEmailCode {
		private final Long constructorId = 2166326607L;
		private final long subclassOfId = 1777582190L;
		private final Boolean isFunction = false;

		private String emailPattern;
		private int length;
	}

	@Data
	public static class Takeout {
		private final Long constructorId = 1304052993L;
		private final long subclassOfId = 2218704517L;
		private final Boolean isFunction = false;

		private BigInteger id;
	}

	@Data
	public static class WallPapersNotModified {
		private final Long constructorId = 471437699L;
		private final long subclassOfId = 2730838269L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class WallPapers {
		private final Long constructorId = 3452142988L;
		private final long subclassOfId = 2730838269L;
		private final Boolean isFunction = false;

		private Api.TypeWallPaper[] wallpapers;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AutoDownloadSettings extends Api.TypeAutoDownloadSettings {
		private final Long constructorId = 1674235686L;
		private final long subclassOfId = 800610593L;
		private final Boolean isFunction = false;

		private Api.TypeAutoDownloadSettings high;
		private Api.TypeAutoDownloadSettings low;
		private Api.TypeAutoDownloadSettings medium;
	}

	@Data
	public static class ThemesNotModified {
		private final Long constructorId = 4095653410L;
		private final long subclassOfId = 2143625732L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class Themes {
		private final Long constructorId = 2587724909L;
		private final long subclassOfId = 2143625732L;
		private final Boolean isFunction = false;

		private Api.TypeTheme[] themes;
		private BigInteger hash;
	}

	@Data
	public static class ContentSettings {
		private final Long constructorId = 1474462241L;
		private final long subclassOfId = 2923427985L;
		private final Boolean isFunction = false;

		private Boolean sensitiveEnabled;
		private Boolean sensitiveCanChange;
	}

	@Data
	public static class ResetPasswordFailedWait {
		private final Long constructorId = 3816265825L;
		private final long subclassOfId = 1230009366L;
		private final Boolean isFunction = false;

		private int retryDate;
	}

	@Data
	public static class ResetPasswordRequestedWait {
		private final Long constructorId = 3924819069L;
		private final long subclassOfId = 1230009366L;
		private final Boolean isFunction = false;

		private int untilDate;
	}

	@Data
	public static class ResetPasswordOk {
		private final Long constructorId = 3911636542L;
		private final long subclassOfId = 1230009366L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class SavedRingtonesNotModified {
		private final Long constructorId = 4227262641L;
		private final long subclassOfId = 666683742L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class SavedRingtones {
		private final Long constructorId = 3253284037L;
		private final long subclassOfId = 666683742L;
		private final Boolean isFunction = false;

		private Api.TypeDocument[] ringtones;
		private BigInteger hash;
	}

	@Data
	public static class SavedRingtone {
		private final Long constructorId = 3072737133L;
		private final long subclassOfId = 2984412196L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class SavedRingtoneConverted {
		private final Long constructorId = 523271863L;
		private final long subclassOfId = 2984412196L;
		private final Boolean isFunction = false;

		private Api.TypeDocument document;
	}

	@Data
	public static class RegisterDevice {
		private final Long constructorId = 3968205178L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean noMuted;
		private Boolean appSandbox;
		private BigInteger[] otherUids;
		private byte secret;
		private int tokenType;
		private String token;
	}

	@Data
	public static class UnregisterDevice {
		private final Long constructorId = 1779249670L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private BigInteger[] otherUids;
		private int tokenType;
		private String token;
	}

	@Data
	public static class UpdateNotifySettings {
		private final Long constructorId = 2227067795L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeerNotifySettings settings;
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetNotifySettings extends Api.TypePeerNotifySettings {
		private final Long constructorId = 313765169L;
		private final long subclassOfId = 3475030132L;
		private final Boolean isFunction = true;

		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	public static class ResetNotifySettings {
		private final Long constructorId = 3682473799L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UpdateProfile extends Api.TypeUser {
		private final Long constructorId = 2018596725L;
		private final long subclassOfId = 765557111L;
		private final Boolean isFunction = true;

		private String firstName;
		private String lastName;
		private String about;
	}

	@Data
	public static class UpdateStatus {
		private final Long constructorId = 1713919532L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean offline;
	}

	@Data
	public static class GetWallPapers {
		private final Long constructorId = 127302966L;
		private final long subclassOfId = 2730838269L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class ReportPeer {
		private final Long constructorId = 3317316998L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeReportReason reason;
		private Api.TypeInputPeer peer;
		private String message;
	}

	@Data
	public static class CheckUsername {
		private final Long constructorId = 655677548L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String username;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UpdateUsername extends Api.TypeUser {
		private final Long constructorId = 1040964988L;
		private final long subclassOfId = 765557111L;
		private final Boolean isFunction = true;

		private String username;
	}

	@Data
	public static class GetPrivacy {
		private final Long constructorId = 3671837008L;
		private final long subclassOfId = 3042622082L;
		private final Boolean isFunction = true;

		private Api.TypeInputPrivacyKey key;
	}

	@Data
	public static class SetPrivacy {
		private final Long constructorId = 3388480744L;
		private final long subclassOfId = 3042622082L;
		private final Boolean isFunction = true;

		private Api.TypeInputPrivacyRule[] rules;
		private Api.TypeInputPrivacyKey key;
	}

	@Data
	public static class DeleteAccount {
		private final Long constructorId = 1099779595L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String reason;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetAccountTTL extends Api.TypeAccountDaysTTL {
		private final Long constructorId = 150761757L;
		private final long subclassOfId = 3131284872L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class SetAccountTTL {
		private final Long constructorId = 608323678L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeAccountDaysTTL ttl;
	}

	@Data
	public static class SendChangePhoneCode {
		private final Long constructorId = 2186758885L;
		private final long subclassOfId = 1827172481L;
		private final Boolean isFunction = true;

		private Api.TypeCodeSettings settings;
		private String phoneNumber;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ChangePhone extends Api.TypeUser {
		private final Long constructorId = 1891839707L;
		private final long subclassOfId = 765557111L;
		private final Boolean isFunction = true;

		private String phoneNumber;
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class UpdateDeviceLocked {
		private final Long constructorId = 954152242L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private int period;
	}

	@Data
	public static class GetAuthorizations {
		private final Long constructorId = 3810574680L;
		private final long subclassOfId = 200663295L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class ResetAuthorization {
		private final Long constructorId = 3749180348L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class GetPassword {
		private final Long constructorId = 1418342645L;
		private final long subclassOfId = 1403130275L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetPasswordSettings {
		private final Long constructorId = 2631199481L;
		private final long subclassOfId = 3527389304L;
		private final Boolean isFunction = true;

		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	public static class UpdatePasswordSettings {
		private final Long constructorId = 2778402863L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputCheckPasswordSRP password;
		private AccountApi.TypePasswordInputSettings newSettings;
	}

	@Data
	public static class SendConfirmPhoneCode {
		private final Long constructorId = 457157256L;
		private final long subclassOfId = 1827172481L;
		private final Boolean isFunction = true;

		private Api.TypeCodeSettings settings;
		private String hash;
	}

	@Data
	public static class ConfirmPhone {
		private final Long constructorId = 1596029123L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class GetTmpPassword {
		private final Long constructorId = 1151208273L;
		private final long subclassOfId = 2959382829L;
		private final Boolean isFunction = true;

		private Api.TypeInputCheckPasswordSRP password;
		private int period;
	}

	@Data
	public static class GetWebAuthorizations {
		private final Long constructorId = 405695855L;
		private final long subclassOfId = 2587253554L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class ResetWebAuthorization {
		private final Long constructorId = 755087855L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class ResetWebAuthorizations {
		private final Long constructorId = 1747789204L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetAllSecureValues {
		private final Long constructorId = 2995305597L;
		private final long subclassOfId = 3895345441L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetSecureValue {
		private final Long constructorId = 1936088002L;
		private final long subclassOfId = 3895345441L;
		private final Boolean isFunction = true;

		private Api.TypeSecureValueType[] types;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SaveSecureValue extends Api.TypeSecureValue {
		private final Long constructorId = 2308956957L;
		private final long subclassOfId = 85014702L;
		private final Boolean isFunction = true;

		private Api.TypeInputSecureValue value;
		private BigInteger secureSecretId;
	}

	@Data
	public static class DeleteSecureValue {
		private final Long constructorId = 3095444555L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeSecureValueType[] types;
	}

	@Data
	public static class GetAuthorizationForm {
		private final Long constructorId = 2838059386L;
		private final long subclassOfId = 2013567636L;
		private final Boolean isFunction = true;

		private String scope;
		private BigInteger botId;
		private String publicKey;
	}

	@Data
	public static class AcceptAuthorization {
		private final Long constructorId = 4092415091L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeSecureCredentialsEncrypted credentials;
		private String scope;
		private Api.TypeSecureValueHash[] valueHashes;
		private BigInteger botId;
		private String publicKey;
	}

	@Data
	public static class SendVerifyPhoneCode {
		private final Long constructorId = 2778945273L;
		private final long subclassOfId = 1827172481L;
		private final Boolean isFunction = true;

		private Api.TypeCodeSettings settings;
		private String phoneNumber;
	}

	@Data
	public static class VerifyPhone {
		private final Long constructorId = 1305716726L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String phoneNumber;
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class SendVerifyEmailCode {
		private final Long constructorId = 1880182943L;
		private final long subclassOfId = 1777582190L;
		private final Boolean isFunction = true;

		private String email;
	}

	@Data
	public static class VerifyEmail {
		private final Long constructorId = 3971627483L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String code;
		private String email;
	}

	@Data
	public static class InitTakeoutSession {
		private final Long constructorId = 2398350000L;
		private final long subclassOfId = 2218704517L;
		private final Boolean isFunction = true;

		private Boolean messageChats;
		private BigInteger fileMaxSize;
		private Boolean files;
		private Boolean messageUsers;
		private Boolean messageMegagroups;
		private Boolean contacts;
		private Boolean messageChannels;
	}

	@Data
	public static class FinishTakeoutSession {
		private final Long constructorId = 489050862L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean success;
	}

	@Data
	public static class ConfirmPasswordEmail {
		private final Long constructorId = 2413762848L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String code;
	}

	@Data
	public static class ResendPasswordEmail {
		private final Long constructorId = 2055154197L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class CancelPasswordEmail {
		private final Long constructorId = 3251361206L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetContactSignUpNotification {
		private final Long constructorId = 2668087080L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class SetContactSignUpNotification {
		private final Long constructorId = 3488890721L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean silent;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetNotifyExceptions extends Api.TypeUpdates {
		private final Long constructorId = 1398240377L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean compareSound;
		private Api.TypeInputNotifyPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetWallPaper extends Api.TypeWallPaper {
		private final Long constructorId = 4237155306L;
		private final long subclassOfId = 2527250827L;
		private final Boolean isFunction = true;

		private Api.TypeInputWallPaper wallpaper;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UploadWallPaper extends Api.TypeWallPaper {
		private final Long constructorId = 3716494945L;
		private final long subclassOfId = 2527250827L;
		private final Boolean isFunction = true;

		private Api.TypeWallPaperSettings settings;
		private Api.TypeInputFile file;
		private String mimeType;
	}

	@Data
	public static class SaveWallPaper {
		private final Long constructorId = 1817860919L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeWallPaperSettings settings;
		private Api.TypeInputWallPaper wallpaper;
		private Boolean unsave;
	}

	@Data
	public static class InstallWallPaper {
		private final Long constructorId = 4276967273L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeWallPaperSettings settings;
		private Api.TypeInputWallPaper wallpaper;
	}

	@Data
	public static class ResetWallPapers {
		private final Long constructorId = 3141244932L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetAutoDownloadSettings extends Api.TypeAutoDownloadSettings {
		private final Long constructorId = 1457130303L;
		private final long subclassOfId = 800610593L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class SaveAutoDownloadSettings {
		private final Long constructorId = 1995661875L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeAutoDownloadSettings settings;
		private Boolean high;
		private Boolean low;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UploadTheme extends Api.TypeDocument {
		private final Long constructorId = 473805619L;
		private final long subclassOfId = 555739168L;
		private final Boolean isFunction = true;

		private String fileName;
		private Api.TypeInputFile file;
		private Api.TypeInputFile thumb;
		private String mimeType;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class CreateTheme extends Api.TypeTheme {
		private final Long constructorId = 1697530880L;
		private final long subclassOfId = 1454688268L;
		private final Boolean isFunction = true;

		private Api.TypeInputThemeSettings[] settings;
		private Api.TypeInputDocument document;
		private String title;
		private String slug;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UpdateTheme extends Api.TypeTheme {
		private final Long constructorId = 737414348L;
		private final long subclassOfId = 1454688268L;
		private final Boolean isFunction = true;

		private Api.TypeInputThemeSettings[] settings;
		private Api.TypeInputDocument document;
		private String format;
		private Api.TypeInputTheme theme;
		private String title;
		private String slug;
	}

	@Data
	public static class SaveTheme {
		private final Long constructorId = 4065792108L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputTheme theme;
		private Boolean unsave;
	}

	@Data
	public static class InstallTheme {
		private final Long constructorId = 3341269819L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeBaseTheme baseTheme;
		private Boolean dark;
		private String format;
		private Api.TypeInputTheme theme;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetTheme extends Api.TypeTheme {
		private final Long constructorId = 2375906347L;
		private final long subclassOfId = 1454688268L;
		private final Boolean isFunction = true;

		private String format;
		private Api.TypeInputTheme theme;
		private BigInteger documentId;
	}

	@Data
	public static class GetThemes {
		private final Long constructorId = 1913054296L;
		private final long subclassOfId = 2143625732L;
		private final Boolean isFunction = true;

		private String format;
		private BigInteger hash;
	}

	@Data
	public static class SetContentSettings {
		private final Long constructorId = 3044323691L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean sensitiveEnabled;
	}

	@Data
	public static class GetContentSettings {
		private final Long constructorId = 2342210990L;
		private final long subclassOfId = 2923427985L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetMultiWallPapers {
		private final Long constructorId = 1705865692L;
		private final long subclassOfId = 2395165315L;
		private final Boolean isFunction = true;

		private Api.TypeInputWallPaper[] wallpapers;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetGlobalPrivacySettings extends Api.TypeGlobalPrivacySettings {
		private final Long constructorId = 3945483510L;
		private final long subclassOfId = 3373160304L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SetGlobalPrivacySettings extends Api.TypeGlobalPrivacySettings {
		private final Long constructorId = 517647042L;
		private final long subclassOfId = 3373160304L;
		private final Boolean isFunction = true;

		private Api.TypeGlobalPrivacySettings settings;
	}

	@Data
	public static class ReportProfilePhoto {
		private final Long constructorId = 4203529973L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeReportReason reason;
		private Api.TypeInputPeer peer;
		private Api.TypeInputPhoto photoId;
		private String message;
	}

	@Data
	public static class ResetPassword {
		private final Long constructorId = 2466827803L;
		private final long subclassOfId = 1230009366L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class DeclinePasswordReset {
		private final Long constructorId = 1284770294L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetChatThemes {
		private final Long constructorId = 3594051209L;
		private final long subclassOfId = 2143625732L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class SetAuthorizationTTL {
		private final Long constructorId = 3213466272L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private int authorizationTtlDays;
	}

	@Data
	public static class ChangeAuthorizationSettings {
		private final Long constructorId = 1089766498L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean encryptedRequestsDisabled;
		private Boolean callRequestsDisabled;
		private BigInteger hash;
	}

	@Data
	public static class GetSavedRingtones {
		private final Long constructorId = 3784319624L;
		private final long subclassOfId = 666683742L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class SaveRingtone {
		private final Long constructorId = 1038768899L;
		private final long subclassOfId = 2984412196L;
		private final Boolean isFunction = true;

		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UploadRingtone extends Api.TypeDocument {
		private final Long constructorId = 2199552930L;
		private final long subclassOfId = 555739168L;
		private final Boolean isFunction = true;

		private String fileName;
		private Api.TypeInputFile file;
		private String mimeType;
	}
}
