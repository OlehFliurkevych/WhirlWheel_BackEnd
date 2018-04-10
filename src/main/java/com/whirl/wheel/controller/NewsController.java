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
import com.whirl.wheel.service.NewsService;

@Controller
@RequestMapping("/news")
public class NewsController {
	
	private NewsService newsService;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(NewsEntity.class, new NewsEditor(newsService));
	}
	
	@Autowired
	public NewsController(NewsService newsService) {
		this.newsService = newsService;
	}


//	@GetMapping("/form")
//	public String showForm(Model model) {
//		model.addAttribute("newsModel",new NewsEntity());
//		return "news/add-news";
//	}
	
	
	@PostMapping("/save")
	public String saveNews(
			Model model,
			@ModelAttribute("newsModel")@Valid NewsEntity news,
			@RequestParam("image")MultipartFile image,
			BindingResult result) {
		System.out.println("kjhkhk");
		if(result.hasErrors()) {
			System.out.println("not valid");
			System.out.println(result.getAllErrors());
//			model.addAttribute("messageForAdd","You don't add news");
			return "admin/add-forms";
		}
		if(image!=null&&image.getSize()>0) {
			System.out.println("went to method");
			newsService.saveNews(news);
			System.out.println("save concern");
			newsService.uploadImage(image, news.getId());
			System.out.println("upload image!END!");
//			model.addAttribute("messageForAdd","You successfully add news");
			return "redirect:/admin/profile";
		}
//		model.addAttribute("messageForAdd","You don't add news");
		return "admin/add-forms";
	}
	
	@GetMapping("/{n.id}/delete")
	public String deleteNews(
			@PathVariable("n.id")int newsId
			) {
		newsService.deleteNewsById(newsId);
		return "redirect:/admin/profile";
	}
	
	@GetMapping("/{n.id}/inf")
	public String showOneNews(
			Model model,
			@PathVariable("n.id")int newsId) {
		
		return "news/news-inf";
	}
}
