package com.payment;

import org.springframework.stereotype.Component;

@Component("online")
public class Online implements Payment{

	@Override
	public String doPayment() {
		return "Online Payment";
	}
	
}
