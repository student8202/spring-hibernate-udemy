package com.hcode.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		// crate the object
		ICoach theCoach = new TrackCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
