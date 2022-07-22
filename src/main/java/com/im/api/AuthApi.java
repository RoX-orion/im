package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class AuthApi {

	public static class TypeSentCode {}
	public static class TypeAuthorization {}
	public static class TypeExportedAuthorization {}
	public static class TypePasswordRecovery {}
	public static class TypeCodeType {}
	public static class TypeSentCodeType {}
	public static class TypeLoginToken {}
	public static class TypeLoggedOut {}

	@Data
	public static class SentCode {
		private final Long constructorId = 1577067778L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String phoneCodeHash;
		private AuthApi.TypeCodeType nextType;
		private AuthApi.TypeSentCodeType type;
		private int timeout;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class Authorization extends Api.TypeAuthorization {
		private final Long constructorId = 872119224L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int tmpSessions;
		private int otherwiseReloginDays;
		private Boolean setupPasswordRequired;
		private Api.TypeUser user;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AuthorizationSignUpRequired extends Api.TypeAuthorization {
		private final Long constructorId = 1148485274L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private HelpApi.TypeTermsOfService termsOfService;
	}

	@Data
	public static class ExportedAuthorization {
		private final Long constructorId = 3023364792L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private byte bytes;
		private BigInteger id;
	}

	@Data
	public static class PasswordRecovery {
		private final Long constructorId = 326715557L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String emailPattern;
	}

	@Data
	public static class CodeTypeSms {
		private final Long constructorId = 1923290508L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class CodeTypeCall {
		private final Long constructorId = 1948046307L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class CodeTypeFlashCall {
		private final Long constructorId = 577556219L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class CodeTypeMissedCall {
		private final Long constructorId = 3592083182L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class SentCodeTypeApp {
		private final Long constructorId = 1035688326L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int length;
	}

	@Data
	public static class SentCodeTypeSms {
		private final Long constructorId = 3221273506L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int length;
	}

	@Data
	public static class SentCodeTypeCall {
		private final Long constructorId = 1398007207L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int length;
	}

	@Data
	public static class SentCodeTypeFlashCall {
		private final Long constructorId = 2869151449L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String pattern;
	}

	@Data
	public static class SentCodeTypeMissedCall {
		private final Long constructorId = 2181063812L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String prefix;
		private int length;
	}

	@Data
	public static class LoginToken {
		private final Long constructorId = 1654593920L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int expires;
		private byte token;
	}

	@Data
	public static class LoginTokenMigrateTo {
		private final Long constructorId = 110008598L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int dcId;
		private byte token;
	}

	@Data
	public static class LoginTokenSuccess {
		private final Long constructorId = 957176926L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private AuthApi.TypeAuthorization authorization;
	}

	@Data
	public static class LoggedOut {
		private final Long constructorId = 3282207583L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private byte futureAuthToken;
	}

	@Data
	public static class SendCode {
		private final Long constructorId = 2792825935L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeCodeSettings settings;
		private String phoneNumber;
		private String apiHash;
		private int apiId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SignUp extends Api.TypeAuthorization {
		private final Long constructorId = 2163139623L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String phoneCodeHash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SignIn extends Api.TypeAuthorization {
		private final Long constructorId = 3168081281L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String phoneNumber;
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class LogOut {
		private final Long constructorId = 1047706137L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	public static class ResetAuthorizations {
		private final Long constructorId = 2678787354L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	public static class ExportAuthorization {
		private final Long constructorId = 3854565325L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private int dcId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ImportAuthorization extends Api.TypeAuthorization {
		private final Long constructorId = 2776268205L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte bytes;
		private BigInteger id;
	}

	@Data
	public static class BindTempAuthKey {
		private final Long constructorId = 3453233669L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte encryptedMessage;
		private BigInteger permAuthKeyId;
		private BigInteger nonce;
		private int expiresAt;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ImportBotAuthorization extends Api.TypeAuthorization {
		private final Long constructorId = 1738800940L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String botAuthToken;
		private String apiHash;
		private int apiId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class CheckPassword extends Api.TypeAuthorization {
		private final Long constructorId = 3515567382L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	public static class RequestPasswordRecovery {
		private final Long constructorId = 3633822822L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RecoverPassword extends Api.TypeAuthorization {
		private final Long constructorId = 923364464L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String code;
		private AccountApi.TypePasswordInputSettings newSettings;
	}

	@Data
	public static class ResendCode {
		private final Long constructorId = 1056025023L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String phoneNumber;
		private String phoneCodeHash;
	}

	@Data
	public static class CancelCode {
		private final Long constructorId = 520357240L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String phoneNumber;
		private String phoneCodeHash;
	}

	@Data
	public static class DropTempAuthKeys {
		private final Long constructorId = 2387124616L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger[] exceptAuthKeys;
	}

	@Data
	public static class ExportLoginToken {
		private final Long constructorId = 3084944894L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger[] exceptIds;
		private String apiHash;
		private int apiId;
	}

	@Data
	public static class ImportLoginToken {
		private final Long constructorId = 2511101156L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte token;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AcceptLoginToken extends Api.TypeAuthorization {
		private final Long constructorId = 3902057805L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte token;
	}

	@Data
	public static class CheckRecoveryPassword {
		private final Long constructorId = 221691769L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String code;
	}
}