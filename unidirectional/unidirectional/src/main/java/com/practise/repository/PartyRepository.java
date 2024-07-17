package com.practise.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.practise.entity.Party;

public interface PartyRepository extends JpaRepository<Party,Integer> {

	@Query(value="select * from party;", nativeQuery=true)
	 public List<Party> Selectall();
}
