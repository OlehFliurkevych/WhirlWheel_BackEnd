package com.whirl.wheel.controller;


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;
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
import com.whirl.wheel.entity.UploadImageEntity;
import com.whirl.wheel.entity.UploadImageForBrand;
import com.whirl.wheel.entity.UploadImageForConcern;
import com.whirl.wheel.entity.UploadImageForModel;
import com.whirl.wheel.entity.UploadImageForNews;
import com.whirl.wheel.service.AdminService;
import com.whirl.wheel.service.AreaService;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;
import com.whirl.wheel.service.CountryService;
import com.whirl.wheel.service.ModelService;
import com.whirl.wheel.service.NewsService;
import com.whirl.wheel.service.UploadImageForBrandService;
import com.whirl.wheel.service.UploadImageForConcernService;
import com.whirl.wheel.service.UploadImageForModelService;
import com.whirl.wheel.service.UploadImageForNewsService;
import com.whirl.wheel.service.UploadImageService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private AdminService adminService;
	private ConcernService concernService;
	private BrandService brandService;
	private ModelService modelService;
	private AreaService areaService;
	private CountryService countryService;
	private NewsService newsService;
	private UploadImageService imageService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ConcernEntity.class, new ConcernEditor(concernService));
		binder.registerCustomEditor(BrandEntity.class, new BrandEditor(brandService));
		binder.registerCustomEditor(ModelEntity.class, new ModelEditor(modelService));
		binder.registerCustomEditor(CountryEntity.class, new CountryEditor(countryService));
		binder.registerCustomEditor(AreaEntity.class, new AreaEditor(areaService));
		binder.registerCustomEditor(NewsEntity.class, new NewsEditor(newsService));
	}
	
	
	
	@Autowired
	public AdminController(AdminService adminService, ConcernService concernService, BrandService brandService,
			ModelService modelService, AreaService areaService, CountryService countryService, NewsService newsService,
			UploadImageService imageService) {
		this.adminService = adminService;
		this.concernService = concernService;
		this.brandService = brandService;
		this.modelService = modelService;
		this.areaService = areaService;
		this.countryService = countryService;
		this.newsService = newsService;
		this.imageService = imageService;
	}




	@GetMapping("/profile")
	public String showProfile(Model model) throws IOException {
		
		Map config=new HashMap<>();
		config.put("cloud_name","whirl-wheel" );
		config.put("api_key","784981521285313");
		config.put("api_secret", "LvX9nxFswIYBInU6HwxxFi4tGQM");
		Cloudinary cloudinary=new Cloudinary(config);
		cloudinary.uploader().upload("nissan_group.jpg", ObjectUtils.asMap("ransformation",new Transformation().width(800).height(600)
				.crop("limit")));
		model.addAttribute("title","Profile");
		model.addAttribute("concernModel",new ConcernEntity());
		model.addAttribute("brandModel",new BrandEntity());
		model.addAttribute("modelModel",new ModelEntity());
		model.addAttribute("countryModel",new CountryEntity());
		model.addAttribute("areaModel",new AreaEntity());
		model.addAttribute("newsModel",new NewsEntity());
		model.addAttribute("imageModel",new UploadImageEntity());
		model.addAttribute("listConcerns",concernService.findAllConcerns());
		model.addAttribute("listBrands",brandService.findAllBrands());
		model.addAttribute("listModels",modelService.findAllModels());
		model.addAttribute("listCountries",countryService.findAllCountries());
		model.addAttribute("listAreas",areaService.findAllAreas());
		return "admin/add-forms";
	}

	@PostMapping("/saveConcern")
	public String saveConcerntoDB(
			@ModelAttribute("concernModel") @Valid ConcernEntity concern,
			@RequestParam("imageForConcern")MultipartFile imageForConcern,
			BindingResult result) throws IOException {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
		
//		if(!imageForConcern.isEmpty()&&imageForConcern!=null) {
//			UploadImageForConcern image=new UploadImageForConcern();
//			image.setFileName(imageForConcern.getOriginalFilename());
//			image.setFileData(imageForConcern.getBytes());
//			imageForConcernService.saveImageForConcern(image);
//			concernService.saveConcern(concern);
//		}
		return "redirect:/admin/profile";
	}

	@PostMapping("/saveBrand")
	public String saveBrandToDB(
			@ModelAttribute("brandModel") @Valid BrandEntity brand,
			@RequestParam("imageForBrand")MultipartFile imageForBrand,
			BindingResult result) throws IOException {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
//		if(imageForBrand!=null&&imageForBrand.getSize()>0) {
//			UploadImageForBrand image=new UploadImageForBrand();
//			image.setFileName(imageForBrand.getOriginalFilename());
//			image.setFileData(imageForBrand.getBytes());
//			imageForBrandService.saveImageForBrand(image);
//			brandService.saveBrand(brand);
//		}
		
		return "redirect:/admin/profile";
	}
	
	@PostMapping("/saveArea")
	public String saveAreaToDB(
			@ModelAttribute("countryModel") @Valid AreaEntity area,
			BindingResult result) {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
		areaService.saveArea(area);
		return "redirect:/admin/profile";
	}
	
	@PostMapping("/saveCountry")
	public String saveCountryToDB(
			@ModelAttribute("countryModel") @Valid CountryEntity country,
			BindingResult result) {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
		countryService.saveCountry(country);
		return "redirect:/admin/profile";
	}
	
	@PostMapping("/saveModel")
	public String saveModelToDB(
			@ModelAttribute("modelModel") @Valid ModelEntity model,
			@RequestParam("imageForModel")MultipartFile imageForModel,
			BindingResult result) throws IOException {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
//		if(imageForModel!=null&&imageForModel.getSize()>0) {
//			UploadImageForModel image=new UploadImageForModel();
//			image.setFileName(imageForModel.getOriginalFilename());
//			image.setFileData(imageForModel.getBytes());
//			imageForModelService.saveImageForModel(image);
//			modelService.saveModel(model);
//		}
		return "redirect:/admin/profile";
	}
	
	@PostMapping("/saveNews")
	public String saveNewsToDB(
			@ModelAttribute("newsModel") @Valid NewsEntity news,
			@RequestParam("imageForNews")MultipartFile imageForNews,
			BindingResult result) throws IOException {
		if(result.hasErrors()) {
			return "admin/add-forms";
		}
//		if(imageForNews!=null&&imageForNews.getSize()>0) {
//			UploadImageForNews image=new UploadImageForNews();
//			image.setFileName(imageForNews.getOriginalFilename());
//			image.setFileData(imageForNews.getBytes());
//			imageForNewsService.saveImageForNews(image);
//			newsService.saveNews(news);
//		}
		return "redirect:/admin/profile";
	}
	



