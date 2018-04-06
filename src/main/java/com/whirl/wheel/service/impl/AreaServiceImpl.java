package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.AreaEntity;
import com.whirl.wheel.repository.AreaRepository;
import com.whirl.wheel.service.AreaService;

@Service
public class AreaServiceImpl implements AreaService{

	private AreaRepository areaRepository;
	
	@Autowired
	public AreaServiceImpl(AreaRepository areaRepository) {
		this.areaRepository = areaRepository;
	}

	@Override
	public void saveArea(AreaEntity area) {
		areaRepository.save(area);
	}

	@Override
	public List<AreaEntity> findAllAreas() {
		return areaRepository.findAll();
	}

	@Override
	public AreaEntity findAreaById(int id) {
		return areaRepository.findOne(id);
	}

	@Override
	public AreaEntity findAreaByTitle(String title) {
		return areaRepository.findAreaByTitle(title);
	}

	@Override
	public void deleteAreaById(int id) {
		areaRepository.delete(id);
	}

}
