package com.spring.core.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("prototype")
public class Student {
	@Value("Kushal Jangid")
	private String sName;
	
	@Value("Jodhpur")
	private String city;
	
	// Spring regular expression language.
	@Value("#{mylist}")
	private List<String> friends;
	
	public String getCity() {
		return city;
	}
	
	public String getsName() {
		return sName;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setsName(String sName) {
		this.sName = sName;
	}

	public List<String> getFriends() {
		return friends;
	}
	
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", city=" + city + ", friends=" + friends + "]";
	}
	
}
