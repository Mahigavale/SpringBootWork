package com.sports.bcci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sports.bcci.repository.playerdetailsrepo;

@RestController
public class playerdetailscontroller {

	
	@Autowired
	playerdetailsrepo repo1;
	
}
