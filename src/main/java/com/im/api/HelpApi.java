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
		private final Long constructorId = 1515793004L;
		private final long subclassOfId = 689453764L;
		private final Boolean isFunction = false;

		private int date;
		private int expires;
		private Api.TypeAccessPointRule[] rules;
	}

	@Data
	public static class AppUpdate {
		private final Long constructorId = 3434860080L;
		private final long subclassOfId = 1486292638L;
		private final Boolean isFunction = false;

		private Boolean canNotSkip;
		private Api.TypeMessageEntity[] entities;
		private Api.TypeDocument document;
		private Api.TypeDocument sticker;
		private int id;
		private String text;
		private String version;
		private String url;
	}

	@Data
	public static class NoAppUpdate {
		private final Long constructorId = 3294258486L;
		private final long subclassOfId = 1486292638L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class InviteText {
		private final Long constructorId = 415997816L;
		private final long subclassOfId = 3480267317L;
		private final Boolean isFunction = false;

		private String message;
	}

	@Data
	public static class Support {
		private final Long constructorId = 398898678L;
		private final long subclassOfId = 1901706475L;
		private final Boolean isFunction = false;

		private String phoneNumber;
		private Api.TypeUser user;
	}

	@Data
	public static class TermsOfService {
		private final Long constructorId = 2013922064L;
		private final long subclassOfId = 552502034L;
		private final Boolean isFunction = false;

		private Boolean popup;
		private Api.TypeMessageEntity[] entities;
		private int minAgeConfirm;
		private Api.TypeDataJSON id;
		private String text;
	}

	@Data
	public static class RecentMeUrls {
		private final Long constructorId = 235081943L;
		private final long subclassOfId = 4067017847L;
		private final Boolean isFunction = false;

		private Api.TypeRecentMeUrl[] urls;
		private Api.TypeChat[] chats;
		private Api.TypeUser[] users;
	}

	@Data
	public static class TermsOfServiceUpdateEmpty {
		private final Long constructorId = 3811614591L;
		private final long subclassOfId = 691808631L;
		private final Boolean isFunction = false;

		private int expires;
	}

	@Data
	public static class TermsOfServiceUpdate {
		private final Long constructorId = 686618977L;
		private final long subclassOfId = 691808631L;
		private final Boolean isFunction = false;

		private int expires;
		private HelpApi.TypeTermsOfService termsOfService;
	}

	@Data
	public static class DeepLinkInfoEmpty {
		private final Long constructorId = 1722786150L;
		private final long subclassOfId = 2555030584L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class DeepLinkInfo {
		private final Long constructorId = 1783556146L;
		private final long subclassOfId = 2555030584L;
		private final Boolean isFunction = false;

		private Api.TypeMessageEntity[] entities;
		private Boolean updateApp;
		private String message;
	}

	@Data
	public static class PassportConfigNotModified {
		private final Long constructorId = 3216634967L;
		private final long subclassOfId = 3328622765L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class PassportConfig {
		private final Long constructorId = 2694370991L;
		private final long subclassOfId = 3328622765L;
		private final Boolean isFunction = false;

		private Api.TypeDataJSON countriesLangs;
		private int hash;
	}

	@Data
	public static class SupportName {
		private final Long constructorId = 2349199817L;
		private final long subclassOfId = 2135996354L;
		private final Boolean isFunction = false;

		private String name;
	}

	@Data
	public static class UserInfoEmpty {
		private final Long constructorId = 4088278765L;
		private final long subclassOfId = 1548998616L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class UserInfo {
		private final Long constructorId = 32192344L;
		private final long subclassOfId = 1548998616L;
		private final Boolean isFunction = false;

		private int date;
		private Api.TypeMessageEntity[] entities;
		private String author;
		private String message;
	}

	@Data
	public static class PromoDataEmpty {
		private final Long constructorId = 2566302837L;
		private final long subclassOfId = 2639877442L;
		private final Boolean isFunction = false;

		private int expires;
	}

	@Data
	public static class PromoData {
		private final Long constructorId = 2352576831L;
		private final long subclassOfId = 2639877442L;
		private final Boolean isFunction = false;

		private Boolean proxy;
		private int expires;
		private Api.TypePeer peer;
		private Api.TypeChat[] chats;
		private String psaMessage;
		private Api.TypeUser[] users;
		private String psaType;
	}

	@Data
	public static class CountryCode {
		private final Long constructorId = 1107543535L;
		private final long subclassOfId = 1995654757L;
		private final Boolean isFunction = false;

		private String[] prefixes;
		private String countryCode;
		private String[] patterns;
	}

	@Data
	public static class Country {
		private final Long constructorId = 3280440867L;
		private final long subclassOfId = 2720964136L;
		private final Boolean isFunction = false;

		private HelpApi.TypeCountryCode[] countryCodes;
		private Boolean hidden;
		private String name;
		private String iso2;
		private String defaultName;
	}

	@Data
	public static class CountriesListNotModified {
		private final Long constructorId = 2479628082L;
		private final long subclassOfId = 3929144968L;
		private final Boolean isFunction = false;

	}

	@Data
	public static class CountriesList {
		private final Long constructorId = 2278585758L;
		private final long subclassOfId = 3929144968L;
		private final Boolean isFunction = false;

		private HelpApi.TypeCountry[] countries;
		private int hash;
	}

	@Data
	public static class PremiumPromo {
		private final Long constructorId = 2320448553L;
		private final long subclassOfId = 3381109560L;
		private final Boolean isFunction = false;

		private String[] videoSections;
		private String statusText;
		private Api.TypeDocument[] videos;
		private String currency;
		private BigInteger monthlyAmount;
		private Api.TypeMessageEntity[] statusEntities;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetConfig extends Api.TypeConfig {
		private final Long constructorId = 3304659051L;
		private final long subclassOfId = 3542493770L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetNearestDc extends Api.TypeNearestDc {
		private final Long constructorId = 531836966L;
		private final long subclassOfId = 947323999L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetAppUpdate {
		private final Long constructorId = 1378703997L;
		private final long subclassOfId = 1486292638L;
		private final Boolean isFunction = true;

		private String source;
	}

	@Data
	public static class GetInviteText {
		private final Long constructorId = 1295590211L;
		private final long subclassOfId = 3480267317L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetSupport {
		private final Long constructorId = 2631862477L;
		private final long subclassOfId = 1901706475L;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetAppChangelog extends Api.TypeUpdates {
		private final Long constructorId = 2417028975L;
		private final long subclassOfId = 2331323052L;
		private final Boolean isFunction = true;

		private String prevAppVersion;
	}

	@Data
	public static class SetBotUpdatesStatus {
		private final Long constructorId = 3961704397L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private int pendingUpdatesCount;
		private String message;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetCdnConfig extends Api.TypeCdnConfig {
		private final Long constructorId = 1375900482L;
		private final long subclassOfId = 3973724540L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetRecentMeUrls {
		private final Long constructorId = 1036054804L;
		private final long subclassOfId = 4067017847L;
		private final Boolean isFunction = true;

		private String referer;
	}

	@Data
	public static class GetTermsOfServiceUpdate {
		private final Long constructorId = 749019089L;
		private final long subclassOfId = 691808631L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class AcceptTermsOfService {
		private final Long constructorId = 4000511898L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeDataJSON id;
	}

	@Data
	public static class GetDeepLinkInfo {
		private final Long constructorId = 1072547679L;
		private final long subclassOfId = 2555030584L;
		private final Boolean isFunction = true;

		private String path;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetAppConfig extends Api.TypeJSONValue {
		private final Long constructorId = 2559656208L;
		private final long subclassOfId = 3952707507L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class SaveAppLog {
		private final Long constructorId = 1862465352L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputAppEvent[] events;
	}

	@Data
	public static class GetPassportConfig {
		private final Long constructorId = 3328290056L;
		private final long subclassOfId = 3328622765L;
		private final Boolean isFunction = true;

		private int hash;
	}

	@Data
	public static class GetSupportName {
		private final Long constructorId = 3546343212L;
		private final long subclassOfId = 2135996354L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class GetUserInfo {
		private final Long constructorId = 59377875L;
		private final long subclassOfId = 1548998616L;
		private final Boolean isFunction = true;

		private Api.TypeInputUser userId;
	}

	@Data
	public static class EditUserInfo {
		private final Long constructorId = 1723407216L;
		private final long subclassOfId = 1548998616L;
		private final Boolean isFunction = true;

		private Api.TypeMessageEntity[] entities;
		private String message;
		private Api.TypeInputUser userId;
	}

	@Data
	public static class GetPromoData {
		private final Long constructorId = 3231151137L;
		private final long subclassOfId = 2639877442L;
		private final Boolean isFunction = true;

	}

	@Data
	public static class HidePromoData {
		private final Long constructorId = 505748629L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
	}

	@Data
	public static class DismissSuggestion {
		private final Long constructorId = 4111317665L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private String suggestion;
	}

	@Data
	public static class GetCountriesList {
		private final Long constructorId = 1935116200L;
		private final long subclassOfId = 3929144968L;
		private final Boolean isFunction = true;

		private String langCode;
		private int hash;
	}

	@Data
	public static class GetPremiumPromo {
		private final Long constructorId = 3088815060L;
		private final long subclassOfId = 3381109560L;
		private final Boolean isFunction = true;

	}
}