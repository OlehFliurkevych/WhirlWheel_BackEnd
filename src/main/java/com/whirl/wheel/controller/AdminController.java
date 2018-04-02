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
import org.springframework.context.annotation.Bean;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;
import com.whirl.wheel.CloudinaryConfig;
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
import com.whirl.wheel.mapper.ConcernMapper;
import com.whirl.wheel.repository.ConcernRepository;
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
	public String showProfile(Model model) throws IOException {
		
		model.addAttribute("title","Profile");
		model.addAttribute("concernModelRequest",new ConcernRequest());
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
	
	
	
	@GetMapping("/upload")
	public String uploadForm(Model model) {
		model.addAttribute("imageModel",new UploadImageEntity());
		return "form";
	}
	
	@PostMapping("/upload")
    public String singleImageUpload(@RequestParam("fileData") MultipartFile file,
    		RedirectAttributes redirectAttributes,
    		Model model,
    		@ModelAttribute("imageModel")UploadImageEntity image,
    		BindingResult result) throws IOException{
		
		if(file!=null&&file.getSize()>0) {
			image=new UploadImageEntity();
			image.setFileData(file.getBytes());
			image.setImageName(file.getOriginalFilename());
			imageService.saveImage(image);
		}
//		if(result.hasErrors()) {
//			return "form";
//		}
//		if (file.isEmpty()){
//            model.addAttribute("message","Please select a file to upload");
//            return "form";
//        }
//        try {
//        	image=new UploadImageEntity();
//        	 System.out.println(file.getOriginalFilename());
//             
//             
//            Map<?,?> uploadResult =  cloudinaryConfig.upload(file.getBytes(), ObjectUtils.asMap("resourcetype", "auto"));
//            model.addAttribute("message", "You successfully uploaded '" + file.getOriginalFilename() + "'");
//            model.addAttribute("imageurl", uploadResult.get("url"));
//            String path=(String)uploadResult.get("url");
//            image.setImageName(path);
//            image.setDescription(decription);
//            imageService.saveImage(image);
//            System.out.println(file.getOriginalFilename());
//            System.out.println(uploadResult.get("url"));
//           
//        } catch (IOException e){
//            e.printStackTrace();
//            model.addAttribute("message", "Sorry I can't upload that!");
//        }
        return "redirect:/admin/upload";
    }

	@PostMapping("/saveConcern")
	public String saveConcerntoDB(
			@RequestParam("image") ImageRequest imageForConcern,
			@ModelAttribute("concernModelRequest") @Valid ConcernRequest concern,
			Model model,
			RedirectAttributes redirectAttributes,
			BindingResult result,
			UploadImageEntity image) throws IOException {
		if(result.hasErrors()) {
			return "form";
		}
			concern=ConcernMapper.concernToEntity(imageForConcern, concern);
		return "redirect:/admin/profile";
	}
//		concernService.uploadImage(imageForConcern, 1);
//		
//		if (imageForConcern.isEmpty()){
//            model.addAttribute("message","Please select a file to upload");
//            return "admin/add-forms";
//        }
//        try {
//        	image=new UploadImageEntity();
//            Map<?,?> uploadResult =  cloudinaryConfig.upload(imageForConcern.getBytes(), ObjectUtils.asMap("resourcetype", "auto"));
//            model.addAttribute("message", "You successfully uploaded '" + imageForConcern.getOriginalFilename() + "'");
//            model.addAttribute("imageurl", uploadResult.get("url"));
//            String path=(String)uploadResult.get("url");
//            image.setImageName(path);
//            imageService.saveImage(image);
//            concern.setCountry(country);
//            concern.setDescription(description);
//            concern.setTitleConcern(titleConcern);
//            concernService.saveConcern(concern);
//        } catch (IOException e){
//            e.printStackTrace();
//            model.addAttribute("message", "Sorry I can't upload that!");
//        }
        

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
