package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container, default bean id of TesnniCoach is tennisCoach
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach newCoach = context.getBean("newCoach", Coach.class);
		
		System.out.println(newCoach.getDailyWorkout());
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailtFortune());
		
		// close the context
		context.close();
	}

}
