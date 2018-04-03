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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter @Getter
@Entity
@Table(name="area",indexes=@Index(columnList="title_area"))
public class AreaEntity extends BaseEntity{
	
	@Column(name="title_area")
	private String titleArea;
	
	@OneToMany(mappedBy="area")
	private List<BrandEntity> brands=new ArrayList<>();
}
