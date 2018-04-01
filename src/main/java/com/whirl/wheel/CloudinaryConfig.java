package com.whirl.wheel;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;
import com.whirl.wheel.entity.UploadImageEntity;

//@Component
public class CloudinaryConfig {
//
//	private Cloudinary cloudinary;
//	
//    @Autowired
//    public CloudinaryConfig(@Value("${cloudinary.apikey}") String key,
//                            @Value("${cloudinary.apisecret}") String secret,
//                            @Value("${cloudinary.cloudname}") String cloud){
//    	cloudinary = Singleton.getCloudinary();
//        cloudinary.config.cloudName=cloud;
//        cloudinary.config.apiSecret=secret;
//        cloudinary.config.apiKey=key;
//        }
//    
//    public Map<?,?> upload(Object file, Map<?,?> options){
//        try{
//            return cloudinary.uploader().upload(file, ObjectUtils.asMap());
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//    public String createUrl(String name, int width, int height, String action){
//    	UploadImageEntity image=new UploadImageEntity();
//        return cloudinary.url()
//                .transformation(new Transformation().width(width).height(height).border("2px_solid_black").crop(action))
//                .imageTag(name);
//    }

}
