package com.spring.core.constructorInjection;

public class AmbigiousCall {
	private int a;
	private int b;

	public AmbigiousCall(double a, double b)
	{
		System.out.println("Constructor: double, double");
		this.a = (int) a;
		this.b = (int) b;
	}
	
	public AmbigiousCall(int a, int b)
	{
		System.out.println("Constructor: int, int");
		this.a = a;
		this.b = b;
	}
	
	
	public AmbigiousCall(String a, String b)
	{
		System.out.println("Constructor: String, String");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
	}
	
	public void doSum() {
		System.out.println("this->a :"+this.a);
		System.out.println("Sum is :"+ (this.a+this.b));
	}

}
