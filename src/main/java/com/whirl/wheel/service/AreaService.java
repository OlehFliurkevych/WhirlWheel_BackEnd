package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.AreaEntity;

public interface AreaService {

	void saveArea(AreaEntity area);
	
	List<AreaEntity> findAllAreas();
	
	AreaEntity findAreaById(int id);
	
	AreaEntity findAreaByTitle(String title);
}
