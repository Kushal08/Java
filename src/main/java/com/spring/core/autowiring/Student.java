package com.spring.core.autowiring;

public class Student {
	private Address address;
	
	public Student() {
	
	}

	public Student(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Setter Injection");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	

}
