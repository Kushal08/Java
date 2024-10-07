package com.spring.core.collections.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	
	
	private List<String> friends;
	private Map<String, Integer> fees;
	private Properties props;
	
	public Emp() {
		
	}

	public List<String> getFriends() {
		return friends;
	}
	
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, Integer> getFees() {
		return fees;
	}
	
	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	public Properties getProps() {
		return props;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}
	
	@Override
	public String toString() {
		return "Emp [friends=" + friends + ", fees=" + fees + ", props=" + props + "]";
	}
	
	

}
