package com.whirl.wheel.editor;

import java.beans.PropertyEditorSupport;

import com.whirl.wheel.entity.AreaEntity;
import com.whirl.wheel.service.AreaService;

public class AreaEditor extends PropertyEditorSupport{

	
	private final AreaService areaService;

	public AreaEditor(AreaService areaService) {
		this.areaService = areaService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		AreaEntity area=areaService.findAreaById(Integer.valueOf(text));
		setValue(area);
	}
	
	
}
