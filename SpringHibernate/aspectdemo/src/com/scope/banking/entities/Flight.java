package com.scope.banking.entities;

import java.util.Date;




public class Flight {
	
	private int flightCode;
		
	private String serviceProvider;
	
	private int capacity;
	

	
	private Date DOP;
	
	private String location;
	
	public int getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(int flightCode) {
		this.flightCode = flightCode;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public Date getDOP() {
		return DOP;
	}
	public void setDOP(Date dOP) {
		DOP = dOP;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
