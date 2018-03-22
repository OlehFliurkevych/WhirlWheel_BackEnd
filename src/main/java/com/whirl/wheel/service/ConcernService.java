package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.ConcernEntity;

public interface ConcernService {
	
	List<ConcernEntity> findAllConcerns();

	void saveConcern(ConcernEntity concern);
	
	ConcernEntity findConcernById(int id);
	
	ConcernEntity findConcernByTitle(String title);
	
	List<ConcernEntity> findConcernByCountry(int id);
}
