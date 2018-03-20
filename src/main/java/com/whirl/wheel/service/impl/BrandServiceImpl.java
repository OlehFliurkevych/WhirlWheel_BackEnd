package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.repository.BrandRepository;
import com.whirl.wheel.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

	private BrandRepository brandRepository;
	
	@Autowired
	public BrandServiceImpl(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
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

}
