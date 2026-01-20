package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.config;
import com.payment.Person;

public class MyClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Person p = context.getBean(Person.class);
		
		System.out.println(p.getOn().doPayment());
		System.out.println(p.getOff().doPayment());;
	}
}
