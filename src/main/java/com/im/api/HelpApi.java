package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class HelpApi {

	public static class TypeConfigSimple {}
	public static class TypeAppUpdate {}
	public static class TypeInviteText {}
	public static class TypeSupport {}
	public static class TypeTermsOfService {}
	public static class TypeRecentMeUrls {}
	public static class TypeTermsOfServiceUpdate {}
	public static class TypeDeepLinkInfo {}
	public static class TypePassportConfig {}
	public static class TypeSupportName {}
	public static class TypeUserInfo {}
	public static class TypePromoData {}
	public static class TypeCountryCode {}
	public static class TypeCountry {}
	public static class TypeCountriesList {}
	public static class TypePremiumPromo {}

	@Data
	public static class ConfigSimple {
		private int date;
		private int expires;
		private Api.TypeAccessPointRule[] rules;
	}

	@Data
	public static class AppUpdate {
		private Boolean canNotSkip;
		private int id;
		private String version;
		private String text;
		private Api.TypeMessageEntity[] entities;
		private Api.TypeDocument document;
		private String url;
		private Api.TypeDocument sticker;
	}

	@Data
	public static class NoAppUpdate {
	}

	@Data
	public static class InviteText {
		private String message;
	}

	@Data
	public static class Support {
		private String phoneNumber;
		private Api.TypeUser user;
	}

	@Data
	public static class TermsOfService {
		private Boolean popup;
		private Api.TypeDataJSON id;
		private String text;
		private Api.TypeMessageEntity[] entities;
		private int minAgeConfirm;
	}

	@Data
	public static class RecentMeUrls {
		private Api.TypeRecentMeUrl[] urls;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class TermsOfServiceUpdateEmpty {
		private int expires;
	}

	@Data
	public static class TermsOfServiceUpdate {
		private int expires;
		private HelpApi.TypeTermsOfService termsOfService;
	}

	@Data
	public static class DeepLinkInfoEmpty {
	}

	@Data
	public static class DeepLinkInfo {
		private Boolean updateApp;
		private String message;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	public static class PassportConfigNotModified {
	}

	@Data
	public static class PassportConfig {
		private int hash;
		private Api.TypeDataJSON countriesLangs;
	}

	@Data
	public static class SupportName {
		private String name;
	}

	@Data
	public static class UserInfoEmpty {
	}

	@Data
	public static class UserInfo {
		private String message;
		private Api.TypeMessageEntity[] entities;
		private String author;
		private int date;
	}

	@Data
	public static class PromoDataEmpty {
		private int expires;
	}

	@Data
	public static class PromoData {
		private Boolean proxy;
		private int expires;
		private Api.TypePeer peer;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
		private String psaType;
		private String psaMessage;
	}

	@Data
	public static class CountryCode {
		private String countryCode;
		private String[] prefixes;
		private String[] patterns;
	}

	@Data
	public static class Country {
		private Boolean hidden;
		private String iso2;
		private String defaultName;
		private String name;
		private HelpApi.TypeCountryCode[] countryCodes;
	}

	@Data
	public static class CountriesListNotModified {
	}

	@Data
	public static class CountriesList {
		private HelpApi.TypeCountry[] countries;
		private int hash;
	}

	@Data
	public static class PremiumPromo {
		private String statusText;
		private Api.TypeMessageEntity[] statusEntities;
		private String[] videoSections;
		private Api.TypeDocument[] videos;
		private Api.TypePremiumSubscriptionOption[] periodOptions;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetConfig extends Api.TypeConfig {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetNearestDc extends Api.TypeNearestDc {
	}

	@Data
	public static class GetAppUpdate {
		private String source;
	}

	@Data
	public static class GetInviteText {
	}

	@Data
	public static class GetSupport {
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetAppChangelog extends Api.TypeUpdates {
		private String prevAppVersion;
	}

	@Data
	public static class SetBotUpdatesStatus {
		private int pendingUpdatesCount;
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetCdnConfig extends Api.TypeCdnConfig {
	}

	@Data
	public static class GetRecentMeUrls {
		private String referer;
	}

	@Data
	public static class GetTermsOfServiceUpdate {
	}

	@Data
	public static class AcceptTermsOfService {
		private Api.TypeDataJSON id;
	}

	@Data
	public static class GetDeepLinkInfo {
		private String path;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetAppConfig extends Api.TypeJSONValue {
	}

	@Data
	public static class SaveAppLog {
		private Api.TypeInputAppEvent[] events;
	}

	@Data
	public static class GetPassportConfig {
		private int hash;
	}

	@Data
	public static class GetSupportName {
	}

	@Data
	public static class GetUserInfo {
		private Api.TypeInputUser userId;
	}

	@Data
	public static class EditUserInfo {
		private Api.TypeInputUser userId;
		private String message;
		private Api.TypeMessageEntity[] entities;
	}

	@Data
	public static class GetPromoData {
	}

	@Data
	public static class HidePromoData {
		private Api.TypeInputPeer peer;
	}

	@Data
	public static class DismissSuggestion {
		private Api.TypeInputPeer peer;
		private String suggestion;
	}

	@Data
	public static class GetCountriesList {
		private String langCode;
		private int hash;
	}

	@Data
	public static class GetPremiumPromo {
	}
}