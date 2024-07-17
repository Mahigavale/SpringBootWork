package com.example.e2e6.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e2e6.Entity.Passengerdetails;

@Repository
public interface Passengerrepo extends JpaRepository <Passengerdetails,Integer> {

}
