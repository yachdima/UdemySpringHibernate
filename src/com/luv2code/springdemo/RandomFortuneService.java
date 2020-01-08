package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {
		
	@Override
	public String getFortune() {
		String[] arr = {"Fortune1","Fortune2","Fortune3"};
		int randomInt = (int)(3.0 * Math.random());
		
		return arr[randomInt];
	}

}
