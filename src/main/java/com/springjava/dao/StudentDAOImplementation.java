package com.springjava.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjava.models.Student;


@Component
public class StudentDAOImplementation implements StudentDAO {

	
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public StudentDAOImplementation(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}



	@Override
	public boolean addStudentInDB(Student addStudent) {
		// TODO Auto-generated method stub
		System.out.println("Add Student details in DAO");
		boolean updated = false;
		String sql = "insert into student_table(studentname,studentid,year,mobileno,email,stream) "
				+ "values" + "(?,?,?,?,?,?)";
		Object params[] = {addStudent.getStudentname(), addStudent.getStudentid(), addStudent.getYear(), 
				addStudent.getMobileno(), addStudent.getEmail(), addStudent.getStream()};
		int ra = jdbcTemplate.update(sql,params);
		if(ra>0)
		{
			updated = true;
		}
		return updated;
	}



	@Override
	public boolean updateStudentInDB(Student updatedStudent) {
		// TODO Auto-generated method stub
		System.out.println("Update Student details in DAO");
		boolean updated = false;
		String sql = "update student_table set studentname=? year=? mobileno=? email=? stream=? where studentid=?";
		Object params[] = {updatedStudent.getStudentname(), updatedStudent.getYear(), updatedStudent.getMobileno()
				,updatedStudent.getEmail(), updatedStudent.getStream(), updatedStudent.getStudentid()};
		int ra = jdbcTemplate.update(sql,params);
		if(ra>0)
		{
			updated = true;
		}
		
		return updated;
	}



	@Override
	public List<Student> getStudentDetails(int studentid) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		String sql = "select studentname, studentid, year, mobileno, email, stream from student_table where stduentid= ?";
		Object params[] = {studentid};
		BeanPropertyRowMapper<Student> bprm = 
				new BeanPropertyRowMapper<Student>(Student.class);
		
		try {
			students = jdbcTemplate.query(sql, params, bprm);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("No Student found");
		}
		
		return students;
	}

	
	
	
	
}
