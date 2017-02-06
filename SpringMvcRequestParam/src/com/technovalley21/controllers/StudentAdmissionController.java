package com.technovalley21.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView mav = new ModelAndView("AdmissionForm");
		
		return mav;
	}
	
	
	@RequestMapping(value="submitAdmissionForm.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm( @RequestParam("name") String name, @RequestParam("age") String age, @RequestParam("nid") String nid){
		ModelAndView mav = new ModelAndView("AdmissionSuccess");
		mav.addObject("msg", "Details submitted by you: " + name + ", " + age + ", " + nid);
		return mav;
	}
	
	@RequestMapping(value="submitAdmissionForm2.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm2( @RequestParam(value="name", defaultValue="Shahadat") String name, @RequestParam("age") String age, @RequestParam("nid") String nid){
		ModelAndView mav = new ModelAndView("AdmissionSuccess");
		mav.addObject("msg", "Details submitted by you: " + name + ", " + age + ", " + nid);
		return mav;
	}
	
	@RequestMapping(value="submitAdmissionForm3.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm3( @RequestParam Map<String, String> reqParam){
		ModelAndView mav = new ModelAndView("AdmissionSuccess");
		mav.addObject("msg", "Details submitted by you: " + reqParam.get("name") + ", " + reqParam.get("age") + ", " + reqParam.get("nid"));
		return mav;
	}
}
