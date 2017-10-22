package com.codecramp.greeting;

import org.springframework.stereotype.Component;

@Component
public class HelloGradle implements Greeting {

	@Override
	public void greet() {
		System.out.println("Hello Gradle!!!");
	}
}
