package com.luv2code.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements ICoach {
	
	private IFortuneService myForturneService;
	
	@Autowired
	public TennisCoach(IFortuneService myForturneService) {
		this.myForturneService = myForturneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return myForturneService.getFortune();
	}

}
