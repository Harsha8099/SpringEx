package com.springwithjavaconfig.service;

import org.springframework.stereotype.Service;

import com.springwithjavaconfig.model.FIleUpdateDetails;

@Service
public interface FIleUpdateDetailsService {
	void saveFileUpdateDetails(FIleUpdateDetails fIleUpdateDetails);
}
