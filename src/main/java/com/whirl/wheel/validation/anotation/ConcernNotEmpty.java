package com.whirl.wheel.validation.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.whirl.wheel.validation.validator.ConcernNotEmptyValidator;


@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=ConcernNotEmptyValidator.class)
public @interface ConcernNotEmpty {

	String message() default "Concern is empty";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};//для роботи з мета даними
}
