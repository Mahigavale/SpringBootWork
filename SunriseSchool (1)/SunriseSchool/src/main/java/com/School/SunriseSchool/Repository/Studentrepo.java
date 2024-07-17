package com.School.SunriseSchool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.School.SunriseSchool.Entity.Student;

public interface Studentrepo extends JpaRepository<Student,Integer> {

}
