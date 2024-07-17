package com.example.e2e5.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PassengerEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int passengerId;
	private String gender;
	private int age;
	private String boarding_point;
	private String dropping_point;
	private String mobile_number;
	private String email_id;
	
	@JoinColumn(name="add_id")
	@OneToOne
	private PassengerAddressEntity psadd;

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public PassengerAddressEntity getPsadd() {
		return psadd;
	}

	public void setPsadd(PassengerAddressEntity psadd) {
		this.psadd = psadd;
	}
	
	
	
}
