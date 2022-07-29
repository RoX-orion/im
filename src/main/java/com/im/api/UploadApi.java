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
		private StorageApi.TypeFileType type;
		private int mtime;
		private byte[] bytes;
	}

	@Data
	public static class FileCdnRedirect {
		private int dcId;
		private byte[] fileToken;
		private byte[] encryptionKey;
		private byte[] encryptionIv;
		private Api.TypeFileHash[] fileHashes;
	}

	@Data
	public static class WebFile {
		private int size;
		private String mimeType;
		private StorageApi.TypeFileType fileType;
		private int mtime;
		private byte[] bytes;
	}

	@Data
	public static class CdnFileReuploadNeeded {
		private byte[] requestToken;
	}

	@Data
	public static class CdnFile {
		private byte[] bytes;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveFilePart extends Api.TypeBool {
		private BigInteger fileId;
		private int filePart;
		private byte[] bytes;
	}

	@Data
	public static class GetFile {
		private Api.True precise;
		private Api.True cdnSupported;
		private Api.TypeInputFileLocation location;
		private BigInteger offset;
		private int limit;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveBigFilePart extends Api.TypeBool {
		private BigInteger fileId;
		private int filePart;
		private int fileTotalParts;
		private byte[] bytes;
	}

	@Data
	public static class GetWebFile {
		private Api.TypeInputWebFileLocation location;
		private int offset;
		private int limit;
	}

	@Data
	public static class GetCdnFile {
		private byte[] fileToken;
		private BigInteger offset;
		private int limit;
	}

	@Data
	public static class ReuploadCdnFile {
		private byte[] fileToken;
		private byte[] requestToken;
	}

	@Data
	public static class GetCdnFileHashes {
		private byte[] fileToken;
		private BigInteger offset;
	}

	@Data
	public static class GetFileHashes {
		private Api.TypeInputFileLocation location;
		private BigInteger offset;
	}
}