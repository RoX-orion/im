package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PhotosController {

	@WebsocketHandlerMapping(value = 1926525996L, name = "UpdateProfilePhoto")
	public PhotosApi.Photo updateProfilePhoto(PhotosApi.UpdateProfilePhoto updateProfilePhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2314407785L, name = "UploadProfilePhoto")
	public PhotosApi.Photo uploadProfilePhoto(PhotosApi.UploadProfilePhoto uploadProfilePhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2278522671L, name = "DeletePhotos")
	public long[] deletePhotos(PhotosApi.DeletePhotos deletePhotos) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2446144168L, name = "GetUserPhotos")
	public PhotosApi.Photos getUserPhotos(PhotosApi.GetUserPhotos getUserPhotos) {
		return null;
	}
}