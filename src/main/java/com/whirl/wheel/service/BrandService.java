package com.whirl.wheel.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.whirl.wheel.entity.BrandEntity;

public interface BrandService {
	
	List<BrandEntity> findAllBrands();

	void saveBrand(BrandEntity brand);
	
	BrandEntity findBrandById(int id);
	
	BrandEntity findBrandByTitle(String title);
	
	List<BrandEntity> findBrandsByConcern(int id);
}
