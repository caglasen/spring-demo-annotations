package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class NewCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "New coach's advices";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
