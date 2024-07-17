package com.datavalidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datavalidation.entity.employee;

@Repository
public interface employeerepo extends JpaRepository<employee,Integer> {

}
