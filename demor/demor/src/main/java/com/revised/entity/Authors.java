package com.revised.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Authors {
    
	
	@Id
	private int author_id;
	private String author_name;
	private String author_email;
	private String author_city;
	
	
	@OneToMany(mappedBy="author")
	@JsonManagedReference
	private List<Books> Books;
	public List<Books> getBooks() {
		return Books;
	}
	public void setBooks(List<Books> books) {
		Books = books;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getAuthor_email() {
		return author_email;
	}
	public void setAuthor_email(String author_email) {
		this.author_email = author_email;
	}
	public String getAuthor_city() {
		return author_city;
	}
	public void setAuthor_city(String author_city) {
		this.author_city = author_city;
	}
	
	
	
}
