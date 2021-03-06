package com.lnt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


//@Entity(name="vehicle")
@Entity(name="vehicle2")                     
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)//single table s created and null value will be there
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)//separate table will be created for twowheeler and fourwheeler  and no joining s tr null value is avoided
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	
	
	@Id
	private String vehicleNo;
	private String vehicleModel;
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	
	
	
	

}
