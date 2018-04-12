package com.whirl.wheel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.BrandEntity;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, Integer>{

	@Query("SELECT b FROM BrandEntity b WHERE b.titleBrand=:title")
	BrandEntity findBrandByTitle(@Param("title")String title);
	
	@Query("SELECT b FROM BrandEntity b WHERE b.concern.id=:concern_id")
	List<BrandEntity> findBrandsByConcern(@Param("concern_id")int id);
	
	@Query("SELECT b FROM BrandEntity b WHERE b.concern.id=:concern_id")
	Page<BrandEntity> findPagebleBrandsByConcernId(@Param("concern_id")int id,Pageable pageable);
}

