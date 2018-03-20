package com.whirl.wheel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.ConcernEntity;

@Repository
public interface ConcernRepository extends JpaRepository<ConcernEntity, Integer>{

	@Query("SELECT c FROM ConcernEntity WHERE c.country=:country")
	List<ConcernEntity> findConcernByCountry(@Param("country")int id);
	
	@Query("SELECT c FROM ConcernEntity WHERE c.titleConcern=:title")
	ConcernEntity findConcernByTitle(@Param("title")String title);
	
}
