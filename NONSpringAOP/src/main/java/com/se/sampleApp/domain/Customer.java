package com.se.sampleApp.domain;

public class Customer {
	String customerId;

	String name;
	String address;
	long age;

	public Customer(String name, String address, long age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAge() {
		return age;
	}

	public void setAge(long age) {
		this.age = age;
	}

}
