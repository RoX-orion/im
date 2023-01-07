package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class StatsApi {

	public static class TypeBroadcastStats {}
	public static class TypeMegagroupStats {}
	public static class TypeMessageStats {}

	@Data
	public static class BroadcastStats {
		private Api.TypeStatsDateRangeDays period;
		private Api.TypeStatsAbsValueAndPrev followers;
		private Api.TypeStatsAbsValueAndPrev viewsPerPost;
		private Api.TypeStatsAbsValueAndPrev sharesPerPost;
		private Api.TypeStatsPercentValue enabledNotifications;
		private Api.TypeStatsGraph growthGraph;
		private Api.TypeStatsGraph followersGraph;
		private Api.TypeStatsGraph muteGraph;
		private Api.TypeStatsGraph topHoursGraph;
		private Api.TypeStatsGraph interactionsGraph;
		private Api.TypeStatsGraph ivInteractionsGraph;
		private Api.TypeStatsGraph viewsBySourceGraph;
		private Api.TypeStatsGraph newFollowersBySourceGraph;
		private Api.TypeStatsGraph languagesGraph;
		private Api.TypeMessageInteractionCounters[] recentMessageInteractions;
	}

	@Data
	public static class MegagroupStats {
		private Api.TypeStatsDateRangeDays period;
		private Api.TypeStatsAbsValueAndPrev members;
		private Api.TypeStatsAbsValueAndPrev messages;
		private Api.TypeStatsAbsValueAndPrev viewers;
		private Api.TypeStatsAbsValueAndPrev posters;
		private Api.TypeStatsGraph growthGraph;
		private Api.TypeStatsGraph membersGraph;
		private Api.TypeStatsGraph newMembersBySourceGraph;
		private Api.TypeStatsGraph languagesGraph;
		private Api.TypeStatsGraph messagesGraph;
		private Api.TypeStatsGraph actionsGraph;
		private Api.TypeStatsGraph topHoursGraph;
		private Api.TypeStatsGraph weekdaysGraph;
		private Api.TypeStatsGroupTopPoster[] topPosters;
		private Api.TypeStatsGroupTopAdmin[] topAdmins;
		private Api.TypeStatsGroupTopInviter[] topInviters;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessageStats {
		private Api.TypeStatsGraph viewsGraph;
	}

	@Data
	public static class GetBroadcastStats {
		private Boolean dark;
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LoadAsyncGraph extends Api.TypeStatsGraph {
		private String token;
		private BigInteger x;
	}

	@Data
	public static class GetMegagroupStats {
		private Boolean dark;
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class GetMessagePublicForwards {
		private Api.TypeInputChannel channel;
		private int msgId;
		private int offsetRate;
		private Api.TypeInputPeer offsetPeer;
		private int offsetId;
		private int limit;
	}

	@Data
	public static class GetMessageStats {
		private Boolean dark;
		private Api.TypeInputChannel channel;
		private int msgId;
	}
}