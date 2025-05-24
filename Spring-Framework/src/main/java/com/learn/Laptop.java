package com.learn;

public class Laptop implements Computer
{
	public Laptop()
	{
		System.out.println("Laptop constructor has been called..");
	}

	public void compile()
	{
		System.out.println("Compiling the Code using Laptop only..");
	}
}
