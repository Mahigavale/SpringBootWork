package com.revised.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revised.entity.Authors;

@Repository
public interface AuthorRepo extends JpaRepository<Authors,Integer> {

}
