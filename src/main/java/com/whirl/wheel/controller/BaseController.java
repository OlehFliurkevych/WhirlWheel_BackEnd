package com.whirl.wheel.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.whirl.wheel.CloudinaryConfig;

@Controller
public class BaseController {
	
	@Autowired
	private CloudinaryConfig cloudinaryC;
	
	
//	 @GetMapping("/upload")
//	    public String uploadForm(){
//	        return "form";
//	    }
//	    @PostMapping("/upload")
//	    public String singleImageUpload(@RequestParam("file") MultipartFile file, 
//	    		RedirectAttributes redirectAttributes,
//	    		Model model){
//	        if (file.isEmpty()){
//	            model.addAttribute("message","Please select a file to upload");
//	            return "form";
//	        }
//	        try {
//	            Map uploadResult =  cloudinaryC.upload(file.getBytes(), ObjectUtils.asMap("resourcetype", "auto"));
//	            model.addAttribute("message", "You successfully uploaded '" + file.getOriginalFilename() + "'");
//	            model.addAttribute("imageurl", uploadResult.get("url"));
//	        } catch (IOException e){
//	            e.printStackTrace();
//	            model.addAttribute("message", "Sorry I can't upload that!");
//	        }
//	        return "redirect:/upload";
//	    }

	@GetMapping({"/","/home"})
	public String showHomePage(Model model) {
		model.addAttribute("title","Home");
		return "home";
	}
	
	@GetMapping("/login")
	public String showSingInFormForAdmin(Model model) {
		model.addAttribute("title","Log in");
		return "admin/signin-admin";
	}
	
	@GetMapping("/error")
	public String showErrorPage(Model model) {
		model.addAttribute("title","Error");
		return "error";
	}
	
	@GetMapping("/news")
	public String showNews(Model model) {
		model.addAttribute("title","News");
		return "news";
	}
	
	@GetMapping("/aboutus")
	public String showAboutUsPage(Model model) {
		model.addAttribute("title","About us");
		return "about-us";
	}
}
