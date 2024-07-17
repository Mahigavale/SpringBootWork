package com.hibernate.endtoend1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentTable {
	
	@Id
	private int student_id;
	private int student_age;
	private double student_percent;
	private String student_name;
	private String student_city;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getStudent_age() {
		return student_age;
	}
	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}
	public double getStudent_percent() {
		return student_percent;
	}
	public void setStudent_percent(double student_percent) {
		this.student_percent = student_percent;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_city() {
		return student_city;
	}
	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}

}
