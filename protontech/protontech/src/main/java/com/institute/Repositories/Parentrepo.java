package com.institute.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.Entity.Parents;

@Repository
public interface Parentrepo extends JpaRepository<Parents,Integer> {

}
