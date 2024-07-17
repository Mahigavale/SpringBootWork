package com.Politics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Politics.Entity.Leader;

@Repository
public interface Leaderrepo extends JpaRepository<Leader,Integer> {

}
