package com.spring.core.lifecycles;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookWithInterface implements InitializingBean, DisposableBean{
	private String name;
	private double price;
	
	public BookWithInterface() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookWithInterface(String name, double price) {
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

	// will use interface for bean init & destroy method.
	public void afterPropertiesSet() throws Exception {
		// init method
		System.out.println("init method---------");
	}

	public void destroy() throws Exception {
		// destroy method
		System.out.println("destroy method--------");
		
	}
	

}
