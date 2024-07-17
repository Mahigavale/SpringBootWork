package com.endtoend3.demoe2e3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.endtoend3.demoe2e3.entity.Tvproduct;
@Repository
public interface tvrepo extends JpaRepository<Tvproduct,Integer> {

	@Query(value=" select * from tvdetails where destination= :nm ;", nativeQuery=true)
	List<Tvproduct> findtv(@RequestParam("nm") String nm);
	
	@Query(value=" from Tvproduct where model_delievery= :mn")
	List<Tvproduct> findtvbyhql(@Param("mn") String mn);
}
