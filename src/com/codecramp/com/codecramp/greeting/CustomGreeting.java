package com.codecramp.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomGreeting implements Greeting {
	private String greeting;
	private String greeter;
	
	public CustomGreeting() {	}
	
	@Autowired
	public CustomGreeting(@Value("Hey There!!!") final String greeting, @Value("Mohit Kumar") final String greeter) {
		this.greeting = greeting;
		this.greeter = greeter;
	}

	@Override
	public void greet() {
		System.out.println(greeting + ", I am - " + greeter);
	}
}
