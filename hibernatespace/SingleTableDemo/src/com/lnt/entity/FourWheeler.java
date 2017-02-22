package com.lnt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity(name="FourWheeler")
public class FourWheeler  extends Vehicle{
	
	@Column(length=20)
	public String steeringWheel;

	public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

}
