package com.codecramp.greeting;

import org.springframework.stereotype.Component;

@Component
public class ByeGradle implements Greeting {

	@Override
	public void greet() {
		System.out.println("Bye Gradle!!!");
	}
}
