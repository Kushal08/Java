package com.spring.core.javaconfig;

import org.springframework.stereotype.Component;

//@Component // If removed, need to define same in AppConfig.
public class Student {
	
	private Address address;
	
	public Student(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void study() {
		System.out.println("Student is studying...");
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	

}
