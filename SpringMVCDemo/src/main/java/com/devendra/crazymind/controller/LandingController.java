package com.devendra.crazymind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/landing")
public class LandingController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(Model model) {
		
		model.addAttribute("message", "First Try");
		return "login";
	}
}
