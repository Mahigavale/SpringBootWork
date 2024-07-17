package com.example.e2e5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e2e5.entity.DriverEntity;

@Repository
public interface Driverrepo extends JpaRepository<DriverEntity,Integer>{

}
