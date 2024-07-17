package com.School.SunriseSchool.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.School.SunriseSchool.Entity.ClassD;
import com.School.SunriseSchool.Repository.ClassRepo;

@RestController
public class ClassDController {
	
	@Autowired
	ClassRepo repo1;
	
	
	@PostMapping("/add-class")
	public String addclass(@RequestBody ClassD classd)
	{
		repo1.save(classd);
		return "the class with the id"+classd.getClass_id()+"added sucessfully..!";
	}
	
	@GetMapping("/get-all-classes")
	public List<ClassD> getallclasses()
	{
		return repo1.findAll();
	}
	
	@PutMapping("/update-the-class")
	public String updateclass()
	{
		return "the class is updated sucessfully....!";
	}
    
	@DeleteMapping("/delete-the-class")
	public String deleteclass(@RequestParam("id") int id)
	{
		repo1.deleteById(id);
		return "the class with the id"+id+"is deleted sucessfully..!";
	}
}
