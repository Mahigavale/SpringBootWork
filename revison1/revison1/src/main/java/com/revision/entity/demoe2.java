package com.revision.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class demoe2 {
    
	@Id
	private int id2;
	private String name2;
	
	@JoinColumn
	@OneToOne
	private demoe dm2;

	public int getId2() {
		return id2;
	}

	public void setId2(int id2) {
		this.id2 = id2;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public demoe getDm() {
		return dm2;
	}

	public void setDm(demoe dm2) {
		this.dm2 = dm2;
	}
	
	
}
