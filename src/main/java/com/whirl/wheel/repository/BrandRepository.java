package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer>{

}
