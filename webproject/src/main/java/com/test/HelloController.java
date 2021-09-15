package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String redirect() {
		
		return "LoginPage";
	}
	
	@RequestMapping("/helloagain")
public String display() {
		
		return "final";
	}
	
}
