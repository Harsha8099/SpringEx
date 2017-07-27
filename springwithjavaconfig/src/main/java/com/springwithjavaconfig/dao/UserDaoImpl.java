package com.springwithjavaconfig.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.springwithjavaconfig.model.User;

//import com.springwithjavaconfig.pojo.User;
@Repository
public class UserDaoImpl extends UserDao implements UserDaoInterface{

	public void saveEmployee(User user) {
		// TODO Auto-generated method stub
		persist(user);
	}

	public List<User> findUsers() {
		// TODO Auto-generated method stub
		//return null;
		Criteria criteria = getSession().createCriteria(User.class);
        return (List<User>) criteria.list();
	}

	public void deleteEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		
	}

}
