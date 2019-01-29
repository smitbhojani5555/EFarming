package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.services.RegistrationService;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;

	@RequestMapping("register.htm")
	public ModelAndView insert(HttpServletRequest request, HttpServletResponse response) throws MessagingException {
		ModelAndView mv = new ModelAndView();
		int usertype = Integer.parseInt(request.getParameter("usertype"));
		registrationService.addUser(request.getParameter("firstname"), request.getParameter("lastname"),
				request.getParameter("name"), request.getParameter("email"), request.getParameter("mobileno"),
				request.getParameter("password1"), usertype);
		mv.setViewName("home");
		return mv;

	}

}
