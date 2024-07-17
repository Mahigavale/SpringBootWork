package com.School.SunriseSchool.Entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ClassD {

	
	@Id
	private int class_id;
	
	private String class_level;
	private String class_location;
	private int class_strength;
	
	@JsonManagedReference
	@OneToMany(mappedBy="classd")
	private Set<Teacher> Teacher;
	
	@JsonManagedReference
	@OneToMany(mappedBy="classd")
	private Set<Student> Student;
	
	
	public Set<Student> getStudent() {
		return Student;
	}
	public void setStudent(Set<Student> student) {
		Student = student;
	}
	public Set<Teacher> getTeacher() {
		return Teacher;
	}
	public void setTeacher(Set<Teacher> teacher) {
		Teacher = teacher;
	}
	public int getClass_id() {
		return class_id;
	}
	public void setClass_id(int class_id) {
		this.class_id = class_id;
	}
	public String getClass_level() {
		return class_level;
	}
	public void setClass_level(String class_level) {
		this.class_level = class_level;
	}
	public String getClass_location() {
		return class_location;
	}
	public void setClass_location(String class_location) {
		this.class_location = class_location;
	}
	public int getClass_strength() {
		return class_strength;
	}
	public void setClass_strength(int class_strength) {
		this.class_strength = class_strength;
	}
	
	
}
