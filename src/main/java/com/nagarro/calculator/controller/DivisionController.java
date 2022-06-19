package com.nagarro.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.calculator.service.divService;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

@Controller
public class DivisionController {
	@RequestMapping(value={"/division"})
	public ModelAndView div(HttpServletRequest request, HttpServletResponse response) {
	int x= Integer.parseInt(request.getParameter("val1"));
	int y= Integer.parseInt(request.getParameter("val2"));
	divService dv= new divService();
	int result = dv.div(x,y);
	ModelAndView mv= new ModelAndView();
	mv.setViewName("display");
	mv.addObject("result",result);
	return mv;
}
}
