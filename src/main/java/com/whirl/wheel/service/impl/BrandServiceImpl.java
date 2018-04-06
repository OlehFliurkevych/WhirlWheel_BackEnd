package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.repository.BrandRepository;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.CloudinaryService;

@Service
public class BrandServiceImpl implements BrandService{

	private BrandRepository brandRepository;
	
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public BrandServiceImpl(BrandRepository brandRepository, CloudinaryService cloudinaryService) {
		this.brandRepository = brandRepository;
		this.cloudinaryService = cloudinaryService;
	}

	@Override
	public void saveBrand(BrandEntity brand) {
		brandRepository.save(brand);
	}

	

	@Override
	public BrandEntity findBrandById(int id) {
		return brandRepository.findOne(id);
	}

	@Override
	public BrandEntity findBrandByTitle(String title) {
		return brandRepository.findBrandByTitle(title);
	}

	@Override
	public List<BrandEntity> findBrandsByConcern(int id) {
		return brandRepository.findBrandsByConcern(id);
	}

	@Override
	public List<BrandEntity> findAllBrands() {
		return brandRepository.findAll();
	}

	@Override
	public void uploadImage(MultipartFile file, int brandId) {
		BrandEntity brand=brandRepository.getOne(brandId);
		String path=cloudinaryService.uploadFile(file, "/brand/"+brandId);
		brand.setImagePath(path);
		brandRepository.save(brand);
	}

	@Override
	public void deleteBrandById(int id) {
		brandRepository.delete(id);
	}

}
