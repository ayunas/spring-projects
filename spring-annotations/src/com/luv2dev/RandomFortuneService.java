package com.luv2dev;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] randomFortunes = {"a","b","c"};
	private Random rand = new Random();

	@Override
	public String getFortune() {
		int r = rand.nextInt(randomFortunes.length);
		return randomFortunes[r];
	}

}
