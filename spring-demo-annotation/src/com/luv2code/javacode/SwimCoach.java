package com.luv2code.javacode;

public class SwimCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	public SwimCoach(IFortuneService myFortuneService) {
		this.fortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
