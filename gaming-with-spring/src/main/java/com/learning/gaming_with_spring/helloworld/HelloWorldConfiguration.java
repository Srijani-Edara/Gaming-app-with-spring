package com.learning.gaming_with_spring.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

record Address(String Street, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Srijani";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean
	public Person person() {
		return new Person("Rosey", 23, new Address("east street", "Guntur"));
	}
	
	@Bean
	public Person person2() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Address address() {
		return new Address("230 village line", "Manchester");
	}
	
}
