package com.whirl.wheel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer>{

	@Query("SELECT b FROM BrandEntity b WHERE b.titleBrand=:title")
	BrandEntity findBrandByTitle(@Param("title")String title);
	
	@Query("SELECT b FROM BrandEntity b WHERE b.concern=:concern")
	List<BrandEntity> findBrandsByConcern(@Param("concern")int id);
}

