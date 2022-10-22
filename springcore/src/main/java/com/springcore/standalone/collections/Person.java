package com.springcore.standalone.collections;

import java.util.*;

public class Person {
	private List<String> friends;
	private Map<String, Integer> fee;
	private Properties properties;
	
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	

	public Map<String, Integer> getFee() {
		return fee;
	}

	public void setFee(Map<String, Integer> fee) {
		this.fee = fee;
	}

	
}
