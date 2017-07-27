package com.springwithjavaconfig.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springwithjavaconfig.model.User;

//import com.springwithjavaconfig.pojo.User;
@Service
public interface UserService {
	void saveEmployee(User user);

	List<User> findUsers();

}
