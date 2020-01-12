package com.luv2code.springdemo;

public class HokkeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HokkeyCoach() {
		
	}
	
	public HokkeyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
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
