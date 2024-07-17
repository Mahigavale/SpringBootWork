package com.institute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Parents {
	
	@Id
	private int parents_id;
	private String parent_city;
	private String parent_pincode;
	private String parent_mobile;
	
	@JoinColumn
	private Student student;

	public int getParents_id() {
		return parents_id;
	}

	public void setParents_id(int parents_id) {
		this.parents_id = parents_id;
	}

	public String getParent_city() {
		return parent_city;
	}

	public void setParent_city(String parent_city) {
		this.parent_city = parent_city;
	}

	public String getParent_pincode() {
		return parent_pincode;
	}

	public void setParent_pincode(String parent_pincode) {
		this.parent_pincode = parent_pincode;
	}

	public String getParent_mobile() {
		return parent_mobile;
	}

	public void setParent_mobile(String parent_mobile) {
		this.parent_mobile = parent_mobile;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
