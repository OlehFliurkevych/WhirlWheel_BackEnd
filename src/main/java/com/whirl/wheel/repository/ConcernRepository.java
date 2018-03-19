package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.ConcernEntity;

@Repository
public interface ConcernRepository extends JpaRepository<ConcernEntity, Integer>{

}
