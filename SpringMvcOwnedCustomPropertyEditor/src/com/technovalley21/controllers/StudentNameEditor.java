package com.technovalley21.controllers;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	/* when we will submit the form Spring MVC will run setAsText method of this class
	 * before performing data binding task for student name property of student object
	 * */
	
	@Override
	public void setAsText(String name) throws IllegalArgumentException{
		
		if( name.contains("Mr.") || name.contains("Ms.") ){
			setValue(name);
		} else{
			setValue("Ms. " + name);
		}
		
	}
}
