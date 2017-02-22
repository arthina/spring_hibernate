package com.lnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name="TwoWheeler")
public class TwoWheeler extends Vehicle {
	
	@Column(length=20)
	private String steeringHandle;

	public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}
	

}
