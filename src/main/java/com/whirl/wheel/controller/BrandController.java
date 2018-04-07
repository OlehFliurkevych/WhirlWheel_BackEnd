package com.whirl.wheel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.editor.AreaEditor;
import com.whirl.wheel.editor.BrandEditor;
import com.whirl.wheel.editor.ConcernEditor;
import com.whirl.wheel.editor.CountryEditor;
import com.whirl.wheel.editor.ModelEditor;
import com.whirl.wheel.editor.NewsEditor;
import com.whirl.wheel.entity.AreaEntity;
import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.entity.CountryEntity;
import com.whirl.wheel.entity.ModelEntity;
import com.whirl.wheel.entity.NewsEntity;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;

@Controller
@RequestMapping("/brand")
public class BrandController {

	private BrandService brandService;
	
	private ConcernService concernService;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ConcernEntity.class, new ConcernEditor(concernService));
		binder.registerCustomEditor(BrandEntity.class, new BrandEditor(brandService));
	}
	
	@Autowired
	public BrandController(BrandService brandService, ConcernService concernService) {
		this.brandService = brandService;
		this.concernService = concernService;
	}
	
//	@GetMapping("/form")
//	public String showForm(Model model) {
//		model.addAttribute("brandModel",new BrandEntity());
//		return "brand/add-brand";
//	}
	
	@PostMapping("/save")
	public String saveBrand(
			@ModelAttribute("brandModel")@Valid BrandEntity brand,
			@RequestParam("image")MultipartFile image,
			BindingResult result) {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
		if(image!=null&&image.getSize()>0) {
			System.out.println("went to method");
			brandService.saveBrand(brand);
			System.out.println("save brand");
			brandService.uploadImage(image, brand.getId());
			System.out.println("upload image!END!");
			return "redirect:/admin/profile";
		}
		return "admin/add-forms";
	}
	
	@GetMapping("/{b.id}/delete")
	public String deleteBrand(
			@PathVariable("b.id")int brandId) {
		brandService.deleteBrandById(brandId);
		return "redirect:/admin/profile";
	}
	
}
