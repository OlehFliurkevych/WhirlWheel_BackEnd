package com.whirl.wheel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="area",indexes=@Index(columnList="title_area"))
public class AreaEntity extends BaseEntity{
	
	@Column(name="title_area")
	private String titleArea;
	
	@ManyToMany
	@JoinTable(name="brand_area",joinColumns=@JoinColumn(name="area_id"),inverseJoinColumns=@JoinColumn(name="brand_id"))
	private List<BrandEntity> brands=new ArrayList<>();
}
