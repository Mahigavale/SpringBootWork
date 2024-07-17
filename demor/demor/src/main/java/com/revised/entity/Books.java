package com.revised.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Books {

	
	@Id
	private int book_id;
	private String book_name;
	private LocalDate book_published_on;
	private String book_genre;
	
	@JoinColumn
	@ManyToOne
	@JsonBackReference
	private Authors author;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public LocalDate getBook_published_on() {
		return book_published_on;
	}

	public void setBook_published_on(LocalDate book_published_on) {
		this.book_published_on = book_published_on;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	public Authors getAuthor() {
		return author;
	}

	public void setAuthor(Authors author) {
		this.author = author;
	}
	
	
}
