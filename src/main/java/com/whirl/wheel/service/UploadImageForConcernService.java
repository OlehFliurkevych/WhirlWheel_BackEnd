package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.UploadImageForConcern;

public interface UploadImageForConcernService {
	
	void saveImageForConcern(UploadImageForConcern image);
	
	UploadImageForConcern findImageForConcernById(int id);
	
	List<UploadImageForConcern> findAllImagesForConcern();

}
