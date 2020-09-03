package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes batting";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}
}


