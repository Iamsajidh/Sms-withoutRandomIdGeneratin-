package com.Sajid.SMS.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Sajid.SMS.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {
	
	

}
