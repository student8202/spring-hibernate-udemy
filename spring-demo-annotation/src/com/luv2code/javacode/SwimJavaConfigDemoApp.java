package com.luv2code.javacode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportBeanConfig.class);
		// read spring config file logger
//		AnnotationConfigApplicationContext contextLog = 
//				new AnnotationConfigApplicationContext(TheLoggerConfig.class);
		
		// get the bean from spring container
		ICoach theCoach = context.getBean("swimCoach",ICoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune dependency injection
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
