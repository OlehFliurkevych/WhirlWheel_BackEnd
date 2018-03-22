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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AreaEntity findAreaById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AreaEntity findAreaByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
