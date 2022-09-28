package com.springjava.dao;

import java.util.List;

import com.springjava.models.Student;

public interface StudentDAO {

	boolean addStudentInDB(Student addStudent);

	boolean updateStudentInDB(Student updatedStudent);

	List<Student> getStudentDetails(int studentid);

}
