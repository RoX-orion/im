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
		private Api.TypeMessageInteractionCounters[] recentMessageInteractions;
		private Api.TypeStatsDateRangeDays period;
		private Api.TypeStatsGraph followersGraph;
		private Api.TypeStatsGraph muteGraph;
		private Api.TypeStatsGraph languagesGraph;
		private Api.TypeStatsGraph topHoursGraph;
		private Api.TypeStatsGraph ivInteractionsGraph;
		private Api.TypeStatsAbsValueAndPrev sharesPerPost;
		private Api.TypeStatsGraph interactionsGraph;
		private Api.TypeStatsGraph viewsBySourceGraph;
		private Api.TypeStatsAbsValueAndPrev followers;
		private Api.TypeStatsAbsValueAndPrev viewsPerPost;
		private Api.TypeStatsPercentValue enabledNotifications;
		private Api.TypeStatsGraph newFollowersBySourceGraph;
		private Api.TypeStatsGraph growthGraph;
	}

	@Data
	public static class MegagroupStats {
		private Api.TypeStatsDateRangeDays period;
		private Api.TypeStatsGraph languagesGraph;
		private Api.TypeStatsGraph topHoursGraph;
		private Api.TypeStatsGraph weekdaysGraph;
		private Api.TypeStatsGraph newMembersBySourceGraph;
		private Api.TypeStatsGroupTopAdmin[] topAdmins;
		private Api.TypeStatsAbsValueAndPrev posters;
		private Api.TypeUser[] users;
		private Api.TypeStatsGroupTopPoster[] topPosters;
		private Api.TypeStatsAbsValueAndPrev viewers;
		private Api.TypeStatsGraph messagesGraph;
		private Api.TypeStatsGraph actionsGraph;
		private Api.TypeStatsAbsValueAndPrev members;
		private Api.TypeStatsGraph membersGraph;
		private Api.TypeStatsAbsValueAndPrev messages;
		private Api.TypeStatsGroupTopInviter[] topInviters;
		private Api.TypeStatsGraph growthGraph;
	}

	@Data
	public static class MessageStats {
		private Api.TypeStatsGraph viewsGraph;
	}

	@Data
	public static class GetBroadcastStats {
		private Api.True dark;
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class LoadAsyncGraph extends Api.TypeStatsGraph {
		private BigInteger x;
		private String token;
	}

	@Data
	public static class GetMegagroupStats {
		private Api.True dark;
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class GetMessagePublicForwards {
		private int offsetRate;
		private Api.TypeInputPeer offsetPeer;
		private Api.TypeInputChannel channel;
		private int limit;
		private int msgId;
		private int offsetId;
	}

	@Data
	public static class GetMessageStats {
		private Api.True dark;
		private Api.TypeInputChannel channel;
		private int msgId;
	}
}