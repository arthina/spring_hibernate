package com.scope.banking.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotEmpty;

@Entity
@Table(name="mvc_customer_tbl")
public class Customer {
	@Id
	@NumberFormat(style=Style.NUMBER)
	@NotEmpty(message="customerId must not be blank")
	@Column(name="customer_id")
	private int customerId;
	
	@NotEmpty
	@Size(min=5,max=20, message="Name must be between 5 and 20")
	@Column(name="name")
	private String name;
	
	//@NotEmpty(message="dob must not be blank")
	@Column(name="dob")
	private Date dob;
	
	@NotEmpty(message="address must not be blank")
	//@Column(name="address")
	private String address;
	
	@NotEmpty(message="phoneNo must not be blank")
	@Column(name="phone_no")
	private String phoneNo;
	
	@NotEmpty(message="emailId must not be blank")
	@Column(name="email_id")
	private String email;
	
	@Column(name="state_code")
	private int stateCode;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name
				+ ", dob=" + dob + ", address=" + address + ", phoneNo="
				+ phoneNo + ", email=" + email + ", stateCode=" + stateCode
				+ "]";
	}
	
	
}
