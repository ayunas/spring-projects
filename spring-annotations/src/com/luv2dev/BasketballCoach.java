package com.luv2dev;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {


	@Override
	public String getWorkout() {
		return "Dribble the ball between your legs 1000 times daily";
	}
}
