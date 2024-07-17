package com.sports.bcci.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class playerdetails {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int player_id;
	private String player_name;
	private int player_jersy;
	private String player_state;
	
	
	
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getPlayer_jersy() {
		return player_jersy;
	}
	public void setPlayer_jersy(int player_jersy) {
		this.player_jersy = player_jersy;
	}
	public String getPlayer_state() {
		return player_state;
	}
	public void setPlayer_state(String player_state) {
		this.player_state = player_state;
	}
	
	
	
}
