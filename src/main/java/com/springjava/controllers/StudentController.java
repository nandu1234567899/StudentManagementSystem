package com.springjava.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springjava.models.Student;
import com.springjava.services.StudentService;


@RestController
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping("/addStudent")
	boolean addStudentDetails(@RequestBody Student addStudent)
	{
		System.out.println("Input got is " + addStudent);
		return false;
	}
	
	
	@PutMapping("/updateStudent")
	boolean updateStudentDetails(@RequestBody Student updatedStudent)
	{
		System.out.println("Input got is " + updatedStudent);
		return false;
	}
	
	
	
	@GetMapping("/getStudentDetail")
	List<Student> getStudentDetails(@RequestParam int StudentId)
	{
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Pranav",1,1998,987456321,"pranav@gmail.com","civil"));
		System.out.println("Input got is " + StudentId);
		return students;
		
	}
}
