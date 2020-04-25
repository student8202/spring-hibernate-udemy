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
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call a method to get the daily fortune dependency injection
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods... has the pros values injected
		System.out.println(">> email: " + theCoach.getEmail());
		System.out.println(">> team: " + theCoach.getTeam());
		
		// close the context
		context.close();

	}

}
