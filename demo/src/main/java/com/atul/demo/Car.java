package com.atul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	
	@Autowired
	@Qualifier("MRFtyre")
	Tyre t;
	
	public void drive() {
		System.out.println("Car chal rahi hai !!!" + t);
		//System.out.println("Car chal rahi hai !!!");
	}

}
