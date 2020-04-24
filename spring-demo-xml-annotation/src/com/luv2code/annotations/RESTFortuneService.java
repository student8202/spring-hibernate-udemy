package com.luv2code.annotations;

import org.springframework.stereotype.Component;

@Component("restFortuneService")
public class RESTFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "call RESTFortuneService";
	}

}
