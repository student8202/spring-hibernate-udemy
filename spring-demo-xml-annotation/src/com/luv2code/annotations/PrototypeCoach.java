package com.luv2code.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
public class PrototypeCoach implements ICoach, DisposableBean {

	@Autowired
	@Qualifier("randomFortuneService")
	private IFortuneService fortuneService;

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> PrototypeCoach: inside doMyStartupStuff()");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println(">> PrototypeCoach: inside destroy()");
		
	}


}
