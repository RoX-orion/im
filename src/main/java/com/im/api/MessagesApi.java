package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class MessagesApi {

	public static class TypeDialogs {}
	public static class TypeMessages {}
	public static class TypeChats {}
	public static class TypeChatFull {}
	public static class TypeAffectedHistory {}
	public static class TypeDhConfig {}
	public static class TypeSentEncryptedMessage {}
	public static class TypeStickers {}
	public static class TypeAllStickers {}
	public static class TypeAffectedMessages {}
	public static class TypeStickerSet {}
	public static class TypeSavedGifs {}
	public static class TypeBotResults {}
	public static class TypeBotCallbackAnswer {}
	public static class TypeMessageEditData {}
	public static class TypePeerDialogs {}
	public static class TypeFeaturedStickers {}
	public static class TypeRecentStickers {}
	public static class TypeArchivedStickers {}
	public static class TypeStickerSetInstallResult {}
	public static class TypeHighScores {}
	public static class TypeFavedStickers {}
	public static class TypeFoundStickerSets {}
	public static class TypeSearchCounter {}
	public static class TypeInactiveChats {}
	public static class TypeVotesList {}
	public static class TypeMessageViews {}
	public static class TypeDiscussionMessage {}
	public static class TypeHistoryImport {}
	public static class TypeHistoryImportParsed {}
	public static class TypeAffectedFoundMessages {}
	public static class TypeExportedChatInvites {}
	public static class TypeExportedChatInvite {}
	public static class TypeChatInviteImporters {}
	public static class TypeChatAdminsWithInvites {}
	public static class TypeCheckedHistoryImportPeer {}
	public static class TypeSponsoredMessages {}
	public static class TypeSearchResultsCalendar {}
	public static class TypeSearchResultsPositions {}
	public static class TypePeerSettings {}
	public static class TypeMessageReactionsList {}
	public static class TypeAvailableReactions {}
	public static class TypeTranslatedText {}
	public static class TypeTranscribedAudio {}

	@Data
	public static class Dialogs {
		private final Long constructorId = 364538944L;
		private final long subclassOfId = 236671726L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private Api.TypeDialog[] dialogs;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DialogsSlice {
		private final Long constructorId = 1910543603L;
		private final long subclassOfId = 236671726L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private Api.TypeDialog[] dialogs;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DialogsNotModified {
		private final Long constructorId = 4041467286L;
		private final long subclassOfId = 236671726L;
		private final Boolean isFunction = false;

		private int count;
	}

	@Data
	public static class Messages {
		private final Long constructorId = 2356252295L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessagesSlice {
		private final Long constructorId = 978610270L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = false;

		private Boolean inexact;
		private int offsetIdOffset;
		private int nextRate;
		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChannelMessages {
		private final Long constructorId = 1682413576L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = false;

		private Boolean inexact;
		private int offsetIdOffset;
		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private int pts;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessagesNotModified {
		private final Long constructorId = 1951620897L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = false;

		private int count;
	}

	@Data
	public static class Chats {
		private final Long constructorId = 1694474197L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
	}

	@Data
	public static class ChatsSlice {
		private final Long constructorId = 2631405892L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeChat[] chats;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ChatFull extends Api.TypeChatFull {
		private final Long constructorId = 3856126364L;
		private final long subclassOfId = 576344329L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeChatFull fullChat;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AffectedHistory {
		private final Long constructorId = 3025955281L;
		private final long subclassOfId = 743031062L;
		private final Boolean isFunction = false;

		private int offset;
		private int ptsCount;
		private int pts;
	}

	@Data
	public static class DhConfigNotModified {
		private final Long constructorId = 3236054581L;
		private final long subclassOfId = 3834178955L;
		private final Boolean isFunction = false;

		private byte random;
	}

	@Data
	public static class DhConfig {
		private final Long constructorId = 740433629L;
		private final long subclassOfId = 3834178955L;
		private final Boolean isFunction = false;

		private byte p;
		private byte random;
		private int g;
		private int version;
	}

	@Data
	public static class SentEncryptedMessage {
		private final Long constructorId = 1443858741L;
		private final long subclassOfId = 3382591056L;
		private final Boolean isFunction = false;

		private int date;
	}

	@Data
	public static class SentEncryptedFile {
		private final Long constructorId = 2492727090L;
		private final long subclassOfId = 3382591056L;
		private final Boolean isFunction = false;

		private int date;
		private Api.TypeEncryptedFile file;
	}

	@Data
	public static class StickersNotModified {
		private final Long constructorId = 4050950690L;
		private final long subclassOfId = 3611015646L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class Stickers {
		private final Long constructorId = 816245886L;
		private final long subclassOfId = 3611015646L;
		private final Boolean isFunction = false;

		private Api.TypeDocument[] stickers;
		private BigInteger hash;
	}

	@Data
	public static class AllStickersNotModified {
		private final Long constructorId = 3898999491L;
		private final long subclassOfId = 1166231593L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class AllStickers {
		private final Long constructorId = 3451637435L;
		private final long subclassOfId = 1166231593L;
		private final Boolean isFunction = false;

		private Api.TypeStickerSet[] sets;
		private BigInteger hash;
	}

	@Data
	public static class AffectedMessages {
		private final Long constructorId = 2228326789L;
		private final long subclassOfId = 3469983854L;
		private final Boolean isFunction = false;

		private int ptsCount;
		private int pts;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class StickerSet extends Api.TypeStickerSet {
		private final Long constructorId = 3054118054L;
		private final long subclassOfId = 2607827546L;
		private final Boolean isFunction = false;

		private Api.TypeStickerSet set;
		private Api.TypeDocument[] documents;
		private Api.TypeStickerPack[] packs;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class StickerSetNotModified extends Api.TypeStickerSet {
		private final Long constructorId = 3556320491L;
		private final long subclassOfId = 2607827546L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class SavedGifsNotModified {
		private final Long constructorId = 3892468898L;
		private final long subclassOfId = 2794152437L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class SavedGifs {
		private final Long constructorId = 2225089037L;
		private final long subclassOfId = 2794152437L;
		private final Boolean isFunction = false;

		private BigInteger hash;
		private Api.TypeDocument[] gifs;
	}

	@Data
	public static class BotResults {
		private final Long constructorId = 2491197512L;
		private final long subclassOfId = 1054136777L;
		private final Boolean isFunction = false;

		private Api.TypeInlineBotSwitchPM switchPm;
		private String nextOffset;
		private Api.TypeBotInlineResult[] results;
		private Boolean gallery;
		private Api.TypeUser[] users;
		private BigInteger queryId;
		private int cacheTime;
	}

	@Data
	public static class BotCallbackAnswer {
		private final Long constructorId = 911761060L;
		private final long subclassOfId = 1817039244L;
		private final Boolean isFunction = false;

		private Boolean hasUrl;
		private Boolean alert;
		private Boolean nativeUi;
		private String message;
		private String url;
		private int cacheTime;
	}

	@Data
	public static class MessageEditData {
		private final Long constructorId = 649453030L;
		private final long subclassOfId = 4215772317L;
		private final Boolean isFunction = false;

		private Boolean caption;
	}

	@Data
	public static class PeerDialogs {
		private final Long constructorId = 863093588L;
		private final long subclassOfId = 986120498L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private UpdatesApi.TypeState state;
		private Api.TypeDialog[] dialogs;
		private Api.TypeUser[] users;
	}

	@Data
	public static class FeaturedStickersNotModified {
		private final Long constructorId = 3336309862L;
		private final long subclassOfId = 638891810L;
		private final Boolean isFunction = false;

		private int count;
	}

	@Data
	public static class FeaturedStickers {
		private final Long constructorId = 3191351558L;
		private final long subclassOfId = 638891810L;
		private final Boolean isFunction = false;

		private Boolean premium;
		private Api.TypeStickerSetCovered[] sets;
		private BigInteger[] unread;
		private int count;
		private BigInteger hash;
	}

	@Data
	public static class RecentStickersNotModified {
		private final Long constructorId = 186120336L;
		private final long subclassOfId = 4151281283L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class RecentStickers {
		private final Long constructorId = 2295561302L;
		private final long subclassOfId = 4151281283L;
		private final Boolean isFunction = false;

		private Api.TypeDocument[] stickers;
		private int[] dates;
		private Api.TypeStickerPack[] packs;
		private BigInteger hash;
	}

	@Data
	public static class ArchivedStickers {
		private final Long constructorId = 1338747336L;
		private final long subclassOfId = 1922488177L;
		private final Boolean isFunction = false;

		private Api.TypeStickerSetCovered[] sets;
		private int count;
	}

	@Data
	public static class StickerSetInstallResultSuccess {
		private final Long constructorId = 946083368L;
		private final long subclassOfId = 1741373416L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class StickerSetInstallResultArchive {
		private final Long constructorId = 904138920L;
		private final long subclassOfId = 1741373416L;
		private final Boolean isFunction = false;

		private Api.TypeStickerSetCovered[] sets;
	}

	@Data
	public static class HighScores {
		private final Long constructorId = 2587622809L;
		private final long subclassOfId = 1825412605L;
		private final Boolean isFunction = false;

		private Api.TypeHighScore[] scores;
		private Api.TypeUser[] users;
	}

	@Data
	public static class FavedStickersNotModified {
		private final Long constructorId = 2660214483L;
		private final long subclassOfId = 2389929913L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FavedStickers {
		private final Long constructorId = 750063767L;
		private final long subclassOfId = 2389929913L;
		private final Boolean isFunction = false;

		private Api.TypeDocument[] stickers;
		private Api.TypeStickerPack[] packs;
		private BigInteger hash;
	}

	@Data
	public static class FoundStickerSetsNotModified {
		private final Long constructorId = 223655517L;
		private final long subclassOfId = 68023137L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FoundStickerSets {
		private final Long constructorId = 2331024850L;
		private final long subclassOfId = 68023137L;
		private final Boolean isFunction = false;

		private Api.TypeStickerSetCovered[] sets;
		private BigInteger hash;
	}

	@Data
	public static class SearchCounter {
		private final Long constructorId = 3896830975L;
		private final long subclassOfId = 3601317794L;
		private final Boolean isFunction = false;

		private Boolean inexact;
		private Api.TypeMessagesFilter filter;
		private int count;
	}

	@Data
	public static class InactiveChats {
		private final Long constructorId = 2837970629L;
		private final long subclassOfId = 2348013524L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private int[] dates;
		private Api.TypeUser[] users;
	}

	@Data
	public static class VotesList {
		private final Long constructorId = 136574537L;
		private final long subclassOfId = 3256457349L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeMessageUserVote[] votes;
		private String nextOffset;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class MessageViews extends Api.TypeMessageViews {
		private final Long constructorId = 3066361155L;
		private final long subclassOfId = 2947935132L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeMessageViews[] views;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DiscussionMessage {
		private final Long constructorId = 2788431746L;
		private final long subclassOfId = 1408820200L;
		private final Boolean isFunction = false;

		private int readOutboxMaxId;
		private int maxId;
		private int readInboxMaxId;
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private int unreadCount;
		private Api.TypeUser[] users;
	}

	@Data
	public static class HistoryImport {
		private final Long constructorId = 375566091L;
		private final long subclassOfId = 2978723082L;
		private final Boolean isFunction = false;

		private BigInteger id;
	}

	@Data
	public static class HistoryImportParsed {
		private final Long constructorId = 1578088377L;
		private final long subclassOfId = 1538421259L;
		private final Boolean isFunction = false;

		private String title;
		private Boolean pm;
		private Boolean group;
	}

	@Data
	public static class AffectedFoundMessages {
		private final Long constructorId = 4019011180L;
		private final long subclassOfId = 4162282798L;
		private final Boolean isFunction = false;

		private int offset;
		private int ptsCount;
		private int[] messages;
		private int pts;
	}

	@Data
	public static class ExportedChatInvites {
		private final Long constructorId = 3183881676L;
		private final long subclassOfId = 1614624881L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeExportedChatInvite[] invites;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ExportedChatInvite extends Api.TypeExportedChatInvite {
		private final Long constructorId = 410107472L;
		private final long subclassOfId = 2195510474L;
		private final Boolean isFunction = false;

		private Api.TypeExportedChatInvite invite;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ExportedChatInviteReplaced extends Api.TypeExportedChatInvite {
		private final Long constructorId = 572915951L;
		private final long subclassOfId = 2195510474L;
		private final Boolean isFunction = false;

		private Api.TypeExportedChatInvite newInvite;
		private Api.TypeExportedChatInvite invite;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChatInviteImporters {
		private final Long constructorId = 2176233482L;
		private final long subclassOfId = 3653012134L;
		private final Boolean isFunction = false;

		private Api.TypeChatInviteImporter[] importers;
		private int count;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChatAdminsWithInvites {
		private final Long constructorId = 3063640791L;
		private final long subclassOfId = 2405149995L;
		private final Boolean isFunction = false;

		private Api.TypeChatAdminWithInvites[] admins;
		private Api.TypeUser[] users;
	}

	@Data
	public static class CheckedHistoryImportPeer {
		private final Long constructorId = 2723014423L;
		private final long subclassOfId = 3091968823L;
		private final Boolean isFunction = false;

		private String confirmText;
	}

	@Data
	public static class SponsoredMessages {
		private final Long constructorId = 1705297877L;
		private final long subclassOfId = 2134993376L;
		private final Boolean isFunction = false;

		private Api.TypeChat[] chats;
		private Api.TypeSponsoredMessage[] messages;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SearchResultsCalendar {
		private final Long constructorId = 343859772L;
		private final long subclassOfId = 2462409743L;
		private final Boolean isFunction = false;

		private Boolean inexact;
		private int offsetIdOffset;
		private int minDate;
		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeSearchResultsCalendarPeriod[] periods;
		private Api.TypeMessage[] messages;
		private int minMsgId;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SearchResultsPositions {
		private final Long constructorId = 1404185519L;
		private final long subclassOfId = 3647172749L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeSearchResultsPosition[] positions;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class PeerSettings extends Api.TypePeerSettings {
		private final Long constructorId = 1753266509L;
		private final long subclassOfId = 1705179041L;
		private final Boolean isFunction = false;

		private Api.TypePeerSettings settings;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessageReactionsList {
		private final Long constructorId = 834488621L;
		private final long subclassOfId = 1627186662L;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeMessagePeerReaction[] reactions;
		private String nextOffset;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AvailableReactionsNotModified {
		private final Long constructorId = 2668042583L;
		private final long subclassOfId = 3827740034L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class AvailableReactions {
		private final Long constructorId = 1989032621L;
		private final long subclassOfId = 3827740034L;
		private final Boolean isFunction = false;

		private Api.TypeAvailableReaction[] reactions;
		private int hash;
	}

	@Data
	public static class TranslateNoResult {
		private final Long constructorId = 1741309751L;
		private final long subclassOfId = 37897192L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class TranslateResultText {
		private final Long constructorId = 2719283152L;
		private final long subclassOfId = 37897192L;
		private final Boolean isFunction = false;

		private String text;
	}

	@Data
	public static class TranscribedAudio {
		private final Long constructorId = 2473929810L;
		private final long subclassOfId = 565332278L;
		private final Boolean isFunction = false;

		private Boolean pending;
		private BigInteger transcriptionId;
		private String text;
	}

	@Data
	public static class GetMessages {
		private final Long constructorId = 1673946374L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private Api.TypeInputMessage[] id;
	}

	@Data
	public static class GetDialogs {
		private final Long constructorId = 2700397391L;
		private final long subclassOfId = 236671726L;
		private final Boolean isFunction = true;

		private Boolean excludePinned;
		private Api.TypeInputPeer offsetPeer;
		private int limit;
		private int offsetDate;
		private int folderId;
		private int offsetId;
		private BigInteger hash;
	}

	@Data
	public static class GetHistory {
		private final Long constructorId = 1143203525L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private int maxId;
		private Api.TypeInputPeer peer;
		private int limit;
		private int addOffset;
		private int offsetDate;
		private int minId;
		private int offsetId;
		private BigInteger hash;
	}

	@Data
	public static class Search {
		private final Long constructorId = 2700978018L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private int minDate;
		private int topMsgId;
		private Api.TypeInputPeer fromId;
		private Api.TypeMessagesFilter filter;
		private String q;
		private int maxId;
		private Api.TypeInputPeer peer;
		private int limit;
		private int maxDate;
		private int addOffset;
		private int minId;
		private int offsetId;
		private BigInteger hash;
	}

	@Data
	public static class ReadHistory {
		private final Long constructorId = 238054714L;
		private final long subclassOfId = 3469983854L;
		private final Boolean isFunction = true;

		private int maxId;
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class DeleteHistory {
		private final Long constructorId = 2962199082L;
		private final long subclassOfId = 743031062L;
		private final Boolean isFunction = true;

		private Boolean justClear;
		private int maxId;
		private int minDate;
		private Api.TypeInputPeer peer;
		private Boolean revoke;
		private int maxDate;
	}

	@Data
	public static class DeleteMessages {
		private final Long constructorId = 3851326930L;
		private final long subclassOfId = 3469983854L;
		private final Boolean isFunction = true;

		private Boolean revoke;
		private int[] id;
	}

	@Data
	public static class ReceivedMessages {
		private final Long constructorId = 94983360L;
		private final long subclassOfId = 2238052503L;
		private final Boolean isFunction = true;

		private int maxId;
	}

	@Data
	public static class SetTyping {
		private final Long constructorId = 1486110434L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeSendMessageAction action;
		private int topMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendMessage extends Api.TypeUpdates {
		private final Long constructorId = 228423076L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean clearDraft;
		private Boolean silent;
		private Boolean noforwards;
		private String message;
		private BigInteger randomId;
		private Api.TypeMessageEntity[] entities;
		private Boolean background;
		private Api.TypeInputPeer peer;
		private Api.TypeReplyMarkup replyMarkup;
		private int scheduleDate;
		private Boolean noWebpage;
		private Api.TypeInputPeer sendAs;
		private int replyToMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendMedia extends Api.TypeUpdates {
		private final Long constructorId = 3797940448L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean clearDraft;
		private Boolean silent;
		private Boolean noforwards;
		private Api.TypeInputMedia media;
		private String message;
		private BigInteger randomId;
		private Api.TypeMessageEntity[] entities;
		private Boolean background;
		private Api.TypeInputPeer peer;
		private Api.TypeReplyMarkup replyMarkup;
		private int scheduleDate;
		private Api.TypeInputPeer sendAs;
		private int replyToMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ForwardMessages extends Api.TypeUpdates {
		private final Long constructorId = 3425708299L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean silent;
		private Boolean dropAuthor;
		private Api.TypeInputPeer fromPeer;
		private Boolean withMyScore;
		private Boolean noforwards;
		private Api.TypeInputPeer toPeer;
		private BigInteger[] randomId;
		private Boolean background;
		private int scheduleDate;
		private Boolean dropMediaCaptions;
		private Api.TypeInputPeer sendAs;
		private int[] id;
	}

	@Data
	public static class ReportSpam {
		private final Long constructorId = 3474297563L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetPeerSettings extends Api.TypePeerSettings {
		private final Long constructorId = 4024018594L;
		private final long subclassOfId = 1705179041L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class Report {
		private final Long constructorId = 2303961934L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeReportReason reason;
		private Api.TypeInputPeer peer;
		private int[] id;
		private String message;
	}

	@Data
	public static class GetChats {
		private final Long constructorId = 1240027791L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = true;

		private BigInteger[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetFullChat extends Api.TypeChatFull {
		private final Long constructorId = 2930772788L;
		private final long subclassOfId = 576344329L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditChatTitle extends Api.TypeUpdates {
		private final Long constructorId = 1937260541L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditChatPhoto extends Api.TypeUpdates {
		private final Long constructorId = 903730804L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
		private Api.TypeInputChatPhoto photo;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AddChatUser extends Api.TypeUpdates {
		private final Long constructorId = 4064760803L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
		private int fwdLimit;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DeleteChatUser extends Api.TypeUpdates {
		private final Long constructorId = 2719505579L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
		private Boolean revokeHistory;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class CreateChat extends Api.TypeUpdates {
		private final Long constructorId = 164303470L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private String title;
		private Api.TypeInputUser[] users;
	}

	@Data
	public static class GetDhConfig {
		private final Long constructorId = 651135312L;
		private final long subclassOfId = 3834178955L;
		private final Boolean isFunction = true;

		private int randomLength;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RequestEncryption extends Api.TypeEncryptedChat {
		private final Long constructorId = 4132286275L;
		private final long subclassOfId = 1831379834L;
		private final Boolean isFunction = true;

		private int randomId;
		private byte gA;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AcceptEncryption extends Api.TypeEncryptedChat {
		private final Long constructorId = 1035731989L;
		private final long subclassOfId = 1831379834L;
		private final Boolean isFunction = true;

		private Api.TypeInputEncryptedChat peer;
		private BigInteger keyFingerprint;
		private byte gB;
	}

	@Data
	public static class DiscardEncryption {
		private final Long constructorId = 4086541984L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean deleteHistory;
		private int chatId;
	}

	@Data
	public static class SetEncryptedTyping {
		private final Long constructorId = 2031374829L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputEncryptedChat peer;
		private Boolean typing;
	}

	@Data
	public static class ReadEncryptedHistory {
		private final Long constructorId = 2135648522L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputEncryptedChat peer;
		private int maxDate;
	}

	@Data
	public static class SendEncrypted {
		private final Long constructorId = 1157265941L;
		private final long subclassOfId = 3382591056L;
		private final Boolean isFunction = true;

		private Boolean silent;
		private BigInteger randomId;
		private byte data;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class SendEncryptedFile {
		private final Long constructorId = 1431914525L;
		private final long subclassOfId = 3382591056L;
		private final Boolean isFunction = true;

		private Boolean silent;
		private BigInteger randomId;
		private Api.TypeInputEncryptedFile file;
		private byte data;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class SendEncryptedService {
		private final Long constructorId = 852769188L;
		private final long subclassOfId = 3382591056L;
		private final Boolean isFunction = true;

		private BigInteger randomId;
		private byte data;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class ReceivedQueue {
		private final Long constructorId = 1436924774L;
		private final long subclassOfId = 2300109160L;
		private final Boolean isFunction = true;

		private int maxQts;
	}

	@Data
	public static class ReportEncryptedSpam {
		private final Long constructorId = 1259113487L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class ReadMessageContents {
		private final Long constructorId = 916930423L;
		private final long subclassOfId = 3469983854L;
		private final Boolean isFunction = true;

		private int[] id;
	}

	@Data
	public static class GetStickers {
		private final Long constructorId = 3584414625L;
		private final long subclassOfId = 3611015646L;
		private final Boolean isFunction = true;

		private String emoticon;
		private BigInteger hash;
	}

	@Data
	public static class GetAllStickers {
		private final Long constructorId = 3097534888L;
		private final long subclassOfId = 1166231593L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetWebPagePreview extends Api.TypeMessageMedia {
		private final Long constructorId = 2338894028L;
		private final long subclassOfId = 1198308914L;
		private final Boolean isFunction = true;

		private Api.TypeMessageEntity[] entities;
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ExportChatInvite extends Api.TypeExportedChatInvite {
		private final Long constructorId = 2687296981L;
		private final long subclassOfId = 3027536472L;
		private final Boolean isFunction = true;

		private Boolean requestNeeded;
		private Api.TypeInputPeer peer;
		private int usageLimit;
		private Boolean legacyRevokePermanent;
		private int expireDate;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class CheckChatInvite extends Api.TypeChatInvite {
		private final Long constructorId = 1051570619L;
		private final long subclassOfId = 72750902L;
		private final Boolean isFunction = true;

		private String hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ImportChatInvite extends Api.TypeUpdates {
		private final Long constructorId = 1817183516L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private String hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetStickerSet extends Api.TypeStickerSet {
		private final Long constructorId = 3365989492L;
		private final long subclassOfId = 2607827546L;
		private final Boolean isFunction = true;

		private Api.TypeInputStickerSet stickerset;
		private int hash;
	}

	@Data
	public static class InstallStickerSet {
		private final Long constructorId = 3348096096L;
		private final long subclassOfId = 1741373416L;
		private final Boolean isFunction = true;

		private Boolean archived;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	public static class UninstallStickerSet {
		private final Long constructorId = 4184757726L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class StartBot extends Api.TypeUpdates {
		private final Long constructorId = 3873403768L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private BigInteger randomId;
		private String startParam;
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetMessagesViews extends Api.TypeMessageViews {
		private final Long constructorId = 1468322785L;
		private final long subclassOfId = 2947935132L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Boolean increment;
		private int[] id;
	}

	@Data
	public static class EditChatAdmin {
		private final Long constructorId = 2824589762L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
		private Boolean isAdmin;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class MigrateChat extends Api.TypeUpdates {
		private final Long constructorId = 2726777625L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
	}

	@Data
	public static class SearchGlobal {
		private final Long constructorId = 1271290010L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private Api.TypeMessagesFilter filter;
		private int offsetRate;
		private String q;
		private int minDate;
		private Api.TypeInputPeer offsetPeer;
		private int limit;
		private int maxDate;
		private int folderId;
		private int offsetId;
	}

	@Data
	public static class ReorderStickerSets {
		private final Long constructorId = 2016638777L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean masks;
		private BigInteger[] order;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetDocumentByHash extends Api.TypeDocument {
		private final Long constructorId = 2985428511L;
		private final long subclassOfId = 555739168L;
		private final Boolean isFunction = true;

		private byte sha256;
		private BigInteger size;
		private String mimeType;
	}

	@Data
	public static class GetSavedGifs {
		private final Long constructorId = 1559270965L;
		private final long subclassOfId = 2794152437L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class SaveGif {
		private final Long constructorId = 846868683L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	public static class GetInlineBotResults {
		private final Long constructorId = 1364105629L;
		private final long subclassOfId = 1054136777L;
		private final Boolean isFunction = true;

		private String offset;
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer peer;
		private String query;
		private Api.TypeInputGeoPoint geoPoint;
	}

	@Data
	public static class SetInlineBotResults {
		private final Long constructorId = 3948847622L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean privateSuffix;
		private Api.TypeInlineBotSwitchPM switchPm;
		private String nextOffset;
		private Api.TypeInputBotInlineResult[] results;
		private Boolean gallery;
		private BigInteger queryId;
		private int cacheTime;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendInlineBotResult extends Api.TypeUpdates {
		private final Long constructorId = 2057376407L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean clearDraft;
		private Boolean silent;
		private BigInteger randomId;
		private Boolean background;
		private Api.TypeInputPeer peer;
		private int scheduleDate;
		private Boolean hideVia;
		private Api.TypeInputPeer sendAs;
		private int replyToMsgId;
		private String id;
		private BigInteger queryId;
	}

	@Data
	public static class GetMessageEditData {
		private final Long constructorId = 4255550774L;
		private final long subclassOfId = 4215772317L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditMessage extends Api.TypeUpdates {
		private final Long constructorId = 1224152952L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeMessageEntity[] entities;
		private Api.TypeInputPeer peer;
		private Api.TypeReplyMarkup replyMarkup;
		private int scheduleDate;
		private Boolean noWebpage;
		private int id;
		private Api.TypeInputMedia media;
		private String message;
	}

	@Data
	public static class EditInlineBotMessage {
		private final Long constructorId = 2203418042L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeMessageEntity[] entities;
		private Api.TypeReplyMarkup replyMarkup;
		private Boolean noWebpage;
		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputMedia media;
		private String message;
	}

	@Data
	public static class GetBotCallbackAnswer {
		private final Long constructorId = 2470627847L;
		private final long subclassOfId = 1817039244L;
		private final Boolean isFunction = true;

		private Boolean game;
		private Api.TypeInputCheckPasswordSRP password;
		private byte data;
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class SetBotCallbackAnswer {
		private final Long constructorId = 3582923530L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean alert;
		private String message;
		private String url;
		private BigInteger queryId;
		private int cacheTime;
	}

	@Data
	public static class GetPeerDialogs {
		private final Long constructorId = 3832593661L;
		private final long subclassOfId = 986120498L;
		private final Boolean isFunction = true;

		private Api.TypeInputDialogPeer[] peers;
	}

	@Data
	public static class SaveDraft {
		private final Long constructorId = 3157909835L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeMessageEntity[] entities;
		private Api.TypeInputPeer peer;
		private Boolean noWebpage;
		private int replyToMsgId;
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetAllDrafts extends Api.TypeUpdates {
		private final Long constructorId = 1782549861L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetFeaturedStickers {
		private final Long constructorId = 1685588756L;
		private final long subclassOfId = 638891810L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class ReadFeaturedStickers {
		private final Long constructorId = 1527873830L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private BigInteger[] id;
	}

	@Data
	public static class GetRecentStickers {
		private final Long constructorId = 2645114939L;
		private final long subclassOfId = 4151281283L;
		private final Boolean isFunction = true;

		private Boolean attached;
		private BigInteger hash;
	}

	@Data
	public static class SaveRecentSticker {
		private final Long constructorId = 958863608L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean attached;
		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	public static class ClearRecentStickers {
		private final Long constructorId = 2308530221L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean attached;
	}

	@Data
	public static class GetArchivedStickers {
		private final Long constructorId = 1475442322L;
		private final long subclassOfId = 1922488177L;
		private final Boolean isFunction = true;

		private int limit;
		private Boolean masks;
		private BigInteger offsetId;
	}

	@Data
	public static class GetMaskStickers {
		private final Long constructorId = 1678738104L;
		private final long subclassOfId = 1166231593L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class GetAttachedStickers {
		private final Long constructorId = 3428542412L;
		private final long subclassOfId = 3423756139L;
		private final Boolean isFunction = true;

		private Api.TypeInputStickeredMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SetGameScore extends Api.TypeUpdates {
		private final Long constructorId = 2398678208L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private int score;
		private Boolean editMessage;
		private Api.TypeInputPeer peer;
		private Boolean force;
		private int id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class SetInlineGameScore {
		private final Long constructorId = 363700068L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private int score;
		private Boolean editMessage;
		private Boolean force;
		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetGameHighScores {
		private final Long constructorId = 3894568093L;
		private final long subclassOfId = 1825412605L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetInlineGameHighScores {
		private final Long constructorId = 258170395L;
		private final long subclassOfId = 1825412605L;
		private final Boolean isFunction = true;

		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetCommonChats {
		private final Long constructorId = 3826032900L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = true;

		private BigInteger maxId;
		private int limit;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetAllChats {
		private final Long constructorId = 2271179966L;
		private final long subclassOfId = 2580925204L;
		private final Boolean isFunction = true;

		private BigInteger[] exceptIds;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetWebPage extends Api.TypeWebPage {
		private final Long constructorId = 852135825L;
		private final long subclassOfId = 1437168769L;
		private final Boolean isFunction = true;

		private String url;
		private int hash;
	}

	@Data
	public static class ToggleDialogPin {
		private final Long constructorId = 2805064279L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean pinned;
		private Api.TypeInputDialogPeer peer;
	}

	@Data
	public static class ReorderPinnedDialogs {
		private final Long constructorId = 991616823L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean force;
		private int folderId;
		private Api.TypeInputDialogPeer[] order;
	}

	@Data
	public static class GetPinnedDialogs {
		private final Long constructorId = 3602468338L;
		private final long subclassOfId = 986120498L;
		private final Boolean isFunction = true;

		private int folderId;
	}

	@Data
	public static class SetBotShippingResults {
		private final Long constructorId = 3858133754L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String error;
		private Api.TypeShippingOption[] shippingOptions;
		private BigInteger queryId;
	}

	@Data
	public static class SetBotPrecheckoutResults {
		private final Long constructorId = 163765653L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean success;
		private String error;
		private BigInteger queryId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UploadMedia extends Api.TypeMessageMedia {
		private final Long constructorId = 1369162417L;
		private final long subclassOfId = 1198308914L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeInputMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendScreenshotNotification extends Api.TypeUpdates {
		private final Long constructorId = 3380473888L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private BigInteger randomId;
		private Api.TypeInputPeer peer;
		private int replyToMsgId;
	}

	@Data
	public static class GetFavedStickers {
		private final Long constructorId = 82946729L;
		private final long subclassOfId = 2389929913L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	public static class FaveSticker {
		private final Long constructorId = 3120547163L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean unfave;
		private Api.TypeInputDocument id;
	}

	@Data
	public static class GetUnreadMentions {
		private final Long constructorId = 1180140658L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private int maxId;
		private Api.TypeInputPeer peer;
		private int limit;
		private int addOffset;
		private int minId;
		private int offsetId;
	}

	@Data
	public static class ReadMentions {
		private final Long constructorId = 251759059L;
		private final long subclassOfId = 743031062L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetRecentLocations {
		private final Long constructorId = 1881817312L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int limit;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendMultiMedia extends Api.TypeUpdates {
		private final Long constructorId = 4160951183L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean clearDraft;
		private Boolean silent;
		private Boolean background;
		private Boolean noforwards;
		private Api.TypeInputPeer peer;
		private int scheduleDate;
		private Api.TypeInputPeer sendAs;
		private int replyToMsgId;
		private Api.TypeInputSingleMedia[] multiMedia;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UploadEncryptedFile extends Api.TypeEncryptedFile {
		private final Long constructorId = 1347929239L;
		private final long subclassOfId = 2217371584L;
		private final Boolean isFunction = true;

		private Api.TypeInputEncryptedFile file;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class SearchStickerSets {
		private final Long constructorId = 896555914L;
		private final long subclassOfId = 68023137L;
		private final Boolean isFunction = true;

		private String q;
		private Boolean excludeFeatured;
		private BigInteger hash;
	}

	@Data
	public static class GetSplitRanges {
		private final Long constructorId = 486505992L;
		private final long subclassOfId = 1537549572L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class MarkDialogUnread {
		private final Long constructorId = 3263617423L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean unread;
		private Api.TypeInputDialogPeer peer;
	}

	@Data
	public static class GetDialogUnreadMarks {
		private final Long constructorId = 585256482L;
		private final long subclassOfId = 3200666329L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class ClearAllDrafts {
		private final Long constructorId = 2119757468L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UpdatePinnedMessage extends Api.TypeUpdates {
		private final Long constructorId = 3534419948L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean silent;
		private Api.TypeInputPeer peer;
		private Boolean pmOneside;
		private Boolean unpin;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendVote extends Api.TypeUpdates {
		private final Long constructorId = 283795844L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private byte[] options;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetPollResults extends Api.TypeUpdates {
		private final Long constructorId = 1941660731L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetOnlines extends Api.TypeChatOnlines {
		private final Long constructorId = 1848369232L;
		private final long subclassOfId = 2357301306L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class EditChatAbout {
		private final Long constructorId = 3740665751L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private String about;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditChatDefaultBannedRights extends Api.TypeUpdates {
		private final Long constructorId = 2777049921L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeChatBannedRights bannedRights;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetEmojiKeywords extends Api.TypeEmojiKeywordsDifference {
		private final Long constructorId = 899735650L;
		private final long subclassOfId = 3531196018L;
		private final Boolean isFunction = true;

		private String langCode;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetEmojiKeywordsDifference extends Api.TypeEmojiKeywordsDifference {
		private final Long constructorId = 352892591L;
		private final long subclassOfId = 3531196018L;
		private final Boolean isFunction = true;

		private int fromVersion;
		private String langCode;
	}

	@Data
	public static class GetEmojiKeywordsLanguages {
		private final Long constructorId = 1318675378L;
		private final long subclassOfId = 3885355911L;
		private final Boolean isFunction = true;

		private String[] langCodes;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetEmojiURL extends Api.TypeEmojiURL {
		private final Long constructorId = 3585149990L;
		private final long subclassOfId = 530614809L;
		private final Boolean isFunction = true;

		private String langCode;
	}

	@Data
	public static class GetSearchCounters {
		private final Long constructorId = 1932455680L;
		private final long subclassOfId = 1809726574L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeMessagesFilter[] filters;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RequestUrlAuth extends Api.TypeUrlAuthResult {
		private final Long constructorId = 428848198L;
		private final long subclassOfId = 2003159838L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int buttonId;
		private int msgId;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AcceptUrlAuth extends Api.TypeUrlAuthResult {
		private final Long constructorId = 2972479781L;
		private final long subclassOfId = 2003159838L;
		private final Boolean isFunction = true;

		private Boolean writeAllowed;
		private Api.TypeInputPeer peer;
		private int buttonId;
		private int msgId;
		private String url;
	}

	@Data
	public static class HidePeerSettingsBar {
		private final Long constructorId = 1336717624L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetScheduledHistory {
		private final Long constructorId = 4111889931L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private BigInteger hash;
	}

	@Data
	public static class GetScheduledMessages {
		private final Long constructorId = 3183150180L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendScheduledMessages extends Api.TypeUpdates {
		private final Long constructorId = 3174597898L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DeleteScheduledMessages extends Api.TypeUpdates {
		private final Long constructorId = 1504586518L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	public static class GetPollVotes {
		private final Long constructorId = 3094231054L;
		private final long subclassOfId = 3256457349L;
		private final Boolean isFunction = true;

		private String offset;
		private Api.TypeInputPeer peer;
		private int limit;
		private int id;
		private byte option;
	}

	@Data
	public static class ToggleStickerSets {
		private final Long constructorId = 3037016042L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean uninstall;
		private Api.TypeInputStickerSet[] stickersets;
		private Boolean unarchive;
		private Boolean archive;
	}

	@Data
	public static class GetDialogFilters {
		private final Long constructorId = 4053719405L;
		private final long subclassOfId = 1612507469L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetSuggestedDialogFilters {
		private final Long constructorId = 2728186924L;
		private final long subclassOfId = 2066312249L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class UpdateDialogFilter {
		private final Long constructorId = 450142282L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeDialogFilter filter;
		private int id;
	}

	@Data
	public static class UpdateDialogFiltersOrder {
		private final Long constructorId = 3311649252L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private int[] order;
	}

	@Data
	public static class GetOldFeaturedStickers {
		private final Long constructorId = 2127598753L;
		private final long subclassOfId = 638891810L;
		private final Boolean isFunction = true;

		private int offset;
		private int limit;
		private BigInteger hash;
	}

	@Data
	public static class GetReplies {
		private final Long constructorId = 584962828L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private int maxId;
		private Api.TypeInputPeer peer;
		private int limit;
		private int msgId;
		private int addOffset;
		private int offsetDate;
		private int minId;
		private int offsetId;
		private BigInteger hash;
	}

	@Data
	public static class GetDiscussionMessage {
		private final Long constructorId = 1147761405L;
		private final long subclassOfId = 1408820200L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class ReadDiscussion {
		private final Long constructorId = 4147227124L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private int readMaxId;
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class UnpinAllMessages {
		private final Long constructorId = 4029004939L;
		private final long subclassOfId = 743031062L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class DeleteChat {
		private final Long constructorId = 1540419152L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private BigInteger chatId;
	}

	@Data
	public static class DeletePhoneCallHistory {
		private final Long constructorId = 4190888969L;
		private final long subclassOfId = 4162282798L;
		private final Boolean isFunction = true;

		private Boolean revoke;
	}

	@Data
	public static class CheckHistoryImport {
		private final Long constructorId = 1140726259L;
		private final long subclassOfId = 1538421259L;
		private final Boolean isFunction = true;

		private String importHead;
	}

	@Data
	public static class InitHistoryImport {
		private final Long constructorId = 873008187L;
		private final long subclassOfId = 2978723082L;
		private final Boolean isFunction = true;

		private Api.TypeInputFile file;
		private Api.TypeInputPeer peer;
		private int mediaCount;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UploadImportedMedia extends Api.TypeMessageMedia {
		private final Long constructorId = 713433234L;
		private final long subclassOfId = 1198308914L;
		private final Boolean isFunction = true;

		private String fileName;
		private BigInteger importId;
		private Api.TypeInputPeer peer;
		private Api.TypeInputMedia media;
	}

	@Data
	public static class StartHistoryImport {
		private final Long constructorId = 3023958852L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private BigInteger importId;
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetExportedChatInvites {
		private final Long constructorId = 2729812982L;
		private final long subclassOfId = 1614624881L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeInputUser adminId;
		private int limit;
		private Boolean revoked;
		private int offsetDate;
		private String offsetLink;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetExportedChatInvite extends Api.TypeExportedChatInvite {
		private final Long constructorId = 1937010524L;
		private final long subclassOfId = 2195510474L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditExportedChatInvite extends Api.TypeExportedChatInvite {
		private final Long constructorId = 3184144245L;
		private final long subclassOfId = 2195510474L;
		private final Boolean isFunction = true;

		private Boolean requestNeeded;
		private Api.TypeInputPeer peer;
		private int usageLimit;
		private String link;
		private int expireDate;
		private Boolean revoked;
		private String title;
	}

	@Data
	public static class DeleteRevokedExportedChatInvites {
		private final Long constructorId = 1452833749L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeInputUser adminId;
	}

	@Data
	public static class DeleteExportedChatInvite {
		private final Long constructorId = 3563365419L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	public static class GetAdminsWithInvites {
		private final Long constructorId = 958457583L;
		private final long subclassOfId = 2405149995L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetChatInviteImporters {
		private final Long constructorId = 3741637966L;
		private final long subclassOfId = 3653012134L;
		private final Boolean isFunction = true;

		private String q;
		private Boolean requested;
		private Api.TypeInputPeer peer;
		private String link;
		private int limit;
		private Api.TypeInputUser offsetUser;
		private int offsetDate;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SetHistoryTTL extends Api.TypeUpdates {
		private final Long constructorId = 3087949796L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private int period;
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class CheckHistoryImportPeer {
		private final Long constructorId = 1573261059L;
		private final long subclassOfId = 3091968823L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SetChatTheme extends Api.TypeUpdates {
		private final Long constructorId = 3862683967L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private String emoticon;
	}

	@Data
	public static class GetMessageReadParticipants {
		private final Long constructorId = 745510839L;
		private final long subclassOfId = 2300109160L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class GetSearchResultsCalendar {
		private final Long constructorId = 1240514025L;
		private final long subclassOfId = 2462409743L;
		private final Boolean isFunction = true;

		private Api.TypeMessagesFilter filter;
		private Api.TypeInputPeer peer;
		private int offsetDate;
		private int offsetId;
	}

	@Data
	public static class GetSearchResultsPositions {
		private final Long constructorId = 1855292323L;
		private final long subclassOfId = 3647172749L;
		private final Boolean isFunction = true;

		private Api.TypeMessagesFilter filter;
		private Api.TypeInputPeer peer;
		private int limit;
		private int offsetId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class HideChatJoinRequest extends Api.TypeUpdates {
		private final Long constructorId = 2145904661L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean approved;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class HideAllChatJoinRequests extends Api.TypeUpdates {
		private final Long constructorId = 3766875370L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean approved;
		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ToggleNoForwards extends Api.TypeUpdates {
		private final Long constructorId = 2971578274L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Boolean enabled;
	}

	@Data
	public static class SaveDefaultSendAs {
		private final Long constructorId = 3439189910L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendReaction extends Api.TypeUpdates {
		private final Long constructorId = 627641572L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Boolean big;
		private String reaction;
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetMessagesReactions extends Api.TypeUpdates {
		private final Long constructorId = 2344259814L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	public static class GetMessageReactionsList {
		private final Long constructorId = 3773721463L;
		private final long subclassOfId = 1627186662L;
		private final Boolean isFunction = true;

		private String reaction;
		private String offset;
		private Api.TypeInputPeer peer;
		private int limit;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SetChatAvailableReactions extends Api.TypeUpdates {
		private final Long constructorId = 335875750L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private String[] availableReactions;
	}

	@Data
	public static class GetAvailableReactions {
		private final Long constructorId = 417243308L;
		private final long subclassOfId = 3827740034L;
		private final Boolean isFunction = true;

		private int hash;
	}

	@Data
	public static class SetDefaultReaction {
		private final Long constructorId = 3646997716L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private String reaction;
	}

	@Data
	public static class TranslateText {
		private final Long constructorId = 617508334L;
		private final long subclassOfId = 37897192L;
		private final Boolean isFunction = true;

		private String fromLang;
		private Api.TypeInputPeer peer;
		private int msgId;
		private String text;
		private String toLang;
	}

	@Data
	public static class GetUnreadReactions {
		private final Long constructorId = 3898322458L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private int maxId;
		private Api.TypeInputPeer peer;
		private int limit;
		private int addOffset;
		private int minId;
		private int offsetId;
	}

	@Data
	public static class ReadReactions {
		private final Long constructorId = 2195870167L;
		private final long subclassOfId = 743031062L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class SearchSentMedia {
		private final Long constructorId = 276705696L;
		private final long subclassOfId = 3568569182L;
		private final Boolean isFunction = true;

		private Api.TypeMessagesFilter filter;
		private String q;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetAttachMenuBots extends Api.TypeAttachMenuBots {
		private final Long constructorId = 385663691L;
		private final long subclassOfId = 2217616346L;
		private final Boolean isFunction = true;

		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetAttachMenuBot extends Api.TypeAttachMenuBotsBot {
		private final Long constructorId = 1998676370L;
		private final long subclassOfId = 3677587517L;
		private final Boolean isFunction = true;

		private Api.TypeInputUser bot;
	}

	@Data
	public static class ToggleBotInAttachMenu {
		private final Long constructorId = 451818415L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputUser bot;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RequestWebView extends Api.TypeWebViewResult {
		private final Long constructorId = 2444318769L;
		private final long subclassOfId = 2479793990L;
		private final Boolean isFunction = true;

		private Boolean fromBotMenu;
		private Boolean silent;
		private Api.TypeDataJSON themeParams;
		private String startParam;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer sendAs;
		private int replyToMsgId;
		private String url;
	}

	@Data
	public static class ProlongWebView {
		private final Long constructorId = 3932142798L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Boolean silent;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer sendAs;
		private int replyToMsgId;
		private BigInteger queryId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RequestSimpleWebView extends Api.TypeSimpleWebViewResult {
		private final Long constructorId = 1790652275L;
		private final long subclassOfId = 367977435L;
		private final Boolean isFunction = true;

		private Api.TypeDataJSON themeParams;
		private Api.TypeInputUser bot;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendWebViewResultMessage extends Api.TypeWebViewMessageSent {
		private final Long constructorId = 172168437L;
		private final long subclassOfId = 1977914130L;
		private final Boolean isFunction = true;

		private Api.TypeInputBotInlineResult result;
		private String botQueryId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendWebViewData extends Api.TypeUpdates {
		private final Long constructorId = 3691135688L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private String buttonText;
		private BigInteger randomId;
		private String data;
		private Api.TypeInputUser bot;
	}

	@Data
	public static class TranscribeAudio {
		private final Long constructorId = 647928393L;
		private final long subclassOfId = 565332278L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class RateTranscribedAudio {
		private final Long constructorId = 2132608815L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private BigInteger transcriptionId;
		private int msgId;
		private Boolean good;
	}
}