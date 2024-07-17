package com.revised.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revised.entity.Authors;
import com.revised.repository.AuthorRepo;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorRepo repo1 ;
	
	@PostMapping("/add-author")
	public String addauth(@RequestBody Authors author) {
		
		repo1.save(author);
		return "the author with the name:"+author.getAuthor_name()+"is added sucessfully...!";
	}
	
	@GetMapping("/get-all-authors")
	public List<Authors> getallauthors()
	{
		return repo1.findAll();
	}
	
	@DeleteMapping("/delete-author-by-id")
	public String deleteauthor(@RequestParam("id") int id)
	{
		repo1.deleteById(id);
		return "the author with the id"+id+"is deleted sucessfully...!";
	}
	

}
