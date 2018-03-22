package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.AreaEntity;

@Repository
public interface AreaRepository extends JpaRepository<AreaEntity, Integer>{

	@Query("SELECT a FROM AreaEntity a WHERE a.titleArea=:title")
	AreaEntity findAreaByTitle(@Param("title")String title);
}
