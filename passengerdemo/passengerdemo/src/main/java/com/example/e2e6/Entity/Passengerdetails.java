package com.example.e2e6.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passengerdetails {
    
	
	@Id
	private int passenger_id;
	private String passenger_name;
	private String boarding_point;
	private String dropping_point;
	private int sit_number;
	private String transaction_number;
	
	@JoinColumn(name="a_id")
	@OneToOne
	private Addressdetails address;
	
	public Addressdetails getAddress() {
		return address;
	}
	public void setAddress(Addressdetails address) {
		this.address = address;
	}
	public int getPassenger_id() {
		return passenger_id;
	}
	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}
	public String getPassenger_name() {
		return passenger_name;
	}
	public void setPassenger_name(String passenger_name) {
		this.passenger_name = passenger_name;
	}
	public String getBoarding_point() {
		return boarding_point;
	}
	public void setBoarding_point(String boarding_point) {
		this.boarding_point = boarding_point;
	}
	public String getDropping_point() {
		return dropping_point;
	}
	public void setDropping_point(String dropping_point) {
		this.dropping_point = dropping_point;
	}
	public int getSit_number() {
		return sit_number;
	}
	public void setSit_number(int sit_number) {
		this.sit_number = sit_number;
	}
	public String getTransaction_number() {
		return transaction_number;
	}
	public void setTransaction_number(String transaction_number) {
		this.transaction_number = transaction_number;
	}
	
	
	
	
}
