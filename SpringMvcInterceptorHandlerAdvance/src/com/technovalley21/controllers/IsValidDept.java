package com.technovalley21.controllers;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;

import org.springframework.messaging.handler.annotation.Payload;

@Documented
@Constraint(validatedBy = DeptValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidDept {
	
	String listOfValidDept() default "CSE|BBA|ICT"; // to receive parameters
	
	String message() default "Please provide valid dept, like (CSE, BBA, ICT) this";
	
	Class<?>[] groups () default {};
	Class<? extends Payload>[] payload() default {};
}
