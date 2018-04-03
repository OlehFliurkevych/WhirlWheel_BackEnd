package com.whirl.wheel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="concern",indexes=@Index(columnList="title_concern"))
@NoArgsConstructor
@Getter @Setter
public class ConcernEntity extends BaseEntity{

	@Column(name="title_concern")
	private String titleConcern;
	
	@Column(columnDefinition="text")
	private String description;
	
//	@OneToOne(cascade = {CascadeType.ALL})
//	@JoinColumn(name="image_id")
//	private UploadImageEntity imageForConcern;
	
	@Column(name="image_path")
	private String imagePath;
	
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="image_for_concern_id")
//	private UploadImageForConcern imageForConcern;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="country_id")
	private CountryEntity country;
	
	@OneToMany(mappedBy="concern")
	private List<BrandEntity> brands=new ArrayList<>();
	
}
