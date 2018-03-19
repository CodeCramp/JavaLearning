package com.codecramp.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomGreeting implements Greeting {
	private static final Logger LOG = LoggerFactory.getLogger(CustomGreeting.class);
	
	private String greeting;
	private String greeter;
	
	public CustomGreeting() {	}
	
	@Autowired
	public CustomGreeting(@Value("Hey There!!!") final String greeting, @Value("CodeCramp.com") final String greeter) {
		this.greeting = greeting;
		this.greeter = greeter;
	}

	@Override
	public void greet() {
		LOG.debug("Executing custom greeting");
		System.out.println(greeting + ", I am - " + greeter);
	}
}
