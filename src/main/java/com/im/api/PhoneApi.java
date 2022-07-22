package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class PhoneApi {

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class PhoneCall extends Api.TypePhoneCall {
		private final Long constructorId = 3968000320L;
		private final long subclassOfId = 3565878863L;
		private final Boolean isFunction = false;

		private Api.TypePhoneCall phoneCall;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GroupCall extends Api.TypeGroupCall {
		private final Long constructorId = 2658302637L;
		private final long subclassOfId = 809572030L;
		private final Boolean isFunction = false;

		private Api.TypeGroupCall call;
		private String participantsNextOffset;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
		private Api.TypeGroupCallParticipant[] participants;
	}

	@Data
	public static class GroupParticipants {
		private final Long constructorId = 4101460406L;
		private final long subclassOfId = 1926431988L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeChat[] chats;
		private String nextOffset;
		private int version;
		private Api.TypeUser[] users;
		private Api.TypeGroupCallParticipant[] participants;
	}

	@Data
	public static class JoinAsPeers {
		private final Long constructorId = 2951045695L;
		private final long subclassOfId = 3031920891L;
		private final Boolean isFunction = false;

		private Api.TypePeer[] peers;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ExportedGroupCallInvite {
		private final Long constructorId = 541839704L;
		private final long subclassOfId = 993787535L;
		private final Boolean isFunction = false;

		private String link;
	}

	@Data
	public static class GroupCallStreamChannels {
		private final Long constructorId = 3504636594L;
		private final long subclassOfId = 2438448612L;
		private final Boolean isFunction = false;

		private Api.TypeGroupCallStreamChannel[] channels;
	}

	@Data
	public static class GroupCallStreamRtmpUrl {
		private final Long constructorId = 767505458L;
		private final long subclassOfId = 3522500043L;
		private final Boolean isFunction = false;

		private String url;
		private String key;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetCallConfig extends Api.TypeDataJSON {
		private final Long constructorId = 1430593449L;
		private final long subclassOfId = 2902676200L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RequestCall extends Api.TypePhoneCall {
		private final Long constructorId = 1124046573L;
		private final long subclassOfId = 3565878863L;
		private final Boolean isFunction = true;

		private byte gAHash;
		private int randomId;
		private Api.TypePhoneCallProtocol protocol;
		private Boolean video;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AcceptCall extends Api.TypePhoneCall {
		private final Long constructorId = 1003664544L;
		private final long subclassOfId = 3565878863L;
		private final Boolean isFunction = true;

		private Api.TypePhoneCallProtocol protocol;
		private Api.TypeInputPhoneCall peer;
		private byte gB;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ConfirmCall extends Api.TypePhoneCall {
		private final Long constructorId = 788404002L;
		private final long subclassOfId = 3565878863L;
		private final Boolean isFunction = true;

		private Api.TypePhoneCallProtocol protocol;
		private Api.TypeInputPhoneCall peer;
		private BigInteger keyFingerprint;
		private byte gA;
	}

	@Data
	public static class ReceivedCall {
		private final Long constructorId = 399855457L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPhoneCall peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DiscardCall extends Api.TypeUpdates {
		private final Long constructorId = 2999697856L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private int duration;
		private Api.TypePhoneCallDiscardReason reason;
		private Api.TypeInputPhoneCall peer;
		private BigInteger connectionId;
		private Boolean video;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SetCallRating extends Api.TypeUpdates {
		private final Long constructorId = 1508562471L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPhoneCall peer;
		private int rating;
		private String comment;
		private Boolean userInitiative;
	}

	@Data
	public static class SaveCallDebug {
		private final Long constructorId = 662363518L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeDataJSON debug;
		private Api.TypeInputPhoneCall peer;
	}

	@Data
	public static class SendSignalingData {
		private final Long constructorId = 4286223235L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private byte data;
		private Api.TypeInputPhoneCall peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class CreateGroupCall extends Api.TypeUpdates {
		private final Long constructorId = 1221445336L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private int randomId;
		private Api.TypeInputPeer peer;
		private int scheduleDate;
		private String title;
		private Boolean rtmpStream;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class JoinGroupCall extends Api.TypeUpdates {
		private final Long constructorId = 2972909435L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private Api.TypeInputPeer joinAs;
		private String inviteHash;
		private Boolean videoStopped;
		private Api.TypeDataJSON params;
		private Boolean muted;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class LeaveGroupCall extends Api.TypeUpdates {
		private final Long constructorId = 1342404601L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private int source;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class InviteToGroupCall extends Api.TypeUpdates {
		private final Long constructorId = 2067345760L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private Api.TypeInputUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DiscardGroupCall extends Api.TypeUpdates {
		private final Long constructorId = 2054648117L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleGroupCallSettings extends Api.TypeUpdates {
		private final Long constructorId = 1958458429L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private Boolean resetInviteHash;
		private Boolean joinMuted;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetGroupCall extends Api.TypeGroupCall {
		private final Long constructorId = 68699611L;
		private final long subclassOfId = 809572030L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private int limit;
	}

	@Data
	public static class GetGroupParticipants {
		private final Long constructorId = 3310934187L;
		private final long subclassOfId = 1926431988L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private int[] sources;
		private String offset;
		private int limit;
		private Api.TypeInputPeer[] ids;
	}

	@Data
	public static class CheckGroupCall {
		private final Long constructorId = 3046963575L;
		private final long subclassOfId = 1344696591L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private int[] sources;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleGroupCallRecord extends Api.TypeUpdates {
		private final Long constructorId = 4045981448L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private Boolean start;
		private Boolean videoPortrait;
		private Boolean video;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditGroupCallParticipant extends Api.TypeUpdates {
		private final Long constructorId = 2770811583L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private int volume;
		private Boolean raiseHand;
		private Boolean videoStopped;
		private Boolean videoPaused;
		private Boolean presentationPaused;
		private Boolean muted;
		private Api.TypeInputPeer participant;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditGroupCallTitle extends Api.TypeUpdates {
		private final Long constructorId = 480685066L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private String title;
	}

	@Data
	public static class GetGroupCallJoinAs {
		private final Long constructorId = 4017889594L;
		private final long subclassOfId = 3031920891L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class ExportGroupCallInvite {
		private final Long constructorId = 3869926527L;
		private final long subclassOfId = 993787535L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private Boolean canSelfUnmute;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleGroupCallStartSubscription extends Api.TypeUpdates {
		private final Long constructorId = 563885286L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private Boolean subscribed;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class StartScheduledGroupCall extends Api.TypeUpdates {
		private final Long constructorId = 1451287362L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
	}

	@Data
	public static class SaveDefaultGroupCallJoinAs {
		private final Long constructorId = 1465786252L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer joinAs;
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class JoinGroupCallPresentation extends Api.TypeUpdates {
		private final Long constructorId = 3421137860L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
		private Api.TypeDataJSON params;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class LeaveGroupCallPresentation extends Api.TypeUpdates {
		private final Long constructorId = 475058500L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
	}

	@Data
	public static class GetGroupCallStreamChannels {
		private final Long constructorId = 447879488L;
		private final long subclassOfId = 2438448612L;
		private final Boolean isFunction = true;

		private Api.TypeInputGroupCall call;
	}

	@Data
	public static class GetGroupCallStreamRtmpUrl {
		private final Long constructorId = 3736316863L;
		private final long subclassOfId = 3522500043L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Boolean revoke;
	}

	@Data
	public static class SaveCallLog {
		private final Long constructorId = 1092913030L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputFile file;
		private Api.TypeInputPhoneCall peer;
	}
}
