package com.createiq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/public")
	public String home() {
		return "public";
	}
	
	@GetMapping("/reg")
	public String reg() {
		return "reg";
	}
	
	@GetMapping("/admin/hello")
	public String hello() {
		return "hello";
	}

}
