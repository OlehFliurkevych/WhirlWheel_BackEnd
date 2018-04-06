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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="model", indexes=@Index(columnList="title_model"))
public class ModelEntity extends BaseEntity{

	@NotEmpty
	@Size(min=3,message="Model title must be longer than 3 symbols")
	@Pattern(regexp="^[A-Za-z0-9]+$")
	@Column(name="title_model")
	private String titleModel;
	
	@NotEmpty
	@Size(min=50,message="Description must be longer than 50 symbols")
	@Column(columnDefinition="text")
	private String description;
	
	@NotEmpty
	@Column(name="image_path")
	private String imagePath;
	
//	@OneToOne
//	@JoinColumn(name="image_id")
//	private UploadImageEntity imageForModel;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="brand_id")
	private BrandEntity brand;
	
}
