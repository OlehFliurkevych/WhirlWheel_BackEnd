package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.UploadImageForConcern;
import com.whirl.wheel.repository.UploadImageForConcernRepository;
import com.whirl.wheel.service.UploadImageForConcernService;

@Service
public class UploadImageForConcernServiceImpl implements UploadImageForConcernService{

	private UploadImageForConcernRepository imageForConcernRepository;
	
	@Autowired
	public UploadImageForConcernServiceImpl(UploadImageForConcernRepository imageForConcernRepository) {
		this.imageForConcernRepository = imageForConcernRepository;
	}

	@Override
	public void saveImageForConcern(UploadImageForConcern image) {
		imageForConcernRepository.save(image);
	}

	@Override
	public UploadImageForConcern findImageForConcernById(int id) {
		return imageForConcernRepository.findOne(id);
	}

	@Override
	public List<UploadImageForConcern> findAllImagesForConcern() {
		return imageForConcernRepository.findAll();
	}

	
}
