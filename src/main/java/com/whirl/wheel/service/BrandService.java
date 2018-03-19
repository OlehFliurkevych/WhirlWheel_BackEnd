package com.whirl.wheel.service;

import com.whirl.wheel.entity.BrandEntity;

public interface BrandService {

	void saveBrand(BrandEntity brand);
	
	BrandEntity findBrandById(int id);
	
	BrandEntity findBrandByTitle(String title);
}
