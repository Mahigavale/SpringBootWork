package com.poultry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poultry.entity.Farm;
@Repository
public interface Farmrepo extends JpaRepository<Farm,Integer>{

}
