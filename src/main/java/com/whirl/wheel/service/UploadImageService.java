package com.whirl.wheel.service;

import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.UploadImageEntity;

public interface UploadImageService {

	void saveImage(UploadImageEntity image);
	
	UploadImageEntity findImageById(int id);
	
	void uploadImage(MultipartFile file,int imageId);
}
