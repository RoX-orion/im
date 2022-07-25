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
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private Api.TypeDialog[] dialogs;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DialogsSlice {
		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private Api.TypeDialog[] dialogs;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DialogsNotModified {
		private int count;
	}

	@Data
	public static class Messages {
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessagesSlice {
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
		private int count;
	}

	@Data
	public static class Chats {
		private Api.TypeChat[] chats;
	}

	@Data
	public static class ChatsSlice {
		private int count;
		private Api.TypeChat[] chats;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ChatFull extends Api.TypeChatFull {
		private Api.TypeChat[] chats;
		private Api.TypeChatFull fullChat;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AffectedHistory {
		private int offset;
		private int ptsCount;
		private int pts;
	}

	@Data
	public static class DhConfigNotModified {
		private byte random;
	}

	@Data
	public static class DhConfig {
		private byte p;
		private byte random;
		private int g;
		private int version;
	}

	@Data
	public static class SentEncryptedMessage {
		private int date;
	}

	@Data
	public static class SentEncryptedFile {
		private int date;
		private Api.TypeEncryptedFile file;
	}

	@Data
	public static class StickersNotModified {
	}

	@Data
	public static class Stickers {
		private Api.TypeDocument[] stickers;
		private BigInteger hash;
	}

	@Data
	public static class AllStickersNotModified {
	}

	@Data
	public static class AllStickers {
		private Api.TypeStickerSet[] sets;
		private BigInteger hash;
	}

	@Data
	public static class AffectedMessages {
		private int ptsCount;
		private int pts;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StickerSet extends Api.TypeStickerSet {
		private Api.TypeStickerSet set;
		private Api.TypeDocument[] documents;
		private Api.TypeStickerPack[] packs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StickerSetNotModified extends Api.TypeStickerSet {
	}

	@Data
	public static class SavedGifsNotModified {
	}

	@Data
	public static class SavedGifs {
		private BigInteger hash;
		private Api.TypeDocument[] gifs;
	}

	@Data
	public static class BotResults {
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
		private Boolean hasUrl;
		private Boolean alert;
		private Boolean nativeUi;
		private String message;
		private String url;
		private int cacheTime;
	}

	@Data
	public static class MessageEditData {
		private Boolean caption;
	}

	@Data
	public static class PeerDialogs {
		private Api.TypeChat[] chats;
		private Api.TypeMessage[] messages;
		private UpdatesApi.TypeState state;
		private Api.TypeDialog[] dialogs;
		private Api.TypeUser[] users;
	}

	@Data
	public static class FeaturedStickersNotModified {
		private int count;
	}

	@Data
	public static class FeaturedStickers {
		private Boolean premium;
		private Api.TypeStickerSetCovered[] sets;
		private BigInteger[] unread;
		private int count;
		private BigInteger hash;
	}

	@Data
	public static class RecentStickersNotModified {
	}

	@Data
	public static class RecentStickers {
		private Api.TypeDocument[] stickers;
		private int[] dates;
		private Api.TypeStickerPack[] packs;
		private BigInteger hash;
	}

	@Data
	public static class ArchivedStickers {
		private Api.TypeStickerSetCovered[] sets;
		private int count;
	}

	@Data
	public static class StickerSetInstallResultSuccess {
	}

	@Data
	public static class StickerSetInstallResultArchive {
		private Api.TypeStickerSetCovered[] sets;
	}

	@Data
	public static class HighScores {
		private Api.TypeHighScore[] scores;
		private Api.TypeUser[] users;
	}

	@Data
	public static class FavedStickersNotModified {
	}

	@Data
	public static class FavedStickers {
		private Api.TypeDocument[] stickers;
		private Api.TypeStickerPack[] packs;
		private BigInteger hash;
	}

	@Data
	public static class FoundStickerSetsNotModified {
	}

	@Data
	public static class FoundStickerSets {
		private Api.TypeStickerSetCovered[] sets;
		private BigInteger hash;
	}

	@Data
	public static class SearchCounter {
		private Boolean inexact;
		private Api.TypeMessagesFilter filter;
		private int count;
	}

	@Data
	public static class InactiveChats {
		private Api.TypeChat[] chats;
		private int[] dates;
		private Api.TypeUser[] users;
	}

	@Data
	public static class VotesList {
		private int count;
		private Api.TypeMessageUserVote[] votes;
		private String nextOffset;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class MessageViews extends Api.TypeMessageViews {
		private Api.TypeChat[] chats;
		private Api.TypeMessageViews[] views;
		private Api.TypeUser[] users;
	}

	@Data
	public static class DiscussionMessage {
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
		private BigInteger id;
	}

	@Data
	public static class HistoryImportParsed {
		private String title;
		private Boolean pm;
		private Boolean group;
	}

	@Data
	public static class AffectedFoundMessages {
		private int offset;
		private int ptsCount;
		private int[] messages;
		private int pts;
	}

	@Data
	public static class ExportedChatInvites {
		private int count;
		private Api.TypeExportedChatInvite[] invites;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ExportedChatInvite extends Api.TypeExportedChatInvite {
		private Api.TypeExportedChatInvite invite;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ExportedChatInviteReplaced extends Api.TypeExportedChatInvite {
		private Api.TypeExportedChatInvite newInvite;
		private Api.TypeExportedChatInvite invite;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChatInviteImporters {
		private Api.TypeChatInviteImporter[] importers;
		private int count;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ChatAdminsWithInvites {
		private Api.TypeChatAdminWithInvites[] admins;
		private Api.TypeUser[] users;
	}

	@Data
	public static class CheckedHistoryImportPeer {
		private String confirmText;
	}

	@Data
	public static class SponsoredMessages {
		private Api.TypeChat[] chats;
		private Api.TypeSponsoredMessage[] messages;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SearchResultsCalendar {
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
		private int count;
		private Api.TypeSearchResultsPosition[] positions;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class PeerSettings extends Api.TypePeerSettings {
		private Api.TypePeerSettings settings;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class MessageReactionsList {
		private int count;
		private Api.TypeChat[] chats;
		private Api.TypeMessagePeerReaction[] reactions;
		private String nextOffset;
		private Api.TypeUser[] users;
	}

	@Data
	public static class AvailableReactionsNotModified {
	}

	@Data
	public static class AvailableReactions {
		private Api.TypeAvailableReaction[] reactions;
		private int hash;
	}

	@Data
	public static class TranslateNoResult {
	}

	@Data
	public static class TranslateResultText {
		private String text;
	}

	@Data
	public static class TranscribedAudio {
		private Boolean pending;
		private BigInteger transcriptionId;
		private String text;
	}

	@Data
	public static class GetMessages {
		private Api.TypeInputMessage[] id;
	}

	@Data
	public static class GetDialogs {
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
		private int maxId;
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class DeleteHistory {
		private Boolean justClear;
		private int maxId;
		private int minDate;
		private Api.TypeInputPeer peer;
		private Boolean revoke;
		private int maxDate;
	}

	@Data
	public static class DeleteMessages {
		private Boolean revoke;
		private int[] id;
	}

	@Data
	public static class ReceivedMessages {
		private int maxId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetTyping extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private Api.TypeSendMessageAction action;
		private int topMsgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendMessage extends Api.TypeUpdates {
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
	@EqualsAndHashCode(callSuper=false)
	public static class SendMedia extends Api.TypeUpdates {
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
	@EqualsAndHashCode(callSuper=false)
	public static class ForwardMessages extends Api.TypeUpdates {
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
	@EqualsAndHashCode(callSuper=false)
	public static class ReportSpam extends Api.TypeBool {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetPeerSettings extends Api.TypePeerSettings {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class Report extends Api.TypeBool {
		private Api.TypeReportReason reason;
		private Api.TypeInputPeer peer;
		private int[] id;
		private String message;
	}

	@Data
	public static class GetChats {
		private BigInteger[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetFullChat extends Api.TypeChatFull {
		private BigInteger chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatTitle extends Api.TypeUpdates {
		private BigInteger chatId;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatPhoto extends Api.TypeUpdates {
		private BigInteger chatId;
		private Api.TypeInputChatPhoto photo;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AddChatUser extends Api.TypeUpdates {
		private BigInteger chatId;
		private int fwdLimit;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteChatUser extends Api.TypeUpdates {
		private BigInteger chatId;
		private Boolean revokeHistory;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CreateChat extends Api.TypeUpdates {
		private String title;
		private Api.TypeInputUser[] users;
	}

	@Data
	public static class GetDhConfig {
		private int randomLength;
		private int version;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestEncryption extends Api.TypeEncryptedChat {
		private int randomId;
		private byte gA;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptEncryption extends Api.TypeEncryptedChat {
		private Api.TypeInputEncryptedChat peer;
		private BigInteger keyFingerprint;
		private byte gB;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DiscardEncryption extends Api.TypeBool {
		private Boolean deleteHistory;
		private int chatId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetEncryptedTyping extends Api.TypeBool {
		private Api.TypeInputEncryptedChat peer;
		private Boolean typing;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadEncryptedHistory extends Api.TypeBool {
		private Api.TypeInputEncryptedChat peer;
		private int maxDate;
	}

	@Data
	public static class SendEncrypted {
		private Boolean silent;
		private BigInteger randomId;
		private byte data;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class SendEncryptedFile {
		private Boolean silent;
		private BigInteger randomId;
		private Api.TypeInputEncryptedFile file;
		private byte data;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class SendEncryptedService {
		private BigInteger randomId;
		private byte data;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class ReceivedQueue {
		private int maxQts;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReportEncryptedSpam extends Api.TypeBool {
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class ReadMessageContents {
		private int[] id;
	}

	@Data
	public static class GetStickers {
		private String emoticon;
		private BigInteger hash;
	}

	@Data
	public static class GetAllStickers {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetWebPagePreview extends Api.TypeMessageMedia {
		private Api.TypeMessageEntity[] entities;
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ExportChatInvite extends Api.TypeExportedChatInvite {
		private Boolean requestNeeded;
		private Api.TypeInputPeer peer;
		private int usageLimit;
		private Boolean legacyRevokePermanent;
		private int expireDate;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CheckChatInvite extends Api.TypeChatInvite {
		private String hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ImportChatInvite extends Api.TypeUpdates {
		private String hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetStickerSet extends Api.TypeStickerSet {
		private Api.TypeInputStickerSet stickerset;
		private int hash;
	}

	@Data
	public static class InstallStickerSet {
		private Boolean archived;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UninstallStickerSet extends Api.TypeBool {
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StartBot extends Api.TypeUpdates {
		private BigInteger randomId;
		private String startParam;
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetMessagesViews extends Api.TypeMessageViews {
		private Api.TypeInputPeer peer;
		private Boolean increment;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatAdmin extends Api.TypeBool {
		private BigInteger chatId;
		private Boolean isAdmin;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class MigrateChat extends Api.TypeUpdates {
		private BigInteger chatId;
	}

	@Data
	public static class SearchGlobal {
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
	@EqualsAndHashCode(callSuper=false)
	public static class ReorderStickerSets extends Api.TypeBool {
		private Boolean masks;
		private BigInteger[] order;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetDocumentByHash extends Api.TypeDocument {
		private byte sha256;
		private BigInteger size;
		private String mimeType;
	}

	@Data
	public static class GetSavedGifs {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveGif extends Api.TypeBool {
		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	public static class GetInlineBotResults {
		private String offset;
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer peer;
		private String query;
		private Api.TypeInputGeoPoint geoPoint;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetInlineBotResults extends Api.TypeBool {
		private Boolean privateSuffix;
		private Api.TypeInlineBotSwitchPM switchPm;
		private String nextOffset;
		private Api.TypeInputBotInlineResult[] results;
		private Boolean gallery;
		private BigInteger queryId;
		private int cacheTime;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendInlineBotResult extends Api.TypeUpdates {
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
		private Api.TypeInputPeer peer;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditMessage extends Api.TypeUpdates {
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
	@EqualsAndHashCode(callSuper=false)
	public static class EditInlineBotMessage extends Api.TypeBool {
		private Api.TypeMessageEntity[] entities;
		private Api.TypeReplyMarkup replyMarkup;
		private Boolean noWebpage;
		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputMedia media;
		private String message;
	}

	@Data
	public static class GetBotCallbackAnswer {
		private Boolean game;
		private Api.TypeInputCheckPasswordSRP password;
		private byte data;
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotCallbackAnswer extends Api.TypeBool {
		private Boolean alert;
		private String message;
		private String url;
		private BigInteger queryId;
		private int cacheTime;
	}

	@Data
	public static class GetPeerDialogs {
		private Api.TypeInputDialogPeer[] peers;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveDraft extends Api.TypeBool {
		private Api.TypeMessageEntity[] entities;
		private Api.TypeInputPeer peer;
		private Boolean noWebpage;
		private int replyToMsgId;
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAllDrafts extends Api.TypeUpdates {
	}

	@Data
	public static class GetFeaturedStickers {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadFeaturedStickers extends Api.TypeBool {
		private BigInteger[] id;
	}

	@Data
	public static class GetRecentStickers {
		private Boolean attached;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveRecentSticker extends Api.TypeBool {
		private Boolean attached;
		private Api.TypeInputDocument id;
		private Boolean unsave;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ClearRecentStickers extends Api.TypeBool {
		private Boolean attached;
	}

	@Data
	public static class GetArchivedStickers {
		private int limit;
		private Boolean masks;
		private BigInteger offsetId;
	}

	@Data
	public static class GetMaskStickers {
		private BigInteger hash;
	}

	@Data
	public static class GetAttachedStickers {
		private Api.TypeInputStickeredMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetGameScore extends Api.TypeUpdates {
		private int score;
		private Boolean editMessage;
		private Api.TypeInputPeer peer;
		private Boolean force;
		private int id;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetInlineGameScore extends Api.TypeBool {
		private int score;
		private Boolean editMessage;
		private Boolean force;
		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetGameHighScores {
		private Api.TypeInputPeer peer;
		private int id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetInlineGameHighScores {
		private Api.TypeInputBotInlineMessageID id;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetCommonChats {
		private BigInteger maxId;
		private int limit;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetAllChats {
		private BigInteger[] exceptIds;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetWebPage extends Api.TypeWebPage {
		private String url;
		private int hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleDialogPin extends Api.TypeBool {
		private Boolean pinned;
		private Api.TypeInputDialogPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReorderPinnedDialogs extends Api.TypeBool {
		private Boolean force;
		private int folderId;
		private Api.TypeInputDialogPeer[] order;
	}

	@Data
	public static class GetPinnedDialogs {
		private int folderId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotShippingResults extends Api.TypeBool {
		private String error;
		private Api.TypeShippingOption[] shippingOptions;
		private BigInteger queryId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotPrecheckoutResults extends Api.TypeBool {
		private Boolean success;
		private String error;
		private BigInteger queryId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadMedia extends Api.TypeMessageMedia {
		private Api.TypeInputPeer peer;
		private Api.TypeInputMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendScreenshotNotification extends Api.TypeUpdates {
		private BigInteger randomId;
		private Api.TypeInputPeer peer;
		private int replyToMsgId;
	}

	@Data
	public static class GetFavedStickers {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class FaveSticker extends Api.TypeBool {
		private Boolean unfave;
		private Api.TypeInputDocument id;
	}

	@Data
	public static class GetUnreadMentions {
		private int maxId;
		private Api.TypeInputPeer peer;
		private int limit;
		private int addOffset;
		private int minId;
		private int offsetId;
	}

	@Data
	public static class ReadMentions {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetRecentLocations {
		private Api.TypeInputPeer peer;
		private int limit;
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendMultiMedia extends Api.TypeUpdates {
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
	@EqualsAndHashCode(callSuper=false)
	public static class UploadEncryptedFile extends Api.TypeEncryptedFile {
		private Api.TypeInputEncryptedFile file;
		private Api.TypeInputEncryptedChat peer;
	}

	@Data
	public static class SearchStickerSets {
		private String q;
		private Boolean excludeFeatured;
		private BigInteger hash;
	}

	@Data
	public static class GetSplitRanges {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class MarkDialogUnread extends Api.TypeBool {
		private Boolean unread;
		private Api.TypeInputDialogPeer peer;
	}

	@Data
	public static class GetDialogUnreadMarks {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ClearAllDrafts extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdatePinnedMessage extends Api.TypeUpdates {
		private Boolean silent;
		private Api.TypeInputPeer peer;
		private Boolean pmOneside;
		private Boolean unpin;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendVote extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private byte[] options;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetPollResults extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetOnlines extends Api.TypeChatOnlines {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatAbout extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private String about;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditChatDefaultBannedRights extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private Api.TypeChatBannedRights bannedRights;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetEmojiKeywords extends Api.TypeEmojiKeywordsDifference {
		private String langCode;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetEmojiKeywordsDifference extends Api.TypeEmojiKeywordsDifference {
		private int fromVersion;
		private String langCode;
	}

	@Data
	public static class GetEmojiKeywordsLanguages {
		private String[] langCodes;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetEmojiURL extends Api.TypeEmojiURL {
		private String langCode;
	}

	@Data
	public static class GetSearchCounters {
		private Api.TypeInputPeer peer;
		private Api.TypeMessagesFilter[] filters;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestUrlAuth extends Api.TypeUrlAuthResult {
		private Api.TypeInputPeer peer;
		private int buttonId;
		private int msgId;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AcceptUrlAuth extends Api.TypeUrlAuthResult {
		private Boolean writeAllowed;
		private Api.TypeInputPeer peer;
		private int buttonId;
		private int msgId;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class HidePeerSettingsBar extends Api.TypeBool {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetScheduledHistory {
		private Api.TypeInputPeer peer;
		private BigInteger hash;
	}

	@Data
	public static class GetScheduledMessages {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendScheduledMessages extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteScheduledMessages extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	public static class GetPollVotes {
		private String offset;
		private Api.TypeInputPeer peer;
		private int limit;
		private int id;
		private byte option;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleStickerSets extends Api.TypeBool {
		private Boolean uninstall;
		private Api.TypeInputStickerSet[] stickersets;
		private Boolean unarchive;
		private Boolean archive;
	}

	@Data
	public static class GetDialogFilters {
	}

	@Data
	public static class GetSuggestedDialogFilters {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateDialogFilter extends Api.TypeBool {
		private Api.TypeDialogFilter filter;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateDialogFiltersOrder extends Api.TypeBool {
		private int[] order;
	}

	@Data
	public static class GetOldFeaturedStickers {
		private int offset;
		private int limit;
		private BigInteger hash;
	}

	@Data
	public static class GetReplies {
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
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ReadDiscussion extends Api.TypeBool {
		private int readMaxId;
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class UnpinAllMessages {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteChat extends Api.TypeBool {
		private BigInteger chatId;
	}

	@Data
	public static class DeletePhoneCallHistory {
		private Boolean revoke;
	}

	@Data
	public static class CheckHistoryImport {
		private String importHead;
	}

	@Data
	public static class InitHistoryImport {
		private Api.TypeInputFile file;
		private Api.TypeInputPeer peer;
		private int mediaCount;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadImportedMedia extends Api.TypeMessageMedia {
		private String fileName;
		private BigInteger importId;
		private Api.TypeInputPeer peer;
		private Api.TypeInputMedia media;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class StartHistoryImport extends Api.TypeBool {
		private BigInteger importId;
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetExportedChatInvites {
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser adminId;
		private int limit;
		private Boolean revoked;
		private int offsetDate;
		private String offsetLink;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetExportedChatInvite extends Api.TypeExportedChatInvite {
		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditExportedChatInvite extends Api.TypeExportedChatInvite {
		private Boolean requestNeeded;
		private Api.TypeInputPeer peer;
		private int usageLimit;
		private String link;
		private int expireDate;
		private Boolean revoked;
		private String title;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteRevokedExportedChatInvites extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser adminId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteExportedChatInvite extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	public static class GetAdminsWithInvites {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class GetChatInviteImporters {
		private String q;
		private Boolean requested;
		private Api.TypeInputPeer peer;
		private String link;
		private int limit;
		private Api.TypeInputUser offsetUser;
		private int offsetDate;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetHistoryTTL extends Api.TypeUpdates {
		private int period;
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class CheckHistoryImportPeer {
		private Api.TypeInputPeer peer;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetChatTheme extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private String emoticon;
	}

	@Data
	public static class GetMessageReadParticipants {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class GetSearchResultsCalendar {
		private Api.TypeMessagesFilter filter;
		private Api.TypeInputPeer peer;
		private int offsetDate;
		private int offsetId;
	}

	@Data
	public static class GetSearchResultsPositions {
		private Api.TypeMessagesFilter filter;
		private Api.TypeInputPeer peer;
		private int limit;
		private int offsetId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class HideChatJoinRequest extends Api.TypeUpdates {
		private Boolean approved;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class HideAllChatJoinRequests extends Api.TypeUpdates {
		private Boolean approved;
		private Api.TypeInputPeer peer;
		private String link;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleNoForwards extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveDefaultSendAs extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private Api.TypeInputPeer sendAs;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendReaction extends Api.TypeUpdates {
		private Boolean big;
		private String reaction;
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetMessagesReactions extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private int[] id;
	}

	@Data
	public static class GetMessageReactionsList {
		private String reaction;
		private String offset;
		private Api.TypeInputPeer peer;
		private int limit;
		private int id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetChatAvailableReactions extends Api.TypeUpdates {
		private Api.TypeInputPeer peer;
		private String[] availableReactions;
	}

	@Data
	public static class GetAvailableReactions {
		private int hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetDefaultReaction extends Api.TypeBool {
		private String reaction;
	}

	@Data
	public static class TranslateText {
		private String fromLang;
		private Api.TypeInputPeer peer;
		private int msgId;
		private String text;
		private String toLang;
	}

	@Data
	public static class GetUnreadReactions {
		private int maxId;
		private Api.TypeInputPeer peer;
		private int limit;
		private int addOffset;
		private int minId;
		private int offsetId;
	}

	@Data
	public static class ReadReactions {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class SearchSentMedia {
		private Api.TypeMessagesFilter filter;
		private String q;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAttachMenuBots extends Api.TypeAttachMenuBots {
		private BigInteger hash;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetAttachMenuBot extends Api.TypeAttachMenuBotsBot {
		private Api.TypeInputUser bot;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ToggleBotInAttachMenu extends Api.TypeBool {
		private Api.TypeInputUser bot;
		private Boolean enabled;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestWebView extends Api.TypeWebViewResult {
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
	@EqualsAndHashCode(callSuper=false)
	public static class ProlongWebView extends Api.TypeBool {
		private Boolean silent;
		private Api.TypeInputPeer peer;
		private Api.TypeInputUser bot;
		private Api.TypeInputPeer sendAs;
		private int replyToMsgId;
		private BigInteger queryId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestSimpleWebView extends Api.TypeSimpleWebViewResult {
		private Api.TypeDataJSON themeParams;
		private Api.TypeInputUser bot;
		private String url;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendWebViewResultMessage extends Api.TypeWebViewMessageSent {
		private Api.TypeInputBotInlineResult result;
		private String botQueryId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendWebViewData extends Api.TypeUpdates {
		private String buttonText;
		private BigInteger randomId;
		private String data;
		private Api.TypeInputUser bot;
	}

	@Data
	public static class TranscribeAudio {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RateTranscribedAudio extends Api.TypeBool {
		private Api.TypeInputPeer peer;
		private BigInteger transcriptionId;
		private int msgId;
		private Boolean good;
	}
}