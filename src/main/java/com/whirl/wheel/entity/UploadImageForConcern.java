package com.whirl.wheel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="upload_image_for_concern")
@Data
public class UploadImageForConcern extends BaseEntity{

	@Column(name="file_name")
	private String fileName;
	
	@Column(name="file_data", length=1000000)
	private byte[] fileData;
	
	@OneToOne(fetch=FetchType.LAZY,mappedBy="imageForConcern")
	private ConcernEntity concern;
}
