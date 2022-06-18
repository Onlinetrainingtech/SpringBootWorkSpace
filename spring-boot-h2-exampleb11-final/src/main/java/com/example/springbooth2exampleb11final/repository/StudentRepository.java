package com.example.springbooth2exampleb11final.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbooth2exampleb11final.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
