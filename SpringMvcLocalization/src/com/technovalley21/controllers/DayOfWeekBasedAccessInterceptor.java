package com.technovalley21.controllers;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hanlder) throws Exception{
		
		Calendar cal = Calendar.getInstance();
		int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
		
		if( dayOfWeek == 6 ){ // 1 == sunday, 2 == monday, ... 6 == friday
			
			response.getWriter().write("This application is unreachable in this day. Please try again others week day");
			
			return false;
		}
		
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object hanlder, ModelAndView modelAndView) throws Exception{
		System.out.println("post handle methos is called from interceptor class"); // check console
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object hanlder, Exception ex) throws Exception{
		System.out.println("after completion methos is called from interceptor class"); // check console
	}
	
}
