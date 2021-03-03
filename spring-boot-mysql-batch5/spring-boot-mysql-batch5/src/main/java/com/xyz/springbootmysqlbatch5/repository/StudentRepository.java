package com.xyz.springbootmysqlbatch5.repository;

import org.springframework.data.repository.CrudRepository;

import com.xyz.springbootmysqlbatch5.model.Student;



public interface StudentRepository extends CrudRepository<Student,Integer> 
{

}
