package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.config;
import com.entity.Main;

public class MyClass {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		
		Main m = context.getBean(Main.class);
		
		m.doMainLogic();
	}

}
