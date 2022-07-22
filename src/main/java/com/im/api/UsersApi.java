package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class UsersApi {

	public static class TypeUserFull {}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UserFull extends Api.TypeUserFull {
		private final Long constructorId = 997004590L;
		private final long subclassOfId = 2212470261L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeUserFull fullUser;
		private Api.TypeUser[] users;
	}

	@Data
	public static class GetUsers {
		private final Long constructorId = 227648840L;
		private final long subclassOfId = 67557965L;
		private final Boolean isFunction = true;

		private Api.TypeInputUser[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetFullUser extends Api.TypeUserFull {
		private final Long constructorId = 3054459160L;
		private final long subclassOfId = 2212470261L;
		private final Boolean isFunction = true;

		private Api.TypeInputUser id;
	}

	@Data
	public static class SetSecureValueErrors {
		private final Long constructorId = 2429064373L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputUser id;
		private Api.TypeSecureValueError[] errors;
	}
}
