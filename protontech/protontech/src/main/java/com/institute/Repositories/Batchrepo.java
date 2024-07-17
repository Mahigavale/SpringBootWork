package com.institute.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.Entity.Batch;

@Repository
public interface Batchrepo extends JpaRepository<Batch,Integer> {

}
