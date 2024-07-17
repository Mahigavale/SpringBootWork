package com.example.e2e5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.e2e5.entity.PassengerAddressEntity;
@Repository
public interface Addressrepo extends JpaRepository<PassengerAddressEntity,Integer> {

}
