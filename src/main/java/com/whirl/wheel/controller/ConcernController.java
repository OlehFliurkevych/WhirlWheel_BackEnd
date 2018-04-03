package com.whirl.wheel.controller;

import java.io.IOException;

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

import com.whirl.wheel.domain.ConcernRequest;
import com.whirl.wheel.domain.ImageRequest;
import com.whirl.wheel.editor.AreaEditor;
import com.whirl.wheel.editor.BrandEditor;
import com.whirl.wheel.editor.ConcernEditor;
import com.whirl.wheel.editor.CountryEditor;
import com.whirl.wheel.editor.ModelEditor;
import com.whirl.wheel.editor.NewsEditor;
import com.whirl.wheel.editor.UploadImageEditor;
import com.whirl.wheel.entity.AreaEntity;
import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.entity.CountryEntity;
import com.whirl.wheel.entity.ModelEntity;
import com.whirl.wheel.entity.NewsEntity;
import com.whirl.wheel.entity.UploadImageEntity;
import com.whirl.wheel.mapper.ConcernMapper;
import com.whirl.wheel.service.AdminService;
import com.whirl.wheel.service.AreaService;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;
import com.whirl.wheel.service.CountryService;
import com.whirl.wheel.service.ModelService;
import com.whirl.wheel.service.NewsService;
import com.whirl.wheel.service.UploadImageService;

@Controller
@RequestMapping("/concern")
public class ConcernController {
	
	private AdminService adminService;
	private ConcernService concernService;
	private BrandService brandService;
	private ModelService modelService;
	private AreaService areaService;
	private NewsService newsService;
	private CountryService countryService;
	private UploadImageService imageService;
	
	@Autowired
	public ConcernController(AdminService adminService, ConcernService concernService, BrandService brandService,
			ModelService modelService, AreaService areaService, NewsService newsService, CountryService countryService,
			UploadImageService imageService) {
		this.adminService = adminService;
		this.concernService = concernService;
		this.brandService = brandService;
		this.modelService = modelService;
		this.areaService = areaService;
		this.newsService = newsService;
		this.countryService = countryService;
		this.imageService = imageService;
	}

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ConcernEntity.class, new ConcernEditor(concernService));
		binder.registerCustomEditor(BrandEntity.class, new BrandEditor(brandService));
		binder.registerCustomEditor(ModelEntity.class, new ModelEditor(modelService));
		binder.registerCustomEditor(CountryEntity.class, new CountryEditor(countryService));
		binder.registerCustomEditor(AreaEntity.class, new AreaEditor(areaService));
		binder.registerCustomEditor(NewsEntity.class, new NewsEditor(newsService));
		binder.registerCustomEditor(UploadImageEntity.class, new UploadImageEditor(imageService));
	}
	
	

	@GetMapping("/form")
	public String formConcern(Model model) {
		model.addAttribute("concernModelRequest",new ConcernRequest());
//		model.addAttribute("listCountries",countryService.findAllCountries());
		return "concern/concern";
	}
	
	@PostMapping("/save")
	public String savaConcernToDB(
			@ModelAttribute("concernModelRequest") ConcernRequest concern,
			@RequestParam("image") ImageRequest image
			) throws IOException {
		ConcernEntity concernEntity=ConcernMapper.concernToEntity(concern.getImage(), concern);
		concernService.uploadImage(image.getImage(), 1);
		concernService.saveConcern(concernEntity);
		
		
//		if(image!=null&&image.getSize()>0) {
//			UploadImageEntity entity=new UploadImageEntity();
//			entity.setImageName(image.getOriginalFilename());
//			entity.setFileData(image.getBytes());
//			concern.setImageForConcern(entity);
//			concernService.saveConcern(concern);
//		}
		
		return "redirect:/concern/form";
	}
}