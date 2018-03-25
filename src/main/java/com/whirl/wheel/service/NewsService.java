package com.whirl.wheel.service;

import java.util.List;

import com.whirl.wheel.entity.NewsEntity;

public interface NewsService {

	void saveNews(NewsEntity news);
	
	List<NewsEntity> findAllNews();
	
	NewsEntity findNewsById(int id);
}
