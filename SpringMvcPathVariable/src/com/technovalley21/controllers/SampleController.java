package com.technovalley21.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Sample")
public class SampleController {
	
	@RequestMapping("/Hello/{userName}/{msg}")
	public ModelAndView hello(@PathVariable("userName") String uName, @PathVariable("msg") String msg){
		ModelAndView mav = new ModelAndView("SampleViewPage");
		
		Map<String, String> obj = new HashMap<String, String>();
		obj.put("username", "Hello, " + uName);
		obj.put("msg", msg);
		
		mav.addObject("obj", obj);
		
		return mav;
	}
	
	@RequestMapping("/Hi/{userName}/{msg}")
	public ModelAndView hi(@PathVariable("msg") String msg, @PathVariable("userName") String uName){
		ModelAndView mav = new ModelAndView("SampleViewPage");
		
		Map<String, String> obj = new HashMap<String, String>();
		obj.put("username", "Hi, " + uName);
		obj.put("msg", msg);
		
		mav.addObject("obj", obj);
		
		return mav;
	}
	
	// localhost:8080/SpringMvcPathVariable/Sample/Hello/Shahadat/How are you
	// localhost:8080/SpringMvcPathVariable/Sample/Hi/Shahadat/How are you
}
