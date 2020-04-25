package com.hcode.springdemo;

import com.hcode.springdemo.utilities.MyUtilities;

public class RandomFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		String[] arr={"Today is your happy day!", "Today is your bad day!", "Today is your lucky day!"};
		return new MyUtilities().randomString(arr);
	}

}
