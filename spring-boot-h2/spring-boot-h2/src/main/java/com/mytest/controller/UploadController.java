package com.mytest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mytest.model.UploadDetails;
import com.mytest.service.UploadService;

@Controller
public class UploadController {
	
	@Autowired
	private UploadService uploadService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<UploadDetails>> uploadDetails() {
        
		List<UploadDetails> uploadDetails = uploadService.getUploadDetails();
		return new ResponseEntity<List<UploadDetails>>(uploadDetails, HttpStatus.OK);
	}

}
