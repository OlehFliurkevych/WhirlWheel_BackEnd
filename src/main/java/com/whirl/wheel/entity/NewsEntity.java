package com.whirl.wheel.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="news")
@Data
public class NewsEntity extends BaseEntity{

	private String headline;
	
	private String link;
	
	private String description;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="image_for_news_id")
	private UploadImageForNews imageForNews;
}