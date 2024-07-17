package com.sports.bcci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.bcci.entity.testformat;

@Repository
public interface testformatrepo extends JpaRepository<testformat,Integer> {

}
