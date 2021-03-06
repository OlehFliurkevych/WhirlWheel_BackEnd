package com.whirl.wheel.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.BrandEntity;

public interface BrandService {
	
	List<BrandEntity> findAllBrands();

	void saveBrand(BrandEntity brand);
	
	BrandEntity findBrandById(int id);
	
	BrandEntity findBrandByTitle(String title);
	
	List<BrandEntity> findBrandsByConcern(int id);
	
	void uploadImage(MultipartFile file,int brandId);
	
	void deleteBrandById(int id);
	
	Page<BrandEntity> getPegableBrandsOfConcern(
			int pageNumber,
			int pageSize,
			String sort,
			String sortByField,
			int concernId);
	
	
}
