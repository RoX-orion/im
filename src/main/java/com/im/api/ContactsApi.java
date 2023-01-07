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
		private Api.TypeContact[] contacts;
		private int savedCount;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ImportedContacts {
		private Api.TypeImportedContact[] imported;
		private Api.TypePopularContact[] popularInvites;
		private BigInteger[] retryContacts;
		private Api.TypeUser[] users;
	}

	@Data
	public static class Blocked {
		private Api.TypePeerBlocked[] blocked;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class BlockedSlice {
		private int count;
		private Api.TypePeerBlocked[] blocked;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class Found {
		private Api.TypePeer[] myResults;
		private Api.TypePeer[] results;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
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
		private Api.TypeTopPeerCategoryPeers[] categories;
		private Api.TypeChat[] chats;
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
	@EqualsAndHashCode(callSuper = true)
	public static class DeleteContacts extends Api.TypeUpdates {
		private Api.TypeInputUser[] id;
	}

	@Data
	public static class DeleteByPhones {
		private String[] phones;
	}

	@Data
	public static class Block {
		private Api.TypeInputPeer id;
	}

	@Data
	public static class Unblock {
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
		private Boolean correspondents;
		private Boolean botsPm;
		private Boolean botsInline;
		private Boolean phoneCalls;
		private Boolean forwardUsers;
		private Boolean forwardChats;
		private Boolean groups;
		private Boolean channels;
		private int offset;
		private int limit;
		private BigInteger hash;
	}

	@Data
	public static class ResetTopPeerRating {
		private Api.TypeTopPeerCategory category;
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class ResetSaved {
	}

	@Data
	public static class GetSaved {
	}

	@Data
	public static class ToggleTopPeers {
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AddContact extends Api.TypeUpdates {
		private Boolean addPhonePrivacyException;
		private Api.TypeInputUser id;
		private String firstName;
		private String lastName;
		private String phone;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AcceptContact extends Api.TypeUpdates {
		private Api.TypeInputUser id;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetLocated extends Api.TypeUpdates {
		private Boolean background;
		private Api.TypeInputGeoPoint geoPoint;
		private int selfExpires;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class BlockFromReplies extends Api.TypeUpdates {
		private Boolean deleteMessage;
		private Boolean deleteHistory;
		private Boolean reportSpam;
		private int msgId;
	}

	@Data
	public static class ResolvePhone {
		private String phone;
	}
}