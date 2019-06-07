package com.microservices.hiservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="helloClient",url="/hello/sayHello")
public interface HelloClient {
	@GetMapping("/hello/sayHello")
	public String getHelloMessage();
}
