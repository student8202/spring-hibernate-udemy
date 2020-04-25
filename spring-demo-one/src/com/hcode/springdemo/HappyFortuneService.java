package com.hcode.springdemo;

public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "Today is your happy day!";
	}

}
