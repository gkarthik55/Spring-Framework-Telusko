package com.learn.Spring.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person
{
	//@Autowired
	//@Qualifier("desktop") // Field Injection
	Computer computer;

	// Constructor Injection
	//	Person(Computer computer)
	//	{
	//		this.computer = computer;
	//	}
	
	// Setter Injection
	@Autowired
	void setComputer(Computer computer)
	{
		this.computer = computer;
	}
	
	void build()
	{
		System.out.println("Working on Awesome project..");
		
		computer.compile();
	}
}
