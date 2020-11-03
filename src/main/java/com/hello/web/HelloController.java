package com.hello.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.business.Car;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello Spring Web World!!!";
	}
	
	@GetMapping("/car")
	public Car getCar() {
		return new Car("Jeep", "Wrangler Unlimited");
	}

}
