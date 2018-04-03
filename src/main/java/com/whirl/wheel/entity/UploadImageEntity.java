package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="upload_image")
public class UploadImageEntity extends BaseEntity{

	@Column(name="image_name")
	private String imageName;
	
	@Lob
	@Column(name="file_data", length=1000000)
	private byte[] fileData;
	
//	@OneToOne(mappedBy="imageForConcern")
//	private ConcernEntity concern;
//	
//	@OneToOne(mappedBy="imageForBrand")
//	private BrandEntity brand;
//	
//	@OneToOne(mappedBy="imageForModel")
//	private ModelEntity model;
//	
//	@OneToOne(mappedBy="imageForNews")
//	private NewsEntity news;
}
