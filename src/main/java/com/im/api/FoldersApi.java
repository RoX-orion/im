package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class FoldersApi {


	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class EditPeerFolders extends Api.TypeUpdates {
		private final Long constructorId = 1749536939L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputFolderPeer[] folderPeers;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class DeleteFolder extends Api.TypeUpdates {
		private final Long constructorId = 472471681L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private int folderId;
	}
}