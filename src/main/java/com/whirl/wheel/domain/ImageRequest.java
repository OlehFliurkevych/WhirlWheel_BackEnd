package com.whirl.wheel.domain;

import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.entity.UploadImageEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class ImageRequest {

	private int id;
	private MultipartFile image;
}
