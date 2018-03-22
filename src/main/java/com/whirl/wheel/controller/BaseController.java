package com.whirl.wheel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

	@GetMapping({"/","/home"})
	public String showHomePage() {
		return "home";
	}
	
	
	@GetMapping("/error")
	public String showErrorPage() {
		return "error";
	}
	
	@GetMapping("/news")
	public String showNews() {
		return "news";
	}
	
	@GetMapping("/aboutus")
	public String showAboutUsPage() {
		return "about-us";
	}
}
