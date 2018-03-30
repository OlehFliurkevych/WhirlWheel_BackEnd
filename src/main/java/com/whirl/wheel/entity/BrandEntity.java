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
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private CountryEntity country;


	@ManyToOne
	@JoinColumn(name="concern_id")
	private ConcernEntity concern;

	@ManyToOne
	@JoinColumn(name="area_id")
	private AreaEntity area;
	
	@OneToMany(mappedBy="brand")
	private List<ModelEntity> models=new ArrayList<>();
	
	
}
