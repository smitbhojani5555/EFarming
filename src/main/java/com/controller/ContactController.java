package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	
	@RequestMapping("contact.htm")
	public ModelAndView redirect(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	   mv.setViewName("contact");
	   return mv;
	}
	@RequestMapping("about.htm")
	public ModelAndView redirecttoabout(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	   mv.setViewName("about");
	   return mv;
	}
}  