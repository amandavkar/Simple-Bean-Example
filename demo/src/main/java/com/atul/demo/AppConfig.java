package com.atul.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.atul.demo")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfig {
	
//	@Bean
//	public Car getCar() {
//		return new Car();
//	}
//	
//	@Bean
//	public Bike getBike() {
//		return new Bike();
//	}
//	
//	@Bean
//	public Tyre getTyre() {
//		return new Tyre("MRF");
//	}

}
