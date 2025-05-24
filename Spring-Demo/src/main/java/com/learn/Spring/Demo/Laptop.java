package com.learn.Spring.Demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer
{
	public Laptop()
	{
		System.out.println("Laptop constructor has been called..");
	}

	@Override
	public void compile()
	{
		System.out.println("Compiling the Code using Laptop..");
	}
}
