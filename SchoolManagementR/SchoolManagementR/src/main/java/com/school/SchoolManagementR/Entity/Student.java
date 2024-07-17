package com.school.SchoolManagementR.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Student {
	
	@jakarta.persistence.Id
	private int studentid;
	
	private String studentname;
	private String studentgrade;
	private String studentcity;
	private float studentpercentage;
	
	@JoinColumn(name="school")
	@ManyToOne
	private Schoolmanagement schoolmanagement;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentgrade() {
		return studentgrade;
	}

	public void setStudentgrade(String studentgrade) {
		this.studentgrade = studentgrade;
	}

	public String getStudentcity() {
		return studentcity;
	}

	public void setStudentcity(String studentcity) {
		this.studentcity = studentcity;
	}

	public float getStudentpercentage() {
		return studentpercentage;
	}

	public void setStudentpercentage(float studentpercentage) {
		this.studentpercentage = studentpercentage;
	}

	public Schoolmanagement getSchoolmanagement() {
		return schoolmanagement;
	}

	public void setSchoolmanagement(Schoolmanagement schoolmanagement) {
		this.schoolmanagement = schoolmanagement;
	}
	
	

}
