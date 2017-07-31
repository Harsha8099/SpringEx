package com.springwithjavaconfig.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.springwithjavaconfig.model.FileDetails;
import com.springwithjavaconfig.model.User;
//import com.springwithjavaconfig.pojo.User;
import com.springwithjavaconfig.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("login", "UserModal", new User());
	}

	@RequestMapping("/login1")
	public ModelAndView login(@ModelAttribute User userModal) {
		List list = userService.findUsers();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			if (userModal.getUserName().equalsIgnoreCase(user.getUserName())
					&& userModal.getPassword().equalsIgnoreCase(userModal.getPassword())) {
				return new ModelAndView("welcome","filePath",new FileDetails());
			}
		}
		return new ModelAndView("welcome1");
	}

	@RequestMapping(value = "/fileupload", method = RequestMethod.POST)
	public String submit(@RequestParam("file") MultipartFile file, ModelMap modelMap) {
		System.out.println("From File:" + file.getOriginalFilename());
		modelMap.addAttribute("file", file);
		return "welcome1";
	}

}
