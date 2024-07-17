package com.sports.bcci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.bcci.entity.playerdetails;

@Repository
public interface playerdetailsrepo extends JpaRepository<playerdetails,Integer>{

}
