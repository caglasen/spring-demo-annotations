package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file, now SportConfig is our Java configuration class 
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container, default bean id of TesnniCoach is tennisCoach
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//Coach newCoach = context.getBean("newCoach", Coach.class);
		
		//System.out.println(newCoach.getDailyWorkout());
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
