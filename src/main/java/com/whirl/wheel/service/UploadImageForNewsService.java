package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.UploadImageForNews;

public interface UploadImageForNewsService {

	void saveImageForNews(UploadImageForNews image);
	
	List<UploadImageForNews> findAllImagesForNews();
	
	UploadImageForNews findImageById(int id);
}
