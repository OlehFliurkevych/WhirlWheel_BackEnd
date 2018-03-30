package com.whirl.wheel.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ImageRequest {

	private MultipartFile file;
}
