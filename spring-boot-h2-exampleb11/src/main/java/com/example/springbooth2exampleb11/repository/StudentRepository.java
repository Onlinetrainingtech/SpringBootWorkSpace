package com.example.springbooth2exampleb11.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springbooth2exampleb11.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
