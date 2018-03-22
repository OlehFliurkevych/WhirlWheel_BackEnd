package com.whirl.wheel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {


	@GetMapping("/profile")
	public String showProfile() {
		return "admin/add-forms";
	}
	
	@GetMapping("/login")
	public String showSingInFormForAdmin() {
		return "admin/signin-admin";
	}
	
}
