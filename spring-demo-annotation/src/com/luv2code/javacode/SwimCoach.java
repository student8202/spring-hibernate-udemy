package com.luv2code.javacode;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {
	
	private IFortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("foo.team")
	private String team;
	
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

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	

}
