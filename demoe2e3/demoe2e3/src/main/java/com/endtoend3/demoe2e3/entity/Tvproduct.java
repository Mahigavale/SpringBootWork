package com.endtoend3.demoe2e3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tvdetails")
public class Tvproduct {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int model_id;
	private String model_name;
	private String model_company;
	private double model_price;
	@Column(name="destination")
	private  String model_delievery;
	public int getModel_id() {
		return model_id;
	}
	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public String getModel_company() {
		return model_company;
	}
	public void setModel_company(String model_company) {
		this.model_company = model_company;
	}
	public double getModel_price() {
		return model_price;
	}
	public void setModel_price(double model_price) {
		this.model_price = model_price;
	}
	public String getModel_delievery() {
		return model_delievery;
	}
	public void setModel_delievery(String model_delievery) {
		this.model_delievery = model_delievery;
	}
	
	
}

 