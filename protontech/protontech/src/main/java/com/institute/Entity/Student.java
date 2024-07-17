package com.institute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	
	@Id
	private int student_id;
	private String student_name;
	private String fees_update;
	private Address address;
	private String placement;
	private String package_in_lpa;
	public String getPlacement() {
		return placement;
	}
	public void setPlacement(String placement) {
		this.placement = placement;
	}
	public String getPackage_in_lpa() {
		return package_in_lpa;
	}
	public void setPackage_in_lpa(String package_in_lpa) {
		this.package_in_lpa = package_in_lpa;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getFees_update() {
		return fees_update;
	}
	public void setFees_update(String fees_update) {
		this.fees_update = fees_update;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
}
