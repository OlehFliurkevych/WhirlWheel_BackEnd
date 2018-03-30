package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.UploadImageEntity;

@Repository
public interface UploadImageRepository extends JpaRepository<UploadImageEntity, Integer>{

}
