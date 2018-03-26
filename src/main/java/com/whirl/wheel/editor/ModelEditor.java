package com.whirl.wheel.editor;

import java.beans.PropertyEditorSupport;

import com.whirl.wheel.entity.ModelEntity;
import com.whirl.wheel.service.ModelService;

public class ModelEditor extends PropertyEditorSupport{

	private final ModelService modelService;

	public ModelEditor(ModelService modelService) {
		this.modelService = modelService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		ModelEntity model=modelService.findModelById(Integer.valueOf(text));
		setValue(model);
	}
	
	
	
}
