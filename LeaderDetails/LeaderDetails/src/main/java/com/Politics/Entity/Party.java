package com.Politics.Entity;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Party {

	
	@Id
	private int party_id;
	private String party_name;
	private String party_ideology;
	private LocalDate party_founded;
	
	@JsonManagedReference
	@OneToMany(mappedBy="party")
    private List<Leader> Leader;

	public int getParty_id() {
		return party_id;
	}

	public void setParty_id(int party_id) {
		this.party_id = party_id;
	}

	public String getParty_name() {
		return party_name;
	}

	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}

	public String getParty_ideology() {
		return party_ideology;
	}

	public void setParty_ideology(String party_ideology) {
		this.party_ideology = party_ideology;
	}

	public LocalDate getParty_founded() {
		return party_founded;
	}

	public void setParty_founded(LocalDate party_founded) {
		this.party_founded = party_founded;
	}

	public List<Leader> getLeader() {
		return Leader;
	}

	public void setLeader(List<Leader> leader) {
		Leader = leader;
	}

	
	
	
	
}
