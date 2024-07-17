package com.example.e2e6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e2e6.Entity.Addressdetails;

@Repository
public interface Addressrepo extends JpaRepository<Addressdetails,Integer> {

}
