package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.UploadImageForBrand;

public interface UploadImageForBrandService {

	void saveImageForBrand(UploadImageForBrand image);
	
	List<UploadImageForBrand> findAllImagesForBrand();
	
	UploadImageForBrand findImageForBrandById(int id);
}
