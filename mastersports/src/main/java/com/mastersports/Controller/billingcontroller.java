package com.mastersports.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mastersports.Entity.billing;
import com.mastersports.ServiceImpl.billingserviceimpl;



@RestController
@CrossOrigin
public class billingcontroller {
	 
		@Autowired
		billingserviceimpl bsi;
	
		@PostMapping("/billing")
	    public ResponseEntity<String> submitBillingForm(@RequestBody billing form) {
			bsi.submitBillingForm(form);
	        return ResponseEntity.ok("Form submitted successfully");
	    }
}
