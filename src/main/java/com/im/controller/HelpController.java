package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelpController {

	@WebsocketHandlerMapping(value = 3304659051L, name = "GetConfig")
	public Api.Config getConfig(HelpApi.GetConfig getConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 531836966L, name = "GetNearestDc")
	public Api.NearestDc getNearestDc(HelpApi.GetNearestDc getNearestDc) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1378703997L, name = "GetAppUpdate")
	public HelpApi.AppUpdate getAppUpdate(HelpApi.GetAppUpdate getAppUpdate) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1295590211L, name = "GetInviteText")
	public HelpApi.InviteText getInviteText(HelpApi.GetInviteText getInviteText) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2631862477L, name = "GetSupport")
	public HelpApi.Support getSupport(HelpApi.GetSupport getSupport) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2417028975L, name = "GetAppChangelog")
	public Api.Updates getAppChangelog(HelpApi.GetAppChangelog getAppChangelog) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3961704397L, name = "SetBotUpdatesStatus")
	public Boolean setBotUpdatesStatus(HelpApi.SetBotUpdatesStatus setBotUpdatesStatus) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1375900482L, name = "GetCdnConfig")
	public Api.CdnConfig getCdnConfig(HelpApi.GetCdnConfig getCdnConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1036054804L, name = "GetRecentMeUrls")
	public HelpApi.RecentMeUrls getRecentMeUrls(HelpApi.GetRecentMeUrls getRecentMeUrls) {
		return null;
	}

	@WebsocketHandlerMapping(value = 749019089L, name = "GetTermsOfServiceUpdate")
	public HelpApi.TermsOfServiceUpdate getTermsOfServiceUpdate(HelpApi.GetTermsOfServiceUpdate getTermsOfServiceUpdate) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4000511898L, name = "AcceptTermsOfService")
	public Boolean acceptTermsOfService(HelpApi.AcceptTermsOfService acceptTermsOfService) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1072547679L, name = "GetDeepLinkInfo")
	public HelpApi.DeepLinkInfo getDeepLinkInfo(HelpApi.GetDeepLinkInfo getDeepLinkInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2559656208L, name = "GetAppConfig")
	public Api.TypeJSONValue getAppConfig(HelpApi.GetAppConfig getAppConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1862465352L, name = "SaveAppLog")
	public Boolean saveAppLog(HelpApi.SaveAppLog saveAppLog) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3328290056L, name = "GetPassportConfig")
	public HelpApi.PassportConfig getPassportConfig(HelpApi.GetPassportConfig getPassportConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3546343212L, name = "GetSupportName")
	public HelpApi.SupportName getSupportName(HelpApi.GetSupportName getSupportName) {
		return null;
	}

	@WebsocketHandlerMapping(value = 59377875L, name = "GetUserInfo")
	public HelpApi.UserInfo getUserInfo(HelpApi.GetUserInfo getUserInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1723407216L, name = "EditUserInfo")
	public HelpApi.UserInfo editUserInfo(HelpApi.EditUserInfo editUserInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3231151137L, name = "GetPromoData")
	public HelpApi.PromoData getPromoData(HelpApi.GetPromoData getPromoData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 505748629L, name = "HidePromoData")
	public Boolean hidePromoData(HelpApi.HidePromoData hidePromoData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4111317665L, name = "DismissSuggestion")
	public Boolean dismissSuggestion(HelpApi.DismissSuggestion dismissSuggestion) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1935116200L, name = "GetCountriesList")
	public HelpApi.CountriesList getCountriesList(HelpApi.GetCountriesList getCountriesList) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3088815060L, name = "GetPremiumPromo")
	public HelpApi.PremiumPromo getPremiumPromo(HelpApi.GetPremiumPromo getPremiumPromo) {
		return null;
	}
}