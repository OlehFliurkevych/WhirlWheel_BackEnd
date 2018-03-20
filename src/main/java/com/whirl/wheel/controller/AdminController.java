package com.whirl.wheel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/")
public class AdminController {

	@GetMapping("/signin")
	public String showSingInFormForAdmin() {
		return "admin/signin-admin";
	}
	
	
	@GetMapping("/registr")
	public String showRegisterFormForAdmin() {
		return "admin/registr-admin";
	}
	
	@PostMapping("/registr")
	public String saveAdminToDatabase() {
		return "admin/signin-admin";
	}
	
}
