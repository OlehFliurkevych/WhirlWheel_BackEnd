package com.whirl.wheel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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

	@PostMapping("/save")
	public String saveModel(
			Model model,
			@ModelAttribute("modelModel")@Valid ModelEntity modelEntity,
			@RequestParam("image")MultipartFile image,
			BindingResult result) {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
		if(image!=null&&image.getSize()>0) {
			System.out.println("went to method");
			modelService.saveModel(modelEntity);
			System.out.println("save concern");
			modelService.uploadImage(image, modelEntity.getId());
			System.out.println("upload image!END!");
			return "redirect:/admin/profile";
			
		}
		return "admin/add-forms";
	}
	
	@GetMapping("/{m.id}/delete")
	public String deleteModel(
			@PathVariable("m.id")int modelId) {
		modelService.deleteModelById(modelId);
		return "redirect:/admin/profile";
	}
	
	@GetMapping("/inf")
	public String searchModel(
			@ModelAttribute("modelModel")ModelEntity entity,
			Model model) {
		return "redirect:/model/"+entity.getId()+"/inf";
	}
	
	@GetMapping("/{id}/inf")
	public String showOneModel(
			@PathVariable("id")int modelId,
			Model model) {
		ModelEntity modelE=modelService.findModelById(modelId);
		model.addAttribute("title",modelE.getTitleModel());
		model.addAttribute("findedModel",modelE);
		return "model/model-inf";
	}
	
	
	@GetMapping("{brandId}/list/pages/{pageNumber}")
	public String showModelsOfBrand(
			@PathVariable("brandId")int brandId,
			@PathVariable("pageNumber") int pageNumber,
			@RequestParam(value="field",required=false)String field,
			@RequestParam(value="sort",required=false)String sort,
			@RequestParam(value="total",required=false)String total,
			Model model) {
		int totalPerPage=total!=null? Integer.valueOf(total):6;
		String sortDirection=sort!=null?sort.toUpperCase():"ASC";
		String sortByField=field!=null?field:"titleModel";
		Page<ModelEntity> page=modelService.getPegableModelsOfBrand(
				pageNumber, 
				totalPerPage, 
				sortDirection, 
				sortByField,
				brandId);
		int currentPage=page.getNumber()+1;
		int begin=Math.max(1, currentPage-6);
		int end=Math.min(begin+6, page.getNumber());
		model.addAttribute("title",brandService.findBrandById(brandId).getTitleBrand()+"models");
		model.addAttribute("sortByField",sortByField);
		model.addAttribute("sortDirection",sortDirection);
		model.addAttribute("totalPerPage",totalPerPage);
		model.addAttribute("currentIndex",currentPage);
		model.addAttribute("modelsList",page);
		model.addAttribute("beginIndex",begin);
		model.addAttribute("endIndex",end);
		model.addAttribute("brand",brandService.findBrandById(brandId));
		model.addAttribute("modelsListByPageSize",page.getContent());
		return "model/model-list";
	}
}
