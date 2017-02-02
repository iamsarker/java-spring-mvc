package com.technovalley21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	// default landing page of that application
	@RequestMapping("/")
	public ModelAndView home(){
		ModelAndView mav = new ModelAndView("EmployeePage");
		mav.addObject("msg", "Home page - Default Landing Page");
		mav.addObject("type", "index");
		return mav;
	}
	
	@RequestMapping("/Employee")
	public ModelAndView index(){
		ModelAndView mav = new ModelAndView("EmployeePage");
		mav.addObject("msg", "Index page of Employee Management");
		mav.addObject("type", "index");
		return mav;
	}
	
	@RequestMapping("/Employee/edit")
	public ModelAndView edit(){
		ModelAndView mav = new ModelAndView("EmployeePage");
		mav.addObject("msg", "Edit page of Employee Management");
		mav.addObject("type", "edit");
		
		return mav;
	}
}
