package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor.");
	}
	
	//@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: Inside setter method - setfortuneService.");
//		this.fortuneService = fortuneService;
//	}

}
