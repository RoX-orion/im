package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class UsersApi {

	public static class TypeUserFull {}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UserFull extends Api.TypeUserFull {
		private Api.TypeUserFull fullUser;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class GetUsers {
		private Api.TypeInputUser[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetFullUser extends Api.TypeUserFull {
		private Api.TypeInputUser id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetSecureValueErrors extends Api.TypeBool {
		private Api.TypeInputUser id;
		private Api.TypeSecureValueError[] errors;
	}
}