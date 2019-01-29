package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.services.GovermentPoliciesService;

@Controller
public class GovermentPoliciesController {
	@Autowired
	private GovermentPoliciesService govermentpoliciesService;

	@RequestMapping("govermentpolicies.htm")
	public ModelAndView redirect(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<Object[]> govermentpoliciesList = govermentpoliciesService.listpolicies();
		mv.addObject("govermentpolicesList", govermentpoliciesList);
		mv.setViewName("govermentpolicies");
		return mv;
	}

}
