package com.xyz.springbooth2examplebatch3.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.springbooth2examplebatch3.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> 
{

}
