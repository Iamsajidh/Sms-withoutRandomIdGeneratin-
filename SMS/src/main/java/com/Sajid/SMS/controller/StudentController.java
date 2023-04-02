package com.Sajid.SMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Sajid.SMS.model.Student;
import com.Sajid.SMS.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@RequestMapping(value = "/student" , method = RequestMethod.POST)
	public Student createStudent(@RequestBody Student student)
	{
		return studentService.createStudent(student);
	}
	
	@RequestMapping(value="/student", method = RequestMethod.GET)
	public List<Student> getStudent()
	{
		return studentService.getStudent();
	}
	
	@RequestMapping(value="/student/{$studentId}", method = RequestMethod.PUT)
	public Student readStudent(@PathVariable (value = "studentId")int studentId, @RequestBody Student studentDetails)
	{
		return studentService.updateStudent(studentId, studentDetails);
	}
	
	@RequestMapping(value="/student/{$studentId}", method = RequestMethod.DELETE)
	public void deleteStudent (@PathVariable (value = "studentId")int studentId)
	{
		studentService.deleteStudent(studentId);
	}

}
