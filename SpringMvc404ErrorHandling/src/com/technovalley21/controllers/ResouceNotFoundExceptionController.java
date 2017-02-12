package com.technovalley21.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResouceNotFoundExceptionController {
	
	@RequestMapping("/404.html")
	public ModelAndView error404(){
		ModelAndView mav = new ModelAndView("404");
		return mav;
	}
	
	
}
