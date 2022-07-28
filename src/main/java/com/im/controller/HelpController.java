package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class HelpController {

	@WebsocketHandlerMapping(value = -990308245, name = "GetConfig")
	public Api.Config getConfig(HelpApi.GetConfig getConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 531836966, name = "GetNearestDc")
	public Api.NearestDc getNearestDc(HelpApi.GetNearestDc getNearestDc) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1378703997, name = "GetAppUpdate")
	public HelpApi.AppUpdate getAppUpdate(HelpApi.GetAppUpdate getAppUpdate) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1295590211, name = "GetInviteText")
	public HelpApi.InviteText getInviteText(HelpApi.GetInviteText getInviteText) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1663104819, name = "GetSupport")
	public HelpApi.Support getSupport(HelpApi.GetSupport getSupport) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1877938321, name = "GetAppChangelog")
	public Api.Updates getAppChangelog(HelpApi.GetAppChangelog getAppChangelog) {
		return null;
	}

	@WebsocketHandlerMapping(value = -333262899, name = "SetBotUpdatesStatus")
	public Boolean setBotUpdatesStatus(HelpApi.SetBotUpdatesStatus setBotUpdatesStatus) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1375900482, name = "GetCdnConfig")
	public Api.CdnConfig getCdnConfig(HelpApi.GetCdnConfig getCdnConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1036054804, name = "GetRecentMeUrls")
	public HelpApi.RecentMeUrls getRecentMeUrls(HelpApi.GetRecentMeUrls getRecentMeUrls) {
		return null;
	}

	@WebsocketHandlerMapping(value = 749019089, name = "GetTermsOfServiceUpdate")
	public HelpApi.TermsOfServiceUpdate getTermsOfServiceUpdate(HelpApi.GetTermsOfServiceUpdate getTermsOfServiceUpdate) {
		return null;
	}

	@WebsocketHandlerMapping(value = -294455398, name = "AcceptTermsOfService")
	public Boolean acceptTermsOfService(HelpApi.AcceptTermsOfService acceptTermsOfService) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1072547679, name = "GetDeepLinkInfo")
	public HelpApi.DeepLinkInfo getDeepLinkInfo(HelpApi.GetDeepLinkInfo getDeepLinkInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1735311088, name = "GetAppConfig")
	public Api.TypeJSONValue getAppConfig(HelpApi.GetAppConfig getAppConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1862465352, name = "SaveAppLog")
	public Boolean saveAppLog(HelpApi.SaveAppLog saveAppLog) {
		return null;
	}

	@WebsocketHandlerMapping(value = -966677240, name = "GetPassportConfig")
	public HelpApi.PassportConfig getPassportConfig(HelpApi.GetPassportConfig getPassportConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = -748624084, name = "GetSupportName")
	public HelpApi.SupportName getSupportName(HelpApi.GetSupportName getSupportName) {
		return null;
	}

	@WebsocketHandlerMapping(value = 59377875, name = "GetUserInfo")
	public HelpApi.UserInfo getUserInfo(HelpApi.GetUserInfo getUserInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1723407216, name = "EditUserInfo")
	public HelpApi.UserInfo editUserInfo(HelpApi.EditUserInfo editUserInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1063816159, name = "GetPromoData")
	public HelpApi.PromoData getPromoData(HelpApi.GetPromoData getPromoData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 505748629, name = "HidePromoData")
	public Boolean hidePromoData(HelpApi.HidePromoData hidePromoData) {
		return null;
	}

	@WebsocketHandlerMapping(value = -183649631, name = "DismissSuggestion")
	public Boolean dismissSuggestion(HelpApi.DismissSuggestion dismissSuggestion) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1935116200, name = "GetCountriesList")
	public HelpApi.CountriesList getCountriesList(HelpApi.GetCountriesList getCountriesList) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1206152236, name = "GetPremiumPromo")
	public HelpApi.PremiumPromo getPremiumPromo(HelpApi.GetPremiumPromo getPremiumPromo) {
		return null;
	}
}