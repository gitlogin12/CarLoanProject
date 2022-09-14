package com.sdkfinance.carloan.app.carloancontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sdkfinance.carloan.app.carloanmodel.Enquirydetails;
import com.sdkfinance.carloan.app.carloanserviceinterface.EnquiryDetailsInterface;

@CrossOrigin("*")
@RestController
public class EnquiryDetailsController {

	@Autowired
	EnquiryDetailsInterface edi;
	
	@PostMapping(value="/enquiry")
	public ResponseEntity<Enquirydetails> postEnquiry(@RequestBody Enquirydetails enq)
	{
		Enquirydetails ed =edi.postEnquiry(enq);
		return new ResponseEntity<Enquirydetails>(enq,HttpStatus.CREATED);
	}
@PostMapping(value="/enquiry")
	public ResponseEntity<Enquirydetails> postEnquiry(@RequestBody Enquirydetails enq)
	{
		Enquirydetails ed =edi.postEnquiry(enq);
		return new ResponseEntity<Enquirydetails>(enq,HttpStatus.CREATED);
	}
}
