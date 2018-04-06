package com.whirl.wheel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.whirl.wheel.domain.ConcernRequest;
import com.whirl.wheel.domain.ImageRequest;
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
import com.whirl.wheel.mapper.ImageMapper;
import com.whirl.wheel.service.AdminService;
import com.whirl.wheel.service.AreaService;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;
import com.whirl.wheel.service.CountryService;
import com.whirl.wheel.service.ModelService;
import com.whirl.wheel.service.NewsService;
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
	public AdminController(AdminService adminService, ConcernService concernService,
			BrandService brandService, ModelService modelService, AreaService areaService,
			CountryService countryService, NewsService newsService, UploadImageService imageService) {
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
	public String showProfile(Model model) {
		
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
		model.addAttribute("listNews",newsService.findAllNews());
		return "admin/add-forms";
	}
	
	
//	@GetMapping("/upload")
//	public String showDoorm(Model model) {
////		model.addAttribute("imageModelRequest",new ImageRequest());
//		model.addAttribute("imageModel",new UploadImageEntity());
//		return "form";
//	}
//	
//	@PostMapping("/upload")
//	public String save(@ModelAttribute("image")UploadImageEntity image) {
////		UploadImageEntity entity=ImageMapper.imageToEntity(image);
//		System.out.println("1");
////		imageService.saveImage(entity);
//		System.out.println("2");
////		imageService.uploadImage(image.getImage(),image.getId());
//		System.out.println("3");
//		return "redirect:/admin/upload";
//	}
	@GetMapping("/upload")
	public String showForm(Model model) {
		model.addAttribute("concernModel",new ConcernEntity());
		model.addAttribute("listCountries",countryService.findAllCountries());
		return "form";
	}

	@PostMapping("/save")
	public String saveConcern(@ModelAttribute("concernModel")ConcernEntity concern,
			@RequestParam("image")MultipartFile image) {
		System.out.println("went to method");
		concernService.saveConcern(concern);
		System.out.println("save concern");
		concernService.uploadImage(image, concern.getId());
		System.out.println("upload image!END!");
		return "redirect:/admin/profile";
	}

}
