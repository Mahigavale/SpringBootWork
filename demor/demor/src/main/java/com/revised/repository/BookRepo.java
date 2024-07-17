package com.revised.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revised.entity.Books;

@Repository
public interface BookRepo extends JpaRepository<Books,Integer> {

}
