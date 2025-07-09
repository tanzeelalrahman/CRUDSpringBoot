package com.example.STUDENTCRUD1.repository;
import com.example.STUDENTCRUD1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
