package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.services.EventService;

@Controller
public class EventController {
	@Autowired
	private EventService eventService;

	@RequestMapping("event.htm")
	public ModelAndView redirect(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<Object[]> eventList = eventService.listevent();
		mv.addObject("eventList", eventList);
		mv.setViewName("event");
		return mv;

	}
	@RequestMapping("join.htm")
	public ModelAndView joinredirect(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<Object[]> eventList = eventService.listevent();
		mv.addObject("eventList", eventList);
		mv.setViewName("eventregister");
		return mv;

	}

	
}
