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
		private String phoneCodeHash;
		private AuthApi.TypeCodeType nextType;
		private AuthApi.TypeSentCodeType type;
		private int timeout;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class Authorization extends Api.TypeAuthorization {
		private int tmpSessions;
		private int otherwiseReloginDays;
		private Api.True setupPasswordRequired;
		private Api.TypeUser user;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AuthorizationSignUpRequired extends Api.TypeAuthorization {
		private HelpApi.TypeTermsOfService termsOfService;
	}

	@Data
	public static class ExportedAuthorization {
		private byte bytes;
		private BigInteger id;
	}

	@Data
	public static class PasswordRecovery {
		private String emailPattern;
	}

	@Data
	public static class CodeTypeSms {
	}

	@Data
	public static class CodeTypeCall {
	}

	@Data
	public static class CodeTypeFlashCall {
	}

	@Data
	public static class CodeTypeMissedCall {
	}

	@Data
	public static class SentCodeTypeApp {
		private int length;
	}

	@Data
	public static class SentCodeTypeSms {
		private int length;
	}

	@Data
	public static class SentCodeTypeCall {
		private int length;
	}

	@Data
	public static class SentCodeTypeFlashCall {
		private String pattern;
	}

	@Data
	public static class SentCodeTypeMissedCall {
		private String prefix;
		private int length;
	}

	@Data
	public static class LoginToken {
		private int expires;
		private byte token;
	}

	@Data
	public static class LoginTokenMigrateTo {
		private int dcId;
		private byte token;
	}

	@Data
	public static class LoginTokenSuccess {
		private AuthApi.TypeAuthorization authorization;
	}

	@Data
	public static class LoggedOut {
		private byte futureAuthToken;
	}

	@Data
	public static class SendCode {
		private Api.TypeCodeSettings settings;
		private String phoneNumber;
		private String apiHash;
		private int apiId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SignUp extends Api.TypeAuthorization {
		private String firstName;
		private String lastName;
		private String phoneNumber;
		private String phoneCodeHash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SignIn extends Api.TypeAuthorization {
		private String phoneNumber;
		private String phoneCodeHash;
		private String phoneCode;
	}

	@Data
	public static class LogOut {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetAuthorizations extends Api.TypeBool {
	}

	@Data
	public static class ExportAuthorization {
		private int dcId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ImportAuthorization extends Api.TypeAuthorization {
		private byte bytes;
		private BigInteger id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class BindTempAuthKey extends Api.TypeBool {
		private byte encryptedMessage;
		private BigInteger permAuthKeyId;
		private BigInteger nonce;
		private int expiresAt;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ImportBotAuthorization extends Api.TypeAuthorization {
		private String botAuthToken;
		private String apiHash;
		private int apiId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CheckPassword extends Api.TypeAuthorization {
		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	public static class RequestPasswordRecovery {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RecoverPassword extends Api.TypeAuthorization {
		private String code;
		private AccountApi.TypePasswordInputSettings newSettings;
	}

	@Data
	public static class ResendCode {
		private String phoneNumber;
		private String phoneCodeHash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CancelCode extends Api.TypeBool {
		private String phoneNumber;
		private String phoneCodeHash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DropTempAuthKeys extends Api.TypeBool {
		private BigInteger[] exceptAuthKeys;
	}

	@Data
	public static class ExportLoginToken {
		private BigInteger[] exceptIds;
		private String apiHash;
		private int apiId;
	}

	@Data
	public static class ImportLoginToken {
		private byte token;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptLoginToken extends Api.TypeAuthorization {
		private byte token;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CheckRecoveryPassword extends Api.TypeBool {
		private String code;
	}
}