package com.whirl.wheel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.repository.ConcernRepository;
import com.whirl.wheel.service.AdminService;
import com.whirl.wheel.service.AreaService;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;
import com.whirl.wheel.service.CountryService;
import com.whirl.wheel.service.ModelService;
import com.whirl.wheel.service.UploadImageForBrandService;
import com.whirl.wheel.service.UploadImageForConcernService;
import com.whirl.wheel.service.UploadImageForModelService;
import com.whirl.wheel.service.UploadImageForNewsService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
//	@InitBinder("user")
//	protected void initBinder(WebDataBinder binder) {
//		binder.registerCustomEditor(User.class, new UserEditor(userService));
//	}
	
	private AdminService adminService;
	private ConcernService concernService;
	private BrandService brandService;
	private ModelService modelService;
	private AreaService areaService;
	private CountryService countryService;
	private UploadImageForConcernService imageforConcernService;
	private UploadImageForModelService imageForModelService;
	private UploadImageForBrandService imageForBrandService;
	private UploadImageForNewsService imageForNewsService;
	
	
	@GetMapping("/profile")
	public String showProfile(Model model) {
		model.addAttribute("title","Profile");
		model.addAttribute("concernModel",new ConcernEntity());
		model.addAttribute("listConcerns",concernService.findAllConcerns());
		
		return "admin/add-forms";
	}
	

	
}
