package com.poultry.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="workertable")
public class Worker {
     
	@Id
	private int id;
	private String name;
	private String contact;
	private double salary;
	
	@JoinColumn(name="fid")
	@JsonBackReference
	@ManyToOne
	private Farm farm;

	@JsonManagedReference
	@OneToMany(mappedBy="worker")
	private List<Chicken> chicken;
	public List<Chicken> getChicken() {
		return chicken;
	}

	public void setChicken(List<Chicken> chicken) {
		this.chicken = chicken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Farm getFarm() {
		return farm;
	}

	public void setFarm(Farm farm) {
		this.farm = farm;
	}
	
	
}
