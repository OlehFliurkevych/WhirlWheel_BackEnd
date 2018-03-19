package com.whirl.wheel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import lombok.Data;

@Data
@Table(name="country")
@Entity
public class CountryEntity extends BaseEntity{

	@Column(name="title_country")
	private String titleCountry;
	
	@ManyToMany
	@JoinTable(name="brand_country",joinColumns=@JoinColumn(name="country_id"),inverseJoinColumns=@JoinColumn(name="brand_id"))
	private List<BrandEntity> brands=new ArrayList<>();
}
