package com.scope.banking.entity;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private long pinCode;
	
	public Address(String street, String city, String state, long pinCode) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state="
				+ state + ", pinCode=" + pinCode + "]";
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public long getPinCode() {
		return pinCode;
	}
	
	

}
