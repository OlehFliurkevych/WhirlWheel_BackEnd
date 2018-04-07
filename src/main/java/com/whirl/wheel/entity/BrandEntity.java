package com.whirl.wheel.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter @Getter
@Entity
@Table(name="brand",indexes=@Index(columnList="title_brand"))
public class BrandEntity extends BaseEntity {

	@NotEmpty(message="Brand title can't be empty")
	@Size(min=3,message="Title brand must be longer than 3 symbols")
	@Pattern(regexp="^[A-Za-z]+$")
	@Column(name="title_brand")
	private String titleBrand;
	
	@NotEmpty(message="Description can't be empty")
	@Size(min=50,message="Description must be longer than 50 symbols")
	@Column(columnDefinition="text")
	private String description;
	
//	@NotEmpty
	@Column(name="image_path")
	private String imagePath;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="country_id")
	private CountryEntity country;


	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="concern_id")
	private ConcernEntity concern;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="area_id")
	private AreaEntity area;
	
	@OneToMany(mappedBy="brand")
	private List<ModelEntity> models=new ArrayList<>();
	
	
}
