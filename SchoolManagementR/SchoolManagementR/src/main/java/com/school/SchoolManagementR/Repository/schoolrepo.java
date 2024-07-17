package com.school.SchoolManagementR.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.SchoolManagementR.Entity.Schoolmanagement;

public interface schoolrepo extends JpaRepository<Schoolmanagement,Integer> {
	
	
	

}
