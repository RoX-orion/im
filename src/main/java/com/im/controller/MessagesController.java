package com.im.controller;

import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.tl.TLRPC;
import com.im.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

@WebsocketHandler
public class MessagesController {

	private final MessageService messageService;

	@Autowired
	public MessagesController(final MessageService messageService) {
		this.messageService = messageService;
	}

//	@WebsocketHandlerMapping(value = 0x63c66506, name = "GetMessages")
//	public TLRPC.Messages getMessages(TLRPC.GetMessages getMessages) {
//		return null;
//	}
//
	@WebsocketHandlerMapping(value = 0xa0f4cb4f, name = "GetDialogs")
	public TLRPC.TL_messages_dialogs getDialogs(TLRPC.TL_messages_getDialogs getDialogs) {
		return messageService.getDialogs(getDialogs);
	}
//
//	@WebsocketHandlerMapping(value = 0x4423e6c5, name = "GetHistory")
//	public TLRPC.Messages getHistory(TLRPC.GetHistory getHistory) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa0fda762, name = "Search")
//	public TLRPC.Messages search(TLRPC.Search search) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe306d3a, name = "ReadHistory")
//	public TLRPC.AffectedMessages readHistory(TLRPC.ReadHistory readHistory) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb08f922a, name = "DeleteHistory")
//	public TLRPC.AffectedHistory deleteHistory(TLRPC.DeleteHistory deleteHistory) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe58e95d2, name = "DeleteMessages")
//	public TLRPC.AffectedMessages deleteMessages(TLRPC.DeleteMessages deleteMessages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5a954c0, name = "ReceivedMessages")
//	public TLRPC.TL_receivedNotifyMessage[] receivedMessages(TLRPC.ReceivedMessages receivedMessages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x58943ee2, name = "SetTyping")
//	public Boolean setTyping(TLRPC.SetTyping setTyping) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1cc20387, name = "SendMessage")
//	public TLRPC.Updates sendMessage(TLRPC.SendMessage sendMessage) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7547c966, name = "SendMedia")
//	public TLRPC.Updates sendMedia(TLRPC.SendMedia sendMedia) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc661bbc4, name = "ForwardMessages")
//	public TLRPC.Updates forwardMessages(TLRPC.ForwardMessages forwardMessages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xcf1592db, name = "ReportSpam")
//	public Boolean reportSpam(TLRPC.ReportSpam reportSpam) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xefd9a6a2, name = "GetPeerSettings")
//	public TLRPC.PeerSettings getPeerSettings(TLRPC.GetPeerSettings getPeerSettings) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x8953ab4e, name = "Report")
//	public Boolean report(TLRPC.Report report) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x49e9528f, name = "GetChats")
//	public TLRPC.Chats getChats(TLRPC.GetChats getChats) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xaeb00b34, name = "GetFullChat")
//	public TLRPC.ChatFull getFullChat(TLRPC.GetFullChat getFullChat) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x73783ffd, name = "EditChatTitle")
//	public TLRPC.Updates editChatTitle(TLRPC.EditChatTitle editChatTitle) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x35ddd674, name = "EditChatPhoto")
//	public TLRPC.Updates editChatPhoto(TLRPC.EditChatPhoto editChatPhoto) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf24753e3, name = "AddChatUser")
//	public TLRPC.Updates addChatUser(TLRPC.AddChatUser addChatUser) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa2185cab, name = "DeleteChatUser")
//	public TLRPC.Updates deleteChatUser(TLRPC.DeleteChatUser deleteChatUser) {
//		return null;
//	}

