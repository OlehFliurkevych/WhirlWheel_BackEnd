package com.whirl.wheel.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="model", indexes=@Index(columnList="description"))
public class ModelEntity extends BaseEntity{

	@Column(name="title_model")
	private String titleModel;
	
	private String description;
	
//	@OneToOne
//	@JoinColumn(name="image_id")
//	private UploadImageEntity imageForModel;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="brand_id")
	private BrandEntity brand;
	
}
