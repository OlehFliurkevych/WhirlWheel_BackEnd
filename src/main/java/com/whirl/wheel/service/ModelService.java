package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.ModelEntity;

public interface ModelService {
	
	List<ModelEntity> findAllModels();
	
	void saveModel(ModelEntity model);
	
	ModelEntity findModelById(int id);
	
	ModelEntity findModelByTitle(String title);
}