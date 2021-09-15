package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// Instead of reading the configuration from an XML file, 
// we will read it from this Java configuration class

/*
 * this is the annotation to say hey this(Sportconfig) is a 
 * java configuration file and follow the appropriate rules or directions here
 */
@Configuration 

/* In this annotation,
 * we simply give the actual package that we want to use 
 * to have spring to start scanning
 */
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// 1. define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
				
	}
	
	// 2. define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
}
