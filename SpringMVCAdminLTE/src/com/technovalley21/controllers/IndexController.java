package com.technovalley21.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@ModelAttribute
	public void addCommonObjects(Model model, HttpServletRequest request){
		model.addAttribute("APP", request.getContextPath());
		
		//request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
		//http://localhost:8080/SpringMVCAdminLTE
	}
	
	@RequestMapping("/index")
	public ModelAndView indexPage(){
		ModelAndView mav = new ModelAndView("IndexPageView");
		
		return mav;
	}
}
