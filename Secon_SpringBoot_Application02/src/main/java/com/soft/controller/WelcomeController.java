package com.soft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wel")
public class WelcomeController {

	@GetMapping("/call")
	public String call() {
		return"Welcome to Call";
	}
}
