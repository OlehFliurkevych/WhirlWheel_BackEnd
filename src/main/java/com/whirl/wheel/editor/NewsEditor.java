package com.whirl.wheel.editor;

import java.beans.PropertyEditorSupport;

import com.whirl.wheel.entity.NewsEntity;
import com.whirl.wheel.service.NewsService;

public class NewsEditor extends PropertyEditorSupport{
	
	private  final NewsService newsService;

	public NewsEditor(NewsService newsService) {
		this.newsService = newsService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		NewsEntity news=newsService.findNewsById(Integer.valueOf(text));
		setValue(news);
	}
	
	

}
