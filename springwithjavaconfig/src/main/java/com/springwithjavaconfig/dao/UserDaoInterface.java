package com.springwithjavaconfig.dao;

import java.util.List;

import com.springwithjavaconfig.model.User;

//import com.springwithjavaconfig.pojo.User;

public interface UserDaoInterface {
	void saveEmployee(User user);
    
    List<User> findUsers();
     
    void deleteEmployeeBySsn(String ssn);
}
