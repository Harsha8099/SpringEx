package com.springwithjavaconfig.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.springwithjavaconfig.model.FIleUpdateDetails;
import com.springwithjavaconfig.model.FileDetails;
import com.springwithjavaconfig.model.User;
import com.springwithjavaconfig.service.FIleUpdateDetailsService;
//import com.springwithjavaconfig.pojo.User;
import com.springwithjavaconfig.service.UserService;

@Controller
public class MainController {
	@Autowired
	private UserService userService;

	@Autowired
	private FIleUpdateDetailsService fileUpdatedDetailsService;
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
	public String submit(@RequestParam("file") CommonsMultipartFile file, ModelMap modelMap,HttpSession session) throws Exception {
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                String completeData = new String(bytes);
                String[] rows = completeData.split("\n");
                for(int i=1;i<rows.length;i++){
                	FIleUpdateDetails fIleUpdateDetails=new FIleUpdateDetails();
                	String[] columns = rows[i].split(",");
                	for(int j=0;j<columns.length;j++){
                		System.out.println(columns[j]);
                		fIleUpdateDetails.setId(1);
                		fIleUpdateDetails.setEmailAddress(columns[0]);
                		fIleUpdateDetails.setUserName(columns[1]);
                		fIleUpdateDetails.setUserType(columns[2]);
                		fIleUpdateDetails.setFirstName(columns[3]);
                		fIleUpdateDetails.setLastName(columns[4]);
                		fIleUpdateDetails.setMiddleName(columns[5]);
                		fIleUpdateDetails.setPrimaryEducationCollegeName(columns[6]);
                		fIleUpdateDetails.setPrimaryEducationSchoolName(columns[7]);
                		fIleUpdateDetails.setWorkAuthorizationName(columns[8]);
                		fIleUpdateDetails.setGender(columns[9]);
                		fIleUpdateDetails.setEthnicity(columns[10]);
                		fIleUpdateDetails.setPrimaryEducationCurrentlyAttending(columns[11]);
                		fIleUpdateDetails.setAuthIdentifier(columns[12]);
                		fIleUpdateDetails.setPrimaryEducationEndDate(columns[13]);
                		fIleUpdateDetails.setSchholYearName(columns[14]);
                		fIleUpdateDetails.setPrimaryEducationLevelName(columns[15]);
                	}
                	fileUpdatedDetailsService.saveFileUpdateDetails(fIleUpdateDetails);
                }
                
                
            }catch(Exception e){
            	System.out.println(e);
            }
            }
        
		modelMap.addAttribute("file", file);
		return "welcome1";
	}

}
