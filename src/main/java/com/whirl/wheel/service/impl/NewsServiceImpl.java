package com.whirl.wheel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.entity.NewsEntity;
import com.whirl.wheel.repository.NewsRepository;
import com.whirl.wheel.service.CloudinaryService;
import com.whirl.wheel.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{

	private NewsRepository newsRepository;
	
	private CloudinaryService cloudinaryService;
	
	@Autowired
	public NewsServiceImpl(NewsRepository newsRepository, CloudinaryService cloudinaryService) {
		this.newsRepository = newsRepository;
		this.cloudinaryService = cloudinaryService;
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

	@Override
	public void uploadImage(MultipartFile file, int newsId) {
		NewsEntity news=newsRepository.getOne(newsId);
		String path=cloudinaryService.uploadFile(file, "/news/"+newsId);
		news.setImagePath(path);
		newsRepository.save(news);
	}


	@Override
	public void deleteNewsById(int id) {
		newsRepository.delete(id);
	}


	@Override
	public Page<NewsEntity> getPageableNews(int pageNumber, int pageSize, String sort, String sortByField) {
		PageRequest request=new PageRequest(pageNumber-1,
				pageSize,
				sort.toUpperCase().equals("ASC") ? Sort.Direction.ASC:Sort.Direction.DESC,
				sortByField);
		return newsRepository.findAll(request);
	}
}
