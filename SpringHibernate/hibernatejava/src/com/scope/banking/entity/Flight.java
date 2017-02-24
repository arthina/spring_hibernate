package com.scope.banking.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="makemytrip_flight")
public class Flight {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="flight_code")
	private int flightCode;
	
	@Column(name="service_provider", length=120, nullable=false)
	private String serviceProvider;
	
	@Column(name="capacity")
	private int capacity;
	
	@Enumerated(EnumType.STRING)
	@Column(name="flight_status")
	private FlightStatus flightStatus;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date_of_purchase")
	private Date DOP;

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

	public FlightStatus getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(FlightStatus flightStatus) {
		this.flightStatus = flightStatus;
	}

	public Date getDOP() {
		return DOP;
	}

	public void setDOP(Date dOP) {
		DOP = dOP;
	}

	@Override
	public String toString() {
		return "Flight [flightCode=" + flightCode + ", serviceProvider="
				+ serviceProvider + ", capacity=" + capacity
				+ ", flightStatus=" + flightStatus + ", DOP=" + DOP + "]";
	}
	
}
