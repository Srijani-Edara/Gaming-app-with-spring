package com.learning.gaming_with_spring.helloworld;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		
		try (// Launch spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//Get bean from spring context
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address"));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person2"));
		} 
		catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
