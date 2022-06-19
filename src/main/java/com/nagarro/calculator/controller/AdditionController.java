package com.nagarro.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.calculator.service.addService;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

@Controller
public class AdditionController {
	
	
	@RequestMapping(value={"/addition"})
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int x= Integer.parseInt(request.getParameter("val1"));
		int y= Integer.parseInt(request.getParameter("val2"));
		addService as= new addService();
		int result = as.add(x,y);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",result);
		return mv;
	}
	
	
}
