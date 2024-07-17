package com.School.SunriseSchool.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.School.SunriseSchool.Entity.ClassD;

@Repository
public interface ClassRepo extends JpaRepository<ClassD,Integer> {

	
	@Query(value="update class set class_location= :l2 where class_id= :id1;", nativeQuery=true)
	public void updateclasslocation(@Param("l2") String l2, @Param("id1") int id1);
	
	@Query(value="update class set class_strength= :sr2 where class_id= :id1;" , nativeQuery=true)
	public void updateclassstrength(@Param("sr2") int sr2,@Param("id") int id);
	
}
