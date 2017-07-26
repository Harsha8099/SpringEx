package com.springwithjavaconfig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springwithjavaconfig.annotation.WebServletConfiguration;
import com.springwithjavaconfig.model.User;
//import com.springwithjavaconfig.pojo.User;
import com.springwithjavaconfig.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		System.out.println("From controller");
		List list=userService.findAllEmployees();
		System.out.println("Size of list is:"+list.size());
		
		User user=new User();
		user.setId(5);
		user.setUserName("Raju");
		user.setPassword("Raju");
		//userService.saveEmployee(user);
		
		return new ModelAndView("login", "UserModal", new User());
	}

	@RequestMapping("/login1")
	public ModelAndView login(@ModelAttribute User userModal) {
		//System.out.println("User Name is:" + userModal.getLoginId());
	/*	if(userModal.getLoginId().equalsIgnoreCase("admin") && userModal.getPassword().equalsIgnoreCase("admin")){
			return new ModelAndView("welcome");
		}*/
		return new ModelAndView("welcome1");
	}

}
