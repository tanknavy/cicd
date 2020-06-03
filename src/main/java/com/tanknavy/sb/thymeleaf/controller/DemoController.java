package com.tanknavy.sb.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	// mapping for "hello"
	@GetMapping("/hello")
	public String sayHello(Model theModel) {
		theModel.addAttribute("theDate", new java.util.Date());
		
		// thymeleaf in POM, so spring will auto-configure to use, look helloworld.html in templates
		return "helloworld"; 
	}
}
