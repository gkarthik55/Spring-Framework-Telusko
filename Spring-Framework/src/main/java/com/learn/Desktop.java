package com.learn;

public class Desktop implements Computer
{
	public Desktop()
	{
		System.out.println("Desktop constructor has been called..");
	}

	public void compile()
	{
		System.out.println("Compiling the Code using Desktop only..");
	}
}
