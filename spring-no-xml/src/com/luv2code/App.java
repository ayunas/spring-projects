package com.luv2code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		//declare the Spring Container from the SpringConfig.
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		//get bean from the spring container
		Coach chessCoach = context.getBean("chessCoach",Coach.class);
		System.out.println(chessCoach.getWorkout());
		System.out.println(chessCoach.getFortune());
	}




}
