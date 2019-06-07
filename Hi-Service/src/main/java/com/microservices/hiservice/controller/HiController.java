package com.microservices.hiservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.hiservice.client.HelloClient;

@RestController
@RequestMapping(value = "/hi")
public class HiController {
	@Autowired
	private HelloClient helloClient;

	@GetMapping("/sayHi")
	public String sayHi() {
		String msg="Hi";
		msg+=","+helloClient.getHelloMessage();
		return msg;
	}
}
