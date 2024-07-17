package com.example.e2e5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.e2e5.entity.PassengerEntity;

@Repository
public interface Passengerrepo extends JpaRepository<PassengerEntity,Integer> {
    
	//  here we have used the hql.Remeber while using the hql use the entity names  and not the actual table names and also we can not use the select * from command in hql.
	
	@Query(value="update Passengerentity set  boarding_point= :nm where passenger_id= :mn;")
	void updatepassengerbyid(@Param("nm")String nm,@Param ("mn")int mn);
	
	
	@Query(value="delete  from Passengerentity where passenger_id= :id ;")
	void deletepassengerbyid(@Param("id") int id);
}
