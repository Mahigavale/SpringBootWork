package com.jdbc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdbc.Entity.product;
@Repository
public interface ProductRepo extends JpaRepository<product,Integer> {

}
