package com.codecramp.greeting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ByeGradle implements Greeting {
	private static final Logger LOG = LoggerFactory.getLogger(ByeGradle.class);

	@Override
	public void greet() {
		LOG.debug("Executing Bye greeting");
		System.out.println("Bye Gradle!!!");
	}
}
