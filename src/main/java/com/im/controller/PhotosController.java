package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PhotosController {

	@WebsocketHandlerMapping(value = 1926525996, name = "UpdateProfilePhoto")
	public PhotosApi.Photo updateProfilePhoto(PhotosApi.UpdateProfilePhoto updateProfilePhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1980559511, name = "UploadProfilePhoto")
	public PhotosApi.Photo uploadProfilePhoto(PhotosApi.UploadProfilePhoto uploadProfilePhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2016444625, name = "DeletePhotos")
	public long[] deletePhotos(PhotosApi.DeletePhotos deletePhotos) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1848823128, name = "GetUserPhotos")
	public PhotosApi.Photos getUserPhotos(PhotosApi.GetUserPhotos getUserPhotos) {
		return null;
	}
}