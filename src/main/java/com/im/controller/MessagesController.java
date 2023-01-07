package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class MessagesController {

	@WebsocketHandlerMapping(value = 0x63c66506, name = "GetMessages")
	public MessagesApi.Messages getMessages(MessagesApi.GetMessages getMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa0f4cb4f, name = "GetDialogs")
	public MessagesApi.Dialogs getDialogs(MessagesApi.GetDialogs getDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4423e6c5, name = "GetHistory")
	public MessagesApi.Messages getHistory(MessagesApi.GetHistory getHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa0fda762, name = "Search")
	public MessagesApi.Messages search(MessagesApi.Search search) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe306d3a, name = "ReadHistory")
	public MessagesApi.AffectedMessages readHistory(MessagesApi.ReadHistory readHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb08f922a, name = "DeleteHistory")
	public MessagesApi.AffectedHistory deleteHistory(MessagesApi.DeleteHistory deleteHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe58e95d2, name = "DeleteMessages")
	public MessagesApi.AffectedMessages deleteMessages(MessagesApi.DeleteMessages deleteMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5a954c0, name = "ReceivedMessages")
	public Api.ReceivedNotifyMessage[] receivedMessages(MessagesApi.ReceivedMessages receivedMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x58943ee2, name = "SetTyping")
	public Boolean setTyping(MessagesApi.SetTyping setTyping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1cc20387, name = "SendMessage")
	public Api.Updates sendMessage(MessagesApi.SendMessage sendMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7547c966, name = "SendMedia")
	public Api.Updates sendMedia(MessagesApi.SendMedia sendMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc661bbc4, name = "ForwardMessages")
	public Api.Updates forwardMessages(MessagesApi.ForwardMessages forwardMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xcf1592db, name = "ReportSpam")
	public Boolean reportSpam(MessagesApi.ReportSpam reportSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xefd9a6a2, name = "GetPeerSettings")
	public MessagesApi.PeerSettings getPeerSettings(MessagesApi.GetPeerSettings getPeerSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8953ab4e, name = "Report")
	public Boolean report(MessagesApi.Report report) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x49e9528f, name = "GetChats")
	public MessagesApi.Chats getChats(MessagesApi.GetChats getChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xaeb00b34, name = "GetFullChat")
	public MessagesApi.ChatFull getFullChat(MessagesApi.GetFullChat getFullChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x73783ffd, name = "EditChatTitle")
	public Api.Updates editChatTitle(MessagesApi.EditChatTitle editChatTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x35ddd674, name = "EditChatPhoto")
	public Api.Updates editChatPhoto(MessagesApi.EditChatPhoto editChatPhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf24753e3, name = "AddChatUser")
	public Api.Updates addChatUser(MessagesApi.AddChatUser addChatUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa2185cab, name = "DeleteChatUser")
	public Api.Updates deleteChatUser(MessagesApi.DeleteChatUser deleteChatUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9cb126e, name = "CreateChat")
	public Api.Updates createChat(MessagesApi.CreateChat createChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x26cf8950, name = "GetDhConfig")
	public MessagesApi.DhConfig getDhConfig(MessagesApi.GetDhConfig getDhConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf64daf43, name = "RequestEncryption")
	public Api.EncryptedChat requestEncryption(MessagesApi.RequestEncryption requestEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3dbc0415, name = "AcceptEncryption")
	public Api.EncryptedChat acceptEncryption(MessagesApi.AcceptEncryption acceptEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf393aea0, name = "DiscardEncryption")
	public Boolean discardEncryption(MessagesApi.DiscardEncryption discardEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x791451ed, name = "SetEncryptedTyping")
	public Boolean setEncryptedTyping(MessagesApi.SetEncryptedTyping setEncryptedTyping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7f4b690a, name = "ReadEncryptedHistory")
	public Boolean readEncryptedHistory(MessagesApi.ReadEncryptedHistory readEncryptedHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x44fa7a15, name = "SendEncrypted")
	public MessagesApi.SentEncryptedMessage sendEncrypted(MessagesApi.SendEncrypted sendEncrypted) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5559481d, name = "SendEncryptedFile")
	public MessagesApi.SentEncryptedMessage sendEncryptedFile(MessagesApi.SendEncryptedFile sendEncryptedFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x32d439a4, name = "SendEncryptedService")
	public MessagesApi.SentEncryptedMessage sendEncryptedService(MessagesApi.SendEncryptedService sendEncryptedService) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x55a5bb66, name = "ReceivedQueue")
	public long[] receivedQueue(MessagesApi.ReceivedQueue receivedQueue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4b0c8c0f, name = "ReportEncryptedSpam")
	public Boolean reportEncryptedSpam(MessagesApi.ReportEncryptedSpam reportEncryptedSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x36a73f77, name = "ReadMessageContents")
	public MessagesApi.AffectedMessages readMessageContents(MessagesApi.ReadMessageContents readMessageContents) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd5a5d3a1, name = "GetStickers")
	public MessagesApi.Stickers getStickers(MessagesApi.GetStickers getStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb8a0a1a8, name = "GetAllStickers")
	public MessagesApi.AllStickers getAllStickers(MessagesApi.GetAllStickers getAllStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8b68b0cc, name = "GetWebPagePreview")
	public Api.TypeMessageMedia getWebPagePreview(MessagesApi.GetWebPagePreview getWebPagePreview) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa02ce5d5, name = "ExportChatInvite")
	public MessagesApi.ExportedChatInvite exportChatInvite(MessagesApi.ExportChatInvite exportChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3eadb1bb, name = "CheckChatInvite")
	public Api.ChatInvite checkChatInvite(MessagesApi.CheckChatInvite checkChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6c50051c, name = "ImportChatInvite")
	public Api.Updates importChatInvite(MessagesApi.ImportChatInvite importChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc8a0ec74, name = "GetStickerSet")
	public MessagesApi.StickerSet getStickerSet(MessagesApi.GetStickerSet getStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc78fe460, name = "InstallStickerSet")
	public MessagesApi.TypeStickerSetInstallResult installStickerSet(MessagesApi.InstallStickerSet installStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf96e55de, name = "UninstallStickerSet")
	public Boolean uninstallStickerSet(MessagesApi.UninstallStickerSet uninstallStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe6df7378, name = "StartBot")
	public Api.Updates startBot(MessagesApi.StartBot startBot) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5784d3e1, name = "GetMessagesViews")
	public MessagesApi.MessageViews getMessagesViews(MessagesApi.GetMessagesViews getMessagesViews) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa85bd1c2, name = "EditChatAdmin")
	public Boolean editChatAdmin(MessagesApi.EditChatAdmin editChatAdmin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa2875319, name = "MigrateChat")
	public Api.Updates migrateChat(MessagesApi.MigrateChat migrateChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4bc6589a, name = "SearchGlobal")
	public MessagesApi.Messages searchGlobal(MessagesApi.SearchGlobal searchGlobal) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x78337739, name = "ReorderStickerSets")
	public Boolean reorderStickerSets(MessagesApi.ReorderStickerSets reorderStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb1f2061f, name = "GetDocumentByHash")
	public Api.Document getDocumentByHash(MessagesApi.GetDocumentByHash getDocumentByHash) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5cf09635, name = "GetSavedGifs")
	public MessagesApi.SavedGifs getSavedGifs(MessagesApi.GetSavedGifs getSavedGifs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x327a30cb, name = "SaveGif")
	public Boolean saveGif(MessagesApi.SaveGif saveGif) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x514e999d, name = "GetInlineBotResults")
	public MessagesApi.BotResults getInlineBotResults(MessagesApi.GetInlineBotResults getInlineBotResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xeb5ea206, name = "SetInlineBotResults")
	public Boolean setInlineBotResults(MessagesApi.SetInlineBotResults setInlineBotResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd3fbdccb, name = "SendInlineBotResult")
	public Api.Updates sendInlineBotResult(MessagesApi.SendInlineBotResult sendInlineBotResult) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfda68d36, name = "GetMessageEditData")
	public MessagesApi.MessageEditData getMessageEditData(MessagesApi.GetMessageEditData getMessageEditData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x48f71778, name = "EditMessage")
	public Api.Updates editMessage(MessagesApi.EditMessage editMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x83557dba, name = "EditInlineBotMessage")
	public Boolean editInlineBotMessage(MessagesApi.EditInlineBotMessage editInlineBotMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9342ca07, name = "GetBotCallbackAnswer")
	public MessagesApi.BotCallbackAnswer getBotCallbackAnswer(MessagesApi.GetBotCallbackAnswer getBotCallbackAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd58f130a, name = "SetBotCallbackAnswer")
	public Boolean setBotCallbackAnswer(MessagesApi.SetBotCallbackAnswer setBotCallbackAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe470bcfd, name = "GetPeerDialogs")
	public MessagesApi.PeerDialogs getPeerDialogs(MessagesApi.GetPeerDialogs getPeerDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb4331e3f, name = "SaveDraft")
	public Boolean saveDraft(MessagesApi.SaveDraft saveDraft) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6a3f8d65, name = "GetAllDrafts")
	public Api.Updates getAllDrafts(MessagesApi.GetAllDrafts getAllDrafts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x64780b14, name = "GetFeaturedStickers")
	public MessagesApi.FeaturedStickers getFeaturedStickers(MessagesApi.GetFeaturedStickers getFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5b118126, name = "ReadFeaturedStickers")
	public Boolean readFeaturedStickers(MessagesApi.ReadFeaturedStickers readFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9da9403b, name = "GetRecentStickers")
	public MessagesApi.RecentStickers getRecentStickers(MessagesApi.GetRecentStickers getRecentStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x392718f8, name = "SaveRecentSticker")
	public Boolean saveRecentSticker(MessagesApi.SaveRecentSticker saveRecentSticker) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8999602d, name = "ClearRecentStickers")
	public Boolean clearRecentStickers(MessagesApi.ClearRecentStickers clearRecentStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x57f17692, name = "GetArchivedStickers")
	public MessagesApi.ArchivedStickers getArchivedStickers(MessagesApi.GetArchivedStickers getArchivedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x640f82b8, name = "GetMaskStickers")
	public MessagesApi.AllStickers getMaskStickers(MessagesApi.GetMaskStickers getMaskStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xcc5b67cc, name = "GetAttachedStickers")
	public Api.StickerSetCovered[] getAttachedStickers(MessagesApi.GetAttachedStickers getAttachedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8ef8ecc0, name = "SetGameScore")
	public Api.Updates setGameScore(MessagesApi.SetGameScore setGameScore) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x15ad9f64, name = "SetInlineGameScore")
	public Boolean setInlineGameScore(MessagesApi.SetInlineGameScore setInlineGameScore) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe822649d, name = "GetGameHighScores")
	public MessagesApi.HighScores getGameHighScores(MessagesApi.GetGameHighScores getGameHighScores) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf635e1b, name = "GetInlineGameHighScores")
	public MessagesApi.HighScores getInlineGameHighScores(MessagesApi.GetInlineGameHighScores getInlineGameHighScores) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe40ca104, name = "GetCommonChats")
	public MessagesApi.Chats getCommonChats(MessagesApi.GetCommonChats getCommonChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x875f74be, name = "GetAllChats")
	public MessagesApi.Chats getAllChats(MessagesApi.GetAllChats getAllChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x32ca8f91, name = "GetWebPage")
	public Api.WebPage getWebPage(MessagesApi.GetWebPage getWebPage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa731e257, name = "ToggleDialogPin")
	public Boolean toggleDialogPin(MessagesApi.ToggleDialogPin toggleDialogPin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3b1adf37, name = "ReorderPinnedDialogs")
	public Boolean reorderPinnedDialogs(MessagesApi.ReorderPinnedDialogs reorderPinnedDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd6b94df2, name = "GetPinnedDialogs")
	public MessagesApi.PeerDialogs getPinnedDialogs(MessagesApi.GetPinnedDialogs getPinnedDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe5f672fa, name = "SetBotShippingResults")
	public Boolean setBotShippingResults(MessagesApi.SetBotShippingResults setBotShippingResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9c2dd95, name = "SetBotPrecheckoutResults")
	public Boolean setBotPrecheckoutResults(MessagesApi.SetBotPrecheckoutResults setBotPrecheckoutResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x519bc2b1, name = "UploadMedia")
	public Api.TypeMessageMedia uploadMedia(MessagesApi.UploadMedia uploadMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc97df020, name = "SendScreenshotNotification")
	public Api.Updates sendScreenshotNotification(MessagesApi.SendScreenshotNotification sendScreenshotNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4f1aaa9, name = "GetFavedStickers")
	public MessagesApi.FavedStickers getFavedStickers(MessagesApi.GetFavedStickers getFavedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb9ffc55b, name = "FaveSticker")
	public Boolean faveSticker(MessagesApi.FaveSticker faveSticker) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf107e790, name = "GetUnreadMentions")
	public MessagesApi.Messages getUnreadMentions(MessagesApi.GetUnreadMentions getUnreadMentions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x36e5bf4d, name = "ReadMentions")
	public MessagesApi.AffectedHistory readMentions(MessagesApi.ReadMentions readMentions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x702a40e0, name = "GetRecentLocations")
	public MessagesApi.Messages getRecentLocations(MessagesApi.GetRecentLocations getRecentLocations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb6f11a1c, name = "SendMultiMedia")
	public Api.Updates sendMultiMedia(MessagesApi.SendMultiMedia sendMultiMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5057c497, name = "UploadEncryptedFile")
	public Api.EncryptedFile uploadEncryptedFile(MessagesApi.UploadEncryptedFile uploadEncryptedFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x35705b8a, name = "SearchStickerSets")
	public MessagesApi.FoundStickerSets searchStickerSets(MessagesApi.SearchStickerSets searchStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1cff7e08, name = "GetSplitRanges")
	public Api.MessageRange[] getSplitRanges(MessagesApi.GetSplitRanges getSplitRanges) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc286d98f, name = "MarkDialogUnread")
	public Boolean markDialogUnread(MessagesApi.MarkDialogUnread markDialogUnread) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x22e24e22, name = "GetDialogUnreadMarks")
	public Api.DialogPeer[] getDialogUnreadMarks(MessagesApi.GetDialogUnreadMarks getDialogUnreadMarks) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7e58ee9c, name = "ClearAllDrafts")
	public Boolean clearAllDrafts(MessagesApi.ClearAllDrafts clearAllDrafts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd2aaf7ec, name = "UpdatePinnedMessage")
	public Api.Updates updatePinnedMessage(MessagesApi.UpdatePinnedMessage updatePinnedMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x10ea6184, name = "SendVote")
	public Api.Updates sendVote(MessagesApi.SendVote sendVote) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x73bb643b, name = "GetPollResults")
	public Api.Updates getPollResults(MessagesApi.GetPollResults getPollResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6e2be050, name = "GetOnlines")
	public Api.ChatOnlines getOnlines(MessagesApi.GetOnlines getOnlines) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdef60797, name = "EditChatAbout")
	public Boolean editChatAbout(MessagesApi.EditChatAbout editChatAbout) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa5866b41, name = "EditChatDefaultBannedRights")
	public Api.Updates editChatDefaultBannedRights(MessagesApi.EditChatDefaultBannedRights editChatDefaultBannedRights) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x35a0e062, name = "GetEmojiKeywords")
	public Api.EmojiKeywordsDifference getEmojiKeywords(MessagesApi.GetEmojiKeywords getEmojiKeywords) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1508b6af, name = "GetEmojiKeywordsDifference")
	public Api.EmojiKeywordsDifference getEmojiKeywordsDifference(MessagesApi.GetEmojiKeywordsDifference getEmojiKeywordsDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4e9963b2, name = "GetEmojiKeywordsLanguages")
	public Api.EmojiLanguage[] getEmojiKeywordsLanguages(MessagesApi.GetEmojiKeywordsLanguages getEmojiKeywordsLanguages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd5b10c26, name = "GetEmojiURL")
	public Api.EmojiURL getEmojiURL(MessagesApi.GetEmojiURL getEmojiURL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xae7cc1, name = "GetSearchCounters")
	public MessagesApi.SearchCounter[] getSearchCounters(MessagesApi.GetSearchCounters getSearchCounters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x198fb446, name = "RequestUrlAuth")
	public Api.TypeUrlAuthResult requestUrlAuth(MessagesApi.RequestUrlAuth requestUrlAuth) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb12c7125, name = "AcceptUrlAuth")
	public Api.TypeUrlAuthResult acceptUrlAuth(MessagesApi.AcceptUrlAuth acceptUrlAuth) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4facb138, name = "HidePeerSettingsBar")
	public Boolean hidePeerSettingsBar(MessagesApi.HidePeerSettingsBar hidePeerSettingsBar) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf516760b, name = "GetScheduledHistory")
	public MessagesApi.Messages getScheduledHistory(MessagesApi.GetScheduledHistory getScheduledHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbdbb0464, name = "GetScheduledMessages")
	public MessagesApi.Messages getScheduledMessages(MessagesApi.GetScheduledMessages getScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbd38850a, name = "SendScheduledMessages")
	public Api.Updates sendScheduledMessages(MessagesApi.SendScheduledMessages sendScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x59ae2b16, name = "DeleteScheduledMessages")
	public Api.Updates deleteScheduledMessages(MessagesApi.DeleteScheduledMessages deleteScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb86e380e, name = "GetPollVotes")
	public MessagesApi.VotesList getPollVotes(MessagesApi.GetPollVotes getPollVotes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb5052fea, name = "ToggleStickerSets")
	public Boolean toggleStickerSets(MessagesApi.ToggleStickerSets toggleStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf19ed96d, name = "GetDialogFilters")
	public Api.DialogFilter[] getDialogFilters(MessagesApi.GetDialogFilters getDialogFilters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa29cd42c, name = "GetSuggestedDialogFilters")
	public Api.DialogFilterSuggested[] getSuggestedDialogFilters(MessagesApi.GetSuggestedDialogFilters getSuggestedDialogFilters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1ad4a04a, name = "UpdateDialogFilter")
	public Boolean updateDialogFilter(MessagesApi.UpdateDialogFilter updateDialogFilter) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc563c1e4, name = "UpdateDialogFiltersOrder")
	public Boolean updateDialogFiltersOrder(MessagesApi.UpdateDialogFiltersOrder updateDialogFiltersOrder) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7ed094a1, name = "GetOldFeaturedStickers")
	public MessagesApi.FeaturedStickers getOldFeaturedStickers(MessagesApi.GetOldFeaturedStickers getOldFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x22ddd30c, name = "GetReplies")
	public MessagesApi.Messages getReplies(MessagesApi.GetReplies getReplies) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x446972fd, name = "GetDiscussionMessage")
	public MessagesApi.DiscussionMessage getDiscussionMessage(MessagesApi.GetDiscussionMessage getDiscussionMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf731a9f4, name = "ReadDiscussion")
	public Boolean readDiscussion(MessagesApi.ReadDiscussion readDiscussion) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xee22b9a8, name = "UnpinAllMessages")
	public MessagesApi.AffectedHistory unpinAllMessages(MessagesApi.UnpinAllMessages unpinAllMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5bd0ee50, name = "DeleteChat")
	public Boolean deleteChat(MessagesApi.DeleteChat deleteChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf9cbe409, name = "DeletePhoneCallHistory")
	public MessagesApi.AffectedFoundMessages deletePhoneCallHistory(MessagesApi.DeletePhoneCallHistory deletePhoneCallHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x43fe19f3, name = "CheckHistoryImport")
	public MessagesApi.HistoryImportParsed checkHistoryImport(MessagesApi.CheckHistoryImport checkHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x34090c3b, name = "InitHistoryImport")
	public MessagesApi.HistoryImport initHistoryImport(MessagesApi.InitHistoryImport initHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2a862092, name = "UploadImportedMedia")
	public Api.TypeMessageMedia uploadImportedMedia(MessagesApi.UploadImportedMedia uploadImportedMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb43df344, name = "StartHistoryImport")
	public Boolean startHistoryImport(MessagesApi.StartHistoryImport startHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa2b5a3f6, name = "GetExportedChatInvites")
	public MessagesApi.ExportedChatInvites getExportedChatInvites(MessagesApi.GetExportedChatInvites getExportedChatInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x73746f5c, name = "GetExportedChatInvite")
	public MessagesApi.ExportedChatInvite getExportedChatInvite(MessagesApi.GetExportedChatInvite getExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbdca2f75, name = "EditExportedChatInvite")
	public MessagesApi.ExportedChatInvite editExportedChatInvite(MessagesApi.EditExportedChatInvite editExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x56987bd5, name = "DeleteRevokedExportedChatInvites")
	public Boolean deleteRevokedExportedChatInvites(MessagesApi.DeleteRevokedExportedChatInvites deleteRevokedExportedChatInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd464a42b, name = "DeleteExportedChatInvite")
	public Boolean deleteExportedChatInvite(MessagesApi.DeleteExportedChatInvite deleteExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3920e6ef, name = "GetAdminsWithInvites")
	public MessagesApi.ChatAdminsWithInvites getAdminsWithInvites(MessagesApi.GetAdminsWithInvites getAdminsWithInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdf04dd4e, name = "GetChatInviteImporters")
	public MessagesApi.ChatInviteImporters getChatInviteImporters(MessagesApi.GetChatInviteImporters getChatInviteImporters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb80e5fe4, name = "SetHistoryTTL")
	public Api.Updates setHistoryTTL(MessagesApi.SetHistoryTTL setHistoryTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5dc60f03, name = "CheckHistoryImportPeer")
	public MessagesApi.CheckedHistoryImportPeer checkHistoryImportPeer(MessagesApi.CheckHistoryImportPeer checkHistoryImportPeer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe63be13f, name = "SetChatTheme")
	public Api.Updates setChatTheme(MessagesApi.SetChatTheme setChatTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2c6f97b7, name = "GetMessageReadParticipants")
	public long[] getMessageReadParticipants(MessagesApi.GetMessageReadParticipants getMessageReadParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x49f0bde9, name = "GetSearchResultsCalendar")
	public MessagesApi.SearchResultsCalendar getSearchResultsCalendar(MessagesApi.GetSearchResultsCalendar getSearchResultsCalendar) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6e9583a3, name = "GetSearchResultsPositions")
	public MessagesApi.SearchResultsPositions getSearchResultsPositions(MessagesApi.GetSearchResultsPositions getSearchResultsPositions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7fe7e815, name = "HideChatJoinRequest")
	public Api.Updates hideChatJoinRequest(MessagesApi.HideChatJoinRequest hideChatJoinRequest) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe085f4ea, name = "HideAllChatJoinRequests")
	public Api.Updates hideAllChatJoinRequests(MessagesApi.HideAllChatJoinRequests hideAllChatJoinRequests) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb11eafa2, name = "ToggleNoForwards")
	public Api.Updates toggleNoForwards(MessagesApi.ToggleNoForwards toggleNoForwards) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xccfddf96, name = "SaveDefaultSendAs")
	public Boolean saveDefaultSendAs(MessagesApi.SaveDefaultSendAs saveDefaultSendAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd30d78d4, name = "SendReaction")
	public Api.Updates sendReaction(MessagesApi.SendReaction sendReaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8bba90e6, name = "GetMessagesReactions")
	public Api.Updates getMessagesReactions(MessagesApi.GetMessagesReactions getMessagesReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x461b3f48, name = "GetMessageReactionsList")
	public MessagesApi.MessageReactionsList getMessageReactionsList(MessagesApi.GetMessageReactionsList getMessageReactionsList) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfeb16771, name = "SetChatAvailableReactions")
	public Api.Updates setChatAvailableReactions(MessagesApi.SetChatAvailableReactions setChatAvailableReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x18dea0ac, name = "GetAvailableReactions")
	public MessagesApi.AvailableReactions getAvailableReactions(MessagesApi.GetAvailableReactions getAvailableReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4f47a016, name = "SetDefaultReaction")
	public Boolean setDefaultReaction(MessagesApi.SetDefaultReaction setDefaultReaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x24ce6dee, name = "TranslateText")
	public MessagesApi.TypeTranslatedText translateText(MessagesApi.TranslateText translateText) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3223495b, name = "GetUnreadReactions")
	public MessagesApi.Messages getUnreadReactions(MessagesApi.GetUnreadReactions getUnreadReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x54aa7f8e, name = "ReadReactions")
	public MessagesApi.AffectedHistory readReactions(MessagesApi.ReadReactions readReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x107e31a0, name = "SearchSentMedia")
	public MessagesApi.Messages searchSentMedia(MessagesApi.SearchSentMedia searchSentMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x16fcc2cb, name = "GetAttachMenuBots")
	public Api.AttachMenuBots getAttachMenuBots(MessagesApi.GetAttachMenuBots getAttachMenuBots) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x77216192, name = "GetAttachMenuBot")
	public Api.AttachMenuBotsBot getAttachMenuBot(MessagesApi.GetAttachMenuBot getAttachMenuBot) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1aee33af, name = "ToggleBotInAttachMenu")
	public Boolean toggleBotInAttachMenu(MessagesApi.ToggleBotInAttachMenu toggleBotInAttachMenu) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x178b480b, name = "RequestWebView")
	public Api.TypeWebViewResult requestWebView(MessagesApi.RequestWebView requestWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7ff34309, name = "ProlongWebView")
	public Boolean prolongWebView(MessagesApi.ProlongWebView prolongWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x299bec8e, name = "RequestSimpleWebView")
	public Api.TypeSimpleWebViewResult requestSimpleWebView(MessagesApi.RequestSimpleWebView requestSimpleWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa4314f5, name = "SendWebViewResultMessage")
	public Api.WebViewMessageSent sendWebViewResultMessage(MessagesApi.SendWebViewResultMessage sendWebViewResultMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdc0242c8, name = "SendWebViewData")
	public Api.Updates sendWebViewData(MessagesApi.SendWebViewData sendWebViewData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x269e9a49, name = "TranscribeAudio")
	public MessagesApi.TranscribedAudio transcribeAudio(MessagesApi.TranscribeAudio transcribeAudio) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7f1d072f, name = "RateTranscribedAudio")
	public Boolean rateTranscribedAudio(MessagesApi.RateTranscribedAudio rateTranscribedAudio) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd9ab0f54, name = "GetCustomEmojiDocuments")
	public Api.Document[] getCustomEmojiDocuments(MessagesApi.GetCustomEmojiDocuments getCustomEmojiDocuments) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfbfca18f, name = "GetEmojiStickers")
	public MessagesApi.AllStickers getEmojiStickers(MessagesApi.GetEmojiStickers getEmojiStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xecf6736, name = "GetFeaturedEmojiStickers")
	public MessagesApi.FeaturedStickers getFeaturedEmojiStickers(MessagesApi.GetFeaturedEmojiStickers getFeaturedEmojiStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3f64c076, name = "ReportReaction")
	public Boolean reportReaction(MessagesApi.ReportReaction reportReaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbb8125ba, name = "GetTopReactions")
	public MessagesApi.Reactions getTopReactions(MessagesApi.GetTopReactions getTopReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x39461db2, name = "GetRecentReactions")
	public MessagesApi.Reactions getRecentReactions(MessagesApi.GetRecentReactions getRecentReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9dfeefb4, name = "ClearRecentReactions")
	public Boolean clearRecentReactions(MessagesApi.ClearRecentReactions clearRecentReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x84f80814, name = "GetExtendedMedia")
	public Api.Updates getExtendedMedia(MessagesApi.GetExtendedMedia getExtendedMedia) {
		return null;
	}
}