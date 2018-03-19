package com.codecramp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		LOG.info("Setting up application context");
		AnnotationConfigApplicationContext context = 
		          new AnnotationConfigApplicationContext(Application.class);
		LOG.info("Instantiating greeting instances");
		Greeting helloGreeting = context.getBean(HelloGradle.class);
		Greeting byeGreeting = context.getBean(ByeGradle.class);
		Greeting customGreeting = context.getBean(CustomGreeting.class);
		
		LOG.info("Invoking greetings");
		System.out.println("\n\n");
		helloGreeting.greet();
		byeGreeting.greet();
		customGreeting.greet();
		System.out.println("\n\n");
		
		LOG.info("Closing the Spring Context");
		context.close();
	}
}





