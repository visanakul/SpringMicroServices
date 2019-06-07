package com.microservices.helloservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@GetMapping("/sayHello")
	private String sayHello() {
		return "Hello Service :: from Hello Controller";
	}
}
