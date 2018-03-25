package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.UploadImageForBrand;

@Repository
public interface UploadImageForBrandRepository extends  JpaRepository<UploadImageForBrand, Integer>{

}
