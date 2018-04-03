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
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.JoinColumn;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@Table(name="country",indexes=@Index(columnList="title_country"))
@Entity
public class CountryEntity extends BaseEntity{

	@NotEmpty
	@Size(min=3,message="Country must be longer than 3 symbols")
	@Column(name="title_country")
	private String titleCountry;
	
	@OneToMany(mappedBy="country")
	private List<BrandEntity> brands=new ArrayList<>();
	
	@OneToMany(mappedBy="country")
	private List<ConcernEntity> concerns=new ArrayList<>();
}
