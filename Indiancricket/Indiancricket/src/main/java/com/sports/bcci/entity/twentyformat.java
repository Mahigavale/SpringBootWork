package com.sports.bcci.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class twentyformat {
    
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int format_id;
	private int matches;
	private double runs;
	private int centuries;
	private int half_centuries;
	private int ducks;
	private int catches;
	private double average;
	private int icc_ranking;
	
	@JoinColumn
	@OneToOne
	private playerdetails pd;
	
	public playerdetails getPd() {
		return pd;
	}
	public void setPd(playerdetails pd) {
		this.pd = pd;
	}
	public int getFormat_id() {
		return format_id;
	}
	public void setFormat_id(int format_id) {
		this.format_id = format_id;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public double getRuns() {
		return runs;
	}
	public void setRuns(double runs) {
		this.runs = runs;
	}
	public int getCenturies() {
		return centuries;
	}
	public void setCenturies(int centuries) {
		this.centuries = centuries;
	}
	public int getHalf_centuries() {
		return half_centuries;
	}
	public void setHalf_centuries(int half_centuries) {
		this.half_centuries = half_centuries;
	}
	public int getDucks() {
		return ducks;
	}
	public void setDucks(int ducks) {
		this.ducks = ducks;
	}
	public int getCatches() {
		return catches;
	}
	public void setCatches(int catches) {
		this.catches = catches;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getIcc_ranking() {
		return icc_ranking;
	}
	public void setIcc_ranking(int icc_ranking) {
		this.icc_ranking = icc_ranking;
	}
	
}
