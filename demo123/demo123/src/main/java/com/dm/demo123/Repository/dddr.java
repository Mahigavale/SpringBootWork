package com.dm.demo123.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dm.demo123.entity.ddd;

@Repository
public interface dddr extends JpaRepository<ddd,Integer>{

}
