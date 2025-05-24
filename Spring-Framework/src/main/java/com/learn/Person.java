package com.learn;

public class Person
{
	int age;
	int salary; 
	
	Computer comp;
	
	public Person()
	{
		System.out.println("Person constructor has been called..");
	}
	
	public Person(int age, int salary)
	{
		this.age = age;
		this.salary = salary;
		
		System.out.println("Person Parametrized constructor has been called..");
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public Computer getComp()
	{
		return comp;
	}

	public void setComp(Computer comp)
	{
		this.comp = comp;
	}

	void build()
	{
		System.out.println("Working on Awesome project..");
		
		// Laptop is configured in 'spring.xml' file.
		comp.compile();
	}
}
