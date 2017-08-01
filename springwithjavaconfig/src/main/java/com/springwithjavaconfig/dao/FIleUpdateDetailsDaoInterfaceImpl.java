package com.springwithjavaconfig.dao;

import org.springframework.stereotype.Repository;

import com.springwithjavaconfig.model.FIleUpdateDetails;
@Repository
public class FIleUpdateDetailsDaoInterfaceImpl extends FIleUpdateDetailsDao implements FIleUpdateDetailsDaoInterface{

	@Override
	public void saveFileUpdateDetails(FIleUpdateDetails fIleUpdateDetails) {
			persist(fIleUpdateDetails);
	}

}
