package com.scope.banking.entity;

import java.util.List;

public class Bank {

	private String bankCode;
	private String name;
	private List<Customer> customerList;
	
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
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	@Override
	public String toString() {
		return "\nBank [bankCode=" + bankCode + "\n, name=" + name + "\n, customerList="
				+ customerList + "\n]";
	}
}
