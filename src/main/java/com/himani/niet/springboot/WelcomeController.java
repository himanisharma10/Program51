package com.himani.niet.springboot;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		System.out.println("Hello");
		model.put("message", "Welcome to Hell");
		return "welcome";
	}
}
