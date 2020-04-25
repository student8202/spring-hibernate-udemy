package com.hcode.springdemo.utilities;

import java.util.Random;

public class MyUtilities {
	
	public String randomString (String[] arr) {
//		String[] arr={"1", "2", "3", "4", "5"};
		
        Random r=new Random();
        int randomNumber=r.nextInt(arr.length);
        
        return arr[randomNumber];
	}

}
