package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.repository.ConcernRepository;
import com.whirl.wheel.service.CloudinaryService;
import com.whirl.wheel.service.ConcernService;

@Service
public class ConcernServiceImpl implements ConcernService{

	private ConcernRepository concernRepository;
	
	private CloudinaryService cloudinaryService;

	
	@Autowired
	public ConcernServiceImpl(ConcernRepository concernRepository, CloudinaryService cloudinaryService) {
		this.concernRepository = concernRepository;
		this.cloudinaryService = cloudinaryService;
	}

	@Override
	public void saveConcern(ConcernEntity concern) {
		concernRepository.save(concern);
	}

	@Override
	public ConcernEntity findConcernById(int id) {
		return concernRepository.findOne(id);
	}

	@Override
	public ConcernEntity findConcernByTitle(String title) {
		return concernRepository.findConcernByTitle(title);
	}

	@Override
	public List<ConcernEntity> findConcernByCountry(int id) {
		return concernRepository.findConcernsByCountry(id);
	}

	@Override
	public List<ConcernEntity> findAllConcerns() {
		return concernRepository.findAll();
	}

	
	@Override
	public void uploadImage(MultipartFile file, int concernId) {
		ConcernEntity concern=concernRepository.getOne(concernId);
		String path=cloudinaryService.uploadFile(file, "/concern/"+concernId);
		concern.setImagePath(path);
		concernRepository.save(concern);
	}

	
}
