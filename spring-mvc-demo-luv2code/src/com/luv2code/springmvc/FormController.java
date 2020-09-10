package com.luv2code.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String returnForm() {
		return "form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "name-page";
	}
}
