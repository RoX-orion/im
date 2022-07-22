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
		private final Long constructorId = 3075189202L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class Contacts {
		private final Long constructorId = 3941105218L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int savedCount;
		private Api.TypeContact[] contacts;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ImportedContacts {
		private final Long constructorId = 2010127419L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypePopularContact[] popularInvites;
		private Api.TypeImportedContact[] imported;
		private Api.TypeUser[] users;
		private BigInteger[] retryContacts;
	}

	@Data
	public static class Blocked {
		private final Long constructorId = 182326673L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypePeerBlocked[] blocked;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class BlockedSlice {
		private final Long constructorId = 3781575060L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypePeerBlocked[] blocked;
		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class Found {
		private final Long constructorId = 3004386717L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypePeer[] results;
		private Api.TypeUser[] users;
		private Api.TypePeer[] myResults;
	}

	@Data
	public static class ResolvedPeer {
		private final Long constructorId = 2131196633L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypePeer peer;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class TopPeersNotModified {
		private final Long constructorId = 3727060725L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class TopPeers {
		private final Long constructorId = 1891070632L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeTopPeerCategoryPeers[] categories;
		private Api.TypeUser[] users;
	}

	@Data
	public static class TopPeersDisabled {
		private final Long constructorId = 3039597469L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class GetContactIDs {
		private final Long constructorId = 2061264541L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class GetStatuses {
		private final Long constructorId = 3299038190L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetContacts {
		private final Long constructorId = 1574346258L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class ImportContacts {
		private final Long constructorId = 746589157L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputContact[] contacts;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DeleteContacts extends Api.TypeUpdates {
		private final Long constructorId = 157945344L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputUser[] id;
	}

	@Data
	public static class DeleteByPhones {
		private final Long constructorId = 269745566L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String[] phones;
	}

	@Data
	public static class Block {
		private final Long constructorId = 1758204945L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer id;
	}

	@Data
	public static class Unblock {
		private final Long constructorId = 3198573904L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer id;
	}

	@Data
	public static class GetBlocked {
		private final Long constructorId = 4118557967L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private int offset;
		private int limit;
	}

	@Data
	public static class Search {
		private final Long constructorId = 301470424L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String q;
		private int limit;
	}

	@Data
	public static class ResolveUsername {
		private final Long constructorId = 4181511075L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String username;
	}

	@Data
	public static class GetTopPeers {
		private final Long constructorId = 2536798390L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

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
	public static class ResetTopPeerRating {
		private final Long constructorId = 451113900L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeTopPeerCategory category;
	}

	@Data
	public static class ResetSaved {
		private final Long constructorId = 2274703345L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetSaved {
		private final Long constructorId = 2196890527L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	public static class ToggleTopPeers {
		private final Long constructorId = 2232729050L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AddContact extends Api.TypeUpdates {
		private final Long constructorId = 3908330448L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Boolean addPhonePrivacyException;
		private String firstName;
		private String lastName;
		private String phone;
		private Api.TypeInputUser id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AcceptContact extends Api.TypeUpdates {
		private final Long constructorId = 4164002319L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputUser id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetLocated extends Api.TypeUpdates {
		private final Long constructorId = 3544759364L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private int selfExpires;
		private Boolean background;
		private Api.TypeInputGeoPoint geoPoint;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class BlockFromReplies extends Api.TypeUpdates {
		private final Long constructorId = 698914348L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Boolean deleteHistory;
		private Boolean reportSpam;
		private int msgId;
		private Boolean deleteMessage;
	}

	@Data
	public static class ResolvePhone {
		private final Long constructorId = 2331591492L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String phone;
	}
}