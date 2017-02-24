package com.scope.banking.inheritence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="user_tbl")
@Inheritance(strategy=InheritanceType.JOINED)
public class User {

	@Id
	@Column(name="mobile_no")
	private long mobileNo;
	
	@Column(name="email_id")
	private String emaiId;
	
	@Column(name="name")
	private String name;

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmaiId() {
		return emaiId;
	}

	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
