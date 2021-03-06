package com.scope.banking.entity;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	
	private int customerId;
	private String name;
	
	private Address permAddress;
	
	private Address commnAddress;
	private Date dob;
	private ContactInfo contactInfo;
	
	@Autowired
	private Account account1;

	public int getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public Address getPermAddress() {
		return permAddress;
	}
	public Address getCommnAddress() {
		return commnAddress;
	}
	public Date getDob() {
		return dob;
	}
	public ContactInfo getContactInfo() {
		return contactInfo;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name
				+ ", permAddress=" + permAddress + ", commnAddress="
				+ commnAddress + ", dob=" + dob + ", contactInfo="
				+ contactInfo + ", account=" + account1 + "]";
	}
	@Autowired
	public Customer(int customerId, String name, Address permAddress,
			Address commnAddress, Date dob, ContactInfo contactInfo) {
		this.customerId = customerId;
		this.name = name;
		this.permAddress = permAddress;
		this.commnAddress = commnAddress;
		this.dob = dob;
		this.contactInfo = contactInfo;
	}
	
	

}
