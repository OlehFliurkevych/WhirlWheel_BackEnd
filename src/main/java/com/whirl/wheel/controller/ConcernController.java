package com.whirl.wheel.controller;

import java.util.ArrayList;
import java.util.List;

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

import com.whirl.wheel.editor.BrandEditor;
import com.whirl.wheel.editor.ConcernEditor;
import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;

@Controller
@RequestMapping("/concern")
public class ConcernController {
	
	private ConcernService concernService;
	private BrandService brandService;
	
	@Autowired
	public ConcernController(ConcernService concernService, BrandService brandService) {
		this.concernService = concernService;
		this.brandService = brandService;
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ConcernEntity.class, new ConcernEditor(concernService));
		binder.registerCustomEditor(BrandEntity.class, new BrandEditor(brandService));
	}
		
	@PostMapping("/save")
	public String saveConcernToDB(@ModelAttribute("concernModel")@Valid ConcernEntity concern,
			@RequestParam("image")MultipartFile image,
			BindingResult result) {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
		if(image!=null&&image.getSize()>0) {
			System.out.println("went to method");
			concernService.saveConcern(concern);
			System.out.println("save concern");
			concernService.uploadImage(image, concern.getId());
			System.out.println("upload image!END!");
			return "redirect:/admin/profile";
		}
		return "admin/add-forms";	
	}
	
	@GetMapping("/{c.id}/delete")
	public String deleteConcern(
			@PathVariable("c.id")int concenId) {
		concernService.deleteConcernById(concenId);
		return "redirect:/admin/profile";
	}
	
	@GetMapping("/inf")
	public String searchConcern(
			@ModelAttribute("concernModel")ConcernEntity entity,
			Model model) {
		return "redirect:/concern/"+entity.getId()+"/inf";
	}
	
	@GetMapping("/{id}/inf")
	public String showOneConcern(
			@PathVariable("id")int concernId,
			Model model) {
		ConcernEntity concern=concernService.findConcernById(concernId);
		List<BrandEntity> brands=brandService.findBrandsByConcern(concernId);
		List<BrandEntity> randBrands=new ArrayList<>();
		int last=0;
		if(brands.size()>=4) {
			last=4;
		}else {
			last=brands.size();
		}
		for(int i=0;i<last;i++) {
			double randIndex=Math.random()*brands.size();
			randBrands.add(brands.get((int)randIndex));
			brands.remove((int)randIndex);
		}
		model.addAttribute("title",concern.getTitleConcern());
		model.addAttribute("randomBrands",randBrands);
		model.addAttribute("findedConcern",concern);
		return "concern/concern-inf";
	}
	
	
	
	
	
	
	
	
}
