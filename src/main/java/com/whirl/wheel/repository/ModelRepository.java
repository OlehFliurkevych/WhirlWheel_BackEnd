package com.whirl.wheel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.ModelEntity;

@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Integer>{

	@Query("SELECT m FROM ModelEntity m WHERE m.titleModel=:title")
	ModelEntity findModelByTitle(@Param("title")String title);
	
	@Query("SELECT m FROM ModelEntity m WHERE m.brand.id=:id")
	List<ModelEntity> findModelsByBrand(@Param("id")int id);
	
	@Query("SELECT m FROM ModelEntity m WHERE m.brand.id=:id")
	Page<ModelEntity> findModelsByBrandId(@Param("id")int id,Pageable pageable);
}
