package com.revised.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revised.entity.Books;
import com.revised.repository.BookRepo;

@RestController
public class BookController {
	
	@Autowired
	private BookRepo repo2;
	
	@PostMapping("/add-books")
	public String addbooks(@RequestBody Books book)
	{
		repo2.save(book);
		
		return "the book with the name :"+book.getBook_name()+"added sucessfully..!";
	}
	
	@GetMapping("/get-all-books")
	public List<Books> getallbooks()
	{
		return repo2.findAll();
		
	}
	
	@DeleteMapping("/delete-by-id")
	public String deletebyid(@RequestParam("id") int id)
	{
		repo2.deleteById(id);
		return "the book with the id :"+ id+"is deleted sucessfully...!";
	}
	
   @PutMapping("/update-book")
   public String updatebook()
   {
	   return "the book is updated sucessfully....!";
   }
}
