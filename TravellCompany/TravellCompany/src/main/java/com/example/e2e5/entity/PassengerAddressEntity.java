package com.example.e2e5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddressTable")
public class PassengerAddressEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int address_id;
	private String city;
	private String apartments;
	private String lane;
	private String pincode;
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getApartments() {
		return apartments;
	}
	public void setApartments(String apartments) {
		this.apartments = apartments;
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
		
	
}
