package com.School.SunriseSchool.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
    
	@Id
	private int student_id;
	private String student_name;
	private String student_class;
	private String student_contact;
	private String student_city;
	private String student_result;
	
	@JoinColumn
	@ManyToOne
	@JsonBackReference
	private ClassD classd;

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

	public String getStudent_class() {
		return student_class;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	public String getStudent_contact() {
		return student_contact;
	}

	public void setStudent_contact(String student_contact) {
		this.student_contact = student_contact;
	}

	public String getStudent_city() {
		return student_city;
	}

	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}

	public String getStudent_result() {
		return student_result;
	}

	public void setStudent_result(String student_result) {
		this.student_result = student_result;
	}

	public ClassD getClassd() {
		return classd;
	}

	public void setClassd(ClassD classd) {
		this.classd = classd;
	}
	
	
	
	
}
