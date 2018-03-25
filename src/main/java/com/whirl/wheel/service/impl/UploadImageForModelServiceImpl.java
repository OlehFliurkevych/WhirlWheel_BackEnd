package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.UploadImageForModel;
import com.whirl.wheel.repository.UploadImageForModelRepository;
import com.whirl.wheel.service.UploadImageForModelService;

@Service
public class UploadImageForModelServiceImpl implements UploadImageForModelService{

	private UploadImageForModelRepository imageForModelRepository;
	
	@Autowired
	public UploadImageForModelServiceImpl(UploadImageForModelRepository imageForModelRepository) {
		this.imageForModelRepository = imageForModelRepository;
	}

	@Override
	public void saveImageForModel(UploadImageForModel image) {
		imageForModelRepository.save(image);
	}

	@Override
	public List<UploadImageForModel> findAllImagesForModel() {
		return imageForModelRepository.findAll();
	}

	@Override
	public UploadImageForModel findImageForModelById(int id) {
		return imageForModelRepository.findOne(id);
	}

}
