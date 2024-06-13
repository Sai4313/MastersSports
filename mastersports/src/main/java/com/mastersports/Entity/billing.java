package com.mastersports.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import lombok.Data;

@Entity
@Data
public class billing {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String fullName;
	    private String email;
	    private String address;
	    private String city;
	    private String state;
	    private String zip;
	    private String cardName;
	    private String cardNumber;
	    private String expMonth;
	    private String expYear;
	    private String cvv;
	    private boolean sameAddress;
	    
}
