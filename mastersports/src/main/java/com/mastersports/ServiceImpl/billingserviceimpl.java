package com.mastersports.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mastersports.Entity.billing;
import com.mastersports.Repository.billingrepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@Service
public class billingserviceimpl {

	@Autowired
	billingrepository bR;
	
	 public ResponseEntity<String> submitBillingForm( billing form)
	 {
		 bR.save(form);
		 return  ResponseEntity.ok("SUBMITTED SUCCESFFULY") ;
		 
	 }
	
}
