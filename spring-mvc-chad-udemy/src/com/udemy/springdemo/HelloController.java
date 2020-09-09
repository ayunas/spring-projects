package com.udemy.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String showMeThePage() {
		return "index";  //return the name of the view we want to return.  the prefix and suffix is taken from
	}
}

