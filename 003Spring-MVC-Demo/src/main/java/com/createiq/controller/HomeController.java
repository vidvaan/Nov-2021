package com.createiq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/hello")
	public ModelAndView sayHello(@RequestParam("name") String name) {
		return new ModelAndView("hello","name",name);
		
	}
	
	@RequestMapping(value="/welcome")
	public ModelAndView sayWelcome(@RequestParam("name") String name) {
		return new ModelAndView("welcome","name",name);
		
	}

}
