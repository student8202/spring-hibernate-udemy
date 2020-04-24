package com.luv2code.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements ICoach {
	
	private IFortuneService myForturneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	// define a setter method
	@Autowired
	public void setMyFortuneService(IFortuneService myFortuneService) {
		System.out.println(">> TennisCoach: inside setMyFortuneService method");
		this.myForturneService = myFortuneService;
	}
	
	// define a any method
		@Autowired
		public void doAnyCrazyStuff(IFortuneService myFortuneService) {
			System.out.println(">> TennisCoach: inside doAnyCrazyStuff method");
			this.myForturneService = myFortuneService;
		}
	/*
	@Autowired
	public TennisCoach(IFortuneService myForturneService) {
		this.myForturneService = myForturneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return myForturneService.getFortune();
	}

}
