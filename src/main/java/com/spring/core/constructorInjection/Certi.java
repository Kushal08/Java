package com.spring.core.constructorInjection;

public class Certi {
	
	private String name;

	public Certi() {
		
	}
	
	public Certi(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}
	
	

}
