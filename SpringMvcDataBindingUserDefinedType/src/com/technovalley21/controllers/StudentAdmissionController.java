package com.technovalley21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
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
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student){
		
		ModelAndView mav = new ModelAndView("AdmissionSuccess");
		mav.addObject("msgHeader", "Welcome to Spring MVC Model Attribute Tutorials");
		
		return mav;
	}
	
}
