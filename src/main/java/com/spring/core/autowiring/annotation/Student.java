package com.spring.core.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	// property injection
	@Autowired
	@Qualifier("address2") // which specific bean to be picked up when multiple bean defined for ref.
	private Address address;
	
	public Student() {
	
	}

	// constuctor injection
	// @Autowired
	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	public Address getAddress() {
		return address;
	}
	
	// setter injection
	// @Autowired
	public void setAddress(Address address) {
		System.out.println("Setter Injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	

}
