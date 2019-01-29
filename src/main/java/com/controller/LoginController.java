package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.services.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping("login.htm")
	public ModelAndView verifyUser(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession(true);

		List<Object[]> user = loginService.verifyUser(userName, password);
		if (user != null && !user.isEmpty() && user.get(0) != null) {
			
			session.setAttribute("userId", user.get(0)[0].toString());
			session.setAttribute("username", user.get(0)[1].toString());
		}
		mv.setViewName("home");
		return mv;
	}
}
