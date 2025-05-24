package com.learn.Spring.Demo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer
{
	public Desktop()
	{
		System.out.println("Desktop constructor has been called..");
	}
	
	@Override
	public void compile()
	{
		System.out.println("Compiling the code using Desktop..");
	}
}
