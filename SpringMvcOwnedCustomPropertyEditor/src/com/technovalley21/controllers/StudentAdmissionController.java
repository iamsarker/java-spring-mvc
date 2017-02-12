package com.technovalley21.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	/*
	 * CustomDateEditor is the property editor class that has been provided
	 * by the Spring MVC. There are so many property editor class is present 
	 * in Spring MVC framework by default. Such as dateEditor, fileEditor, mapEditor, numberEditor, & etc
	 * */
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.setDisallowedFields(new String[] {"age"}); // spring mvc framework will skip this field
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyy");
		binder.registerCustomEditor(Date.class, "studentDoB", new CustomDateEditor(sdf, false));
		
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
		
	}
	
	@RequestMapping(value="admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView mav = new ModelAndView("AdmissionFormPage");
		
		return mav;
	}
	
	
	@ModelAttribute
	public void extraObjects(Model model1){
		model1.addAttribute("cmsg", "Common Message");
	}
	
	@RequestMapping(value="submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student, BindingResult result){
		
		/* catch form related error with BindingResult */
		if( result.hasErrors() ){
			ModelAndView mav1 = new ModelAndView("AdmissionFormPage");
			
			return mav1;
		}
		
		ModelAndView mav = new ModelAndView("AdmissionSuccess");
		mav.addObject("msgHeader", "Welcome to Spring MVC Model Attribute Tutorials");
		
		return mav;
	}
	
}
