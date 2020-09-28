package com.jobreadyprogrammer.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloController {

	@RequestMapping(value = "/informal", method=RequestMethod.GET)
//	any request coming to the / url mapping will execute the underneath function
	public String sayHello() {
		return "whats up";
	}

	@RequestMapping("/proper")
	public String sayProperHello() {
		return "<h1>Hello there, how are you doing today?</h1>";
	}

	@RequestMapping("/user-entry")
	public String userForm() {
		return "<form action=\"/greeting/user-greeting\" method=\"post\">\n" +
				"  <label for=\"fname\">First name:</label>\n" +
				"  <input type=\"text\" id=\"fname\" name=\"fname\"><br><br>\n" +
				"  <label for=\"lname\">Last name:</label>\n" +
				"  <input type=\"text\" id=\"lname\" name=\"lname\"><br><br>\n" +
				"  <input type=\"submit\" value=\"Submit\">\n" +
				"</form>";
	}

	@RequestMapping(value="/user-greeting", method=RequestMethod.POST)
	public String userGreeting() {
		return "welcome user! you have made it to the inside!";
	}

	@RequestMapping("/link-me")
	public String linked() {
		return "click on the link : <a href=/greeting/link-made>this link</a>";
	}

	@RequestMapping("/link-made")
	public String linkMade() {
		return "you have arrived at the link!";
	}

}
