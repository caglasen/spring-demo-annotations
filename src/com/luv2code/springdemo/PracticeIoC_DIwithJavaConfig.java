package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeIoC_DIwithJavaConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PracticeConfig.class);
		
		PracticeCoach theCoach = context.getBean("practiceCoach", PracticeCoach.class);
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("helal bana be");
		
		context.close();
		
	}

}
