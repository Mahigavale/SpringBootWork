package com.poultry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poultry.entity.Worker;

@Repository
public interface workerrepo extends JpaRepository<Worker,Integer> {

}
