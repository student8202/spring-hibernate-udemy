package com.luv2code.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		ICoach theCoach = context.getBean("tennisCoach",ICoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune dependency injection
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
