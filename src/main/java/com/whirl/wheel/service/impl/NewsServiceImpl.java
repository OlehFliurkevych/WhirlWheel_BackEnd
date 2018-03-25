package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.whirl.wheel.entity.NewsEntity;
import com.whirl.wheel.repository.NewsRepository;
import com.whirl.wheel.service.NewsService;

public class NewsServiceImpl implements NewsService{

	private NewsRepository newsRepository;
	
	@Autowired
	public NewsServiceImpl(NewsRepository newsRepository) {
		this.newsRepository = newsRepository;
	}

	@Override
	public void saveNews(NewsEntity news) {
		newsRepository.save(news);
	}

	@Override
	public List<NewsEntity> findAllNews() {
		return newsRepository.findAll();
	}

	@Override
	public NewsEntity findNewsById(int id) {
		return newsRepository.findOne(id);
	}

}
