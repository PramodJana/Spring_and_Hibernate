package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach =context.getBean("myCoach",Coach.class);
		
		//check if these are the same beans
		boolean result =(theCoach == alphaCoach);
		System.out.println("\nPointing to the same object " + result);
		System.out.println("\nMemory location for theCoach "+theCoach);
		System.out.println("\nMemory location for alphaCoach "+alphaCoach);
	}

}
