package com.spring.core.constructorInjection;

import java.util.List;

public class Person {

	private String name;
	private int personId;
	private Certi certi;
	private List<String> friends;


	public Person(String name, int personId, Certi certi, List<String> friends) {
		System.out.println("Calling Person's Constructor");
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.friends = friends;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + ", friends=" + friends + "]";
	}


	

}
