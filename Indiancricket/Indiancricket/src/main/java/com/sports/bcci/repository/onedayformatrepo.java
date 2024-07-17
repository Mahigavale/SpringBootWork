package com.sports.bcci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.bcci.entity.onedayformat;

@Repository
public interface onedayformatrepo extends JpaRepository<onedayformat,Integer> {

}
