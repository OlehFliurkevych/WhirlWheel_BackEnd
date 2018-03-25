package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="upload_image_for_news")
@Entity
public class UploadImageForNews extends BaseEntity{

	@Column(name="file_name")
	private String fileName;
	
	@Column(name="file_data", length=1000000)
	private byte[] fileData;
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="imageForNews")
	private NewsEntity news;
}
