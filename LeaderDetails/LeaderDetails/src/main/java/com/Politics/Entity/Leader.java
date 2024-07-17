package com.Politics.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Leader {

	
	@Id
	private int leader_id;
	
	private String leader_name;
	private String leader_consituency;
	private String leader_state;
	
	@JoinColumn(name="party_id")
	@ManyToOne
	@JsonBackReference
	private Party party;
	
	public Party getParty() {
		return party;
	}
	public void setParty(Party party) {
		this.party = party;
	}
	public int getLeader_id() {
		return leader_id;
	}
	public void setLeader_id(int leader_id) {
		this.leader_id = leader_id;
	}
	public String getLeader_name() {
		return leader_name;
	}
	public void setLeader_name(String leader_name) {
		this.leader_name = leader_name;
	}
	public String getLeader_consituency() {
		return leader_consituency;
	}
	public void setLeader_consituency(String leader_consituency) {
		this.leader_consituency = leader_consituency;
	}
	public String getLeader_state() {
		return leader_state;
	}
	public void setLeader_state(String leader_state) {
		this.leader_state = leader_state;
	}
	
	
}
