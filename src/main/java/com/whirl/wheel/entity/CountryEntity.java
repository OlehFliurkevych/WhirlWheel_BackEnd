package com.whirl.wheel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import lombok.Data;

@Data
@Table(name="country",indexes=@Index(columnList="title_country"))
@Entity
public class CountryEntity extends BaseEntity{

	@Column(name="title_country")
	private String titleCountry;
	
	@OneToMany(mappedBy="country")
	private List<BrandEntity> brands=new ArrayList<>();
}
