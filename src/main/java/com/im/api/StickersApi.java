package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class StickersApi {

	public static class TypeSuggestedShortName {}

	@Data
	public static class SuggestedShortName {
		private final Long constructorId = 2248056895L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String shortName;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class CreateStickerSet extends Api.TypeStickerSet {
		private final Long constructorId = 2418125671L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String software;
		private Api.TypeInputDocument thumb;
		private Boolean animated;
		private Boolean masks;
		private Boolean videos;
		private Api.TypeInputStickerSetItem[] stickers;
		private String title;
		private String shortName;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RemoveStickerFromSet extends Api.TypeStickerSet {
		private final Long constructorId = 4151709521L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputDocument sticker;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class ChangeStickerPosition extends Api.TypeStickerSet {
		private final Long constructorId = 4290172106L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputDocument sticker;
		private int position;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AddStickerToSet extends Api.TypeStickerSet {
		private final Long constructorId = 2253651646L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputStickerSetItem sticker;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SetStickerSetThumb extends Api.TypeStickerSet {
		private final Long constructorId = 2587250224L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputDocument thumb;
		private Api.TypeInputStickerSet stickerset;
	}

	@Data
	public static class CheckShortName {
		private final Long constructorId = 676017721L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String shortName;
	}

	@Data
	public static class SuggestShortName {
		private final Long constructorId = 1303364867L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String title;
	}
}