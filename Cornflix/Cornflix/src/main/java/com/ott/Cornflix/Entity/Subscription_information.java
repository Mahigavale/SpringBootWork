package com.ott.Cornflix.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Subscription_information {

	
	
	@Id
	private String sub_id;
	private int sub_charges;
	private Date sub_due_date;
	private String card_details;
	private String sub_plan_name;
	
	@OneToOne
	@JoinColumn
	private Login login;

	public String getSub_id() {
		return sub_id;
	}

	public void setSub_id(String sub_id) {
		this.sub_id = sub_id;
	}

	public int getSub_charges() {
		return sub_charges;
	}

	public void setSub_charges(int sub_charges) {
		this.sub_charges = sub_charges;
	}

	public Date getSub_due_date() {
		return sub_due_date;
	}

	public void setSub_due_date(Date sub_due_date) {
		this.sub_due_date = sub_due_date;
	}

	public String getCard_details() {
		return card_details;
	}

	public void setCard_details(String card_details) {
		this.card_details = card_details;
	}

	public String getSub_plan_name() {
		return sub_plan_name;
	}

	public void setSub_plan_name(String sub_plan_name) {
		this.sub_plan_name = sub_plan_name;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	
	
}
