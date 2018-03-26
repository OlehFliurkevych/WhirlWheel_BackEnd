package com.whirl.wheel.editor;

import java.beans.PropertyEditorSupport;

import com.whirl.wheel.entity.CountryEntity;
import com.whirl.wheel.service.CountryService;

public class CountryEditor extends PropertyEditorSupport{

	private final CountryService countryService;

	public CountryEditor(CountryService countryService) {
		super();
		this.countryService = countryService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		CountryEntity country=countryService.findCountryById(Integer.valueOf(text));
		setValue(country);
	}
	
	
}
