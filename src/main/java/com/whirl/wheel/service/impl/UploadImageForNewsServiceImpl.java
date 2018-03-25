package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.UploadImageForNews;
import com.whirl.wheel.repository.UploadImageForNewsRepository;
import com.whirl.wheel.service.UploadImageForNewsService;

@Service
public class UploadImageForNewsServiceImpl implements UploadImageForNewsService{

	private UploadImageForNewsRepository imageForNewsRepository;
	
	@Autowired
	public UploadImageForNewsServiceImpl(UploadImageForNewsRepository imageForNewsRepository) {
		this.imageForNewsRepository = imageForNewsRepository;
	}

	@Override
	public void saveImageForNews(UploadImageForNews image) {
		imageForNewsRepository.save(image);
	}

	@Override
	public List<UploadImageForNews> findAllImagesForNews() {
		return imageForNewsRepository.findAll();
	}

	@Override
	public UploadImageForNews findImageById(int id) {
		return imageForNewsRepository.findOne(id);
	}

}
