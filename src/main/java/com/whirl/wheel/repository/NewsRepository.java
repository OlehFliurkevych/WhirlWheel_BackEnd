package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.whirl.wheel.entity.NewsEntity;

public interface NewsRepository extends JpaRepository<NewsEntity, Integer>{

}
