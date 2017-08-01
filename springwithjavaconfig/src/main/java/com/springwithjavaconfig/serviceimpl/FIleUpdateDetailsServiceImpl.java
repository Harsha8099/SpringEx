package com.springwithjavaconfig.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springwithjavaconfig.dao.FIleUpdateDetailsDaoInterface;
import com.springwithjavaconfig.model.FIleUpdateDetails;
import com.springwithjavaconfig.service.FIleUpdateDetailsService;

@Service("fileUpdatedDetailsService")
@Transactional
public class FIleUpdateDetailsServiceImpl implements FIleUpdateDetailsService{

	@Autowired
	private FIleUpdateDetailsDaoInterface fileUpdateDetailsDaoInterface;
	
	@Override
	public void saveFileUpdateDetails(FIleUpdateDetails fIleUpdateDetails) {
		// TODO Auto-generated method stub
		fileUpdateDetailsDaoInterface.saveFileUpdateDetails(fIleUpdateDetails);
	}

}
