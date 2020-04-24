package com.luv2code.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService myForturneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}

	/*
	 * // define a setter method
	 * 
	 * @Autowired public void setMyFortuneService(IFortuneService myFortuneService)
	 * { System.out.println(">> TennisCoach: inside setMyFortuneService method");
	 * this.myForturneService = myFortuneService; }
	 */

	/*
	 * // define a any method
	 * 
	 * @Autowired public void doAnyCrazyStuff(IFortuneService myFortuneService) {
	 * System.out.println(">> TennisCoach: inside doAnyCrazyStuff method");
	 * this.myForturneService = myFortuneService; }
	 */
	
	/*
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") IFortuneService myForturneService) {
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
