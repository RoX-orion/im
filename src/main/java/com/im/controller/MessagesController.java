package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class MessagesController {

	@WebsocketHandlerMapping(value = 1673946374, name = "GetMessages")
	public MessagesApi.Messages getMessages(MessagesApi.GetMessages getMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1594569905, name = "GetDialogs")
	public MessagesApi.Dialogs getDialogs(MessagesApi.GetDialogs getDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1143203525, name = "GetHistory")
	public MessagesApi.Messages getHistory(MessagesApi.GetHistory getHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1593989278, name = "Search")
	public MessagesApi.Messages search(MessagesApi.Search search) {
		return null;
	}

	@WebsocketHandlerMapping(value = 238054714, name = "ReadHistory")
	public MessagesApi.AffectedMessages readHistory(MessagesApi.ReadHistory readHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1332768214, name = "DeleteHistory")
	public MessagesApi.AffectedHistory deleteHistory(MessagesApi.DeleteHistory deleteHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = -443640366, name = "DeleteMessages")
	public MessagesApi.AffectedMessages deleteMessages(MessagesApi.DeleteMessages deleteMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 94983360, name = "ReceivedMessages")
	public Api.ReceivedNotifyMessage[] receivedMessages(MessagesApi.ReceivedMessages receivedMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1486110434, name = "SetTyping")
	public Boolean setTyping(MessagesApi.SetTyping setTyping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 228423076, name = "SendMessage")
	public Api.Updates sendMessage(MessagesApi.SendMessage sendMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = -497026848, name = "SendMedia")
	public Api.Updates sendMedia(MessagesApi.SendMedia sendMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = -869258997, name = "ForwardMessages")
	public Api.Updates forwardMessages(MessagesApi.ForwardMessages forwardMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = -820669733, name = "ReportSpam")
	public Boolean reportSpam(MessagesApi.ReportSpam reportSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = -270948702, name = "GetPeerSettings")
	public MessagesApi.PeerSettings getPeerSettings(MessagesApi.GetPeerSettings getPeerSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1991005362, name = "Report")
	public Boolean report(MessagesApi.Report report) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1240027791, name = "GetChats")
	public MessagesApi.Chats getChats(MessagesApi.GetChats getChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1364194508, name = "GetFullChat")
	public MessagesApi.ChatFull getFullChat(MessagesApi.GetFullChat getFullChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1937260541, name = "EditChatTitle")
	public Api.Updates editChatTitle(MessagesApi.EditChatTitle editChatTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = 903730804, name = "EditChatPhoto")
	public Api.Updates editChatPhoto(MessagesApi.EditChatPhoto editChatPhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = -230206493, name = "AddChatUser")
	public Api.Updates addChatUser(MessagesApi.AddChatUser addChatUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1575461717, name = "DeleteChatUser")
	public Api.Updates deleteChatUser(MessagesApi.DeleteChatUser deleteChatUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = 164303470, name = "CreateChat")
	public Api.Updates createChat(MessagesApi.CreateChat createChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 651135312, name = "GetDhConfig")
	public MessagesApi.DhConfig getDhConfig(MessagesApi.GetDhConfig getDhConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = -162681021, name = "RequestEncryption")
	public Api.EncryptedChat requestEncryption(MessagesApi.RequestEncryption requestEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1035731989, name = "AcceptEncryption")
	public Api.EncryptedChat acceptEncryption(MessagesApi.AcceptEncryption acceptEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = -208425312, name = "DiscardEncryption")
	public Boolean discardEncryption(MessagesApi.DiscardEncryption discardEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2031374829, name = "SetEncryptedTyping")
	public Boolean setEncryptedTyping(MessagesApi.SetEncryptedTyping setEncryptedTyping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2135648522, name = "ReadEncryptedHistory")
	public Boolean readEncryptedHistory(MessagesApi.ReadEncryptedHistory readEncryptedHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1157265941, name = "SendEncrypted")
	public MessagesApi.SentEncryptedMessage sendEncrypted(MessagesApi.SendEncrypted sendEncrypted) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1431914525, name = "SendEncryptedFile")
	public MessagesApi.SentEncryptedMessage sendEncryptedFile(MessagesApi.SendEncryptedFile sendEncryptedFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 852769188, name = "SendEncryptedService")
	public MessagesApi.SentEncryptedMessage sendEncryptedService(MessagesApi.SendEncryptedService sendEncryptedService) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1436924774, name = "ReceivedQueue")
	public long[] receivedQueue(MessagesApi.ReceivedQueue receivedQueue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1259113487, name = "ReportEncryptedSpam")
	public Boolean reportEncryptedSpam(MessagesApi.ReportEncryptedSpam reportEncryptedSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = 916930423, name = "ReadMessageContents")
	public MessagesApi.AffectedMessages readMessageContents(MessagesApi.ReadMessageContents readMessageContents) {
		return null;
	}

	@WebsocketHandlerMapping(value = -710552671, name = "GetStickers")
	public MessagesApi.Stickers getStickers(MessagesApi.GetStickers getStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1197432408, name = "GetAllStickers")
	public MessagesApi.AllStickers getAllStickers(MessagesApi.GetAllStickers getAllStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1956073268, name = "GetWebPagePreview")
	public Api.TypeMessageMedia getWebPagePreview(MessagesApi.GetWebPagePreview getWebPagePreview) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1607670315, name = "ExportChatInvite")
	public MessagesApi.ExportedChatInvite exportChatInvite(MessagesApi.ExportChatInvite exportChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1051570619, name = "CheckChatInvite")
	public Api.ChatInvite checkChatInvite(MessagesApi.CheckChatInvite checkChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1817183516, name = "ImportChatInvite")
	public Api.Updates importChatInvite(MessagesApi.ImportChatInvite importChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = -928977804, name = "GetStickerSet")
	public MessagesApi.StickerSet getStickerSet(MessagesApi.GetStickerSet getStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = -946871200, name = "InstallStickerSet")
	public MessagesApi.TypeStickerSetInstallResult installStickerSet(MessagesApi.InstallStickerSet installStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = -110209570, name = "UninstallStickerSet")
	public Boolean uninstallStickerSet(MessagesApi.UninstallStickerSet uninstallStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = -421563528, name = "StartBot")
	public Api.Updates startBot(MessagesApi.StartBot startBot) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1468322785, name = "GetMessagesViews")
	public MessagesApi.MessageViews getMessagesViews(MessagesApi.GetMessagesViews getMessagesViews) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1470377534, name = "EditChatAdmin")
	public Boolean editChatAdmin(MessagesApi.EditChatAdmin editChatAdmin) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1568189671, name = "MigrateChat")
	public Api.Updates migrateChat(MessagesApi.MigrateChat migrateChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1271290010, name = "SearchGlobal")
	public MessagesApi.Messages searchGlobal(MessagesApi.SearchGlobal searchGlobal) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2016638777, name = "ReorderStickerSets")
	public Boolean reorderStickerSets(MessagesApi.ReorderStickerSets reorderStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1309538785, name = "GetDocumentByHash")
	public Api.Document getDocumentByHash(MessagesApi.GetDocumentByHash getDocumentByHash) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1559270965, name = "GetSavedGifs")
	public MessagesApi.SavedGifs getSavedGifs(MessagesApi.GetSavedGifs getSavedGifs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 846868683, name = "SaveGif")
	public Boolean saveGif(MessagesApi.SaveGif saveGif) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1364105629, name = "GetInlineBotResults")
	public MessagesApi.BotResults getInlineBotResults(MessagesApi.GetInlineBotResults getInlineBotResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = -346119674, name = "SetInlineBotResults")
	public Boolean setInlineBotResults(MessagesApi.SetInlineBotResults setInlineBotResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2057376407, name = "SendInlineBotResult")
	public Api.Updates sendInlineBotResult(MessagesApi.SendInlineBotResult sendInlineBotResult) {
		return null;
	}

	@WebsocketHandlerMapping(value = -39416522, name = "GetMessageEditData")
	public MessagesApi.MessageEditData getMessageEditData(MessagesApi.GetMessageEditData getMessageEditData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1224152952, name = "EditMessage")
	public Api.Updates editMessage(MessagesApi.EditMessage editMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2091549254, name = "EditInlineBotMessage")
	public Boolean editInlineBotMessage(MessagesApi.EditInlineBotMessage editInlineBotMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1824339449, name = "GetBotCallbackAnswer")
	public MessagesApi.BotCallbackAnswer getBotCallbackAnswer(MessagesApi.GetBotCallbackAnswer getBotCallbackAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = -712043766, name = "SetBotCallbackAnswer")
	public Boolean setBotCallbackAnswer(MessagesApi.SetBotCallbackAnswer setBotCallbackAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = -462373635, name = "GetPeerDialogs")
	public MessagesApi.PeerDialogs getPeerDialogs(MessagesApi.GetPeerDialogs getPeerDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1137057461, name = "SaveDraft")
	public Boolean saveDraft(MessagesApi.SaveDraft saveDraft) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1782549861, name = "GetAllDrafts")
	public Api.Updates getAllDrafts(MessagesApi.GetAllDrafts getAllDrafts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1685588756, name = "GetFeaturedStickers")
	public MessagesApi.FeaturedStickers getFeaturedStickers(MessagesApi.GetFeaturedStickers getFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1527873830, name = "ReadFeaturedStickers")
	public Boolean readFeaturedStickers(MessagesApi.ReadFeaturedStickers readFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1649852357, name = "GetRecentStickers")
	public MessagesApi.RecentStickers getRecentStickers(MessagesApi.GetRecentStickers getRecentStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 958863608, name = "SaveRecentSticker")
	public Boolean saveRecentSticker(MessagesApi.SaveRecentSticker saveRecentSticker) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1986437075, name = "ClearRecentStickers")
	public Boolean clearRecentStickers(MessagesApi.ClearRecentStickers clearRecentStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1475442322, name = "GetArchivedStickers")
	public MessagesApi.ArchivedStickers getArchivedStickers(MessagesApi.GetArchivedStickers getArchivedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1678738104, name = "GetMaskStickers")
	public MessagesApi.AllStickers getMaskStickers(MessagesApi.GetMaskStickers getMaskStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -866424884, name = "GetAttachedStickers")
	public Api.StickerSetCovered[] getAttachedStickers(MessagesApi.GetAttachedStickers getAttachedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1896289088, name = "SetGameScore")
	public Api.Updates setGameScore(MessagesApi.SetGameScore setGameScore) {
		return null;
	}

	@WebsocketHandlerMapping(value = 363700068, name = "SetInlineGameScore")
	public Boolean setInlineGameScore(MessagesApi.SetInlineGameScore setInlineGameScore) {
		return null;
	}

	@WebsocketHandlerMapping(value = -400399203, name = "GetGameHighScores")
	public MessagesApi.HighScores getGameHighScores(MessagesApi.GetGameHighScores getGameHighScores) {
		return null;
	}

	@WebsocketHandlerMapping(value = 258170395, name = "GetInlineGameHighScores")
	public MessagesApi.HighScores getInlineGameHighScores(MessagesApi.GetInlineGameHighScores getInlineGameHighScores) {
		return null;
	}

	@WebsocketHandlerMapping(value = -468934396, name = "GetCommonChats")
	public MessagesApi.Chats getCommonChats(MessagesApi.GetCommonChats getCommonChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2023787330, name = "GetAllChats")
	public MessagesApi.Chats getAllChats(MessagesApi.GetAllChats getAllChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 852135825, name = "GetWebPage")
	public Api.WebPage getWebPage(MessagesApi.GetWebPage getWebPage) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1489903017, name = "ToggleDialogPin")
	public Boolean toggleDialogPin(MessagesApi.ToggleDialogPin toggleDialogPin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 991616823, name = "ReorderPinnedDialogs")
	public Boolean reorderPinnedDialogs(MessagesApi.ReorderPinnedDialogs reorderPinnedDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = -692498958, name = "GetPinnedDialogs")
	public MessagesApi.PeerDialogs getPinnedDialogs(MessagesApi.GetPinnedDialogs getPinnedDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = -436833542, name = "SetBotShippingResults")
	public Boolean setBotShippingResults(MessagesApi.SetBotShippingResults setBotShippingResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 163765653, name = "SetBotPrecheckoutResults")
	public Boolean setBotPrecheckoutResults(MessagesApi.SetBotPrecheckoutResults setBotPrecheckoutResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1369162417, name = "UploadMedia")
	public Api.TypeMessageMedia uploadMedia(MessagesApi.UploadMedia uploadMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = -914493408, name = "SendScreenshotNotification")
	public Api.Updates sendScreenshotNotification(MessagesApi.SendScreenshotNotification sendScreenshotNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 82946729, name = "GetFavedStickers")
	public MessagesApi.FavedStickers getFavedStickers(MessagesApi.GetFavedStickers getFavedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1174420133, name = "FaveSticker")
	public Boolean faveSticker(MessagesApi.FaveSticker faveSticker) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1180140658, name = "GetUnreadMentions")
	public MessagesApi.Messages getUnreadMentions(MessagesApi.GetUnreadMentions getUnreadMentions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 251759059, name = "ReadMentions")
	public MessagesApi.AffectedHistory readMentions(MessagesApi.ReadMentions readMentions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1881817312, name = "GetRecentLocations")
	public MessagesApi.Messages getRecentLocations(MessagesApi.GetRecentLocations getRecentLocations) {
		return null;
	}

	@WebsocketHandlerMapping(value = -134016113, name = "SendMultiMedia")
	public Api.Updates sendMultiMedia(MessagesApi.SendMultiMedia sendMultiMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1347929239, name = "UploadEncryptedFile")
	public Api.EncryptedFile uploadEncryptedFile(MessagesApi.UploadEncryptedFile uploadEncryptedFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 896555914, name = "SearchStickerSets")
	public MessagesApi.FoundStickerSets searchStickerSets(MessagesApi.SearchStickerSets searchStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = 486505992, name = "GetSplitRanges")
	public Api.MessageRange[] getSplitRanges(MessagesApi.GetSplitRanges getSplitRanges) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1031349873, name = "MarkDialogUnread")
	public Boolean markDialogUnread(MessagesApi.MarkDialogUnread markDialogUnread) {
		return null;
	}

	@WebsocketHandlerMapping(value = 585256482, name = "GetDialogUnreadMarks")
	public Api.DialogPeer[] getDialogUnreadMarks(MessagesApi.GetDialogUnreadMarks getDialogUnreadMarks) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2119757468, name = "ClearAllDrafts")
	public Boolean clearAllDrafts(MessagesApi.ClearAllDrafts clearAllDrafts) {
		return null;
	}

	@WebsocketHandlerMapping(value = -760547348, name = "UpdatePinnedMessage")
	public Api.Updates updatePinnedMessage(MessagesApi.UpdatePinnedMessage updatePinnedMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 283795844, name = "SendVote")
	public Api.Updates sendVote(MessagesApi.SendVote sendVote) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1941660731, name = "GetPollResults")
	public Api.Updates getPollResults(MessagesApi.GetPollResults getPollResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1848369232, name = "GetOnlines")
	public Api.ChatOnlines getOnlines(MessagesApi.GetOnlines getOnlines) {
		return null;
	}

	@WebsocketHandlerMapping(value = -554301545, name = "EditChatAbout")
	public Boolean editChatAbout(MessagesApi.EditChatAbout editChatAbout) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1517917375, name = "EditChatDefaultBannedRights")
	public Api.Updates editChatDefaultBannedRights(MessagesApi.EditChatDefaultBannedRights editChatDefaultBannedRights) {
		return null;
	}

	@WebsocketHandlerMapping(value = 899735650, name = "GetEmojiKeywords")
	public Api.EmojiKeywordsDifference getEmojiKeywords(MessagesApi.GetEmojiKeywords getEmojiKeywords) {
		return null;
	}

	@WebsocketHandlerMapping(value = 352892591, name = "GetEmojiKeywordsDifference")
	public Api.EmojiKeywordsDifference getEmojiKeywordsDifference(MessagesApi.GetEmojiKeywordsDifference getEmojiKeywordsDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1318675378, name = "GetEmojiKeywordsLanguages")
	public Api.EmojiLanguage[] getEmojiKeywordsLanguages(MessagesApi.GetEmojiKeywordsLanguages getEmojiKeywordsLanguages) {
		return null;
	}

	@WebsocketHandlerMapping(value = -709817306, name = "GetEmojiURL")
	public Api.EmojiURL getEmojiURL(MessagesApi.GetEmojiURL getEmojiURL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1932455680, name = "GetSearchCounters")
	public MessagesApi.SearchCounter[] getSearchCounters(MessagesApi.GetSearchCounters getSearchCounters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 428848198, name = "RequestUrlAuth")
	public Api.TypeUrlAuthResult requestUrlAuth(MessagesApi.RequestUrlAuth requestUrlAuth) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1322487515, name = "AcceptUrlAuth")
	public Api.TypeUrlAuthResult acceptUrlAuth(MessagesApi.AcceptUrlAuth acceptUrlAuth) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1336717624, name = "HidePeerSettingsBar")
	public Boolean hidePeerSettingsBar(MessagesApi.HidePeerSettingsBar hidePeerSettingsBar) {
		return null;
	}

	@WebsocketHandlerMapping(value = -183077365, name = "GetScheduledHistory")
	public MessagesApi.Messages getScheduledHistory(MessagesApi.GetScheduledHistory getScheduledHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1111817116, name = "GetScheduledMessages")
	public MessagesApi.Messages getScheduledMessages(MessagesApi.GetScheduledMessages getScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1120369398, name = "SendScheduledMessages")
	public Api.Updates sendScheduledMessages(MessagesApi.SendScheduledMessages sendScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1504586518, name = "DeleteScheduledMessages")
	public Api.Updates deleteScheduledMessages(MessagesApi.DeleteScheduledMessages deleteScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1200736242, name = "GetPollVotes")
	public MessagesApi.VotesList getPollVotes(MessagesApi.GetPollVotes getPollVotes) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1257951254, name = "ToggleStickerSets")
	public Boolean toggleStickerSets(MessagesApi.ToggleStickerSets toggleStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = -241247891, name = "GetDialogFilters")
	public Api.DialogFilter[] getDialogFilters(MessagesApi.GetDialogFilters getDialogFilters) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1566780372, name = "GetSuggestedDialogFilters")
	public Api.DialogFilterSuggested[] getSuggestedDialogFilters(MessagesApi.GetSuggestedDialogFilters getSuggestedDialogFilters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 450142282, name = "UpdateDialogFilter")
	public Boolean updateDialogFilter(MessagesApi.UpdateDialogFilter updateDialogFilter) {
		return null;
	}

	@WebsocketHandlerMapping(value = -983318044, name = "UpdateDialogFiltersOrder")
	public Boolean updateDialogFiltersOrder(MessagesApi.UpdateDialogFiltersOrder updateDialogFiltersOrder) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2127598753, name = "GetOldFeaturedStickers")
	public MessagesApi.FeaturedStickers getOldFeaturedStickers(MessagesApi.GetOldFeaturedStickers getOldFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 584962828, name = "GetReplies")
	public MessagesApi.Messages getReplies(MessagesApi.GetReplies getReplies) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1147761405, name = "GetDiscussionMessage")
	public MessagesApi.DiscussionMessage getDiscussionMessage(MessagesApi.GetDiscussionMessage getDiscussionMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = -147740172, name = "ReadDiscussion")
	public Boolean readDiscussion(MessagesApi.ReadDiscussion readDiscussion) {
		return null;
	}

	@WebsocketHandlerMapping(value = -265962357, name = "UnpinAllMessages")
	public MessagesApi.AffectedHistory unpinAllMessages(MessagesApi.UnpinAllMessages unpinAllMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1540419152, name = "DeleteChat")
	public Boolean deleteChat(MessagesApi.DeleteChat deleteChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = -104078327, name = "DeletePhoneCallHistory")
	public MessagesApi.AffectedFoundMessages deletePhoneCallHistory(MessagesApi.DeletePhoneCallHistory deletePhoneCallHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1140726259, name = "CheckHistoryImport")
	public MessagesApi.HistoryImportParsed checkHistoryImport(MessagesApi.CheckHistoryImport checkHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 873008187, name = "InitHistoryImport")
	public MessagesApi.HistoryImport initHistoryImport(MessagesApi.InitHistoryImport initHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 713433234, name = "UploadImportedMedia")
	public Api.TypeMessageMedia uploadImportedMedia(MessagesApi.UploadImportedMedia uploadImportedMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1271008444, name = "StartHistoryImport")
	public Boolean startHistoryImport(MessagesApi.StartHistoryImport startHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1565154314, name = "GetExportedChatInvites")
	public MessagesApi.ExportedChatInvites getExportedChatInvites(MessagesApi.GetExportedChatInvites getExportedChatInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1937010524, name = "GetExportedChatInvite")
	public MessagesApi.ExportedChatInvite getExportedChatInvite(MessagesApi.GetExportedChatInvite getExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1110823051, name = "EditExportedChatInvite")
	public MessagesApi.ExportedChatInvite editExportedChatInvite(MessagesApi.EditExportedChatInvite editExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1452833749, name = "DeleteRevokedExportedChatInvites")
	public Boolean deleteRevokedExportedChatInvites(MessagesApi.DeleteRevokedExportedChatInvites deleteRevokedExportedChatInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = -731601877, name = "DeleteExportedChatInvite")
	public Boolean deleteExportedChatInvite(MessagesApi.DeleteExportedChatInvite deleteExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 958457583, name = "GetAdminsWithInvites")
	public MessagesApi.ChatAdminsWithInvites getAdminsWithInvites(MessagesApi.GetAdminsWithInvites getAdminsWithInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = -553329330, name = "GetChatInviteImporters")
	public MessagesApi.ChatInviteImporters getChatInviteImporters(MessagesApi.GetChatInviteImporters getChatInviteImporters) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1207017500, name = "SetHistoryTTL")
	public Api.Updates setHistoryTTL(MessagesApi.SetHistoryTTL setHistoryTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1573261059, name = "CheckHistoryImportPeer")
	public MessagesApi.CheckedHistoryImportPeer checkHistoryImportPeer(MessagesApi.CheckHistoryImportPeer checkHistoryImportPeer) {
		return null;
	}

	@WebsocketHandlerMapping(value = -432283329, name = "SetChatTheme")
	public Api.Updates setChatTheme(MessagesApi.SetChatTheme setChatTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 745510839, name = "GetMessageReadParticipants")
	public long[] getMessageReadParticipants(MessagesApi.GetMessageReadParticipants getMessageReadParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1240514025, name = "GetSearchResultsCalendar")
	public MessagesApi.SearchResultsCalendar getSearchResultsCalendar(MessagesApi.GetSearchResultsCalendar getSearchResultsCalendar) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1855292323, name = "GetSearchResultsPositions")
	public MessagesApi.SearchResultsPositions getSearchResultsPositions(MessagesApi.GetSearchResultsPositions getSearchResultsPositions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2145904661, name = "HideChatJoinRequest")
	public Api.Updates hideChatJoinRequest(MessagesApi.HideChatJoinRequest hideChatJoinRequest) {
		return null;
	}

	@WebsocketHandlerMapping(value = -528091926, name = "HideAllChatJoinRequests")
	public Api.Updates hideAllChatJoinRequests(MessagesApi.HideAllChatJoinRequests hideAllChatJoinRequests) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1323389022, name = "ToggleNoForwards")
	public Api.Updates toggleNoForwards(MessagesApi.ToggleNoForwards toggleNoForwards) {
		return null;
	}

	@WebsocketHandlerMapping(value = -855777386, name = "SaveDefaultSendAs")
	public Boolean saveDefaultSendAs(MessagesApi.SaveDefaultSendAs saveDefaultSendAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 627641572, name = "SendReaction")
	public Api.Updates sendReaction(MessagesApi.SendReaction sendReaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1950707482, name = "GetMessagesReactions")
	public Api.Updates getMessagesReactions(MessagesApi.GetMessagesReactions getMessagesReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = -521245833, name = "GetMessageReactionsList")
	public MessagesApi.MessageReactionsList getMessageReactionsList(MessagesApi.GetMessageReactionsList getMessageReactionsList) {
		return null;
	}

	@WebsocketHandlerMapping(value = 335875750, name = "SetChatAvailableReactions")
	public Api.Updates setChatAvailableReactions(MessagesApi.SetChatAvailableReactions setChatAvailableReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 417243308, name = "GetAvailableReactions")
	public MessagesApi.AvailableReactions getAvailableReactions(MessagesApi.GetAvailableReactions getAvailableReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = -647969580, name = "SetDefaultReaction")
	public Boolean setDefaultReaction(MessagesApi.SetDefaultReaction setDefaultReaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 617508334, name = "TranslateText")
	public MessagesApi.TypeTranslatedText translateText(MessagesApi.TranslateText translateText) {
		return null;
	}

	@WebsocketHandlerMapping(value = -396644838, name = "GetUnreadReactions")
	public MessagesApi.Messages getUnreadReactions(MessagesApi.GetUnreadReactions getUnreadReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2099097129, name = "ReadReactions")
	public MessagesApi.AffectedHistory readReactions(MessagesApi.ReadReactions readReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 276705696, name = "SearchSentMedia")
	public MessagesApi.Messages searchSentMedia(MessagesApi.SearchSentMedia searchSentMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 385663691, name = "GetAttachMenuBots")
	public Api.AttachMenuBots getAttachMenuBots(MessagesApi.GetAttachMenuBots getAttachMenuBots) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1998676370, name = "GetAttachMenuBot")
	public Api.AttachMenuBotsBot getAttachMenuBot(MessagesApi.GetAttachMenuBot getAttachMenuBot) {
		return null;
	}

	@WebsocketHandlerMapping(value = 451818415, name = "ToggleBotInAttachMenu")
	public Boolean toggleBotInAttachMenu(MessagesApi.ToggleBotInAttachMenu toggleBotInAttachMenu) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1850648527, name = "RequestWebView")
	public Api.TypeWebViewResult requestWebView(MessagesApi.RequestWebView requestWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = -362824498, name = "ProlongWebView")
	public Boolean prolongWebView(MessagesApi.ProlongWebView prolongWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1790652275, name = "RequestSimpleWebView")
	public Api.TypeSimpleWebViewResult requestSimpleWebView(MessagesApi.RequestSimpleWebView requestSimpleWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 172168437, name = "SendWebViewResultMessage")
	public Api.WebViewMessageSent sendWebViewResultMessage(MessagesApi.SendWebViewResultMessage sendWebViewResultMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = -603831608, name = "SendWebViewData")
	public Api.Updates sendWebViewData(MessagesApi.SendWebViewData sendWebViewData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 647928393, name = "TranscribeAudio")
	public MessagesApi.TranscribedAudio transcribeAudio(MessagesApi.TranscribeAudio transcribeAudio) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2132608815, name = "RateTranscribedAudio")
	public Boolean rateTranscribedAudio(MessagesApi.RateTranscribedAudio rateTranscribedAudio) {
		return null;
	}
}