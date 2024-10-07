package com.spring.core.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("point")

public class Point {

	@Value("#{11+22}")
	private int x;

	@Value("#{45+23}")
	private int y;
	
	// Calling static method of some class.
	@Value("#{ T(java.lang.Math).sqrt(25)}")
	private int z;
	
	// Calling variables of some class.
	@Value("#{ T(java.lang.Math).PI}")
	private double w;
	
	// Creating new object of a class.
	@Value("#{new String('Kushal')}")
	private String name;
	
	@Value("#{3>2}")
	private boolean bool;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public double getW() {
		return w;
	}
	
	public void setW(double w) {
		this.w = w;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", z=" + z + ", w=" + w + ", name=" + name + ", bool=" + bool + "]";
	}

}
