package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.UploadImageForModel;

public interface UploadImageForModelService {

	void saveImageForModel(UploadImageForModel image);
	
	List<UploadImageForModel> findAllImagesForModel();
	
	UploadImageForModel findImageForModelById(int id);
}
