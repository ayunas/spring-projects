package com.luv2dev;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotateApp {

	public static void main(String[] args) {

		System.out.println("hello world");
		//create context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println(context.toString());

		//get bean
		Coach golfCoach = context.getBean("golfCoach",Coach.class);
		Coach bballCoach = context.getBean("basketballCoach",Coach.class);
		Coach bikeCoach = context.getBean("bikeCoach",Coach.class);
		Coach fieldHockeyCoach = context.getBean("fieldHockeyCoach",Coach.class);

		//run bean methods
		System.out.println(golfCoach.getWorkout());
		System.out.println(bballCoach.getWorkout());
		System.out.println(bikeCoach.getWorkout());
		System.out.println(fieldHockeyCoach.getWorkout());

		System.out.println(bballCoach.getFortune());
		System.out.println(golfCoach.getFortune());
		System.out.println(bikeCoach.getFortune());
		System.out.println(fieldHockeyCoach.getFortune());

		//close the context
		context.close();
	}
}
