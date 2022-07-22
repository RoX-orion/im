package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class UploadApi {

	public static class TypeFile {}
	public static class TypeWebFile {}
	public static class TypeCdnFile {}

	@Data
	public static class File {
		private final Long constructorId = 157948117L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private byte bytes;
		private StorageApi.TypeFileType type;
		private int mtime;
	}

	@Data
	public static class FileCdnRedirect {
		private final Long constructorId = 4052539972L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private byte fileToken;
		private byte encryptionIv;
		private int dcId;
		private Api.TypeFileHash[] fileHashes;
		private byte encryptionKey;
	}

	@Data
	public static class WebFile {
		private final Long constructorId = 568808380L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int size;
		private byte bytes;
		private String mimeType;
		private int mtime;
		private StorageApi.TypeFileType fileType;
	}

	@Data
	public static class CdnFileReuploadNeeded {
		private final Long constructorId = 4004045934L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private byte requestToken;
	}

	@Data
	public static class CdnFile {
		private final Long constructorId = 2845821519L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private byte bytes;
	}

	@Data
	public static class SaveFilePart {
		private final Long constructorId = 3003426337L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte bytes;
		private int filePart;
		private BigInteger fileId;
	}

	@Data
	public static class GetFile {
		private final Long constructorId = 3193124286L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger offset;
		private int limit;
		private Boolean cdnSupported;
		private Api.TypeInputFileLocation location;
		private Boolean precise;
	}

	@Data
	public static class SaveBigFilePart {
		private final Long constructorId = 3732629309L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte bytes;
		private int filePart;
		private int fileTotalParts;
		private BigInteger fileId;
	}

	@Data
	public static class GetWebFile {
		private final Long constructorId = 619086221L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private int offset;
		private int limit;
		private Api.TypeInputWebFileLocation location;
	}

	@Data
	public static class GetCdnFile {
		private final Long constructorId = 962554330L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte fileToken;
		private BigInteger offset;
		private int limit;
	}

	@Data
	public static class ReuploadCdnFile {
		private final Long constructorId = 2603046056L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte fileToken;
		private byte requestToken;
	}

	@Data
	public static class GetCdnFileHashes {
		private final Long constructorId = 2447130417L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte fileToken;
		private BigInteger offset;
	}

	@Data
	public static class GetFileHashes {
		private final Long constructorId = 2438371370L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger offset;
		private Api.TypeInputFileLocation location;
	}
}