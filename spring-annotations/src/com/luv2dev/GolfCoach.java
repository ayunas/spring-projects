package com.luv2dev;

import org.springframework.stereotype.Component;

@Component("golfCoach")
public class GolfCoach implements Coach {

	@Override
	public String getWorkout() {
		return "Putt putt golf and games";
	}
}
