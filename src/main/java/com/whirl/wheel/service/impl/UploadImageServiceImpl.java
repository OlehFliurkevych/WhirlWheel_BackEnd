package com.whirl.wheel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.UploadImageEntity;
import com.whirl.wheel.repository.UploadImageRepository;
import com.whirl.wheel.service.UploadImageService;

@Service
public class UploadImageServiceImpl implements UploadImageService{

	private UploadImageRepository imageRepository;
	
	@Autowired
	public UploadImageServiceImpl(UploadImageRepository imageRepository) {
		this.imageRepository = imageRepository;
	}

	@Override
	public void saveImage(UploadImageEntity image) {
		imageRepository.save(image);
	}

	@Override
	public UploadImageEntity findImageById(int id) {
		return imageRepository.findOne(id);
	}

}
