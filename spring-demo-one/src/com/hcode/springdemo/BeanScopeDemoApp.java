package com.hcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");


		// retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		ICoach alphaCoach = context.getBean("myCoach", ICoach.class);

		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

		// close the context
		context.close();

	}

}
