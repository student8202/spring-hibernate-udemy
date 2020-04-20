package com.hcode.springdemo;

public class CricketCoach implements ICoach {

	private IFortuneService fortuneService;
	
	// create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	// our setter method
	public void setFortuneService(IFortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
