package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class ChannelsApi {

	@Data
	public static class ChannelParticipants {
		private final Long constructorId = 2595290799L;
		private final long subclassOfId = 3859443300L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
		private Api.TypeChannelParticipant[] participants;
	}

	@Data
	public static class ChannelParticipantsNotModified {
		private final Long constructorId = 4028055529L;
		private final long subclassOfId = 3859443300L;
		private final Boolean isFunction = false;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ChannelParticipant extends Api.TypeChannelParticipant {
		private final Long constructorId = 3753378583L;
		private final long subclassOfId = 1717048602L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeChannelParticipant participant;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AdminLogResults {
		private final Long constructorId = 3985307469L;
		private final long subclassOfId = 1374713532L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeChannelAdminLogEvent[] events;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SendAsPeers {
		private final Long constructorId = 2203504041L;
		private final long subclassOfId = 952864033L;
		private final Boolean isFunction = false;

		private Api.TypePeer[] peers;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ReadHistory {
		private final Long constructorId = 3423619383L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private int maxId;
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class DeleteMessages {
		private final Long constructorId = 2227305806L;
		private final long subclassOfId = 3469983854L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private int[] id;
	}

	@Data
	public static class ReportSpam {
		private final Long constructorId = 4098523925L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private int[] id;
		private Api.TypeInputPeer participant;
	}

	@Data
	public static class GetMessages {
		private final Long constructorId = 2911672867L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Api.TypeInputMessage[] id;
	}

	@Data
	public static class GetParticipants {
		private final Long constructorId = 2010044880L;
		private final long subclassOfId = 3859443300L;
		private final Boolean isFunction = true;

		private Api.TypeChannelParticipantsFilter filter;
		private int offset;
		private Api.TypeInputChannel channel;
		private int limit;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetParticipant extends Api.TypeChannelParticipant {
		private final Long constructorId = 2695589062L;
		private final long subclassOfId = 1717048602L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
	}

	@Data
	public static class GetChannels {
		private final Long constructorId = 176122811L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetFullChannel extends Api.TypeChatFull {
		private final Long constructorId = 141781513L;
		private final long subclassOfId = 576344329L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class CreateChannel extends Api.TypeUpdates {
		private final Long constructorId = 1029681423L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean broadcast;
		private String address;
		private String about;
		private String title;
		private Api.TypeInputGeoPoint geoPoint;
		private Boolean forImport;
		private Boolean megagroup;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditAdmin extends Api.TypeUpdates {
		private final Long constructorId = 3543959810L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private String rank;
		private Api.TypeInputUser userId;
		private Api.TypeChatAdminRights adminRights;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditTitle extends Api.TypeUpdates {
		private final Long constructorId = 1450044624L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditPhoto extends Api.TypeUpdates {
		private final Long constructorId = 4046346185L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Api.TypeInputChatPhoto photo;
	}

	@Data
	public static class CheckUsername {
		private final Long constructorId = 283557164L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private String username;
	}

	@Data
	public static class UpdateUsername {
		private final Long constructorId = 890549214L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private String username;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class JoinChannel extends Api.TypeUpdates {
		private final Long constructorId = 615851205L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class LeaveChannel extends Api.TypeUpdates {
		private final Long constructorId = 4164332181L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class InviteToChannel extends Api.TypeUpdates {
		private final Long constructorId = 429865580L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Api.TypeInputUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DeleteChannel extends Api.TypeUpdates {
		private final Long constructorId = 3222347747L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ExportMessageLink extends Api.TypeExportedMessageLink {
		private final Long constructorId = 3862932971L;
		private final long subclassOfId = 3739632844L;
		private final Boolean isFunction = true;

		private Boolean grouped;
		private Api.TypeInputChannel channel;
		private Boolean thread;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleSignatures extends Api.TypeUpdates {
		private final Long constructorId = 527021574L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	public static class GetAdminedPublicChannels {
		private final Long constructorId = 4172297903L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = true;

		private Boolean byLocation;
		private Boolean checkLimit;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditBanned extends Api.TypeUpdates {
		private final Long constructorId = 2531708289L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
		private Api.TypeChatBannedRights bannedRights;
	}

	@Data
	public static class GetAdminLog {
		private final Long constructorId = 870184064L;
		private final long subclassOfId = 1374713532L;
		private final Boolean isFunction = true;

		private String q;
		private BigInteger maxId;
		private Api.TypeChannelAdminLogEventsFilter eventsFilter;
		private Api.TypeInputChannel channel;
		private int limit;
		private BigInteger minId;
		private Api.TypeInputUser[] admins;
	}

	@Data
	public static class SetStickers {
		private final Long constructorId = 3935085817L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	public static class ReadMessageContents {
		private final Long constructorId = 3937786936L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DeleteHistory extends Api.TypeUpdates {
		private final Long constructorId = 2611648071L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private int maxId;
		private Api.TypeInputChannel channel;
		private Boolean forEveryone;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class TogglePreHistoryHidden extends Api.TypeUpdates {
		private final Long constructorId = 3938171212L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	public static class GetLeftChannels {
		private final Long constructorId = 2202135744L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = true;

		private int offset;
	}

	@Data
	public static class GetGroupsForDiscussion {
		private final Long constructorId = 4124758904L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class SetDiscussionGroup {
		private final Long constructorId = 1079520178L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel broadcast;
		private Api.TypeInputChannel group;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditCreator extends Api.TypeUpdates {
		private final Long constructorId = 2402864415L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputCheckPasswordSRP password;
		private Api.TypeInputChannel channel;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class EditLocation {
		private final Long constructorId = 1491484525L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String address;
		private Api.TypeInputChannel channel;
		private Api.TypeInputGeoPoint geoPoint;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleSlowMode extends Api.TypeUpdates {
		private final Long constructorId = 3990134512L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private int seconds;
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class GetInactiveChannels {
		private final Long constructorId = 300429806L;
		private final long subclassOfId = 2348013524L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ConvertToGigagroup extends Api.TypeUpdates {
		private final Long constructorId = 187239529L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
	}

	@Data
	public static class ViewSponsoredMessage {
		private final Long constructorId = 3199130516L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private byte randomId;
		private Api.TypeInputChannel channel;
	}

	@Data
	public static class GetSponsoredMessages {
		private final Long constructorId = 3961589695L;
		private final long subclassOfId = 2134993376L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
	}

	@Data
	public static class GetSendAs {
		private final Long constructorId = 231174382L;
		private final long subclassOfId = 952864033L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class DeleteParticipantHistory {
		private final Long constructorId = 913655003L;
		private final long subclassOfId = 743031062L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Api.TypeInputPeer participant;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleJoinToSend extends Api.TypeUpdates {
		private final Long constructorId = 3838547328L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleJoinRequest extends Api.TypeUpdates {
		private final Long constructorId = 1277789622L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputChannel channel;
		private Boolean enabled;
	}
}
