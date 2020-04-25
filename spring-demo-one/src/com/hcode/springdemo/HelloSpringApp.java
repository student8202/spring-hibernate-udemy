package com.hcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach",ICoach.class);
		ICoach theCoach2 = context.getBean("myRandomCoach",ICoach.class);
				
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach2.getDailyFortune());
		
		// close the context
		context.close();

	}

}
