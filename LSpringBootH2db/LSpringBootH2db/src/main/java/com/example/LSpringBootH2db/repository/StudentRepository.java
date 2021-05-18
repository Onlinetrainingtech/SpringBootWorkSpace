package com.example.LSpringBootH2db.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.LSpringBootH2db.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> 
{
   
}
