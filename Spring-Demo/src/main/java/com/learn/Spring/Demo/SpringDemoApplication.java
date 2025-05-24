package com.learn.Spring.Demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Spring Boot Demo");
		
		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
		
		//	Person obj = new Person(10, "Karthik G");
		//	System.out.println(obj.toString());
	    
		Person obj1 = applicationContext.getBean(Person.class);
		obj1.build();
	}
}
