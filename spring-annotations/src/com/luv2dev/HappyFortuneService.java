package com.luv2dev;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "InshaAllah, today will be a good day for you!";
	}
}

