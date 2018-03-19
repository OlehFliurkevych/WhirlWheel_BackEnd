package com.whirl.wheel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="concern",indexes=@Index(columnList="title_concern"))
public class ConcernEntity extends BaseEntity{

	@Column(name="title_concern")
	private String titleConcern;
	
	private String description;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private CountryEntity country;
	
	@OneToMany(mappedBy="concern")
	private List<BrandEntity> brands=new ArrayList<>();
	
}