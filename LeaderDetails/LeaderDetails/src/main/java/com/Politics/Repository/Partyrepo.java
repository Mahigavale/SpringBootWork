package com.Politics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Politics.Entity.Party;

@Repository
public interface Partyrepo extends JpaRepository<Party,Integer>{

}
