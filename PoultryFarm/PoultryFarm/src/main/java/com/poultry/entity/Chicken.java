package com.poultry.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="chickentable")
public class Chicken {

	@Id
	private int id;
	private LocalDate vaccination;
	private float weight;
	private int price;
	
	@JoinColumn(name="lookedby")
	@ManyToOne
	@JsonBackReference
	private Worker worker;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getVaccination() {
		return vaccination;
	}

	public void setVaccination(LocalDate vaccination) {
		this.vaccination = vaccination;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	
	
	
	

}
