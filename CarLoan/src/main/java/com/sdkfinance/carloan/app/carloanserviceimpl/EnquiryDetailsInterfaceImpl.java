package com.sdkfinance.carloan.app.carloanserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sdkfinance.carloan.app.carloanmodel.Enquirydetails;
import com.sdkfinance.carloan.app.carloanrepository.EnquiryDetailsRepository;
import com.sdkfinance.carloan.app.carloanserviceinterface.EnquiryDetailsInterface;

@Service
public class EnquiryDetailsInterfaceImpl implements EnquiryDetailsInterface{

	@Autowired
	EnquiryDetailsRepository edr;
	
	@Override
	public Enquirydetails postEnquiry(Enquirydetails enq) {
		Enquirydetails ed = edr.save(enq);
		return ed;
	}

}
