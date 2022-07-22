package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class PhotosApi {

	public static class TypePhotos {}
	public static class TypePhoto {}

	@Data
	public static class Photos {
		private final Long constructorId = 2378853029L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypePhoto[] photos;
		private Api.TypeUser[] users;
	}

	@Data
	public static class PhotosSlice {
		private final Long constructorId = 352657236L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int count;
		private Api.TypePhoto[] photos;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class Photo extends Api.TypePhoto {
		private final Long constructorId = 539045032L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypePhoto photo;
		private Api.TypeUser[] users;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UpdateProfilePhoto extends Api.TypePhoto {
		private final Long constructorId = 1926525996L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputPhoto id;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class UploadProfilePhoto extends Api.TypePhoto {
		private final Long constructorId = 2314407785L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputFile file;
		private double videoStartTs;
		private Api.TypeInputFile video;
	}

	@Data
	public static class DeletePhotos {
		private final Long constructorId = 2278522671L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputPhoto[] id;
	}

	@Data
	public static class GetUserPhotos {
		private final Long constructorId = 2446144168L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger maxId;
		private int offset;
		private int limit;
		private Api.TypeInputUser userId;
	}
}