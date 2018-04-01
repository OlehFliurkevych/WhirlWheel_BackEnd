package com.whirl.wheel.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.Uploader;
import com.cloudinary.utils.ObjectUtils;
import com.whirl.wheel.service.CloudinaryService;

@Service
@PropertySource("classpath:cloudinary.properties")
public class CloudinaryServiceImpl  implements CloudinaryService{

//	private Cloudinary cloudinary;
//	
//	
//	public CloudinaryServiceImpl(Environment env) {
//		this.cloudinary = new Cloudinary(env.getProperty("cloudinary.env"));
//	}
//
//	@Override
//	public String uploadFile(MultipartFile file, String path) {
//		Uploader uploader=cloudinary.uploader();
//		String fileName=file.getOriginalFilename()
//				.substring(0, file.getOriginalFilename().lastIndexOf("."));
//		Map<?,?> options=ObjectUtils.asMap(
//				"public_id",fileName,
//				"folder",path,
//				"overwrite",true
//				);
//		Map<?, ?> result=null;
//		
//		try {
//			InputStream inputStream=file.getInputStream();
//			result=uploader.uploadLarge(inputStream, options);
//			inputStream.close();
//		}catch(IOException e) {
//			e.printStackTrace();
//			return null;
//		}
//		return (String)result.get("url");
//	}
//
//	@Override
//	public String findImageByPath(String path) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
