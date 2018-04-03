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
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="model", indexes=@Index(columnList="description"))
public class ModelEntity extends BaseEntity{

	@Size(min=3,message="Model title must be longer than 3 symbols")
	@Column(name="title_model")
	private String titleModel;
	
	@Size(min=100,message="Description about model must be longer than 100 symbols")
	private String description;
	
	@Column(name="image_path")
	private String imagePath;
	
//	@OneToOne
//	@JoinColumn(name="image_id")
//	private UploadImageEntity imageForModel;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="brand_id")
	private BrandEntity brand;
	
}
