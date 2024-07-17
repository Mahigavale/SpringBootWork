package com.school.SchoolManagementR.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.SchoolManagementR.Entity.Student;

public interface studentrepo extends JpaRepository<Student,Integer> {

}
