package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UploadController {

	@WebsocketHandlerMapping(value = -1291540959, name = "SaveFilePart")
	public Boolean saveFilePart(UploadApi.SaveFilePart saveFilePart) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1101843010, name = "GetFile")
	public UploadApi.File getFile(UploadApi.GetFile getFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = -562337987, name = "SaveBigFilePart")
	public Boolean saveBigFilePart(UploadApi.SaveBigFilePart saveBigFilePart) {
		return null;
	}

	@WebsocketHandlerMapping(value = 619086221, name = "GetWebFile")
	public UploadApi.WebFile getWebFile(UploadApi.GetWebFile getWebFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = 962554330, name = "GetCdnFile")
	public UploadApi.CdnFile getCdnFile(UploadApi.GetCdnFile getCdnFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1691921240, name = "ReuploadCdnFile")
	public Api.FileHash[] reuploadCdnFile(UploadApi.ReuploadCdnFile reuploadCdnFile) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1847836879, name = "GetCdnFileHashes")
	public Api.FileHash[] getCdnFileHashes(UploadApi.GetCdnFileHashes getCdnFileHashes) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1856595926, name = "GetFileHashes")
	public Api.FileHash[] getFileHashes(UploadApi.GetFileHashes getFileHashes) {
		return null;
	}
}