package com.hcode.springdemo;

public class BaseballCoach implements ICoach{
	
	@Override
	public String getDailyWorkout()  {
		return "Spend 30 minutes on batting practice";
	}

}
