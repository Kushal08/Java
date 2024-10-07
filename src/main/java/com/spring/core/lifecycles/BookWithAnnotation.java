package com.spring.core.lifecycles;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BookWithAnnotation {
	private String name;
	private double price;
	
	public BookWithAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookWithAnnotation(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}

	
	@PostConstruct
	public void start() {
		System.out.println("Starting....");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending....");
	}
	

}
