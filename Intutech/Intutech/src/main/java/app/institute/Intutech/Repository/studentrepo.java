package app.institute.Intutech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.institute.Intutech.Entity.Student;

public interface studentrepo extends JpaRepository<Student,Integer>{

}
