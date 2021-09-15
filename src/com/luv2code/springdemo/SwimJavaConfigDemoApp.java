package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file, now SportConfig is our Java configuration class 
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container, default bean id of TesnniCoach is tennisCoach
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//Coach newCoach = context.getBean("newCoach", Coach.class);
		
		//System.out.println(newCoach.getDailyWorkout());
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		// call our new swim coach methods ... has the properties values injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
