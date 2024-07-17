package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.Entity.directors;

@Repository
public interface directorrepo extends JpaRepository<directors,Integer> {

}
