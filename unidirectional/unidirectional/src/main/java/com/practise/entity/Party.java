package com.practise.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Party {

	   @Id
	   private int partyid;
	   private String partyname;
	   private String partyideology;
	   
	   @JoinColumn(name="leader_id")
	   @ManyToOne
	   @JsonBackReference
	   private Leader leader;

	public int getPartyid() {
		return partyid;
	}

	public void setPartyid(int partyid) {
		this.partyid = partyid;
	}

	public String getPartyname() {
		return partyname;
	}

	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}

	public String getPartyideology() {
		return partyideology;
	}

	public void setPartyideology(String partyideology) {
		this.partyideology = partyideology;
	}

	public Leader getLeader() {
		return leader;
	}

	public void setLeader(Leader leader) {
		this.leader = leader;
	}
	   
	   
}
