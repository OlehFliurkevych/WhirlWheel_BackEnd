package com.whirl.wheel.service;

import com.whirl.wheel.entity.ConcernEntity;

public interface ConcernService {

	void saveConcern(ConcernEntity concern);
	
	ConcernEntity findConcernById(int id);
	
	ConcernEntity findConcernByTitle(String title);
	
	ConcernEntity findConcernByCountry(String country);
}