package com.codecramp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.codecramp.greeting.ByeGradle;
import com.codecramp.greeting.CustomGreeting;
import com.codecramp.greeting.Greeting;
import com.codecramp.greeting.HelloGradle;

@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
		          new AnnotationConfigApplicationContext(Application.class);
		Greeting helloGreeting = context.getBean(HelloGradle.class);
		Greeting byeGreeting = context.getBean(ByeGradle.class);
		Greeting customGreeting = context.getBean(CustomGreeting.class);
		
		System.out.println("\n\n");
		helloGreeting.greet();
		byeGreeting.greet();
		customGreeting.greet();
		System.out.println("\n\n");
		
		context.close();
	}
}





