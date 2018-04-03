package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.entity.ModelEntity;
import com.whirl.wheel.repository.ModelRepository;
import com.whirl.wheel.service.CloudinaryService;
import com.whirl.wheel.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService{

	
	private ModelRepository modelRepository;
	
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public ModelServiceImpl(ModelRepository modelRepository, CloudinaryService cloudinaryService) {
		this.modelRepository = modelRepository;
		this.cloudinaryService = cloudinaryService;
	}

	@Override
	public List<ModelEntity> findAllModels() {
		return modelRepository.findAll();
	}

	

	@Override
	public void saveModel(ModelEntity model) {
		modelRepository.save(model);
	}

	@Override
	public ModelEntity findModelById(int id) {
		return modelRepository.findOne(id);
	}

	@Override
	public ModelEntity findModelByTitle(String title) {
		return modelRepository.findModelByTitle(title);
	}

	@Override
	public void uploadImage(MultipartFile file, int modelId) {
		ModelEntity model=modelRepository.getOne(modelId);
		String path=cloudinaryService.uploadFile(file, "/model/"+modelId);
		model.setImagePath(path);
		modelRepository.save(model);
	}

	
}
