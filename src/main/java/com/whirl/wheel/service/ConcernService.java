package com.whirl.wheel.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.ConcernEntity;

public interface ConcernService {
	
	List<ConcernEntity> findAllConcerns();

	void saveConcern(ConcernEntity concern);
	
	ConcernEntity findConcernById(int id);
	
	ConcernEntity findConcernByTitle(String title);
	
	List<ConcernEntity> findConcernByCountry(int id);
	
	void uploadImage(MultipartFile file,int concernId);
	
	void deleteConcernById(int id);
}
