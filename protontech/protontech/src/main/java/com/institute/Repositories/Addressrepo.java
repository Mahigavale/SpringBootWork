package com.institute.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.Entity.Address;

@Repository
public interface Addressrepo extends JpaRepository<Address,Integer> {

}
