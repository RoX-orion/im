package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class ChannelsApi {

	public static class TypeChannelParticipants {}
	public static class TypeChannelParticipant {}
	public static class TypeAdminLogResults {}
	public static class TypeSendAsPeers {}

	@Data
	public static class ChannelParticipants {
		private int count;
		private Api.TypeChannelParticipant[] participants;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChannelParticipantsNotModified {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChannelParticipant extends Api.TypeChannelParticipant {
		private Api.TypeChannelParticipant participant;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AdminLogResults {
		private Api.TypeChannelAdminLogEvent[] events;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SendAsPeers {
		private Api.TypeSendAsPeer[] peers;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ReadHistory {
		private Api.TypeInputChannel channel;
		private int maxId;
	}

	@Data
	public static class DeleteMessages {
		private Api.TypeInputChannel channel;
		private int[] id;
	}

	@Data
	public static class ReportSpam {
		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
		private int[] id;
	}

	@Data
	public static class GetMessages {
		private Api.TypeInputChannel channel;
		private Api.TypeInputMessage[] id;
	}

	@Data
	public static class GetParticipants {
		private Api.TypeInputChannel channel;
		private Api.TypeChannelParticipantsFilter filter;
		private int offset;
		private int limit;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetParticipant extends Api.TypeChannelParticipant {
		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
	}

	@Data
	public static class GetChannels {
		private Api.TypeInputChannel[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetFullChannel extends Api.TypeChatFull {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CreateChannel extends Api.TypeUpdates {
		private Boolean broadcast;
		private Boolean megagroup;
		private Boolean forImport;
		private String title;
		private String about;
		private Api.TypeInputGeoPoint geoPoint;
		private String address;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EditAdmin extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputUser userId;
		private Api.TypeChatAdminRights adminRights;
		private String rank;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EditTitle extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EditPhoto extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputChatPhoto photo;
	}

	@Data
	public static class CheckUsername {
		private Api.TypeInputChannel channel;
		private String username;
	}

	@Data
	public static class UpdateUsername {
		private Api.TypeInputChannel channel;
		private String username;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class JoinChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class LeaveChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class InviteToChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DeleteChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ExportMessageLink extends Api.TypeExportedMessageLink {
		private Boolean grouped;
		private Boolean thread;
		private Api.TypeInputChannel channel;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ToggleSignatures extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	public static class GetAdminedPublicChannels {
		private Boolean byLocation;
		private Boolean checkLimit;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EditBanned extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
		private Api.TypeChatBannedRights bannedRights;
	}

	@Data
	public static class GetAdminLog {
		private Api.TypeInputChannel channel;
		private String q;
		private Api.TypeChannelAdminLogEventsFilter eventsFilter;
		private Api.TypeInputUser[] admins;
		private BigInteger maxId;
		private BigInteger minId;
		private int limit;
	}

	@Data
	public static class SetStickers {
		private Api.TypeInputChannel channel;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	public static class ReadMessageContents {
		private Api.TypeInputChannel channel;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DeleteHistory extends Api.TypeUpdates {
		private Boolean forEveryone;
		private Api.TypeInputChannel channel;
		private int maxId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class TogglePreHistoryHidden extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	public static class GetLeftChannels {
		private int offset;
	}

	@Data
	public static class GetGroupsForDiscussion {
	}

	@Data
	public static class SetDiscussionGroup {
		private Api.TypeInputChannel broadcast;
		private Api.TypeInputChannel group;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EditCreator extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputUser userId;
		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	public static class EditLocation {
		private Api.TypeInputChannel channel;
		private Api.TypeInputGeoPoint geoPoint;
		private String address;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ToggleSlowMode extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private int seconds;
	}

	@Data
	public static class GetInactiveChannels {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ConvertToGigagroup extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class ViewSponsoredMessage {
		private Api.TypeInputChannel channel;
		private byte[] randomId;
	}

	@Data
	public static class GetSponsoredMessages {
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class GetSendAs {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class DeleteParticipantHistory {
		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ToggleJoinToSend extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ToggleJoinRequest extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	public static class ReorderUsernames {
		private Api.TypeInputChannel channel;
		private String[] order;
	}

	@Data
	public static class ToggleUsername {
		private Api.TypeInputChannel channel;
		private String username;
		private Boolean active;
	}

	@Data
	public static class DeactivateAllUsernames {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ToggleForum extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CreateForumTopic extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private String title;
		private int iconColor;
		private BigInteger iconEmojiId;
		private BigInteger randomId;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	public static class GetForumTopics {
		private Api.TypeInputChannel channel;
		private String q;
		private int offsetDate;
		private int offsetId;
		private int offsetTopic;
		private int limit;
	}

	@Data
	public static class GetForumTopicsByID {
		private Api.TypeInputChannel channel;
		private int[] topics;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EditForumTopic extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private int topicId;
		private String title;
		private BigInteger iconEmojiId;
		private Boolean closed;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class UpdatePinnedForumTopic extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private int topicId;
		private Boolean pinned;
	}

	@Data
	public static class DeleteTopicHistory {
		private Api.TypeInputChannel channel;
		private int topMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ReorderPinnedForumTopics extends Api.TypeUpdates {
		private Boolean force;
		private Api.TypeInputChannel channel;
		private int[] order;
	}
}