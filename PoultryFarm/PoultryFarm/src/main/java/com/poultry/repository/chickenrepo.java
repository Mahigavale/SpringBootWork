package com.poultry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poultry.entity.Chicken;
import com.poultry.entity.Farm;

@Repository
public interface chickenrepo extends JpaRepository<Chicken,Integer> {

}
