package com.springwithjavaconfig.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.springwithjavaconfig.model.FIleUpdateDetails;
import com.springwithjavaconfig.model.User;
@Repository
public class FIleUpdateDetailsDaoInterfaceImpl extends FIleUpdateDetailsDao implements FIleUpdateDetailsDaoInterface{

	@Override
	public void saveFileUpdateDetails(FIleUpdateDetails fIleUpdateDetails) {
			persist(fIleUpdateDetails);
	}

	@Override
	public List retreiveEmployees() {
		// TODO Auto-generated method stub
		
		Criteria criteria = getSession().createCriteria(FIleUpdateDetails.class);
        return (List<FIleUpdateDetails>) criteria.list();
	}

}
