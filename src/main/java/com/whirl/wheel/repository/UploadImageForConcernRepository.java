package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.UploadImageForConcern;

@Repository
public interface UploadImageForConcernRepository extends JpaRepository<UploadImageForConcern, Integer>{

	
}
