package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class FoldersApi {


	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class EditPeerFolders extends Api.TypeUpdates {
		private Api.TypeInputFolderPeer[] folderPeers;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class DeleteFolder extends Api.TypeUpdates {
		private int folderId;
	}
}