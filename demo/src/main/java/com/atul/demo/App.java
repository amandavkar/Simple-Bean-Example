package com.atul.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Car obj = context.getBean(Car.class);
    	
        obj.drive();
        
        // Tyre t = (Tyre)context.getBean("tyre");
        // System.out.println(t);
        
        ((ConfigurableApplicationContext)context).close();
    }
}	
