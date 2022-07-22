package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MessagesController {

	@WebsocketHandlerMapping(value = 1673946374L, name = "GetMessages")
	public MessagesApi.Messages getMessages(MessagesApi.GetMessages getMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2700397391L, name = "GetDialogs")
	public MessagesApi.Dialogs getDialogs(MessagesApi.GetDialogs getDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1143203525L, name = "GetHistory")
	public MessagesApi.Messages getHistory(MessagesApi.GetHistory getHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2700978018L, name = "Search")
	public MessagesApi.Messages search(MessagesApi.Search search) {
		return null;
	}

	@WebsocketHandlerMapping(value = 238054714L, name = "ReadHistory")
	public MessagesApi.AffectedMessages readHistory(MessagesApi.ReadHistory readHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2962199082L, name = "DeleteHistory")
	public MessagesApi.AffectedHistory deleteHistory(MessagesApi.DeleteHistory deleteHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3851326930L, name = "DeleteMessages")
	public MessagesApi.AffectedMessages deleteMessages(MessagesApi.DeleteMessages deleteMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 94983360L, name = "ReceivedMessages")
	public Api.ReceivedNotifyMessage[] receivedMessages(MessagesApi.ReceivedMessages receivedMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1486110434L, name = "SetTyping")
	public Boolean setTyping(MessagesApi.SetTyping setTyping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 228423076L, name = "SendMessage")
	public Api.Updates sendMessage(MessagesApi.SendMessage sendMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3797940448L, name = "SendMedia")
	public Api.Updates sendMedia(MessagesApi.SendMedia sendMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3425708299L, name = "ForwardMessages")
	public Api.Updates forwardMessages(MessagesApi.ForwardMessages forwardMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3474297563L, name = "ReportSpam")
	public Boolean reportSpam(MessagesApi.ReportSpam reportSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4024018594L, name = "GetPeerSettings")
	public MessagesApi.PeerSettings getPeerSettings(MessagesApi.GetPeerSettings getPeerSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2303961934L, name = "Report")
	public Boolean report(MessagesApi.Report report) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1240027791L, name = "GetChats")
	public MessagesApi.Chats getChats(MessagesApi.GetChats getChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2930772788L, name = "GetFullChat")
	public MessagesApi.ChatFull getFullChat(MessagesApi.GetFullChat getFullChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1937260541L, name = "EditChatTitle")
	public Api.Updates editChatTitle(MessagesApi.EditChatTitle editChatTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = 903730804L, name = "EditChatPhoto")
	public Api.Updates editChatPhoto(MessagesApi.EditChatPhoto editChatPhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4064760803L, name = "AddChatUser")
	public Api.Updates addChatUser(MessagesApi.AddChatUser addChatUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2719505579L, name = "DeleteChatUser")
	public Api.Updates deleteChatUser(MessagesApi.DeleteChatUser deleteChatUser) {
		return null;
	}

	@WebsocketHandlerMapping(value = 164303470L, name = "CreateChat")
	public Api.Updates createChat(MessagesApi.CreateChat createChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 651135312L, name = "GetDhConfig")
	public MessagesApi.DhConfig getDhConfig(MessagesApi.GetDhConfig getDhConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4132286275L, name = "RequestEncryption")
	public Api.EncryptedChat requestEncryption(MessagesApi.RequestEncryption requestEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1035731989L, name = "AcceptEncryption")
	public Api.EncryptedChat acceptEncryption(MessagesApi.AcceptEncryption acceptEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4086541984L, name = "DiscardEncryption")
	public Boolean discardEncryption(MessagesApi.DiscardEncryption discardEncryption) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2031374829L, name = "SetEncryptedTyping")
	public Boolean setEncryptedTyping(MessagesApi.SetEncryptedTyping setEncryptedTyping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2135648522L, name = "ReadEncryptedHistory")
	public Boolean readEncryptedHistory(MessagesApi.ReadEncryptedHistory readEncryptedHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1157265941L, name = "SendEncrypted")
	public MessagesApi.SentEncryptedMessage sendEncrypted(MessagesApi.SendEncrypted sendEncrypted) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1431914525L, name = "SendEncryptedFile")
	public MessagesApi.SentEncryptedMessage sendEncryptedFile(MessagesApi.SendEncryptedFile sendEncryptedFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 852769188L, name = "SendEncryptedService")
	public MessagesApi.SentEncryptedMessage sendEncryptedService(MessagesApi.SendEncryptedService sendEncryptedService) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1436924774L, name = "ReceivedQueue")
	public long[] receivedQueue(MessagesApi.ReceivedQueue receivedQueue) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1259113487L, name = "ReportEncryptedSpam")
	public Boolean reportEncryptedSpam(MessagesApi.ReportEncryptedSpam reportEncryptedSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = 916930423L, name = "ReadMessageContents")
	public MessagesApi.AffectedMessages readMessageContents(MessagesApi.ReadMessageContents readMessageContents) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3584414625L, name = "GetStickers")
	public MessagesApi.Stickers getStickers(MessagesApi.GetStickers getStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3097534888L, name = "GetAllStickers")
	public MessagesApi.AllStickers getAllStickers(MessagesApi.GetAllStickers getAllStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2338894028L, name = "GetWebPagePreview")
	public Api.TypeMessageMedia getWebPagePreview(MessagesApi.GetWebPagePreview getWebPagePreview) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2687296981L, name = "ExportChatInvite")
	public MessagesApi.ExportedChatInvite exportChatInvite(MessagesApi.ExportChatInvite exportChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1051570619L, name = "CheckChatInvite")
	public Api.ChatInvite checkChatInvite(MessagesApi.CheckChatInvite checkChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1817183516L, name = "ImportChatInvite")
	public Api.Updates importChatInvite(MessagesApi.ImportChatInvite importChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3365989492L, name = "GetStickerSet")
	public MessagesApi.StickerSet getStickerSet(MessagesApi.GetStickerSet getStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3348096096L, name = "InstallStickerSet")
	public MessagesApi.TypeStickerSetInstallResult installStickerSet(MessagesApi.InstallStickerSet installStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4184757726L, name = "UninstallStickerSet")
	public Boolean uninstallStickerSet(MessagesApi.UninstallStickerSet uninstallStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3873403768L, name = "StartBot")
	public Api.Updates startBot(MessagesApi.StartBot startBot) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1468322785L, name = "GetMessagesViews")
	public MessagesApi.MessageViews getMessagesViews(MessagesApi.GetMessagesViews getMessagesViews) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2824589762L, name = "EditChatAdmin")
	public Boolean editChatAdmin(MessagesApi.EditChatAdmin editChatAdmin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2726777625L, name = "MigrateChat")
	public Api.Updates migrateChat(MessagesApi.MigrateChat migrateChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1271290010L, name = "SearchGlobal")
	public MessagesApi.Messages searchGlobal(MessagesApi.SearchGlobal searchGlobal) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2016638777L, name = "ReorderStickerSets")
	public Boolean reorderStickerSets(MessagesApi.ReorderStickerSets reorderStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2985428511L, name = "GetDocumentByHash")
	public Api.Document getDocumentByHash(MessagesApi.GetDocumentByHash getDocumentByHash) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1559270965L, name = "GetSavedGifs")
	public MessagesApi.SavedGifs getSavedGifs(MessagesApi.GetSavedGifs getSavedGifs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 846868683L, name = "SaveGif")
	public Boolean saveGif(MessagesApi.SaveGif saveGif) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1364105629L, name = "GetInlineBotResults")
	public MessagesApi.BotResults getInlineBotResults(MessagesApi.GetInlineBotResults getInlineBotResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3948847622L, name = "SetInlineBotResults")
	public Boolean setInlineBotResults(MessagesApi.SetInlineBotResults setInlineBotResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2057376407L, name = "SendInlineBotResult")
	public Api.Updates sendInlineBotResult(MessagesApi.SendInlineBotResult sendInlineBotResult) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4255550774L, name = "GetMessageEditData")
	public MessagesApi.MessageEditData getMessageEditData(MessagesApi.GetMessageEditData getMessageEditData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1224152952L, name = "EditMessage")
	public Api.Updates editMessage(MessagesApi.EditMessage editMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2203418042L, name = "EditInlineBotMessage")
	public Boolean editInlineBotMessage(MessagesApi.EditInlineBotMessage editInlineBotMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2470627847L, name = "GetBotCallbackAnswer")
	public MessagesApi.BotCallbackAnswer getBotCallbackAnswer(MessagesApi.GetBotCallbackAnswer getBotCallbackAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3582923530L, name = "SetBotCallbackAnswer")
	public Boolean setBotCallbackAnswer(MessagesApi.SetBotCallbackAnswer setBotCallbackAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3832593661L, name = "GetPeerDialogs")
	public MessagesApi.PeerDialogs getPeerDialogs(MessagesApi.GetPeerDialogs getPeerDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3157909835L, name = "SaveDraft")
	public Boolean saveDraft(MessagesApi.SaveDraft saveDraft) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1782549861L, name = "GetAllDrafts")
	public Api.Updates getAllDrafts(MessagesApi.GetAllDrafts getAllDrafts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1685588756L, name = "GetFeaturedStickers")
	public MessagesApi.FeaturedStickers getFeaturedStickers(MessagesApi.GetFeaturedStickers getFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1527873830L, name = "ReadFeaturedStickers")
	public Boolean readFeaturedStickers(MessagesApi.ReadFeaturedStickers readFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2645114939L, name = "GetRecentStickers")
	public MessagesApi.RecentStickers getRecentStickers(MessagesApi.GetRecentStickers getRecentStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 958863608L, name = "SaveRecentSticker")
	public Boolean saveRecentSticker(MessagesApi.SaveRecentSticker saveRecentSticker) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2308530221L, name = "ClearRecentStickers")
	public Boolean clearRecentStickers(MessagesApi.ClearRecentStickers clearRecentStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1475442322L, name = "GetArchivedStickers")
	public MessagesApi.ArchivedStickers getArchivedStickers(MessagesApi.GetArchivedStickers getArchivedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1678738104L, name = "GetMaskStickers")
	public MessagesApi.AllStickers getMaskStickers(MessagesApi.GetMaskStickers getMaskStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3428542412L, name = "GetAttachedStickers")
	public Api.StickerSetCovered[] getAttachedStickers(MessagesApi.GetAttachedStickers getAttachedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2398678208L, name = "SetGameScore")
	public Api.Updates setGameScore(MessagesApi.SetGameScore setGameScore) {
		return null;
	}

	@WebsocketHandlerMapping(value = 363700068L, name = "SetInlineGameScore")
	public Boolean setInlineGameScore(MessagesApi.SetInlineGameScore setInlineGameScore) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3894568093L, name = "GetGameHighScores")
	public MessagesApi.HighScores getGameHighScores(MessagesApi.GetGameHighScores getGameHighScores) {
		return null;
	}

	@WebsocketHandlerMapping(value = 258170395L, name = "GetInlineGameHighScores")
	public MessagesApi.HighScores getInlineGameHighScores(MessagesApi.GetInlineGameHighScores getInlineGameHighScores) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3826032900L, name = "GetCommonChats")
	public MessagesApi.Chats getCommonChats(MessagesApi.GetCommonChats getCommonChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2271179966L, name = "GetAllChats")
	public MessagesApi.Chats getAllChats(MessagesApi.GetAllChats getAllChats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 852135825L, name = "GetWebPage")
	public Api.WebPage getWebPage(MessagesApi.GetWebPage getWebPage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2805064279L, name = "ToggleDialogPin")
	public Boolean toggleDialogPin(MessagesApi.ToggleDialogPin toggleDialogPin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 991616823L, name = "ReorderPinnedDialogs")
	public Boolean reorderPinnedDialogs(MessagesApi.ReorderPinnedDialogs reorderPinnedDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3602468338L, name = "GetPinnedDialogs")
	public MessagesApi.PeerDialogs getPinnedDialogs(MessagesApi.GetPinnedDialogs getPinnedDialogs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3858133754L, name = "SetBotShippingResults")
	public Boolean setBotShippingResults(MessagesApi.SetBotShippingResults setBotShippingResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 163765653L, name = "SetBotPrecheckoutResults")
	public Boolean setBotPrecheckoutResults(MessagesApi.SetBotPrecheckoutResults setBotPrecheckoutResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1369162417L, name = "UploadMedia")
	public Api.TypeMessageMedia uploadMedia(MessagesApi.UploadMedia uploadMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3380473888L, name = "SendScreenshotNotification")
	public Api.Updates sendScreenshotNotification(MessagesApi.SendScreenshotNotification sendScreenshotNotification) {
		return null;
	}

	@WebsocketHandlerMapping(value = 82946729L, name = "GetFavedStickers")
	public MessagesApi.FavedStickers getFavedStickers(MessagesApi.GetFavedStickers getFavedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3120547163L, name = "FaveSticker")
	public Boolean faveSticker(MessagesApi.FaveSticker faveSticker) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1180140658L, name = "GetUnreadMentions")
	public MessagesApi.Messages getUnreadMentions(MessagesApi.GetUnreadMentions getUnreadMentions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 251759059L, name = "ReadMentions")
	public MessagesApi.AffectedHistory readMentions(MessagesApi.ReadMentions readMentions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1881817312L, name = "GetRecentLocations")
	public MessagesApi.Messages getRecentLocations(MessagesApi.GetRecentLocations getRecentLocations) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4160951183L, name = "SendMultiMedia")
	public Api.Updates sendMultiMedia(MessagesApi.SendMultiMedia sendMultiMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1347929239L, name = "UploadEncryptedFile")
	public Api.EncryptedFile uploadEncryptedFile(MessagesApi.UploadEncryptedFile uploadEncryptedFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 896555914L, name = "SearchStickerSets")
	public MessagesApi.FoundStickerSets searchStickerSets(MessagesApi.SearchStickerSets searchStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = 486505992L, name = "GetSplitRanges")
	public Api.MessageRange[] getSplitRanges(MessagesApi.GetSplitRanges getSplitRanges) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3263617423L, name = "MarkDialogUnread")
	public Boolean markDialogUnread(MessagesApi.MarkDialogUnread markDialogUnread) {
		return null;
	}

	@WebsocketHandlerMapping(value = 585256482L, name = "GetDialogUnreadMarks")
	public Api.DialogPeer[] getDialogUnreadMarks(MessagesApi.GetDialogUnreadMarks getDialogUnreadMarks) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2119757468L, name = "ClearAllDrafts")
	public Boolean clearAllDrafts(MessagesApi.ClearAllDrafts clearAllDrafts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3534419948L, name = "UpdatePinnedMessage")
	public Api.Updates updatePinnedMessage(MessagesApi.UpdatePinnedMessage updatePinnedMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 283795844L, name = "SendVote")
	public Api.Updates sendVote(MessagesApi.SendVote sendVote) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1941660731L, name = "GetPollResults")
	public Api.Updates getPollResults(MessagesApi.GetPollResults getPollResults) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1848369232L, name = "GetOnlines")
	public Api.ChatOnlines getOnlines(MessagesApi.GetOnlines getOnlines) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3740665751L, name = "EditChatAbout")
	public Boolean editChatAbout(MessagesApi.EditChatAbout editChatAbout) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2777049921L, name = "EditChatDefaultBannedRights")
	public Api.Updates editChatDefaultBannedRights(MessagesApi.EditChatDefaultBannedRights editChatDefaultBannedRights) {
		return null;
	}

	@WebsocketHandlerMapping(value = 899735650L, name = "GetEmojiKeywords")
	public Api.EmojiKeywordsDifference getEmojiKeywords(MessagesApi.GetEmojiKeywords getEmojiKeywords) {
		return null;
	}

	@WebsocketHandlerMapping(value = 352892591L, name = "GetEmojiKeywordsDifference")
	public Api.EmojiKeywordsDifference getEmojiKeywordsDifference(MessagesApi.GetEmojiKeywordsDifference getEmojiKeywordsDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1318675378L, name = "GetEmojiKeywordsLanguages")
	public Api.EmojiLanguage[] getEmojiKeywordsLanguages(MessagesApi.GetEmojiKeywordsLanguages getEmojiKeywordsLanguages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3585149990L, name = "GetEmojiURL")
	public Api.EmojiURL getEmojiURL(MessagesApi.GetEmojiURL getEmojiURL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1932455680L, name = "GetSearchCounters")
	public MessagesApi.SearchCounter[] getSearchCounters(MessagesApi.GetSearchCounters getSearchCounters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 428848198L, name = "RequestUrlAuth")
	public Api.TypeUrlAuthResult requestUrlAuth(MessagesApi.RequestUrlAuth requestUrlAuth) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2972479781L, name = "AcceptUrlAuth")
	public Api.TypeUrlAuthResult acceptUrlAuth(MessagesApi.AcceptUrlAuth acceptUrlAuth) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1336717624L, name = "HidePeerSettingsBar")
	public Boolean hidePeerSettingsBar(MessagesApi.HidePeerSettingsBar hidePeerSettingsBar) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4111889931L, name = "GetScheduledHistory")
	public MessagesApi.Messages getScheduledHistory(MessagesApi.GetScheduledHistory getScheduledHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3183150180L, name = "GetScheduledMessages")
	public MessagesApi.Messages getScheduledMessages(MessagesApi.GetScheduledMessages getScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3174597898L, name = "SendScheduledMessages")
	public Api.Updates sendScheduledMessages(MessagesApi.SendScheduledMessages sendScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1504586518L, name = "DeleteScheduledMessages")
	public Api.Updates deleteScheduledMessages(MessagesApi.DeleteScheduledMessages deleteScheduledMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3094231054L, name = "GetPollVotes")
	public MessagesApi.VotesList getPollVotes(MessagesApi.GetPollVotes getPollVotes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3037016042L, name = "ToggleStickerSets")
	public Boolean toggleStickerSets(MessagesApi.ToggleStickerSets toggleStickerSets) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4053719405L, name = "GetDialogFilters")
	public Api.DialogFilter[] getDialogFilters(MessagesApi.GetDialogFilters getDialogFilters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2728186924L, name = "GetSuggestedDialogFilters")
	public Api.DialogFilterSuggested[] getSuggestedDialogFilters(MessagesApi.GetSuggestedDialogFilters getSuggestedDialogFilters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 450142282L, name = "UpdateDialogFilter")
	public Boolean updateDialogFilter(MessagesApi.UpdateDialogFilter updateDialogFilter) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3311649252L, name = "UpdateDialogFiltersOrder")
	public Boolean updateDialogFiltersOrder(MessagesApi.UpdateDialogFiltersOrder updateDialogFiltersOrder) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2127598753L, name = "GetOldFeaturedStickers")
	public MessagesApi.FeaturedStickers getOldFeaturedStickers(MessagesApi.GetOldFeaturedStickers getOldFeaturedStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 584962828L, name = "GetReplies")
	public MessagesApi.Messages getReplies(MessagesApi.GetReplies getReplies) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1147761405L, name = "GetDiscussionMessage")
	public MessagesApi.DiscussionMessage getDiscussionMessage(MessagesApi.GetDiscussionMessage getDiscussionMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4147227124L, name = "ReadDiscussion")
	public Boolean readDiscussion(MessagesApi.ReadDiscussion readDiscussion) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4029004939L, name = "UnpinAllMessages")
	public MessagesApi.AffectedHistory unpinAllMessages(MessagesApi.UnpinAllMessages unpinAllMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1540419152L, name = "DeleteChat")
	public Boolean deleteChat(MessagesApi.DeleteChat deleteChat) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4190888969L, name = "DeletePhoneCallHistory")
	public MessagesApi.AffectedFoundMessages deletePhoneCallHistory(MessagesApi.DeletePhoneCallHistory deletePhoneCallHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1140726259L, name = "CheckHistoryImport")
	public MessagesApi.HistoryImportParsed checkHistoryImport(MessagesApi.CheckHistoryImport checkHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 873008187L, name = "InitHistoryImport")
	public MessagesApi.HistoryImport initHistoryImport(MessagesApi.InitHistoryImport initHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 713433234L, name = "UploadImportedMedia")
	public Api.TypeMessageMedia uploadImportedMedia(MessagesApi.UploadImportedMedia uploadImportedMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3023958852L, name = "StartHistoryImport")
	public Boolean startHistoryImport(MessagesApi.StartHistoryImport startHistoryImport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2729812982L, name = "GetExportedChatInvites")
	public MessagesApi.ExportedChatInvites getExportedChatInvites(MessagesApi.GetExportedChatInvites getExportedChatInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1937010524L, name = "GetExportedChatInvite")
	public MessagesApi.ExportedChatInvite getExportedChatInvite(MessagesApi.GetExportedChatInvite getExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3184144245L, name = "EditExportedChatInvite")
	public MessagesApi.ExportedChatInvite editExportedChatInvite(MessagesApi.EditExportedChatInvite editExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1452833749L, name = "DeleteRevokedExportedChatInvites")
	public Boolean deleteRevokedExportedChatInvites(MessagesApi.DeleteRevokedExportedChatInvites deleteRevokedExportedChatInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3563365419L, name = "DeleteExportedChatInvite")
	public Boolean deleteExportedChatInvite(MessagesApi.DeleteExportedChatInvite deleteExportedChatInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 958457583L, name = "GetAdminsWithInvites")
	public MessagesApi.ChatAdminsWithInvites getAdminsWithInvites(MessagesApi.GetAdminsWithInvites getAdminsWithInvites) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3741637966L, name = "GetChatInviteImporters")
	public MessagesApi.ChatInviteImporters getChatInviteImporters(MessagesApi.GetChatInviteImporters getChatInviteImporters) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3087949796L, name = "SetHistoryTTL")
	public Api.Updates setHistoryTTL(MessagesApi.SetHistoryTTL setHistoryTTL) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1573261059L, name = "CheckHistoryImportPeer")
	public MessagesApi.CheckedHistoryImportPeer checkHistoryImportPeer(MessagesApi.CheckHistoryImportPeer checkHistoryImportPeer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3862683967L, name = "SetChatTheme")
	public Api.Updates setChatTheme(MessagesApi.SetChatTheme setChatTheme) {
		return null;
	}

	@WebsocketHandlerMapping(value = 745510839L, name = "GetMessageReadParticipants")
	public long[] getMessageReadParticipants(MessagesApi.GetMessageReadParticipants getMessageReadParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1240514025L, name = "GetSearchResultsCalendar")
	public MessagesApi.SearchResultsCalendar getSearchResultsCalendar(MessagesApi.GetSearchResultsCalendar getSearchResultsCalendar) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1855292323L, name = "GetSearchResultsPositions")
	public MessagesApi.SearchResultsPositions getSearchResultsPositions(MessagesApi.GetSearchResultsPositions getSearchResultsPositions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2145904661L, name = "HideChatJoinRequest")
	public Api.Updates hideChatJoinRequest(MessagesApi.HideChatJoinRequest hideChatJoinRequest) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3766875370L, name = "HideAllChatJoinRequests")
	public Api.Updates hideAllChatJoinRequests(MessagesApi.HideAllChatJoinRequests hideAllChatJoinRequests) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2971578274L, name = "ToggleNoForwards")
	public Api.Updates toggleNoForwards(MessagesApi.ToggleNoForwards toggleNoForwards) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3439189910L, name = "SaveDefaultSendAs")
	public Boolean saveDefaultSendAs(MessagesApi.SaveDefaultSendAs saveDefaultSendAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 627641572L, name = "SendReaction")
	public Api.Updates sendReaction(MessagesApi.SendReaction sendReaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2344259814L, name = "GetMessagesReactions")
	public Api.Updates getMessagesReactions(MessagesApi.GetMessagesReactions getMessagesReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3773721463L, name = "GetMessageReactionsList")
	public MessagesApi.MessageReactionsList getMessageReactionsList(MessagesApi.GetMessageReactionsList getMessageReactionsList) {
		return null;
	}

	@WebsocketHandlerMapping(value = 335875750L, name = "SetChatAvailableReactions")
	public Api.Updates setChatAvailableReactions(MessagesApi.SetChatAvailableReactions setChatAvailableReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 417243308L, name = "GetAvailableReactions")
	public MessagesApi.AvailableReactions getAvailableReactions(MessagesApi.GetAvailableReactions getAvailableReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3646997716L, name = "SetDefaultReaction")
	public Boolean setDefaultReaction(MessagesApi.SetDefaultReaction setDefaultReaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 617508334L, name = "TranslateText")
	public MessagesApi.TypeTranslatedText translateText(MessagesApi.TranslateText translateText) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3898322458L, name = "GetUnreadReactions")
	public MessagesApi.Messages getUnreadReactions(MessagesApi.GetUnreadReactions getUnreadReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2195870167L, name = "ReadReactions")
	public MessagesApi.AffectedHistory readReactions(MessagesApi.ReadReactions readReactions) {
		return null;
	}

	@WebsocketHandlerMapping(value = 276705696L, name = "SearchSentMedia")
	public MessagesApi.Messages searchSentMedia(MessagesApi.SearchSentMedia searchSentMedia) {
		return null;
	}

	@WebsocketHandlerMapping(value = 385663691L, name = "GetAttachMenuBots")
	public Api.AttachMenuBots getAttachMenuBots(MessagesApi.GetAttachMenuBots getAttachMenuBots) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1998676370L, name = "GetAttachMenuBot")
	public Api.AttachMenuBotsBot getAttachMenuBot(MessagesApi.GetAttachMenuBot getAttachMenuBot) {
		return null;
	}

	@WebsocketHandlerMapping(value = 451818415L, name = "ToggleBotInAttachMenu")
	public Boolean toggleBotInAttachMenu(MessagesApi.ToggleBotInAttachMenu toggleBotInAttachMenu) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2444318769L, name = "RequestWebView")
	public Api.TypeWebViewResult requestWebView(MessagesApi.RequestWebView requestWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3932142798L, name = "ProlongWebView")
	public Boolean prolongWebView(MessagesApi.ProlongWebView prolongWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1790652275L, name = "RequestSimpleWebView")
	public Api.TypeSimpleWebViewResult requestSimpleWebView(MessagesApi.RequestSimpleWebView requestSimpleWebView) {
		return null;
	}

	@WebsocketHandlerMapping(value = 172168437L, name = "SendWebViewResultMessage")
	public Api.WebViewMessageSent sendWebViewResultMessage(MessagesApi.SendWebViewResultMessage sendWebViewResultMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3691135688L, name = "SendWebViewData")
	public Api.Updates sendWebViewData(MessagesApi.SendWebViewData sendWebViewData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 647928393L, name = "TranscribeAudio")
	public MessagesApi.TranscribedAudio transcribeAudio(MessagesApi.TranscribeAudio transcribeAudio) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2132608815L, name = "RateTranscribedAudio")
	public Boolean rateTranscribedAudio(MessagesApi.RateTranscribedAudio rateTranscribedAudio) {
		return null;
	}
}