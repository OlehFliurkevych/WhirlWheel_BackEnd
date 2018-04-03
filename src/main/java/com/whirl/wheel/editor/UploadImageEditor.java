package com.whirl.wheel.editor;

import java.beans.PropertyEditorSupport;

import com.whirl.wheel.entity.UploadImageEntity;
import com.whirl.wheel.service.UploadImageService;

public class UploadImageEditor extends PropertyEditorSupport{

	private final UploadImageService imageService;

	public UploadImageEditor(UploadImageService imageService) {
		this.imageService = imageService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		UploadImageEntity image=imageService.findImageById(Integer.valueOf(text));
		setValue(image);
	}
	
	
}
