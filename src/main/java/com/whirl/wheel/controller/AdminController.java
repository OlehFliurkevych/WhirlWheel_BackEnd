package com.whirl.wheel.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.repository.ConcernRepository;
import com.whirl.wheel.service.ConcernService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
//	@InitBinder("user")
//	protected void initBinder(WebDataBinder binder) {
//		binder.registerCustomEditor(User.class, new UserEditor(userService));
//	}
	
	@Autowired
	private ConcernService concernService;
	
	
	@GetMapping("/profile")
	public String showProfile(Model model) {
		model.addAttribute("title","Profile");
		model.addAttribute("concernModel",new ConcernEntity());
		model.addAttribute("listConcerns",concernService.findAllConcerns());
		return "admin/add-forms";
	}
	

	
}
