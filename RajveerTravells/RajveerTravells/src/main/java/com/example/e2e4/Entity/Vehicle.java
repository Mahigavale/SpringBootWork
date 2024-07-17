package com.example.e2e4.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vehicle {
	
	private int vehicle_id;
	private String vehicle_name;
	private String driver_id;
	private String driver_mobile;
	private  double vehicle_revenue;
	
	 @Temporal(TemporalType.DATE)
	private Date vehicle_servicing;

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_name() {
		return vehicle_name;
	}

	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}

	public String getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(String driver_id) {
		this.driver_id = driver_id;
	}

	public String getDriver_mobile() {
		return driver_mobile;
	}

	public void setDriver_mobile(String driver_mobile) {
		this.driver_mobile = driver_mobile;
	}

	public double getVehicle_revenue() {
		return vehicle_revenue;
	}

	public void setVehicle_revenue(double vehicle_revenue) {
		this.vehicle_revenue = vehicle_revenue;
	}

	public Date getVehicle_servicing() {
		return vehicle_servicing;
	}

	public void setVehicle_servicing(Date vehicle_servicing) {
		this.vehicle_servicing = vehicle_servicing;
	}
	 

}
