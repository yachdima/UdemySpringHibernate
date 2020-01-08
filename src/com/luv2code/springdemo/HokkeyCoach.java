package com.luv2code.springdemo;

public class HokkeyCoach implements Coach {
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do that you must do";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	
}
