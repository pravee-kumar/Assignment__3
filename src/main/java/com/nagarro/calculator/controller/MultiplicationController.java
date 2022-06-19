package com.nagarro.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.calculator.service.mulService;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

@Controller
public class MultiplicationController {
	
	@RequestMapping(value={"/multiplication"})
	public ModelAndView mul(HttpServletRequest request, HttpServletResponse response) {
	int x= Integer.parseInt(request.getParameter("val1"));
	int y= Integer.parseInt(request.getParameter("val2"));
	mulService ml= new mulService();
	int result = ml.mul(x,y);
	ModelAndView mv= new ModelAndView();
	mv.setViewName("display");
	mv.addObject("result",result);
	return mv;
}
}
