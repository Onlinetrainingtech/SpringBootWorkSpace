package com.example.springbooth2examplebatch2.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbooth2examplebatch2.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> 
{

}
