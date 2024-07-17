package com.practise.demo21Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.demo21Services.getAddressService;

@RestController
//step 2 to create the controller to consume the service class.
public class getAddressController {

	@Autowired
	getAddressService cbm;
	//step 3 to add the respective dependacies into the given class.
	@GetMapping("/sdr")
	//localhost:8080/sdr?city=pune&divison=region
	 public String Showadd(@RequestParam("city") String city)
	 {
	//	String nn= cbm.SetAd(city, divison);
		return "your total address is"+cbm.SetAd(city);
	 }
	
	
}
