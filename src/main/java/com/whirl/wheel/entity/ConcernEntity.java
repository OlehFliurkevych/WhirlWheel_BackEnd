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
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="concern",indexes=@Index(columnList="title_concern"))
@NoArgsConstructor
@Getter @Setter
public class ConcernEntity extends BaseEntity{

	@NotEmpty
	@Size(min=3,message="Title concern must be longer than 3 symbols")
	@Pattern(regexp="^[A-Za-z]+$")
	@Column(name="title_concern")
	private String titleConcern;
	
	@NotEmpty
	@Size(min=50,message="Description must be longer than 50 symbols")
	@Column(columnDefinition="text")
	private String description;
	
//	@OneToOne(cascade = {CascadeType.ALL})
//	@JoinColumn(name="image_id")
//	private UploadImageEntity imageForConcern;
	
	@NotEmpty
	@Column(name="image_path")
	private String imagePath;
	
//	@OneToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="image_for_concern_id")
//	private UploadImageForConcern imageForConcern;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="country_id")
	private CountryEntity country;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="concern")
	private List<BrandEntity> brands=new ArrayList<>();
	
}
