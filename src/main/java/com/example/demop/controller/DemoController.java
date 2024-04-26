package com.example.demop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/news")
public class DemoController {
	
	@GetMapping("/headline")
	@ResponseBody
	public String news() {
		System.out.println("Changing the demo controller");
		System.out.println("Changing the demo controller2");
		System.out.println("Changing the demo controller2");
		return "News app getting tested";
	}

}
