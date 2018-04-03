package com.whirl.wheel.mapper;

import com.whirl.wheel.domain.ImageRequest;
import com.whirl.wheel.entity.UploadImageEntity;

public interface ImageMapper {

	public static UploadImageEntity imageToEntity(ImageRequest image) {
		UploadImageEntity entity=new UploadImageEntity();
		entity.setId(image.getId());
		return entity;
	}
}
