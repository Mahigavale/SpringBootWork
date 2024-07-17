package com.poultry.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="farmtable")
public class Farm {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int farm_id;
	private String farm_name;
	private String farm_owner;
	private String farm_address;
	private String farm_pincode;
	
	@JsonManagedReference
	@OneToMany(mappedBy="farm")
	private List<Worker> worker;
	public List<Worker> getWorker() {
		return worker;
	}
	public void setWorker(List<Worker> worker) {
		this.worker = worker;
	}
	public int getFarm_id() {
		return farm_id;
	}
	public void setFarm_id(int farm_id) {
		this.farm_id = farm_id;
	}
	public String getFarm_name() {
		return farm_name;
	}
	public void setFarm_name(String farm_name) {
		this.farm_name = farm_name;
	}
	public String getFarm_owner() {
		return farm_owner;
	}
	public void setFarm_owner(String farm_owner) {
		this.farm_owner = farm_owner;
	}
	public String getFarm_address() {
		return farm_address;
	}
	public void setFarm_address(String farm_address) {
		this.farm_address = farm_address;
	}
	public String getFarm_pincode() {
		return farm_pincode;
	}
	public void setFarm_pincode(String farm_pincode) {
		this.farm_pincode = farm_pincode;
	}
	
	
}
