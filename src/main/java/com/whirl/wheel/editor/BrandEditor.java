package com.whirl.wheel.editor;

import java.beans.PropertyEditorSupport;

import com.whirl.wheel.entity.BrandEntity;
import com.whirl.wheel.service.BrandService;

public class BrandEditor extends PropertyEditorSupport{

	private final BrandService brandService;

	public BrandEditor(BrandService brandService) {
		this.brandService = brandService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		BrandEntity brand=brandService.findBrandById(Integer.valueOf(text));
		setValue(brand);
	}
	
	
}
