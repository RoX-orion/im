package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class LangpackApi {


	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetLangPack extends Api.TypeLangPackDifference {
		private final Long constructorId = 4075959050L;
		private final long subclassOfId = 1382427989L;
		private final Boolean isFunction = true;

		private String langPack;
		private String langCode;
	}

	@Data
	public static class GetStrings {
		private final Long constructorId = 4025104387L;
		private final long subclassOfId = 3350672701L;
		private final Boolean isFunction = true;

		private String langPack;
		private String[] keys;
		private String langCode;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetDifference extends Api.TypeLangPackDifference {
		private final Long constructorId = 3449309861L;
		private final long subclassOfId = 1382427989L;
		private final Boolean isFunction = true;

		private int fromVersion;
		private String langPack;
		private String langCode;
	}

	@Data
	public static class GetLanguages {
		private final Long constructorId = 1120311183L;
		private final long subclassOfId = 671683273L;
		private final Boolean isFunction = true;

		private String langPack;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetLanguage extends Api.TypeLangPackLanguage {
		private final Long constructorId = 1784243458L;
		private final long subclassOfId = 2880211383L;
		private final Boolean isFunction = true;

		private String langPack;
		private String langCode;
	}
}
