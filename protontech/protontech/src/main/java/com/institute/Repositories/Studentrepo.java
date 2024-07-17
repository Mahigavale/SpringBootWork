package com.institute.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.Entity.Student;

@Repository
public interface Studentrepo  extends JpaRepository<Student,Integer>{

}
