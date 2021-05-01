package com.te.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FristControler {
	@RequestMapping(path="/first", method=RequestMethod.GET)
	public ModelAndView getFristPage() {
		ModelAndView andVeiw = new ModelAndView();
		andVeiw.addObject("name","Bhandavya");
	//andVeiw.setViewName("/WEB-INF/views/app.jsp");
		andVeiw.setViewName("app");
		return andVeiw;
		
	}
	
	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public ModelAndView getUserData(ModelAndView modelAndView) {
//modelAndView.setViewName("/WEB-INF/views/userapp.jsp");
		modelAndView.setViewName("userapp");
		return modelAndView;
	}
	@GetMapping("/second")
	public String getUser(ModelMap map) {
		map.addAttribute("name", "Smith");
		return "app";
	}
}
