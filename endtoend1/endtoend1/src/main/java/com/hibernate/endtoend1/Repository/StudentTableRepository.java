package com.hibernate.endtoend1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.endtoend1.Entity.StudentTable;

@Repository
public interface StudentTableRepository  extends JpaRepository <StudentTable,Integer>{

}
