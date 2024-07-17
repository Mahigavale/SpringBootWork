package com.ott.Cornflix.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ott.Cornflix.Entity.Subscription_information;
import com.ott.Cornflix.Repository.Subscription_Repo;

@Service
public class Subscription_information_Service {
	
	
	@Autowired
	private Subscription_Repo repo;
	
	
	public List<Subscription_information> timelinepassed(Date date)
	{
		return repo.findduedate(date);
	}
	
	
}
