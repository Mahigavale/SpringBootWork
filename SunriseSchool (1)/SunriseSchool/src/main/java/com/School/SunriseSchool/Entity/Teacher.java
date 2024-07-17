package com.School.SunriseSchool.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="teacher")
public class Teacher {
	
	@Id
	private int teacher_id;
	
	private String teacher_name;
	private String teacher_contcat;
	private String teacher_location;
	private String teacher_feedback;
	
	@Column(name="level", nullable=false)
	private String teacher_salary_level;
	
	   @JoinColumn(name="class_id")
	   @ManyToOne
	   @JsonBackReference 
	   private ClassD classd;
	   
	
	public ClassD getClassd() {
		return classd;
	}
	public void setClassd(ClassD classd) {
		this.classd = classd;
	}
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public String getTeacher_contcat() {
		return teacher_contcat;
	}
	public void setTeacher_contcat(String teacher_contcat) {
		this.teacher_contcat = teacher_contcat;
	}
	public String getTeacher_location() {
		return teacher_location;
	}
	public void setTeacher_location(String teacher_location) {
		this.teacher_location = teacher_location;
	}
	public String getTeacher_feedback() {
		return teacher_feedback;
	}
	public void setTeacher_feedback(String teacher_feedback) {
		this.teacher_feedback = teacher_feedback;
	}
	public String getTeacher_salary_level() {
		return teacher_salary_level;
	}
	public void setTeacher_salary_level(String teacher_salary_level) {
		this.teacher_salary_level = teacher_salary_level;
	}
	
	

}
