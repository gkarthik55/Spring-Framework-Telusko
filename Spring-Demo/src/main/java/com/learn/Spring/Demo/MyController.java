package com.learn.Spring.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@RequestMapping("/")
	public String greet()
	{
		return "Hello World, Welcome to Telusko..";
	}
}
