package com.whirl.wheel.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.ModelEntity;

public interface ModelService {
	
	List<ModelEntity> findAllModels();
	
	void saveModel(ModelEntity model);
	
	ModelEntity findModelById(int id);
	
	ModelEntity findModelByTitle(String title);
	
	List<ModelEntity> findModelsByBrand(int id);
	
	void uploadImage(MultipartFile file,int modelId);
	
	void deleteModelById(int id);
	
	Page<ModelEntity> getPegableModelsOfBrand(
			int pageNumber,
			int pageSize,
			String sort,
			String sortByField,
			int brandId);
}
