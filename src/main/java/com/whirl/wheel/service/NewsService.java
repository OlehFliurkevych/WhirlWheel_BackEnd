package com.whirl.wheel.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.NewsEntity;

public interface NewsService {

	void saveNews(NewsEntity news);
	
	List<NewsEntity> findAllNews();
	
	NewsEntity findNewsById(int id);

	void uploadImage(MultipartFile file, int newsId);
	
	void deleteNewsById(int id);
	
	Page<NewsEntity> getPageableNews(
			int pageNumber,
			int pageSize,
			String sort,
			String sortByField);
}