//
//	@PostMapping("/saveBrand")
//	public String saveBrandToDB(
//			@ModelAttribute("brandModel") @Valid BrandEntity brand,
//			@RequestParam("imageForBrand")UploadImageForBrand imageForBrand,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			return "admin/add-forms";
//		}
//		imageForBrandService.saveImageForBrand(imageForBrand);
//		brandService.saveBrand(brand);
//		return "redirect:/admin/profile";
//	}
//	
//	@PostMapping("/saveArea")
//	public String saveAreaToDB(
//			@ModelAttribute("countryModel") @Valid AreaEntity area,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			return "admin/add-forms";
//		}
//		areaService.saveArea(area);
//		return "redirect:/admin/profile";
//	}
//	
//	@PostMapping("/saveCountry")
//	public String saveCountryToDB(
//			@ModelAttribute("countryModel") @Valid CountryEntity country,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			return "admin/add-forms";
//		}
//		countryService.saveCountry(country);
//		return "redirect:/admin/profile";
//	}
//	
//	@PostMapping("/saveModel")
//	public String saveModelToDB(
//			@ModelAttribute("modelModel") @Valid ModelEntity model,
//			@RequestParam("imageForModel")UploadImageForModel imageForModel,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			return "admin/add-forms";
//		}
//		imageForModelService.saveImageForModel(imageForModel);
//		modelService.saveModel(model);
//		return "redirect:/admin/profile";
//	}
//	
//	@PostMapping("/saveNews")
//	public String saveNewsToDB(
//			@ModelAttribute("newsModel") @Valid NewsEntity news,
//			@RequestParam("imageForNews")UploadImageForNews imageForNews,
//			BindingResult result) {
//		if(result.hasErrors()) {
//			return "admin/add-forms";
//		}
//		newsService.saveNews(news);
//		imageForNewsService.saveImageForNews(imageForNews);
//		return "redirect:/admin/profile";
//	}
//	


}
