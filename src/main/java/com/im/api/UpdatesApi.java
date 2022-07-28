package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class UpdatesApi {

	public static class TypeState {}
	public static class TypeDifference {}
	public static class TypeChannelDifference {}

	@Data
	public static class State {
		private int date;
		private int qts;
		private int unreadCount;
		private int pts;
		private int seq;
	}

	@Data
	public static class DifferenceEmpty {
		private int date;
		private int seq;
	}

	@Data
	public static class Difference {
		private Api.TypeMessage[] newMessages;
		private Api.TypeEncryptedMessage[] newEncryptedMessages;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private UpdatesApi.TypeState state;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DifferenceSlice {
		private Api.TypeMessage[] newMessages;
		private Api.TypeEncryptedMessage[] newEncryptedMessages;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private UpdatesApi.TypeState intermediateState;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DifferenceTooLong {
		private int pts;
	}

	@Data
	public static class ChannelDifferenceEmpty {
		private Api.True finalSuffix;
		private int pts;
		private int timeout;
	}

	@Data
	public static class ChannelDifferenceTooLong {
		private Api.TypeDialog dialog;
		private Api.True finalSuffix;
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private int timeout;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChannelDifference {
		private Api.TypeMessage[] newMessages;
		private Api.True finalSuffix;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private int pts;
		private int timeout;
		private Api.TypeUser[] users;
	}

	@Data
	public static class GetState {
	}

	@Data
	public static class GetDifference {
		private int date;
		private int qts;
		private int ptsTotalLimit;
		private int pts;
	}

	@Data
	public static class GetChannelDifference {
		private Api.TypeChannelMessagesFilter filter;
		private Api.TypeInputChannel channel;
		private int limit;
		private Api.True force;
		private int pts;
	}
}