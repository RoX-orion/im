package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

public class FoldersApi {


	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class EditPeerFolders extends Api.TypeUpdates {
		private Api.TypeInputFolderPeer[] folderPeers;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class DeleteFolder extends Api.TypeUpdates {
		private int folderId;
	}
}
