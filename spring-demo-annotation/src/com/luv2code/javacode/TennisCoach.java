package com.luv2code.javacode;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
//@Scope("prototype")
public class TennisCoach implements ICoach {

	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService myForturneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside doMyStartupStuff method");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside doMyCleanupStuff method");
	}
	
	/*
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") IFortuneService myForturneService) {
		this.myForturneService = myForturneService;
	}
	*/
	
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
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return myForturneService.getFortune();
	}

}