	// create group
	@WebsocketHandlerMapping(value = 0x9cb126e, name = "CreateChat")
	public TLRPC.Updates createChat(TLRPC.TL_messages_createChat createChat) {
		return messageService.createChat(createChat);
	}
//
//	@WebsocketHandlerMapping(value = 0x26cf8950, name = "GetDhConfig")
//	public TLRPC.DhConfig getDhConfig(TLRPC.GetDhConfig getDhConfig) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf64daf43, name = "RequestEncryption")
//	public TLRPC.EncryptedChat requestEncryption(TLRPC.RequestEncryption requestEncryption) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3dbc0415, name = "AcceptEncryption")
//	public TLRPC.EncryptedChat acceptEncryption(TLRPC.AcceptEncryption acceptEncryption) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf393aea0, name = "DiscardEncryption")
//	public Boolean discardEncryption(TLRPC.DiscardEncryption discardEncryption) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x791451ed, name = "SetEncryptedTyping")
//	public Boolean setEncryptedTyping(TLRPC.SetEncryptedTyping setEncryptedTyping) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7f4b690a, name = "ReadEncryptedHistory")
//	public Boolean readEncryptedHistory(TLRPC.ReadEncryptedHistory readEncryptedHistory) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x44fa7a15, name = "SendEncrypted")
//	public TLRPC.SentEncryptedMessage sendEncrypted(TLRPC.SendEncrypted sendEncrypted) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5559481d, name = "SendEncryptedFile")
//	public TLRPC.SentEncryptedMessage sendEncryptedFile(TLRPC.SendEncryptedFile sendEncryptedFile) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x32d439a4, name = "SendEncryptedService")
//	public TLRPC.SentEncryptedMessage sendEncryptedService(TLRPC.SendEncryptedService sendEncryptedService) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x55a5bb66, name = "ReceivedQueue")
//	public long[] receivedQueue(TLRPC.ReceivedQueue receivedQueue) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x4b0c8c0f, name = "ReportEncryptedSpam")
//	public Boolean reportEncryptedSpam(TLRPC.ReportEncryptedSpam reportEncryptedSpam) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x36a73f77, name = "ReadMessageContents")
//	public TLRPC.AffectedMessages readMessageContents(TLRPC.ReadMessageContents readMessageContents) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd5a5d3a1, name = "GetStickers")
//	public TLRPC.Stickers getStickers(TLRPC.GetStickers getStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb8a0a1a8, name = "GetAllStickers")
//	public TLRPC.AllStickers getAllStickers(TLRPC.GetAllStickers getAllStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x8b68b0cc, name = "GetWebPagePreview")
//	public TLRPC.MessageMedia getWebPagePreview(TLRPC.GetWebPagePreview getWebPagePreview) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa02ce5d5, name = "ExportChatInvite")
//	public TLRPC.ExportedChatInvite exportChatInvite(TLRPC.ExportChatInvite exportChatInvite) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3eadb1bb, name = "CheckChatInvite")
//	public TLRPC.ChatInvite checkChatInvite(TLRPC.CheckChatInvite checkChatInvite) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x6c50051c, name = "ImportChatInvite")
//	public TLRPC.Updates importChatInvite(TLRPC.ImportChatInvite importChatInvite) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc8a0ec74, name = "GetStickerSet")
//	public TLRPC.StickerSet getStickerSet(TLRPC.GetStickerSet getStickerSet) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc78fe460, name = "InstallStickerSet")
//	public TLRPC.TypeStickerSetInstallResult installStickerSet(TLRPC.InstallStickerSet installStickerSet) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf96e55de, name = "UninstallStickerSet")
//	public Boolean uninstallStickerSet(TLRPC.UninstallStickerSet uninstallStickerSet) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe6df7378, name = "StartBot")
//	public TLRPC.Updates startBot(TLRPC.StartBot startBot) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5784d3e1, name = "GetMessagesViews")
//	public TLRPC.MessageViews getMessagesViews(TLRPC.GetMessagesViews getMessagesViews) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa85bd1c2, name = "EditChatAdmin")
//	public Boolean editChatAdmin(TLRPC.EditChatAdmin editChatAdmin) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa2875319, name = "MigrateChat")
//	public TLRPC.Updates migrateChat(TLRPC.MigrateChat migrateChat) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x4bc6589a, name = "SearchGlobal")
//	public TLRPC.Messages searchGlobal(TLRPC.SearchGlobal searchGlobal) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x78337739, name = "ReorderStickerSets")
//	public Boolean reorderStickerSets(TLRPC.ReorderStickerSets reorderStickerSets) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb1f2061f, name = "GetDocumentByHash")
//	public TLRPC.Document getDocumentByHash(TLRPC.GetDocumentByHash getDocumentByHash) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5cf09635, name = "GetSavedGifs")
//	public TLRPC.SavedGifs getSavedGifs(TLRPC.GetSavedGifs getSavedGifs) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x327a30cb, name = "SaveGif")
//	public Boolean saveGif(TLRPC.SaveGif saveGif) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x514e999d, name = "GetInlineBotResults")
//	public TLRPC.BotResults getInlineBotResults(TLRPC.GetInlineBotResults getInlineBotResults) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xeb5ea206, name = "SetInlineBotResults")
//	public Boolean setInlineBotResults(TLRPC.SetInlineBotResults setInlineBotResults) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd3fbdccb, name = "SendInlineBotResult")
//	public TLRPC.Updates sendInlineBotResult(TLRPC.SendInlineBotResult sendInlineBotResult) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xfda68d36, name = "GetMessageEditData")
//	public TLRPC.MessageEditData getMessageEditData(TLRPC.GetMessageEditData getMessageEditData) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x48f71778, name = "EditMessage")
//	public TLRPC.Updates editMessage(TLRPC.EditMessage editMessage) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x83557dba, name = "EditInlineBotMessage")
//	public Boolean editInlineBotMessage(TLRPC.EditInlineBotMessage editInlineBotMessage) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x9342ca07, name = "GetBotCallbackAnswer")
//	public TLRPC.BotCallbackAnswer getBotCallbackAnswer(TLRPC.GetBotCallbackAnswer getBotCallbackAnswer) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd58f130a, name = "SetBotCallbackAnswer")
//	public Boolean setBotCallbackAnswer(TLRPC.SetBotCallbackAnswer setBotCallbackAnswer) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe470bcfd, name = "GetPeerDialogs")
//	public TLRPC.PeerDialogs getPeerDialogs(TLRPC.GetPeerDialogs getPeerDialogs) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb4331e3f, name = "SaveDraft")
//	public Boolean saveDraft(TLRPC.SaveDraft saveDraft) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x6a3f8d65, name = "GetAllDrafts")
//	public TLRPC.Updates getAllDrafts(TLRPC.GetAllDrafts getAllDrafts) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x64780b14, name = "GetFeaturedStickers")
//	public TLRPC.FeaturedStickers getFeaturedStickers(TLRPC.GetFeaturedStickers getFeaturedStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5b118126, name = "ReadFeaturedStickers")
//	public Boolean readFeaturedStickers(TLRPC.ReadFeaturedStickers readFeaturedStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x9da9403b, name = "GetRecentStickers")
//	public TLRPC.RecentStickers getRecentStickers(TLRPC.GetRecentStickers getRecentStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x392718f8, name = "SaveRecentSticker")
//	public Boolean saveRecentSticker(TLRPC.SaveRecentSticker saveRecentSticker) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x8999602d, name = "ClearRecentStickers")
//	public Boolean clearRecentStickers(TLRPC.ClearRecentStickers clearRecentStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x57f17692, name = "GetArchivedStickers")
//	public TLRPC.ArchivedStickers getArchivedStickers(TLRPC.GetArchivedStickers getArchivedStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x640f82b8, name = "GetMaskStickers")
//	public TLRPC.AllStickers getMaskStickers(TLRPC.GetMaskStickers getMaskStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xcc5b67cc, name = "GetAttachedStickers")
//	public TLRPC.StickerSetCovered[] getAttachedStickers(TLRPC.GetAttachedStickers getAttachedStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x8ef8ecc0, name = "SetGameScore")
//	public TLRPC.Updates setGameScore(TLRPC.SetGameScore setGameScore) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x15ad9f64, name = "SetInlineGameScore")
//	public Boolean setInlineGameScore(TLRPC.SetInlineGameScore setInlineGameScore) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe822649d, name = "GetGameHighScores")
//	public TLRPC.HighScores getGameHighScores(TLRPC.GetGameHighScores getGameHighScores) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf635e1b, name = "GetInlineGameHighScores")
//	public TLRPC.HighScores getInlineGameHighScores(TLRPC.GetInlineGameHighScores getInlineGameHighScores) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe40ca104, name = "GetCommonChats")
//	public TLRPC.Chats getCommonChats(TLRPC.GetCommonChats getCommonChats) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x875f74be, name = "GetAllChats")
//	public TLRPC.Chats getAllChats(TLRPC.GetAllChats getAllChats) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x32ca8f91, name = "GetWebPage")
//	public TLRPC.WebPage getWebPage(TLRPC.GetWebPage getWebPage) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa731e257, name = "ToggleDialogPin")
//	public Boolean toggleDialogPin(TLRPC.ToggleDialogPin toggleDialogPin) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3b1adf37, name = "ReorderPinnedDialogs")
//	public Boolean reorderPinnedDialogs(TLRPC.ReorderPinnedDialogs reorderPinnedDialogs) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd6b94df2, name = "GetPinnedDialogs")
//	public TLRPC.PeerDialogs getPinnedDialogs(TLRPC.GetPinnedDialogs getPinnedDialogs) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe5f672fa, name = "SetBotShippingResults")
//	public Boolean setBotShippingResults(TLRPC.SetBotShippingResults setBotShippingResults) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x9c2dd95, name = "SetBotPrecheckoutResults")
//	public Boolean setBotPrecheckoutResults(TLRPC.SetBotPrecheckoutResults setBotPrecheckoutResults) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x519bc2b1, name = "UploadMedia")
//	public TLRPC.MessageMedia uploadMedia(TLRPC.UploadMedia uploadMedia) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc97df020, name = "SendScreenshotNotification")
//	public TLRPC.Updates sendScreenshotNotification(TLRPC.SendScreenshotNotification sendScreenshotNotification) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x4f1aaa9, name = "GetFavedStickers")
//	public TLRPC.FavedStickers getFavedStickers(TLRPC.GetFavedStickers getFavedStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb9ffc55b, name = "FaveSticker")
//	public Boolean faveSticker(TLRPC.FaveSticker faveSticker) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf107e790, name = "GetUnreadMentions")
//	public TLRPC.Messages getUnreadMentions(TLRPC.GetUnreadMentions getUnreadMentions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x36e5bf4d, name = "ReadMentions")
//	public TLRPC.AffectedHistory readMentions(TLRPC.ReadMentions readMentions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x702a40e0, name = "GetRecentLocations")
//	public TLRPC.Messages getRecentLocations(TLRPC.GetRecentLocations getRecentLocations) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb6f11a1c, name = "SendMultiMedia")
//	public TLRPC.Updates sendMultiMedia(TLRPC.SendMultiMedia sendMultiMedia) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5057c497, name = "UploadEncryptedFile")
//	public TLRPC.EncryptedFile uploadEncryptedFile(TLRPC.UploadEncryptedFile uploadEncryptedFile) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x35705b8a, name = "SearchStickerSets")
//	public TLRPC.FoundStickerSets searchStickerSets(TLRPC.SearchStickerSets searchStickerSets) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1cff7e08, name = "GetSplitRanges")
//	public TLRPC.TL_messageRange[] getSplitRanges(TLRPC.GetSplitRanges getSplitRanges) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc286d98f, name = "MarkDialogUnread")
//	public Boolean markDialogUnread(TLRPC.MarkDialogUnread markDialogUnread) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x22e24e22, name = "GetDialogUnreadMarks")
//	public TLRPC.DialogPeer[] getDialogUnreadMarks(TLRPC.GetDialogUnreadMarks getDialogUnreadMarks) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7e58ee9c, name = "ClearAllDrafts")
//	public Boolean clearAllDrafts(TLRPC.ClearAllDrafts clearAllDrafts) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd2aaf7ec, name = "UpdatePinnedMessage")
//	public TLRPC.Updates updatePinnedMessage(TLRPC.UpdatePinnedMessage updatePinnedMessage) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x10ea6184, name = "SendVote")
//	public TLRPC.Updates sendVote(TLRPC.SendVote sendVote) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x73bb643b, name = "GetPollResults")
//	public TLRPC.Updates getPollResults(TLRPC.GetPollResults getPollResults) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x6e2be050, name = "GetOnlines")
//	public TLRPC.TL_chatOnlines getOnlines(TLRPC.GetOnlines getOnlines) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xdef60797, name = "EditChatAbout")
//	public Boolean editChatAbout(TLRPC.EditChatAbout editChatAbout) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa5866b41, name = "EditChatDefaultBannedRights")
//	public TLRPC.Updates editChatDefaultBannedRights(TLRPC.EditChatDefaultBannedRights editChatDefaultBannedRights) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x35a0e062, name = "GetEmojiKeywords")
//	public TLRPC.TL_emojiKeywordsDifference getEmojiKeywords(TLRPC.GetEmojiKeywords getEmojiKeywords) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1508b6af, name = "GetEmojiKeywordsDifference")
//	public TLRPC.TL_emojiKeywordsDifference getEmojiKeywordsDifference(TLRPC.GetEmojiKeywordsDifference getEmojiKeywordsDifference) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x4e9963b2, name = "GetEmojiKeywordsLanguages")
//	public TLRPC.TL_emojiLanguage[] getEmojiKeywordsLanguages(TLRPC.GetEmojiKeywordsLanguages getEmojiKeywordsLanguages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd5b10c26, name = "GetEmojiURL")
//	public TLRPC.TL_emojiURL getEmojiURL(TLRPC.GetEmojiURL getEmojiURL) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xae7cc1, name = "GetSearchCounters")
//	public TLRPC.SearchCounter[] getSearchCounters(TLRPC.GetSearchCounters getSearchCounters) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x198fb446, name = "RequestUrlAuth")
//	public TLRPC.UrlAuthResult requestUrlAuth(TLRPC.RequestUrlAuth requestUrlAuth) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb12c7125, name = "AcceptUrlAuth")
//	public TLRPC.UrlAuthResult acceptUrlAuth(TLRPC.AcceptUrlAuth acceptUrlAuth) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x4facb138, name = "HidePeerSettingsBar")
//	public Boolean hidePeerSettingsBar(TLRPC.HidePeerSettingsBar hidePeerSettingsBar) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf516760b, name = "GetScheduledHistory")
//	public TLRPC.Messages getScheduledHistory(TLRPC.GetScheduledHistory getScheduledHistory) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xbdbb0464, name = "GetScheduledMessages")
//	public TLRPC.Messages getScheduledMessages(TLRPC.GetScheduledMessages getScheduledMessages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xbd38850a, name = "SendScheduledMessages")
//	public TLRPC.Updates sendScheduledMessages(TLRPC.SendScheduledMessages sendScheduledMessages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x59ae2b16, name = "DeleteScheduledMessages")
//	public TLRPC.Updates deleteScheduledMessages(TLRPC.DeleteScheduledMessages deleteScheduledMessages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb86e380e, name = "GetPollVotes")
//	public TLRPC.VotesList getPollVotes(TLRPC.GetPollVotes getPollVotes) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb5052fea, name = "ToggleStickerSets")
//	public Boolean toggleStickerSets(TLRPC.ToggleStickerSets toggleStickerSets) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf19ed96d, name = "GetDialogFilters")
//	public TLRPC.DialogFilter[] getDialogFilters(TLRPC.GetDialogFilters getDialogFilters) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa29cd42c, name = "GetSuggestedDialogFilters")
//	public TLRPC.TL_dialogFilterSuggested[] getSuggestedDialogFilters(TLRPC.GetSuggestedDialogFilters getSuggestedDialogFilters) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1ad4a04a, name = "UpdateDialogFilter")
//	public Boolean updateDialogFilter(TLRPC.UpdateDialogFilter updateDialogFilter) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc563c1e4, name = "UpdateDialogFiltersOrder")
//	public Boolean updateDialogFiltersOrder(TLRPC.UpdateDialogFiltersOrder updateDialogFiltersOrder) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7ed094a1, name = "GetOldFeaturedStickers")
//	public TLRPC.FeaturedStickers getOldFeaturedStickers(TLRPC.GetOldFeaturedStickers getOldFeaturedStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x22ddd30c, name = "GetReplies")
//	public TLRPC.Messages getReplies(TLRPC.GetReplies getReplies) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x446972fd, name = "GetDiscussionMessage")
//	public TLRPC.DiscussionMessage getDiscussionMessage(TLRPC.GetDiscussionMessage getDiscussionMessage) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf731a9f4, name = "ReadDiscussion")
//	public Boolean readDiscussion(TLRPC.ReadDiscussion readDiscussion) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xee22b9a8, name = "UnpinAllMessages")
//	public TLRPC.AffectedHistory unpinAllMessages(TLRPC.UnpinAllMessages unpinAllMessages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5bd0ee50, name = "DeleteChat")
//	public Boolean deleteChat(TLRPC.DeleteChat deleteChat) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf9cbe409, name = "DeletePhoneCallHistory")
//	public TLRPC.AffectedFoundMessages deletePhoneCallHistory(TLRPC.DeletePhoneCallHistory deletePhoneCallHistory) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x43fe19f3, name = "CheckHistoryImport")
//	public TLRPC.HistoryImportParsed checkHistoryImport(TLRPC.CheckHistoryImport checkHistoryImport) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x34090c3b, name = "InitHistoryImport")
//	public TLRPC.HistoryImport initHistoryImport(TLRPC.InitHistoryImport initHistoryImport) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x2a862092, name = "UploadImportedMedia")
//	public TLRPC.MessageMedia uploadImportedMedia(TLRPC.UploadImportedMedia uploadImportedMedia) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb43df344, name = "StartHistoryImport")
//	public Boolean startHistoryImport(TLRPC.StartHistoryImport startHistoryImport) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa2b5a3f6, name = "GetExportedChatInvites")
//	public TLRPC.ExportedChatInvites getExportedChatInvites(TLRPC.GetExportedChatInvites getExportedChatInvites) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x73746f5c, name = "GetExportedChatInvite")
//	public TLRPC.ExportedChatInvite getExportedChatInvite(TLRPC.GetExportedChatInvite getExportedChatInvite) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xbdca2f75, name = "EditExportedChatInvite")
//	public TLRPC.ExportedChatInvite editExportedChatInvite(TLRPC.EditExportedChatInvite editExportedChatInvite) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x56987bd5, name = "DeleteRevokedExportedChatInvites")
//	public Boolean deleteRevokedExportedChatInvites(TLRPC.DeleteRevokedExportedChatInvites deleteRevokedExportedChatInvites) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd464a42b, name = "DeleteExportedChatInvite")
//	public Boolean deleteExportedChatInvite(TLRPC.DeleteExportedChatInvite deleteExportedChatInvite) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3920e6ef, name = "GetAdminsWithInvites")
//	public TLRPC.ChatAdminsWithInvites getAdminsWithInvites(TLRPC.GetAdminsWithInvites getAdminsWithInvites) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xdf04dd4e, name = "GetChatInviteImporters")
//	public TLRPC.ChatInviteImporters getChatInviteImporters(TLRPC.GetChatInviteImporters getChatInviteImporters) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb80e5fe4, name = "SetHistoryTTL")
//	public TLRPC.Updates setHistoryTTL(TLRPC.SetHistoryTTL setHistoryTTL) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5dc60f03, name = "CheckHistoryImportPeer")
//	public TLRPC.CheckedHistoryImportPeer checkHistoryImportPeer(TLRPC.CheckHistoryImportPeer checkHistoryImportPeer) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe63be13f, name = "SetChatTheme")
//	public TLRPC.Updates setChatTheme(TLRPC.SetChatTheme setChatTheme) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x2c6f97b7, name = "GetMessageReadParticipants")
//	public long[] getMessageReadParticipants(TLRPC.GetMessageReadParticipants getMessageReadParticipants) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x49f0bde9, name = "GetSearchResultsCalendar")
//	public TLRPC.SearchResultsCalendar getSearchResultsCalendar(TLRPC.GetSearchResultsCalendar getSearchResultsCalendar) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x6e9583a3, name = "GetSearchResultsPositions")
//	public TLRPC.SearchResultsPositions getSearchResultsPositions(TLRPC.GetSearchResultsPositions getSearchResultsPositions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7fe7e815, name = "HideChatJoinRequest")
//	public TLRPC.Updates hideChatJoinRequest(TLRPC.HideChatJoinRequest hideChatJoinRequest) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe085f4ea, name = "HideAllChatJoinRequests")
//	public TLRPC.Updates hideAllChatJoinRequests(TLRPC.HideAllChatJoinRequests hideAllChatJoinRequests) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb11eafa2, name = "ToggleNoForwards")
//	public TLRPC.Updates toggleNoForwards(TLRPC.ToggleNoForwards toggleNoForwards) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xccfddf96, name = "SaveDefaultSendAs")
//	public Boolean saveDefaultSendAs(TLRPC.SaveDefaultSendAs saveDefaultSendAs) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd30d78d4, name = "SendReaction")
//	public TLRPC.Updates sendReaction(TLRPC.SendReaction sendReaction) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x8bba90e6, name = "GetMessagesReactions")
//	public TLRPC.Updates getMessagesReactions(TLRPC.GetMessagesReactions getMessagesReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x461b3f48, name = "GetMessageReactionsList")
//	public TLRPC.MessageReactionsList getMessageReactionsList(TLRPC.GetMessageReactionsList getMessageReactionsList) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xfeb16771, name = "SetChatAvailableReactions")
//	public TLRPC.Updates setChatAvailableReactions(TLRPC.SetChatAvailableReactions setChatAvailableReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x18dea0ac, name = "GetAvailableReactions")
//	public TLRPC.AvailableReactions getAvailableReactions(TLRPC.GetAvailableReactions getAvailableReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x4f47a016, name = "SetDefaultReaction")
//	public Boolean setDefaultReaction(TLRPC.SetDefaultReaction setDefaultReaction) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x24ce6dee, name = "TranslateText")
//	public TLRPC.TypeTranslatedText translateText(TLRPC.TranslateText translateText) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3223495b, name = "GetUnreadReactions")
//	public TLRPC.Messages getUnreadReactions(TLRPC.GetUnreadReactions getUnreadReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x54aa7f8e, name = "ReadReactions")
//	public TLRPC.AffectedHistory readReactions(TLRPC.ReadReactions readReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x107e31a0, name = "SearchSentMedia")
//	public TLRPC.Messages searchSentMedia(TLRPC.SearchSentMedia searchSentMedia) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x16fcc2cb, name = "GetAttachMenuBots")
//	public TLRPC.AttachMenuBots getAttachMenuBots(TLRPC.GetAttachMenuBots getAttachMenuBots) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x77216192, name = "GetAttachMenuBot")
//	public TLRPC.TL_attachMenuBotsBot getAttachMenuBot(TLRPC.GetAttachMenuBot getAttachMenuBot) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1aee33af, name = "ToggleBotInAttachMenu")
//	public Boolean toggleBotInAttachMenu(TLRPC.ToggleBotInAttachMenu toggleBotInAttachMenu) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x178b480b, name = "RequestWebView")
//	public TLRPC.TL_messages_webViewResult requestWebView(TLRPC.RequestWebView requestWebView) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7ff34309, name = "ProlongWebView")
//	public Boolean prolongWebView(TLRPC.ProlongWebView prolongWebView) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x299bec8e, name = "RequestSimpleWebView")
//	public TLRPC.TL_simpleWebViewResultUrl requestSimpleWebView(TLRPC.RequestSimpleWebView requestSimpleWebView) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa4314f5, name = "SendWebViewResultMessage")
//	public TLRPC.TL_webViewMessageSent sendWebViewResultMessage(TLRPC.SendWebViewResultMessage sendWebViewResultMessage) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xdc0242c8, name = "SendWebViewData")
//	public TLRPC.Updates sendWebViewData(TLRPC.SendWebViewData sendWebViewData) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x269e9a49, name = "TranscribeAudio")
//	public TLRPC.TranscribedAudio transcribeAudio(TLRPC.TranscribeAudio transcribeAudio) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7f1d072f, name = "RateTranscribedAudio")
//	public Boolean rateTranscribedAudio(TLRPC.RateTranscribedAudio rateTranscribedAudio) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd9ab0f54, name = "GetCustomEmojiDocuments")
//	public TLRPC.Document[] getCustomEmojiDocuments(TLRPC.GetCustomEmojiDocuments getCustomEmojiDocuments) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xfbfca18f, name = "GetEmojiStickers")
//	public TLRPC.AllStickers getEmojiStickers(TLRPC.GetEmojiStickers getEmojiStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xecf6736, name = "GetFeaturedEmojiStickers")
//	public TLRPC.FeaturedStickers getFeaturedEmojiStickers(TLRPC.GetFeaturedEmojiStickers getFeaturedEmojiStickers) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3f64c076, name = "ReportReaction")
//	public Boolean reportReaction(TLRPC.ReportReaction reportReaction) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xbb8125ba, name = "GetTopReactions")
//	public TLRPC.Reactions getTopReactions(TLRPC.GetTopReactions getTopReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x39461db2, name = "GetRecentReactions")
//	public TLRPC.Reactions getRecentReactions(TLRPC.GetRecentReactions getRecentReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x9dfeefb4, name = "ClearRecentReactions")
//	public Boolean clearRecentReactions(TLRPC.ClearRecentReactions clearRecentReactions) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x84f80814, name = "GetExtendedMedia")
//	public TLRPC.Updates getExtendedMedia(TLRPC.GetExtendedMedia getExtendedMedia) {
//		return null;
//	}
}
