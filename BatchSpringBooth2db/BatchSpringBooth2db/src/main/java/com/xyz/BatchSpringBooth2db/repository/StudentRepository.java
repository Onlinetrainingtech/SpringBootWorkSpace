package com.xyz.BatchSpringBooth2db.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.BatchSpringBooth2db.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> 
{
   
}
