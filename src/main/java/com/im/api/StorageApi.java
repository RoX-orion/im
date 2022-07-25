package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class StorageApi {

	public static class TypeFileType {}

	@Data
	public static class FileUnknown {
	}

	@Data
	public static class FilePartial {
	}

	@Data
	public static class FileJpeg {
	}

	@Data
	public static class FileGif {
	}

	@Data
	public static class FilePng {
	}

	@Data
	public static class FilePdf {
	}

	@Data
	public static class FileMp3 {
	}

	@Data
	public static class FileMov {
	}

	@Data
	public static class FileMp4 {
	}

	@Data
	public static class FileWebp {
	}
}