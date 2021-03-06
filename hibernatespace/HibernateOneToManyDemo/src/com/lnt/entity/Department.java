package com.lnt.entity;

import java.util.HashSet;
import java.util.Set;

public class Department {
	
	private Long deptid;
	private String deptname;
	
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Long getDeptid() {
		return deptid;
	}

	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
	

}
