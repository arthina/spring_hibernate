package com.lnt.entity;

public class Employee {
	
	
	private Long id;
	private String firstname;
	private String lastname;
	
	private EmployeeDetail employeeDetail;
		public Employee()
		{
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public EmployeeDetail getEmployeeDetail() {
			return employeeDetail;
		}
		public void setEmployeeDetail(EmployeeDetail employeeDetail) {
			this.employeeDetail = employeeDetail;
		}
	
	

}
