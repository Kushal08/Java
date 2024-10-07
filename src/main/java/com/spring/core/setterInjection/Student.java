package com.spring.core.setterInjection;

public class Student {

	private int studentId;
	private String sName;
	private String sAddress;
	
	public Student() {
	}

	
	public Student(int studentId, String sName, String sAddress) {
		super();
		this.studentId = studentId;
		this.sName = sName;
		this.sAddress = sAddress;
	}


	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Setting Student ID");
		this.studentId = studentId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		System.out.println("Setting Student Name");
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		System.out.println("Setting address");
		this.sAddress = sAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}

	
	
}
