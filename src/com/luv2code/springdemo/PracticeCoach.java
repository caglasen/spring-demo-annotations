package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PracticeCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public PracticeCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice x for 20 minutes.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
