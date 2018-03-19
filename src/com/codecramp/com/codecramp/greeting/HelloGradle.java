package com.codecramp.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloGradle implements Greeting {
	private static final Logger LOG = LoggerFactory.getLogger(HelloGradle.class);

	@Override
	public void greet() {
		LOG.debug("Executing Hello greeting");
		System.out.println("Hello Gradle!!!");
	}
}
