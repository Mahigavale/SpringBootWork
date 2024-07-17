package com.example.e2e5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DriverTable")
public class DriverEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int driverid;
	private String driver_name;
	private String vehicle_id;
	private String conductor_name;
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getDriver_name() {
		return driver_name;
	}
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getConductor_name() {
		return conductor_name;
	}
	public void setConductor_name(String conductor_name) {
		this.conductor_name = conductor_name;
	}
	
	
}
