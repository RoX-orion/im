package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UploadController {

	@WebsocketHandlerMapping(value = 3003426337L, name = "SaveFilePart")
	public Boolean saveFilePart(UploadApi.SaveFilePart saveFilePart) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3193124286L, name = "GetFile")
	public UploadApi.File getFile(UploadApi.GetFile getFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3732629309L, name = "SaveBigFilePart")
	public Boolean saveBigFilePart(UploadApi.SaveBigFilePart saveBigFilePart) {
		return null;
	}

	@WebsocketHandlerMapping(value = 619086221L, name = "GetWebFile")
	public UploadApi.WebFile getWebFile(UploadApi.GetWebFile getWebFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 962554330L, name = "GetCdnFile")
	public UploadApi.CdnFile getCdnFile(UploadApi.GetCdnFile getCdnFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2603046056L, name = "ReuploadCdnFile")
	public Api.FileHash[] reuploadCdnFile(UploadApi.ReuploadCdnFile reuploadCdnFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2447130417L, name = "GetCdnFileHashes")
	public Api.FileHash[] getCdnFileHashes(UploadApi.GetCdnFileHashes getCdnFileHashes) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2438371370L, name = "GetFileHashes")
	public Api.FileHash[] getFileHashes(UploadApi.GetFileHashes getFileHashes) {
		return null;
	}
}