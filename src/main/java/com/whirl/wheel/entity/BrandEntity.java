package com.whirl.wheel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="brand",indexes=@Index(columnList="title_brand"))
public class BrandEntity extends BaseEntity {

	@Column(name="title_brand")
	private String titleBrand;
	
	private String description;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="image_for_brand_id")
	private UploadImageForBrand imageForBrand;
	
	@ManyToMany
	@JoinTable(name="brand_country",joinColumns=@JoinColumn(name="brand_id"),inverseJoinColumns=@JoinColumn(name="country_id"))
	private List<CountryEntity> counrties=new ArrayList<>();

	@ManyToOne
	@JoinColumn(name="concern_id")
	private ConcernEntity concern;

	@ManyToMany
	@JoinTable(name="brand_area",joinColumns=@JoinColumn(name="brand_id"),inverseJoinColumns=@JoinColumn(name="area_id"))
	private List<AreaEntity> areas=new ArrayList<>();
	
	@OneToMany(mappedBy="brand")
	private List<ModelEntity> models=new ArrayList<>();
	
}
