package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class ContactsApi {

	public static class TypeContacts {}
	public static class TypeImportedContacts {}
	public static class TypeBlocked {}
	public static class TypeFound {}
	public static class TypeResolvedPeer {}
	public static class TypeTopPeers {}

	@Data
	public static class ContactsNotModified {
	}

	@Data
	public static class Contacts {
		private int savedCount;
		private Api.TypeContact[] contacts;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ImportedContacts {
		private Api.TypePopularContact[] popularInvites;
		private Api.TypeImportedContact[] imported;
		private Api.TypeUser[] users;
		private BigInteger[] retryContacts;
	}

	@Data
	public static class Blocked {
		private Api.TypePeerBlocked[] blocked;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class BlockedSlice {
		private Api.TypePeerBlocked[] blocked;
		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class Found {
		private Api.TypeChat[] chats;
		private Api.TypePeer[] results;
		private Api.TypeUser[] users;
		private Api.TypePeer[] myResults;
	}

	@Data
	public static class ResolvedPeer {
		private Api.TypePeer peer;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class TopPeersNotModified {
	}

	@Data
	public static class TopPeers {
		private Api.TypeChat[] chats;
		private Api.TypeTopPeerCategoryPeers[] categories;
		private Api.TypeUser[] users;
	}

	@Data
	public static class TopPeersDisabled {
	}

	@Data
	public static class GetContactIDs {
		private BigInteger hash;
	}

	@Data
	public static class GetStatuses {
	}

	@Data
	public static class GetContacts {
		private BigInteger hash;
	}

	@Data
	public static class ImportContacts {
		private Api.TypeInputContact[] contacts;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteContacts extends Api.TypeUpdates {
		private Api.TypeInputUser[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteByPhones extends Api.TypeBool {
		private String[] phones;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class Block extends Api.TypeBool {
		private Api.TypeInputPeer id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class Unblock extends Api.TypeBool {
		private Api.TypeInputPeer id;
	}

	@Data
	public static class GetBlocked {
		private int offset;
		private int limit;
	}

	@Data
	public static class Search {
		private String q;
		private int limit;
	}

	@Data
	public static class ResolveUsername {
		private String username;
	}

	@Data
	public static class GetTopPeers {
		private Boolean phoneCalls;
		private Boolean botsPm;
		private Boolean channels;
		private int offset;
		private Boolean botsInline;
		private Boolean forwardChats;
		private Boolean forwardUsers;
		private int limit;
		private Boolean groups;
		private Boolean correspondents;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetTopPeerRating extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private Api.TypeTopPeerCategory category;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetSaved extends Api.TypeBool {
	}

	@Data
	public static class GetSaved {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleTopPeers extends Api.TypeBool {
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AddContact extends Api.TypeUpdates {
		private Boolean addPhonePrivacyException;
		private String firstName;
		private String lastName;
		private String phone;
		private Api.TypeInputUser id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptContact extends Api.TypeUpdates {
		private Api.TypeInputUser id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetLocated extends Api.TypeUpdates {
		private int selfExpires;
		private Boolean background;
		private Api.TypeInputGeoPoint geoPoint;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class BlockFromReplies extends Api.TypeUpdates {
		private Boolean deleteHistory;
		private Boolean reportSpam;
		private int msgId;
		private Boolean deleteMessage;
	}

	@Data
	public static class ResolvePhone {
		private String phone;
	}
}