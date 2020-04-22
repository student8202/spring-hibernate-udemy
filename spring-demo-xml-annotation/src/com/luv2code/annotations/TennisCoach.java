package com.luv2code.annotations;

import org.springframework.stereotype.Component;

@Component("theSillyCoach")
public class TennisCoach implements ICoach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
