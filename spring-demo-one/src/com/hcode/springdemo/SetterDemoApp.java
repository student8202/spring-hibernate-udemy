package com.hcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		ICoach myCoach = context.getBean("myCricketCoach", ICoach.class);
		
		// call methods on the bean
		// ... let's come back to this ...
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(myCoach.getDailyFortune());
		
		// close the context
		context.close();
		
		
	}

}
