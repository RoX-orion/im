package com.im.controller;

import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.tl.TLRPC;
import com.im.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;

@WebsocketHandler
public class HelpController {

	private final HelpService helpService;

	@Autowired
	public HelpController(final HelpService helpService) {
		this.helpService = helpService;
	}
//
//	@WebsocketHandlerMapping(value = 0xc4f9186b, name = "GetConfig")
//	public TLRPC.TL_config getConfig(HelpApi.GetConfig getConfig) {
//		return null;
//	}

	@WebsocketHandlerMapping(value = 0x1fb33026, name = "GetNearestDc")
	public TLRPC.TL_nearestDc getNearestDc() {
		return helpService.getNearestDc();
	}
//
//	@WebsocketHandlerMapping(value = 0x522d5a7d, name = "GetAppUpdate")
//	public HelpApi.AppUpdate getAppUpdate(HelpApi.GetAppUpdate getAppUpdate) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x4d392343, name = "GetInviteText")
//	public HelpApi.InviteText getInviteText(HelpApi.GetInviteText getInviteText) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x9cdf08cd, name = "GetSupport")
//	public HelpApi.Support getSupport(HelpApi.GetSupport getSupport) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x9010ef6f, name = "GetAppChangelog")
//	public TLRPC.Updates getAppChangelog(HelpApi.GetAppChangelog getAppChangelog) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xec22cfcd, name = "SetBotUpdatesStatus")
//	public Boolean setBotUpdatesStatus(HelpApi.SetBotUpdatesStatus setBotUpdatesStatus) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x52029342, name = "GetCdnConfig")
//	public TLRPC.CdnConfig getCdnConfig(HelpApi.GetCdnConfig getCdnConfig) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3dc0f114, name = "GetRecentMeUrls")
//	public HelpApi.RecentMeUrls getRecentMeUrls(HelpApi.GetRecentMeUrls getRecentMeUrls) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x2ca51fd1, name = "GetTermsOfServiceUpdate")
//	public HelpApi.TermsOfServiceUpdate getTermsOfServiceUpdate(HelpApi.GetTermsOfServiceUpdate getTermsOfServiceUpdate) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xee72f79a, name = "AcceptTermsOfService")
//	public Boolean acceptTermsOfService(HelpApi.AcceptTermsOfService acceptTermsOfService) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3fedc75f, name = "GetDeepLinkInfo")
//	public HelpApi.DeepLinkInfo getDeepLinkInfo(HelpApi.GetDeepLinkInfo getDeepLinkInfo) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x98914110, name = "GetAppConfig")
//	public TLRPC.JSONValue getAppConfig(HelpApi.GetAppConfig getAppConfig) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x6f02f748, name = "SaveAppLog")
//	public Boolean saveAppLog(HelpApi.SaveAppLog saveAppLog) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc661ad08, name = "GetPassportConfig")
//	public HelpApi.PassportConfig getPassportConfig(HelpApi.GetPassportConfig getPassportConfig) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xd360e72c, name = "GetSupportName")
//	public HelpApi.SupportName getSupportName(HelpApi.GetSupportName getSupportName) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x38a08d3, name = "GetUserInfo")
//	public HelpApi.UserInfo getUserInfo(HelpApi.GetUserInfo getUserInfo) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x66b91b70, name = "EditUserInfo")
//	public HelpApi.UserInfo editUserInfo(HelpApi.EditUserInfo editUserInfo) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc0977421, name = "GetPromoData")
//	public HelpApi.PromoData getPromoData(HelpApi.GetPromoData getPromoData) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1e251c95, name = "HidePromoData")
//	public Boolean hidePromoData(HelpApi.HidePromoData hidePromoData) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf50dbaa1, name = "DismissSuggestion")
//	public Boolean dismissSuggestion(HelpApi.DismissSuggestion dismissSuggestion) {
//		return null;
//	}

	@WebsocketHandlerMapping(value = 0x735787a8, name = "GetCountriesList")
	public TLRPC.help_CountriesList getCountriesList(TLRPC.TL_help_getCountriesList getCountriesList) {
		return helpService.getCountriesList(getCountriesList);
	}
//
//	@WebsocketHandlerMapping(value = 0xb81b93d4, name = "GetPremiumPromo")
//	public HelpApi.PremiumPromo getPremiumPromo(HelpApi.GetPremiumPromo getPremiumPromo) {
//		return null;
//	}
}
