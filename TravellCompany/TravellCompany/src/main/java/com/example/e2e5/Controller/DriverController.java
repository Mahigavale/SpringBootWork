package com.example.e2e5.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.e2e5.Repository.Driverrepo;

@RestController
public class DriverController {
	
	@Autowired
	Driverrepo repo2;

}
