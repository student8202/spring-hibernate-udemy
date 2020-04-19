package com.hcode.springdemo;

public class BaseballCoach implements ICoach{
	
	// define a private field for the dependency
	private IFortuneService fortuneService;
	
	// constructor
	public BaseballCoach() {
		super();
	}
	
	// define a constructor for dependency injection
	public BaseballCoach(IFortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout()  {
		return "Spend 30 minutes on batting practice";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
