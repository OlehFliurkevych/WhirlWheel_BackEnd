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

import com.whirl.wheel.editor.AreaEditor;
import com.whirl.wheel.entity.AreaEntity;
import com.whirl.wheel.service.AreaService;

@Controller
@RequestMapping("/area")
public class AreaController {

	private AreaService areaService;

	@Autowired
	public AreaController(AreaService areaService) {
		this.areaService = areaService;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(AreaEntity.class, new AreaEditor(areaService));
	}
	
	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("areaModel",new AreaEntity());
		return "area/add-area";
	}
	
	
	@PostMapping("/save")
	public String saveArea(
			@ModelAttribute("areaModel")AreaEntity area) {
		areaService.saveArea(area);
		return "redirect:/area/form";
	}
	
	
	
}
