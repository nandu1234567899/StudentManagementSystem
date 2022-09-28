package com.springjava.services;

import java.util.List;

import com.springjava.models.Student;

public interface StudentService {

	boolean addStudentDetails(Student addStudent);

	boolean updateStudentDetails(Student updatedStudent);

	List<Student> getStudentDetails(int studentid);

}
