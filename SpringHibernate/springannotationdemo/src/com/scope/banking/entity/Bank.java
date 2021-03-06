package com.scope.banking.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

public class Bank {

	private String bankCode;
	private String name;
	@Autowired
	@Qualifier(value="customer2")
	//@Qualifier("customer2")
	private Customer customer;
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/
	@Override
	public String toString() {
		return "Bank [bankCode=" + bankCode + ", name=" + name + ", customer="
				+ customer + "]";
	}
	
	@Bean
	public DataSource getInstance() {
		return new DataSource();
	}
	
}
