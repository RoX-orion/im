package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class LangpackApi {


	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetLangPack extends Api.TypeLangPackDifference {
		private String langPack;
		private String langCode;
	}

	@Data
	public static class GetStrings {
		private String langPack;
		private String langCode;
		private String[] keys;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetDifference extends Api.TypeLangPackDifference {
		private String langPack;
		private String langCode;
		private int fromVersion;
	}

	@Data
	public static class GetLanguages {
		private String langPack;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetLanguage extends Api.TypeLangPackLanguage {
		private String langPack;
		private String langCode;
	}
}
