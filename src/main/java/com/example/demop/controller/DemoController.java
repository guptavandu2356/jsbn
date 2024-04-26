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
		System.out.println("Change done");
		return "News app getting tested";
	}

}
