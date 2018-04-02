package com.whirl.wheel.domain;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.CountryEntity;
import com.whirl.wheel.entity.UploadImageEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class ConcernRequest {

	private int id;
	private Timestamp createdAt;
	private Boolean isDeleted;
	private String title;
	private CountryEntity country;
	private String description;
	private String imagePath;
}
