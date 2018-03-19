package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="model", indexes=@Index(columnList="description"))
public class ModelEntity extends BaseEntity{

	@Column(name="title_brand")
	private String titleBrand;
	
	private String description;
	
	@ManyToMany
	@JoinColumn(name="brand_id")
	private BrandEntity brand;
	
}