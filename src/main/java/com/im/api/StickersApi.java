package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class StickersApi {

	public static class TypeSuggestedShortName {}

	@Data
	public static class SuggestedShortName {
		private String shortName;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class CreateStickerSet extends Api.TypeStickerSet {
		private Boolean masks;
		private Boolean animated;
		private Boolean videos;
		private Api.TypeInputUser userId;
		private String title;
		private String shortName;
		private Api.TypeInputDocument thumb;
		private Api.TypeInputStickerSetItem[] stickers;
		private String software;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class RemoveStickerFromSet extends Api.TypeStickerSet {
		private Api.TypeInputDocument sticker;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class ChangeStickerPosition extends Api.TypeStickerSet {
		private Api.TypeInputDocument sticker;
		private int position;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class AddStickerToSet extends Api.TypeStickerSet {
		private Api.TypeInputStickerSet stickerset;
		private Api.TypeInputStickerSetItem sticker;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SetStickerSetThumb extends Api.TypeStickerSet {
		private Api.TypeInputStickerSet stickerset;
		private Api.TypeInputDocument thumb;
	}

	@Data
	public static class CheckShortName {
		private String shortName;
	}

	@Data
	public static class SuggestShortName {
		private String title;
	}
}