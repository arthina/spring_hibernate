package com.lnt.entity;

import java.util.HashSet;
import java.util.Set;

public class Meeting {
	
	private String meetingId;
	private String meetingType;
	
	private Set<Employee> employees = new HashSet<Employee>();

	public String getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
	}

	public String getMeetingType() {
		return meetingType;
	}

	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	

}
