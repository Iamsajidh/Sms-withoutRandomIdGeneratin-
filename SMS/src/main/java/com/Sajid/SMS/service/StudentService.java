package com.Sajid.SMS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sajid.SMS.model.Student;
import com.Sajid.SMS.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRespo;
	
	public Student createStudent(Student student)
	{
		return studentRespo.save(student);
	}
	
	public List<Student> getStudent()
	{
		return studentRespo.findAll();	
	}
	
	public void deleteStudent (int studentId)
	{
		studentRespo.deleteById(studentId);
	}
	
	public Student updateStudent(int studentId, Student studentDetails)
	{
		Student student = studentRespo.findById(studentId).get();
		student.setStudentId(studentDetails.getStudentId());
		student.setStudentName(studentDetails.getStudentName());
		student.setAddress(studentDetails.getAddress());
		return studentRespo.save(student);
		
	}

}
