package com.microservices.hiservice.client;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
@EnableDiscoveryClient
@FeignClient(name="helloClient",url = "http://localhost:4444/api/hello")
public interface HelloClient {
	@GetMapping("/hello/sayHello")
	public String getHelloMessage();
}
