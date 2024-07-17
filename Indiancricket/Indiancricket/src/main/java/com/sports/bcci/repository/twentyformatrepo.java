package com.sports.bcci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.bcci.entity.twentyformat;
@Repository
public interface twentyformatrepo extends JpaRepository<twentyformat,Integer>{

}
