package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.luv2code.springdemo")
public class PracticeConfig {
	
	@Bean
	public FortuneService practiceFortune() {
		return new PracticeFortune();
	}
	
	@Bean
	public Coach practiceCoach() {
		return new PracticeCoach(practiceFortune());
	}
}
