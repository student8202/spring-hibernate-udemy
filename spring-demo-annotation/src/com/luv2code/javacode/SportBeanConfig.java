package com.luv2code.javacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.luv2code.javacode")
public class SportBeanConfig {
	// define bean for our sad fortune service (beanId)
	@Bean
	public IFortuneService myFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency by beanId
	@Bean("swimCoach")
	public ICoach mySwimCoach() {
		return new SwimCoach(myFortuneService());
	}
}
