package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="news")
@NoArgsConstructor
@Getter
@Setter
public class NewsEntity extends BaseEntity{

	
	private String headline;
	
	private String link;
	
	private String description;
	
	@Column(name="image_path")
	private String imagePath;
	
//	@OneToOne
//	@JoinColumn(name="image_id")
//	private UploadImageEntity imageForNews;
}
