package com.whirl.wheel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whirl.wheel.entity.UploadImageForNews;

@Repository
public interface UploadImageForNewsRepository extends JpaRepository<UploadImageForNews, Integer>{

}
