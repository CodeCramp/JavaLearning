package com.codecramp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		HelloGradle helloGreeting = context.getBean(HelloGradle.class);
		ByeGradle byeGreeting = context.getBean(ByeGradle.class);
		CustomGreeting customGreeting = context.getBean(CustomGreeting.class);
		
		System.out.println("\n\n");
		helloGreeting.greet();
		byeGreeting.greet();
		customGreeting.greet();
		System.out.println("\n\n");
		
		context.close();
	}
}





