package com.whirl.wheel.editor;

import java.beans.PropertyEditorSupport;

import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.service.ConcernService;

public class ConcernEditor extends PropertyEditorSupport{

	private final ConcernService concernService;

	public ConcernEditor(ConcernService concernService) {
		this.concernService = concernService;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		ConcernEntity concern=concernService.findConcernById(Integer.valueOf(text));
		setValue(concern);;
	}
	
	
}
