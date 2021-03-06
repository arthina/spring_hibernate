package com.lnt.entity;

public class EmployeeDetail {
	private long employeeid;
	private int streetno;
	private String streetname;
	private String city;
	private String country;
	
	private Employee employee;
	
	public EmployeeDetail()
	{
		
	}

	public long getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(long employeeid) {
		this.employeeid = employeeid;
	}

	public int getStreetno() {
		return streetno;
	}

	public void setStreetno(int streetno) {
		this.streetno = streetno;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
}
