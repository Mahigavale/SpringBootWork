package com.institute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Batch {

	
	@Id
	private int batch_id;
	
	private String batch_name;
	private String batch_coordinator;
	
	private String locality;
	
	@JoinColumn
	@OneToOne
	private Student student;

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public String getBatch_coordinator() {
		return batch_coordinator;
	}

	public void setBatch_coordinator(String batch_coordinator) {
		this.batch_coordinator = batch_coordinator;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
}
