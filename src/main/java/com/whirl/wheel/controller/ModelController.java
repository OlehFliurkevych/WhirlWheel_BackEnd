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

import com.whirl.wheel.editor.BrandEditor;
import com.whirl.wheel.editor.ModelEditor;
import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.entity.ModelEntity;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ModelService;

@Controller
@RequestMapping("/model")
public class ModelController {

	private ModelService modelService;
	private BrandService brandService;

	@Autowired
	public ModelController(ModelService modelService, BrandService brandService) {
		this.modelService = modelService;
		this.brandService = brandService;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(BrandEntity.class, new BrandEditor(brandService));
		binder.registerCustomEditor(ModelEntity.class, new ModelEditor(modelService));
	}
	
/*	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("modelModel",new ModelEntity());
		model.addAttribute("listBrands",brandService.findAllBrands());
		return "model/add-model";
	}*/
	
	

	@PostMapping("/save")
	public String saveModel(
			Model model,
			@ModelAttribute("modelModel")@Valid ModelEntity modelEntity,
			@RequestParam("image")MultipartFile image,
			BindingResult result) {
		if(result.hasErrors()) {
//			model.addAttribute("messageForAdd","You don't add model");
			return "admin/add-forms";
		}
		if(image!=null&&image.getSize()>0) {
			System.out.println("went to method");
			modelService.saveModel(modelEntity);
			System.out.println("save concern");
			modelService.uploadImage(image, modelEntity.getId());
			System.out.println("upload image!END!");
//			model.addAttribute("messageForAdd","You successfully add model"+modelEntity.getTitleModel());
			return "redirect:/admin/profile";
			
		}
//		model.addAttribute("messageForAdd","You don't add model");
		return "admin/add-forms";
	}
	
	@GetMapping("/{m.id}/delete")
	public String deleteModel(
			@PathVariable("m.id")int modelId) {
		modelService.deleteModelById(modelId);
		return "redirect:/admin/profile";
	}
}
