package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.Entity.branch;

@Repository
public interface branchrepo extends JpaRepository<branch,String> {

}
