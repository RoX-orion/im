package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class PhoneApi {

	public static class TypePhoneCall {}
	public static class TypeGroupCall {}
	public static class TypeGroupParticipants {}
	public static class TypeJoinAsPeers {}
	public static class TypeExportedGroupCallInvite {}
	public static class TypeGroupCallStreamChannels {}
	public static class TypeGroupCallStreamRtmpUrl {}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class PhoneCall extends Api.TypePhoneCall {
		private Api.TypePhoneCall phoneCall;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GroupCall extends Api.TypeGroupCall {
		private Api.TypeGroupCall call;
		private String participantsNextOffset;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
		private Api.TypeGroupCallParticipant[] participants;
	}

	@Data
	public static class GroupParticipants {
		private int count;
		private Api.TypeChat[] chats;
		private String nextOffset;
		private int version;
		private Api.TypeUser[] users;
		private Api.TypeGroupCallParticipant[] participants;
	}

	@Data
	public static class JoinAsPeers {
		private Api.TypePeer[] peers;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ExportedGroupCallInvite {
		private String link;
	}

	@Data
	public static class GroupCallStreamChannels {
		private Api.TypeGroupCallStreamChannel[] channels;
	}

	@Data
	public static class GroupCallStreamRtmpUrl {
		private String url;
		private String key;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetCallConfig extends Api.TypeDataJSON {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestCall extends Api.TypePhoneCall {
		private byte gAHash;
		private int randomId;
		private Api.TypePhoneCallProtocol protocol;
		private Boolean video;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptCall extends Api.TypePhoneCall {
		private Api.TypePhoneCallProtocol protocol;
		private Api.TypeInputPhoneCall peer;
		private byte gB;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ConfirmCall extends Api.TypePhoneCall {
		private Api.TypePhoneCallProtocol protocol;
		private Api.TypeInputPhoneCall peer;
		private BigInteger keyFingerprint;
		private byte gA;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReceivedCall extends Api.TypeBool {
		private Api.TypeInputPhoneCall peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DiscardCall extends Api.TypeUpdates {
		private int duration;
		private Api.TypePhoneCallDiscardReason reason;
		private Api.TypeInputPhoneCall peer;
		private BigInteger connectionId;
		private Boolean video;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetCallRating extends Api.TypeUpdates {
		private Api.TypeInputPhoneCall peer;
		private int rating;
		private String comment;
		private Boolean userInitiative;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveCallDebug extends Api.TypeBool {
		private Api.TypeDataJSON debug;
		private Api.TypeInputPhoneCall peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendSignalingData extends Api.TypeBool {
		private byte data;
		private Api.TypeInputPhoneCall peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CreateGroupCall extends Api.TypeUpdates {
		private int randomId;
		private Api.TypeInputPeer peer;
		private int scheduleDate;
		private String title;
		private Boolean rtmpStream;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class JoinGroupCall extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private Api.TypeInputPeer joinAs;
		private String inviteHash;
		private Boolean videoStopped;
		private Api.TypeDataJSON params;
		private Boolean muted;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class LeaveGroupCall extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private int source;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class InviteToGroupCall extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private Api.TypeInputUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DiscardGroupCall extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleGroupCallSettings extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private Boolean resetInviteHash;
		private Boolean joinMuted;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetGroupCall extends Api.TypeGroupCall {
		private Api.TypeInputGroupCall call;
		private int limit;
	}

	@Data
	public static class GetGroupParticipants {
		private Api.TypeInputGroupCall call;
		private int[] sources;
		private String offset;
		private int limit;
		private Api.TypeInputPeer[] ids;
	}

	@Data
	public static class CheckGroupCall {
		private Api.TypeInputGroupCall call;
		private int[] sources;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleGroupCallRecord extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private Boolean start;
		private Boolean videoPortrait;
		private Boolean video;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditGroupCallParticipant extends Api.TypeUpdates {
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
	@EqualsAndHashCode(callSuper=false)
	public static class EditGroupCallTitle extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private String title;
	}

	@Data
	public static class GetGroupCallJoinAs {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class ExportGroupCallInvite {
		private Api.TypeInputGroupCall call;
		private Boolean canSelfUnmute;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleGroupCallStartSubscription extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private Boolean subscribed;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StartScheduledGroupCall extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveDefaultGroupCallJoinAs extends Api.TypeBool {
		private Api.TypeInputPeer joinAs;
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class JoinGroupCallPresentation extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
		private Api.TypeDataJSON params;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class LeaveGroupCallPresentation extends Api.TypeUpdates {
		private Api.TypeInputGroupCall call;
	}

	@Data
	public static class GetGroupCallStreamChannels {
		private Api.TypeInputGroupCall call;
	}

	@Data
	public static class GetGroupCallStreamRtmpUrl {
		private Api.TypeInputPeer peer;
		private Boolean revoke;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveCallLog extends Api.TypeBool {
		private Api.TypeInputFile file;
		private Api.TypeInputPhoneCall peer;
	}
}