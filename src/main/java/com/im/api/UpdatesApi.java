package com.im.api;

import lombok.Data;

public class UpdatesApi {

	public static class TypeState {}
	public static class TypeDifference {}
	public static class TypeChannelDifference {}

	@Data
	public static class State {
		private int pts;
		private int qts;
		private int date;
		private int seq;
		private int unreadCount;
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
		private Api.TypeUser[] users;
		private UpdatesApi.TypeState state;
	}

	@Data
	public static class DifferenceSlice {
		private Api.TypeMessage[] newMessages;
		private Api.TypeEncryptedMessage[] newEncryptedMessages;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
		private UpdatesApi.TypeState intermediateState;
	}

	@Data
	public static class DifferenceTooLong {
		private int pts;
	}

	@Data
	public static class ChannelDifferenceEmpty {
		private Boolean finalSuffix;
		private int pts;
		private int timeout;
	}

	@Data
	public static class ChannelDifferenceTooLong {
		private Boolean finalSuffix;
		private int timeout;
		private Api.TypeDialog dialog;
		private Api.TypeMessage[] messages;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChannelDifference {
		private Boolean finalSuffix;
		private int pts;
		private int timeout;
		private Api.TypeMessage[] newMessages;
		private Api.TypeUpdate[] otherUpdates;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class GetState {
	}

	@Data
	public static class GetDifference {
		private int pts;
		private int ptsTotalLimit;
		private int date;
		private int qts;
	}

	@Data
	public static class GetChannelDifference {
		private Boolean force;
		private Api.TypeInputChannel channel;
		private Api.TypeChannelMessagesFilter filter;
		private int pts;
		private int limit;
	}
}
