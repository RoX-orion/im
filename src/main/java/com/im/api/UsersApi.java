package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class UsersApi {

	public static class TypeUserFull {}

	@Data
	@EqualsAndHashCode(callSuper = true)
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
	@EqualsAndHashCode(callSuper = true)
	public static class GetFullUser extends Api.TypeUserFull {
		private Api.TypeInputUser id;
	}

	@Data
	public static class SetSecureValueErrors {
		private Api.TypeInputUser id;
		private Api.TypeSecureValueError[] errors;
	}
}
