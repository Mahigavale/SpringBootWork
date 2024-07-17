package com.endtoend2.demoe2e2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.endtoend2.demoe2e2.Entity.studentdemo;
@Repository
public interface studentdemorepository extends JpaRepository<studentdemo,Integer> {

}
