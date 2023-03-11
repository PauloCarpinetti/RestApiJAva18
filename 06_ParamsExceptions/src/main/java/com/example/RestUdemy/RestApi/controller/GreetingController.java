package com.example.RestUdemy.RestApi.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestUdemy.RestApi.model.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s !";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting") ///greeting?name=Paulo parametro e nome
	public Greeting greeting(
			@RequestParam(value= "name", defaultValue = "world")
	        String name) {
		
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
		
	}
}	
