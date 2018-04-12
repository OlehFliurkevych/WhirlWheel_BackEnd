package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
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
@Table(name="news")
@NoArgsConstructor
@Getter
@Setter
public class NewsEntity extends BaseEntity{

//	@NotEmpty(message="Headline can't be empty")
//	@Size(min=15,message="HeadLine must be longer than 15 symbols")
//	@Pattern(regexp="^[A-Za-z0-9]+$")
	private String headline;
	
//	@NotEmpty(message="link can't be empty")
//	@Pattern(regexp="^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$")
//	@Size(min=10,message="Link must be longer than 10 symbols")
	private String link;
	
//	@NotEmpty(message="Description  can't be empty")
//	@Size(min=50,message="Description must be longer than 50 symbols")
	@Column(columnDefinition="text")
	private String description;
	
//	@NotEmpty
	@Column(name="image_path")
	private String imagePath;

}
