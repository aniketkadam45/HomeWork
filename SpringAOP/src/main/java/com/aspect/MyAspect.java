package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution (* com.entity.Main.*(..))")
	public void beforeMainLogic() {
		System.err.println("Printing before main logic");
	}
	
	@After("execution (* com.entity.Main.*(..))")
	public void afterMainLogic() {
		System.err.println("Printing after main logic");
	}
	
	@Around("execution (* com.entity.Main.*(..))")
	public Object bothAfterAndBefore(ProceedingJoinPoint p) throws Throwable {
		
		System.out.println("Using Arroud");
		
		Object result = p.proceed();
		
		System.out.println("Using Arroud");
		
		return result;
	}
	
}
