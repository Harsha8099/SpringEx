package com.springwithjavaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springwithjavaconfig.pojo.User;

@Controller
public class MainController {
	@RequestMapping("/")
	public ModelAndView welcome() {
		System.out.println("From controller");
		return new ModelAndView("login", "UserModal", new User());
	}

	@RequestMapping("/login1")
	public ModelAndView login(@ModelAttribute User userModal) {
		System.out.println("User Name is:" + userModal.getLoginId());
		if(userModal.getLoginId().equalsIgnoreCase("admin") && userModal.getPassword().equalsIgnoreCase("admin")){
			return new ModelAndView("welcome");
		}
		return new ModelAndView("welcome1");
	}

}
