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
		private final Long constructorId = 3187114900L;
		private final long subclassOfId = 2146587688L;
		private final Boolean isFunction = false;

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
		private final Long constructorId = 4018141462L;
		private final long subclassOfId = 1532608141L;
		private final Boolean isFunction = false;

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
		private final Long constructorId = 2308567701L;
		private final long subclassOfId = 2516886306L;
		private final Boolean isFunction = false;

		private Api.TypeStatsGraph viewsGraph;
	}

	@Data
	public static class GetBroadcastStats {
		private final Long constructorId = 2873246746L;
		private final long subclassOfId = 2146587688L;
		private final Boolean isFunction = true;

		private Boolean dark;
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class LoadAsyncGraph extends Api.TypeStatsGraph {
		private final Long constructorId = 1646092192L;
		private final long subclassOfId = 2609918291L;
		private final Boolean isFunction = true;

		private BigInteger x;
		private String token;
	}

	@Data
	public static class GetMegagroupStats {
		private final Long constructorId = 3705636359L;
		private final long subclassOfId = 1532608141L;
		private final Boolean isFunction = true;

		private Boolean dark;
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class GetMessagePublicForwards {
		private final Long constructorId = 1445996571L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private int offsetRate;
		private Api.TypeInputPeer offsetPeer;
		private Api.TypeInputChannel channel;
		private int limit;
		private int msgId;
		private int offsetId;
	}

	@Data
	public static class GetMessageStats {
		private final Long constructorId = 3068175349L;
		private final long subclassOfId = 2516886306L;
		private final Boolean isFunction = true;

		private Boolean dark;
		private Api.TypeInputChannel channel;
		private int msgId;
	}
}