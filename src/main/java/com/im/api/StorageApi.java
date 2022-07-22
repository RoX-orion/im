package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class StorageApi {

	public static class TypeFileType {}

	@Data
	public static class FileUnknown {
		private final Long constructorId = 2861972229L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FilePartial {
		private final Long constructorId = 1086091090L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FileJpeg {
		private final Long constructorId = 8322574L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FileGif {
		private final Long constructorId = 3403786975L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FilePng {
		private final Long constructorId = 172975040L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FilePdf {
		private final Long constructorId = 2921222285L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FileMp3 {
		private final Long constructorId = 1384777335L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FileMov {
		private final Long constructorId = 1258941372L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FileMp4 {
		private final Long constructorId = 3016663268L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}

	@Data
	public static class FileWebp {
		private final Long constructorId = 276907596L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

	}
}