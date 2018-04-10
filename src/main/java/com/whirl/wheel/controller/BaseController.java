package com.whirl.wheel.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.whirl.wheel.CloudinaryConfig;
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
import com.whirl.wheel.service.AreaService;
import com.whirl.wheel.service.BrandService;
import com.whirl.wheel.service.ConcernService;
import com.whirl.wheel.service.CountryService;
import com.whirl.wheel.service.ModelService;
import com.whirl.wheel.service.NewsService;

@Controller
public class BaseController {

	
	
//	 @GetMapping("/upload")
//	    public String uploadForm(){
//	        return "form";
//	    }
//	    @PostMapping("/upload")
//	    public String singleImageUpload(@RequestParam("file") MultipartFile file, 
//	    		RedirectAttributes redirectAttributes,
//	    		Model model){
//	        if (file.isEmpty()){
//	            model.addAttribute("message","Please select a file to upload");
//	            return "form";
//	        }
//	        try {
//	            Map uploadResult =  cloudinaryC.upload(file.getBytes(), ObjectUtils.asMap("resourcetype", "auto"));
//	            model.addAttribute("message", "You successfully uploaded '" + file.getOriginalFilename() + "'");
//	            model.addAttribute("imageurl", uploadResult.get("url"));
//	        } catch (IOException e){
//	            e.printStackTrace();
//	            model.addAttribute("message", "Sorry I can't upload that!");
//	        }
//	        return "redirect:/upload";
//	    }

	private ConcernService concernService;
	private CountryService countryService;
	private BrandService brandService;
	private ModelService modelService;
	private AreaService areaService;
	private NewsService newsService;
	
	@Autowired
	public BaseController(ConcernService concernService, CountryService countryService, BrandService brandService,
			ModelService modelService, AreaService areaService, NewsService newsService) {
		this.concernService = concernService;
		this.countryService = countryService;
		this.brandService = brandService;
		this.modelService = modelService;
		this.areaService = areaService;
		this.newsService = newsService;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(ConcernEntity.class, new ConcernEditor(concernService));
		binder.registerCustomEditor(BrandEntity.class, new BrandEditor(brandService));
		binder.registerCustomEditor(ModelEntity.class, new ModelEditor(modelService));
		binder.registerCustomEditor(CountryEntity.class, new CountryEditor(countryService));
		binder.registerCustomEditor(AreaEntity.class, new AreaEditor(areaService));
		binder.registerCustomEditor(NewsEntity.class, new NewsEditor(newsService));
	}

	@GetMapping({"/","/home"})
	public String showHomePage(Model model) {
		model.addAttribute("title","Home");
		model.addAttribute("concernModel",new ConcernEntity());
		model.addAttribute("listNews",newsService.findAllNews());
		model.addAttribute("listConcerns",concernService.findAllConcerns());
		model.addAttribute("listBrands",brandService.findAllBrands());
		model.addAttribute("listModels",modelService.findAllModels());
		return "home";
	}
	
	@GetMapping("/login")
	public String showSingInFormForAdmin(Model model) {
		model.addAttribute("title","Log in");
		return "admin/signin-admin";
	}
	
	@GetMapping("/error")
	public String showErrorPage(Model model) {
		model.addAttribute("title","Error");
		return "error";
	}
	
	@GetMapping("/news")
	public String showNews(Model model) {
		model.addAttribute("listNews",newsService.findAllNews());
		model.addAttribute("title","News");
		return "news";
	}
	
	@GetMapping("/aboutus")
	public String showAboutUsPage(Model model) {
		model.addAttribute("title","About us");
		return "about-us";
	}
}
