package com.hcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");


		// retrieve bean from spring container
		ICoach theCoach = context.getBean("myCoach", ICoach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();

	}

}
