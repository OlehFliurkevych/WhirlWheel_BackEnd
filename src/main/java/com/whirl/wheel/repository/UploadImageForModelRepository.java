package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.UploadImageForModel;

@Repository
public interface UploadImageForModelRepository extends JpaRepository<UploadImageForModel, Integer>{

}
