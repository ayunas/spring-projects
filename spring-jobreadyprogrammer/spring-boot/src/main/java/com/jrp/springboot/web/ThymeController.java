package com.jrp.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jrp.springboot.domain.User;

@Controller
public class ThymeController {

	@RequestMapping("/thyme")
	public String thyme(Model model) {
		model.addAttribute("formData", new User()); //giving the model a key / val pair. it's like an object map.  given a key / val pair.
		return "pages/index";
	}

	@RequestMapping(value="/create", method= RequestMethod.POST)
	public String processThymeForm(User user) {
		return "pages/thyme-process";
	}
}
