package com.spring.core.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.core.javaconfig") // need only if component tag is used.
public class AppConfig {
	
	@Bean(name={"student", "temp"}) // not method name would be bean id
	public Student getStudent() {
		return new Student(getAddress());
	}

	@Bean // not method name would be bean id
	public Address getAddress() {
		return new Address("Jodhpur");
	}
}
