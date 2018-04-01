package com.whirl.wheel.service;

import org.springframework.web.multipart.MultipartFile;

public interface CloudinaryService {

	
	String uploadImage(MultipartFile file,String path);
	
	String findImageByPath(String path);
}
