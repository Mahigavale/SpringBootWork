package com.School.SunriseSchool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.School.SunriseSchool.Entity.Teacher;

import jakarta.transaction.Transactional;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
 
	
	@Modifying
	@Transactional
	@Query(value="update teacher set teacher_name= :nm2 where teacher_name= :nm1")
	public int updateteachername(@Param("nm2") String nm2,@Param("nm1") String nm1);
	
	@Modifying
	@Transactional
	@Query(value="update teacher set level=:lv2 where level=:lv1" ,nativeQuery=true)
	public int updateteachersalarylevel(@Param("lv2")String lv2,@Param("lv1")String lv1);
	
	@Modifying
	@Transactional
	@Query(value="update teacher set teacher_contcat= :nm2 where teacher_contcat= :nm1" ,nativeQuery=true)
	public int updateteachercontact(@Param("nm2") String nm2,@Param("nm1") String nm1);
}
