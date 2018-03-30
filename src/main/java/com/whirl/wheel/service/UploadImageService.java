package com.whirl.wheel.service;

import com.whirl.wheel.entity.UploadImageEntity;

public interface UploadImageService {

	void saveImage(UploadImageEntity image);
	
	UploadImageEntity findImageById(int id);
	
}
