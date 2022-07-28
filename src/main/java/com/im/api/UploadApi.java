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
		private byte bytes;
		private StorageApi.TypeFileType type;
		private int mtime;
	}

	@Data
	public static class FileCdnRedirect {
		private byte fileToken;
		private byte encryptionIv;
		private int dcId;
		private Api.TypeFileHash[] fileHashes;
		private byte encryptionKey;
	}

	@Data
	public static class WebFile {
		private int size;
		private byte bytes;
		private String mimeType;
		private int mtime;
		private StorageApi.TypeFileType fileType;
	}

	@Data
	public static class CdnFileReuploadNeeded {
		private byte requestToken;
	}

	@Data
	public static class CdnFile {
		private byte bytes;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveFilePart extends Api.TypeBool {
		private byte bytes;
		private int filePart;
		private BigInteger fileId;
	}

	@Data
	public static class GetFile {
		private BigInteger offset;
		private int limit;
		private Api.True cdnSupported;
		private Api.TypeInputFileLocation location;
		private Api.True precise;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SaveBigFilePart extends Api.TypeBool {
		private byte bytes;
		private int filePart;
		private int fileTotalParts;
		private BigInteger fileId;
	}

	@Data
	public static class GetWebFile {
		private int offset;
		private int limit;
		private Api.TypeInputWebFileLocation location;
	}

	@Data
	public static class GetCdnFile {
		private byte fileToken;
		private BigInteger offset;
		private int limit;
	}

	@Data
	public static class ReuploadCdnFile {
		private byte fileToken;
		private byte requestToken;
	}

	@Data
	public static class GetCdnFileHashes {
		private byte fileToken;
		private BigInteger offset;
	}

	@Data
	public static class GetFileHashes {
		private BigInteger offset;
		private Api.TypeInputFileLocation location;
	}
}