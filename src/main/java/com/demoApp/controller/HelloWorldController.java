package com.demoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1")
public class HelloWorldController {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Life is a Race so We RUn RUn";
	}

}
