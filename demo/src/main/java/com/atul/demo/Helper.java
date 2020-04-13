package com.atul.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Helper {
	
	@Before("execution(public void drive())")
	public void logshow() {
		System.out.println("Logshow called");
	}
}
