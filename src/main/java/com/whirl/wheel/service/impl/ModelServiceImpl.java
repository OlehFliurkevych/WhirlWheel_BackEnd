package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.ModelEntity;
import com.whirl.wheel.repository.ModelRepository;
import com.whirl.wheel.service.ModelService;

@Service
public class ModelServiceImpl implements ModelService{

	
	private ModelRepository modelRepository;
	
	@Autowired
	public ModelServiceImpl(ModelRepository modelRepository) {
		this.modelRepository = modelRepository;
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

	
}
