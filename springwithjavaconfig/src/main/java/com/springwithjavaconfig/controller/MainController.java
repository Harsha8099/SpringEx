package com.springwithjavaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
@RequestMapping("/")
public ModelAndView welcome(){
	System.out.println("From controller");
	return new ModelAndView("welcome");
}
}
