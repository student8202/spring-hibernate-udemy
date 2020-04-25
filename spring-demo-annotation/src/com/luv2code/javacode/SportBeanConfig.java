package com.luv2code.javacode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.javacode")
@PropertySource("classpath:sport.properties")
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
	
	/**
	 * If you are using Spring 4.2 and lower
	 * // add support to resolve ${...} properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer
                    propertySourcesPlaceHolderConfigurer() {
        
        return new PropertySourcesPlaceholderConfigurer();
    }
	 */
}
