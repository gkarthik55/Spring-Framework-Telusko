package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
   public static void main(String[] args) 
   {
      System.out.println("Spring Framework Demo..");
      
      ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
      
      Person pObj = context.getBean(Person.class);
      // Person pObj = (Person) context.getBean("person");
      
      System.out.println("Age of the Person : "+pObj.age);
      System.out.println("Salary of the Person : "+pObj.salary);
      
      pObj.build();
      
      
   }
}