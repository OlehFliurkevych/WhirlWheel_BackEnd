package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.repository.ConcernRepository;
import com.whirl.wheel.service.ConcernService;

@Service
public class ConcernServiceImpl implements ConcernService{
	
	private ConcernRepository concernRepository;

	@Autowired
	public ConcernServiceImpl(ConcernRepository concernRepository) {
		this.concernRepository = concernRepository;
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
		return concernRepository.findConcernByCountry(id);
	}

	
}
