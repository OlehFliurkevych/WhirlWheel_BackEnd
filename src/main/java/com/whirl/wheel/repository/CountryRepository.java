package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.CountryEntity;

@Repository
public interface CountryRepository extends JpaRepository<CountryEntity, Integer>{

	@Query("SELECT a FROM AreaEntity a WHERE a.titleArea=:title")
	CountryEntity findAreaByTitle(@Param("title")String title);
}
