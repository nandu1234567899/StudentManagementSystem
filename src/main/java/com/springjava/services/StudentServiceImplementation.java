package com.springjava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springjava.dao.StudentDAO;
import com.springjava.models.Student;


@Component
public class StudentServiceImplementation implements StudentService {

	
	private StudentDAO studentDAO;
	

	@Autowired
	public StudentServiceImplementation(StudentDAO studentDAO) {
		super();
		this.studentDAO = studentDAO;
	}



	@Override
	public boolean addStudentDetails(Student addStudent) {
		// TODO Auto-generated method stub
		return studentDAO.addStudentInDB(addStudent);
	}



	@Override
	public boolean updateStudentDetails(Student updatedStudent) {
		// TODO Auto-generated method stub
		return studentDAO.updateStudentInDB(updatedStudent);
	}



	@Override
	public List<Student> getStudentDetails(int studentid) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentDetails(studentid);
	}

}
