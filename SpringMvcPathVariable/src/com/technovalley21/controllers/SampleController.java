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
	
	/*
	 * to pass all the parameters to the method's single map we have config spring-dispatcher-servlet.xml file
	 * with following code
	 * in beans tag:-> xmlns:mvc="http://www.springframework.org/schema/mvc"
	 * in xsi:schemaLocation attr:-> http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd
	 * and finally put the following line in top of viewResolver tag
	 * <mvc:annotation-driven />
	 * */
	
	@RequestMapping("/Map/{userName}/{msg}")
	public ModelAndView Map(@PathVariable Map<String, String> pathVar){
		ModelAndView mav = new ModelAndView("SampleViewPage");
		
		String name = pathVar.get("userName");
		String msg = pathVar.get("msg");
		
		Map<String, String> obj = new HashMap<String, String>();
		obj.put("username", "Via Map: " + name);
		obj.put("msg", msg);
		
		mav.addObject("obj", obj);
		
		return mav;
	}
	
	// localhost:8080/SpringMvcPathVariable/Sample/Hello/Shahadat/How are you
	// localhost:8080/SpringMvcPathVariable/Sample/Hi/Shahadat/How are you
	// localhost:8080/SpringMvcPathVariable/Sample/Map/Dhaka/Where am I
}
