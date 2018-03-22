package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.ModelEntity;

@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Integer>{

	@Query("SELECT m FROM ModelEntity m WHERE m.titleModel=:title")
	ModelEntity findModelByTitle(@Param("title")String title);
}
