package com.ott.Cornflix.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ott.Cornflix.Entity.Subscription_information;

@Repository
public interface Subscription_Repo extends JpaRepository<Subscription_information ,String> {

	@Query(value="select *from Subscription_information where sub_due_date < :date ",  nativeQuery=true)
	public List<Subscription_information> findduedate(@Param("date")Date date);
}
