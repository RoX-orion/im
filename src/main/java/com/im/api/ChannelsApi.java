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
	@EqualsAndHashCode(callSuper=false)
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
		private Api.TypePeer[] peers;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadHistory extends Api.TypeBool {
		private Api.TypeInputChannel channel;
		private int maxId;
	}

	@Data
	public static class DeleteMessages {
		private Api.TypeInputChannel channel;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReportSpam extends Api.TypeBool {
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
	@EqualsAndHashCode(callSuper=false)
	public static class GetParticipant extends Api.TypeChannelParticipant {
		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
	}

	@Data
	public static class GetChannels {
		private Api.TypeInputChannel[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetFullChannel extends Api.TypeChatFull {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CreateChannel extends Api.TypeUpdates {
		private Api.True broadcast;
		private Api.True megagroup;
		private Api.True forImport;
		private String title;
		private String about;
		private Api.TypeInputGeoPoint geoPoint;
		private String address;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditAdmin extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputUser userId;
		private Api.TypeChatAdminRights adminRights;
		private String rank;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditTitle extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditPhoto extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputChatPhoto photo;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CheckUsername extends Api.TypeBool {
		private Api.TypeInputChannel channel;
		private String username;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateUsername extends Api.TypeBool {
		private Api.TypeInputChannel channel;
		private String username;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class JoinChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class LeaveChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class InviteToChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteChannel extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ExportMessageLink extends Api.TypeExportedMessageLink {
		private Api.True grouped;
		private Api.True thread;
		private Api.TypeInputChannel channel;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleSignatures extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	public static class GetAdminedPublicChannels {
		private Api.True byLocation;
		private Api.True checkLimit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
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
	@EqualsAndHashCode(callSuper=false)
	public static class SetStickers extends Api.TypeBool {
		private Api.TypeInputChannel channel;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadMessageContents extends Api.TypeBool {
		private Api.TypeInputChannel channel;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteHistory extends Api.TypeUpdates {
		private Api.True forEveryone;
		private Api.TypeInputChannel channel;
		private int maxId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
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
	@EqualsAndHashCode(callSuper=false)
	public static class SetDiscussionGroup extends Api.TypeBool {
		private Api.TypeInputChannel broadcast;
		private Api.TypeInputChannel group;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditCreator extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Api.TypeInputUser userId;
		private Api.TypeInputCheckPasswordSRP password;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditLocation extends Api.TypeBool {
		private Api.TypeInputChannel channel;
		private Api.TypeInputGeoPoint geoPoint;
		private String address;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleSlowMode extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private int seconds;
	}

	@Data
	public static class GetInactiveChannels {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ConvertToGigagroup extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ViewSponsoredMessage extends Api.TypeBool {
		private Api.TypeInputChannel channel;
		private byte randomId;
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
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleJoinToSend extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleJoinRequest extends Api.TypeUpdates {
		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}
}