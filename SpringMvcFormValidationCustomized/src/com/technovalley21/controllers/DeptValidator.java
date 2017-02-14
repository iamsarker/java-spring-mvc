package com.technovalley21.controllers;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DeptValidator implements ConstraintValidator<IsValidDept, String> {
	
	private String deptList;
	
	@Override
	public void initialize(IsValidDept isValidDept) {
		// TODO Auto-generated method stub
		this.deptList = isValidDept.listOfValidDept();
	}

	@Override
	public boolean isValid(String dept, ConstraintValidatorContext ctx) {
		
		if( dept.matches(deptList) ){
			return true;
		}
		
		return false;
	}

}
