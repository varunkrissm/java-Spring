/**
 * 
 */
package com.mytest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytest.dao.UploadDao;
import com.mytest.model.UploadDetails;
import com.mytest.service.UploadService;

@Service
public class UploadServiceImpl implements UploadService {
	
	@Autowired
	private UploadDao uploadDao;

	public List<UploadDetails> getUploadDetails() {
		return uploadDao.getUploadDetails();

	}

}
