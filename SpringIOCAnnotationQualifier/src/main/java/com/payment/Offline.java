package com.payment;

import org.springframework.stereotype.Component;

@Component("offline")
public class Offline implements Payment{
	
	@Override
	public String doPayment() {
		return "Offline Payment";
	}
}
