package com.luv2code.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanProcessorDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("applicationContext.xml");	
				
		// retrieve bean from spring container
		ICoach theCoach = context.getBean("prototypeCoach", ICoach.class);

		System.out.println("Daily workout: " + theCoach.getDailyWorkout());

		// close the context
		context.close();
	}

}








