package com.whirl.wheel.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.whirl.wheel.entity.ConcernEntity;
import com.whirl.wheel.service.ConcernService;

//@Component
//public class ConcernNotEmptyValidator implements ConstraintValidator<ConcernNotEmpty, ConcernEntity>{
//	
//	private ConcernService concernService;
//
//	@Autowired
//	public ConcernNotEmptyValidator(ConcernService concernService) {
//		this.concernService = concernService;
//	}
//
//	@Override
//	public void initialize(ConcernNotEmpty arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public boolean isValid(ConcernEntity concern, ConstraintValidatorContext validator) {
//		if(concern==null) {
//			return false;
//		}else {
//			return true;
//		}
//	}
//	
//	
//
//}
