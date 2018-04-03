package com.whirl.wheel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.UploadImageEntity;
import com.whirl.wheel.repository.UploadImageRepository;
import com.whirl.wheel.service.CloudinaryService;
import com.whirl.wheel.service.UploadImageService;

@Service
public class UploadImageServiceImpl implements UploadImageService{

	private UploadImageRepository imageRepository;
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public UploadImageServiceImpl(UploadImageRepository imageRepository, CloudinaryService cloudinaryService) {
		this.imageRepository = imageRepository;
		this.cloudinaryService = cloudinaryService;
	}

	@Override
	public void saveImage(UploadImageEntity image) {
		imageRepository.save(image);
	}

	@Override
	public UploadImageEntity findImageById(int id) {
		return imageRepository.findOne(id);
	}

	@Override
	public void uploadImage(MultipartFile file, int imageId) {
		UploadImageEntity image=imageRepository.getOne(imageId);
		String path=cloudinaryService.uploadFile(file, "/image/"+imageId);
		image.setImageName(path);
		imageRepository.save(image);
	}

}
