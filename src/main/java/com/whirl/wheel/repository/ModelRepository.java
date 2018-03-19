package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.ModelEntity;

@Repository
public interface ModelRepository extends JpaRepository<ModelEntity, Integer>{

}
