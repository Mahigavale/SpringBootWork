package com.endtoend3.demoe2e3.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.endtoend3.demoe2e3.Repository.tvrepo;
import com.endtoend3.demoe2e3.entity.Tvproduct;

@RestController
public class tvcontroller {

	@Autowired
	tvrepo repo;
	
	@PostMapping("/add-tv")
	public String addtv(@RequestBody Tvproduct tv)
	{
		repo.save(tv);
		return "tv added sucessfully.....";
	}
	
	@DeleteMapping("/delete-tv")
	public String deletetv(@RequestParam("id") int id)
	{
		repo.deleteById(id);
		return "tv deleted sucessfully...";
	}
	
	@GetMapping("/show-tvs")
	public List<Tvproduct> showalltv()
	{
		return repo.findAll();
	}
	
	
	@GetMapping("/show-tv-by-id/{id}")
	public Tvproduct findtv(@RequestParam(value="id") int id)
	{
		return repo.findById(id).get();
	}
	@GetMapping("/sql")
	public List<Tvproduct> sqlq(@RequestParam("nm") String nm)
	{
		//return repo.findtv(nm);
		return repo.findtvbyhql(nm);
	}
}
