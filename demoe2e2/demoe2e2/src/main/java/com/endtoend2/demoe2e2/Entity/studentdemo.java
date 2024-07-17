package com.endtoend2.demoe2e2.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class studentdemo {
      @Id
	private int stud_id;
	private String stud_name;
	private String stud_city;
	private float stud_percentage;
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_city() {
		return stud_city;
	}
	public void setStud_city(String stud_city) {
		this.stud_city = stud_city;
	}
	public float getStud_percentage() {
		return stud_percentage;
	}
	public void setStud_percentage(float stud_percentage) {
		this.stud_percentage = stud_percentage;
	}
	
	
}
