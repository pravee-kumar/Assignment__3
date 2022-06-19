package com.nagarro.calculator.controller;

import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.calculator.service.subService;

@Controller
public class SubstractionController {
	@RequestMapping(value={"/substraction"})
	public ModelAndView sub(HttpServletRequest request, HttpServletResponse response) {
		int x= Integer.parseInt(request.getParameter("val1"));
		int y= Integer.parseInt(request.getParameter("val2"));
		subService sb= new subService();
		int result = sb.sub(x,y);
		ModelAndView mv= new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",result);
		return mv;
	}
}
