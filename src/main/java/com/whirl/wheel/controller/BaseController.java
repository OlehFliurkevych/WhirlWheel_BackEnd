package com.whirl.wheel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

	@GetMapping({"/","/home"})
	public String showHomePage(Model model) {
		model.addAttribute("title","Home");
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
		model.addAttribute("title","News");
		return "news";
	}
	
	@GetMapping("/aboutus")
	public String showAboutUsPage(Model model) {
		model.addAttribute("title","About us");
		return "about-us";
	}
}
