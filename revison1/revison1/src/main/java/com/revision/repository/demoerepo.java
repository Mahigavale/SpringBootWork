package com.revision.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revision.entity.demoe;

@Repository
public interface demoerepo extends JpaRepository<demoe,Integer> {

}
