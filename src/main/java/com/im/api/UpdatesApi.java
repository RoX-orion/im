package com.im.api;

import lombok.Data;

public class UpdatesApi {

	public static class TypeState {}
	public static class TypeDifference {}
	public static class TypeChannelDifference {}

	@Data
	public static class State {
		private final Long constructorId = 2775329342L;
		private final long subclassOfId = 601823745L;
		private final Boolean isFunction = false;

		private int date;
		private int qts;
		private int unreadCount;
		private int pts;
		private int seq;
	}

	@Data
	public static class DifferenceEmpty {
		private final Long constructorId = 1567990072L;
		private final long subclassOfId = 541599860L;
		private final Boolean isFunction = false;

		private int date;
		private int seq;
	}

	@Data
	public static class Difference {
		private final Long constructorId = 16030880L;
		private final long subclassOfId = 541599860L;
		private final Boolean isFunction = false;

		private Api.TypeMessage[] newMessages;
		private Api.TypeEncryptedMessage[] newEncryptedMessages;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private UpdatesApi.TypeState state;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DifferenceSlice {
		private final Long constructorId = 2835028353L;
		private final long subclassOfId = 541599860L;
		private final Boolean isFunction = false;

		private Api.TypeMessage[] newMessages;
		private Api.TypeEncryptedMessage[] newEncryptedMessages;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private UpdatesApi.TypeState intermediateState;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DifferenceTooLong {
		private final Long constructorId = 1258196845L;
		private final long subclassOfId = 541599860L;
		private final Boolean isFunction = false;

		private int pts;
	}

	@Data
	public static class ChannelDifferenceEmpty {
		private final Long constructorId = 1041346555L;
		private final long subclassOfId = 696872797L;
		private final Boolean isFunction = false;

		private Boolean finalSuffix;
		private int pts;
		private int timeout;
	}

	@Data
	public static class ChannelDifferenceTooLong {
		private final Long constructorId = 2763835134L;
		private final long subclassOfId = 696872797L;
		private final Boolean isFunction = false;

		private Api.TypeDialog dialog;
		private Boolean finalSuffix;
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private int timeout;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChannelDifference {
		private final Long constructorId = 543450958L;
		private final long subclassOfId = 696872797L;
		private final Boolean isFunction = false;

		private Api.TypeMessage[] newMessages;
		private Boolean finalSuffix;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private int pts;
		private int timeout;
		private Api.TypeUser[] users;
	}

	@Data
	public static class GetState {
		private final Long constructorId = 3990128682L;
		private final long subclassOfId = 601823745L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetDifference {
		private final Long constructorId = 630429265L;
		private final long subclassOfId = 541599860L;
		private final Boolean isFunction = true;

		private int date;
		private int qts;
		private int ptsTotalLimit;
		private int pts;
	}

	@Data
	public static class GetChannelDifference {
		private final Long constructorId = 51854712L;
		private final long subclassOfId = 696872797L;
		private final Boolean isFunction = true;

		private Api.TypeChannelMessagesFilter filter;
		private Api.TypeInputChannel channel;
		private int limit;
		private Boolean force;
		private int pts;
	}
}
