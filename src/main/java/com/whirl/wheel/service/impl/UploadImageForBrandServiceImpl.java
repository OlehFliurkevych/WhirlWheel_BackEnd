package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.UploadImageForBrand;
import com.whirl.wheel.repository.UploadImageForBrandRepository;
import com.whirl.wheel.service.UploadImageForBrandService;

@Service
public class UploadImageForBrandServiceImpl implements UploadImageForBrandService{

	private UploadImageForBrandRepository imageForBrandRepository;
	
	public UploadImageForBrandServiceImpl(UploadImageForBrandRepository imageForBrandRepository) {
		this.imageForBrandRepository = imageForBrandRepository;
	}

	@Override
	public void saveImageForBrand(UploadImageForBrand image) {
		imageForBrandRepository.save(image);
	}

	@Override
	public List<UploadImageForBrand> findAllImagesForBrand() {
		return imageForBrandRepository.findAll();
	}

	@Override
	public UploadImageForBrand findImageForBrandById(int id) {
		return imageForBrandRepository.findOne(id);
	}

	

}
