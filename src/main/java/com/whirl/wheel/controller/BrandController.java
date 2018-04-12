package com.whirl.wheel.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.whirl.wheel.editor.ConcernEditor;
import com.whirl.wheel.editor.ModelEditor;
import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.entity.ModelEntity;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;
import com.whirl.wheel.service.ModelService;

@Controller
@RequestMapping("/brand")
public class BrandController {

	private BrandService brandService;
	private ModelService modelService;
	private ConcernService concernService;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ConcernEntity.class, new ConcernEditor(concernService));
		binder.registerCustomEditor(BrandEntity.class, new BrandEditor(brandService));
		binder.registerCustomEditor(ModelEntity.class, new ModelEditor(modelService));
	}
	
	@Autowired
	public BrandController(BrandService brandService, ModelService modelService, ConcernService concernService) {
		this.brandService = brandService;
		this.modelService = modelService;
		this.concernService = concernService;
	}
	
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
	
	@GetMapping("/inf")
	public String searchBrand(
			Model model,
			@ModelAttribute("brandModel")BrandEntity brand) {
		return "redirect:/brand/"+brand.getId()+"/inf";
	}
	
	@GetMapping("/{id}/inf")
	public String showOneBrand(
			@PathVariable("id")int brandId,
			Model model) {
		BrandEntity entity=brandService.findBrandById(brandId);
		List<ModelEntity> models=modelService.findModelsByBrand(brandId);
		List<ModelEntity> randomModels=new ArrayList<>();
		int last=0;
		if(models.size()>=4) {
			last=4;
		}else {
			last=models.size();
		}
		for(int i=0;i<last;i++) {
			double randIndex=Math.random()*models.size();
			randomModels.add(models.get((int)randIndex));
			models.remove((int)randIndex);
		}
		model.addAttribute("title",entity.getTitleBrand());
		model.addAttribute("randModels",randomModels);
		model.addAttribute("findedBrand",entity);
		return "brand/brand-inf";
	}
	
	@GetMapping("{concernId}/list/pages/{pageNumber}")
	public String showBrandsOfOneConcern(
			@PathVariable("concernId")int concernId,
			@PathVariable("pageNumber") int pageNumber,
			@RequestParam(value="field",required=false)String field,
			@RequestParam(value="sort",required=false)String sort,
			@RequestParam(value="total",required=false)String total,
			Model model) {
		int totalPerPage=total!=null? Integer.valueOf(total):6;
		String sortDirection=sort!=null?sort.toUpperCase():"ASC";
		String sortByField=field!=null?field:"titleBrand";
		Page<BrandEntity> page=brandService.getPegableBrandsOfConcern(
				pageNumber, 
				totalPerPage, 
				sortDirection, 
				sortByField,
				concernId);
		int currentPage=page.getNumber()+1;
		int begin=Math.max(1, currentPage-6);
		int end=Math.min(begin+6, page.getNumber());
		model.addAttribute("title",concernService.findConcernById(concernId).getTitleConcern()+"brands");
		model.addAttribute("sortByField",sortByField);
		model.addAttribute("sortDirection",sortDirection);
		model.addAttribute("totalPerPage",totalPerPage);
		model.addAttribute("currentIndex",currentPage);
		model.addAttribute("brandsList",page);
		model.addAttribute("beginIndex",begin);
		model.addAttribute("endIndex",end);
		model.addAttribute("concern",concernService.findConcernById(concernId));
		model.addAttribute("brandsListByPageSize",page.getContent());
		return "brand/brand-list";
	}
	
}
