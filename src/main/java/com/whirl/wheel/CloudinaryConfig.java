package com.whirl.wheel;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.cloudinary.Cloudinary;
import com.cloudinary.Singleton;
import com.cloudinary.Transformation;

@Component
public class CloudinaryConfig {

	private Cloudinary cloudinary;

//	private final static String KEY="784981521285313";
//	private final static String SECRET="LvX9nxFswIYBInU6HwxxFi4tGQM";
//	private final static String CLOUDNAME="whirl-wheel";
	
	@Autowired
	public CloudinaryConfig(@Value("${cloudinary.apikey}") String key,
            @Value("${cloudinary.apisecret}") String secret,
            @Value("${cloudinary.cloudname}") String cloud){
			cloudinary = Singleton.getCloudinary();
			cloudinary.config.cloudName=cloud;
			cloudinary.config.apiSecret=secret;
			cloudinary.config.apiKey=key;
}
	
//	@Autowired
//	public CloudinaryConfig() {
//		this.cloudinary = Singleton.getCloudinary();
//		cloudinary.config.cloudName=CLOUDNAME;
//		cloudinary.config.apiSecret=SECRET;
//		cloudinary.config.apiKey=KEY;
//	}
	
//	@Autowired
//	public CloudinaryConfig() {
//		cloudinary = Singleton.getCloudinary();
//		cloudinary.config.cloudName=CLOUDNAME;
//		cloudinary.config.apiSecret=SECRET;
//		cloudinary.config.apiKey=KEY;
//	}
	

	public Map upload(Object file,Map options) {
		try{
            return cloudinary.uploader().upload(file, options);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
	}

	public String createUrl(String name,
			int width,
			int height,
			String action) {
		return cloudinary.url()
				.transformation(new Transformation().width(width)
						.height(height)
						.border("2px_solid_black")
						.crop(action))
				.imageTag(name);
	}
}
