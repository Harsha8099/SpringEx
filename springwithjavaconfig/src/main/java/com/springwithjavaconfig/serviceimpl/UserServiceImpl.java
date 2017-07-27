package com.springwithjavaconfig.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springwithjavaconfig.dao.UserDaoInterface;
import com.springwithjavaconfig.model.User;
//import com.springwithjavaconfig.pojo.User;
import com.springwithjavaconfig.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDaoInterface userDaoInterface;
	
	public void saveEmployee(User user) {
		// TODO Auto-generated method stub
		userDaoInterface.saveEmployee(user);
	}

	public List<User> findUsers() {
		// TODO Auto-generated method stub
		return userDaoInterface.findUsers();
	}

}
