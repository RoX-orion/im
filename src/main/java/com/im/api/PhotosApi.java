package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class PhotosApi {

	public static class TypePhotos {}
	public static class TypePhoto {}

	@Data
	public static class Photos {
		private Api.TypePhoto[] photos;
		private Api.TypeUser[] users;
	}

	@Data
	public static class PhotosSlice {
		private int count;
		private Api.TypePhoto[] photos;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class Photo extends Api.TypePhoto {
		private Api.TypePhoto photo;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UpdateProfilePhoto extends Api.TypePhoto {
		private Api.TypeInputPhoto id;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class UploadProfilePhoto extends Api.TypePhoto {
		private Api.TypeInputFile file;
		private Api.TypeInputFile video;
		private double videoStartTs;
	}

	@Data
	public static class DeletePhotos {
		private Api.TypeInputPhoto[] id;
	}

	@Data
	public static class GetUserPhotos {
		private Api.TypeInputUser userId;
		private int offset;
		private BigInteger maxId;
		private int limit;
	}
}