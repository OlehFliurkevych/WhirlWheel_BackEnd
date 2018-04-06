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
import com.whirl.wheel.service.CountryService;

@Controller
@RequestMapping("/country")
public class CountryController {

	private CountryService countryService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(CountryEntity.class, new CountryEditor(countryService));
	}

	@Autowired
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}
	
//	@GetMapping("/form")
//	public String showForm(Model model) {
//		model.addAttribute("countryModel",new CountryEntity());
//		return "country/add-country";
//	}
	
	@PostMapping("/save")
	public String saveCountry(
			@ModelAttribute("countryModel")@Valid CountryEntity country,
			Model model,
			BindingResult result) {
		if(result.hasErrors()) {
//			model.addAttribute("messageForAdd","You don't add country");
			return "redirect:/admin/profile";
		}
		countryService.saveCountry(country);
//		model.addAttribute("messageForAdd","You successfully add country");
		return "redirect:/admin/profile";
	}
	
	@GetMapping("/{c.id}/delete")
	public String deleteCountry(
			@PathVariable("c.id")int countryId) {
		countryService.deleteCountryById(countryId);
		return "redirect:/admin/profile";
	}
	
}
