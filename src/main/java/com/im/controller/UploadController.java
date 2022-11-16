package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class UploadController {

	@WebsocketHandlerMapping(value = 0xb304a621, name = "SaveFilePart")
	public Boolean saveFilePart(UploadApi.SaveFilePart saveFilePart) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbe5335be, name = "GetFile")
	public UploadApi.File getFile(UploadApi.GetFile getFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xde7b673d, name = "SaveBigFilePart")
	public Boolean saveBigFilePart(UploadApi.SaveBigFilePart saveBigFilePart) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x24e6818d, name = "GetWebFile")
	public UploadApi.WebFile getWebFile(UploadApi.GetWebFile getWebFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x395f69da, name = "GetCdnFile")
	public UploadApi.CdnFile getCdnFile(UploadApi.GetCdnFile getCdnFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9b2754a8, name = "ReuploadCdnFile")
	public Api.FileHash[] reuploadCdnFile(UploadApi.ReuploadCdnFile reuploadCdnFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x91dc3f31, name = "GetCdnFileHashes")
	public Api.FileHash[] getCdnFileHashes(UploadApi.GetCdnFileHashes getCdnFileHashes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9156982a, name = "GetFileHashes")
	public Api.FileHash[] getFileHashes(UploadApi.GetFileHashes getFileHashes) {
		return null;
	}
}