package com.institute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.institute.Entity.student;

import jakarta.transaction.Transactional;

@Repository
public interface studentrepo extends JpaRepository<student,Integer > {

	@Modifying
	@Transactional
	@Query(value="update student set student_name=:nn where student_name= :on",nativeQuery=true)
	public int updatestudent(@Param("nn")String newn,@Param("on") String oldn);
	
	
	@Query(value="select * from student where student_city=:ct",nativeQuery=true)
	public List<student> getstudentbycity(@Param("ct") String city);
}
