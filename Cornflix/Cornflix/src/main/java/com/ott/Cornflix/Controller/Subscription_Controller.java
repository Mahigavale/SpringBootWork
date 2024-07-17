package com.ott.Cornflix.Controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ott.Cornflix.Entity.Subscription_information;
import com.ott.Cornflix.Service.Subscription_information_Service;


@CrossOrigin(allowedHeaders="*")
@RestController
public class Subscription_Controller {

	
	@Autowired
	private Subscription_information_Service service;
	
	
	public List<Subscription_information> getbillingdate(@RequestParam("date") Date date)
	{
		
		
		return (service.timelinepassed(date));
	}
	
}
