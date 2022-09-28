package com.springjava.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	private String studentname;
	
	@Id
	private int studentid;
	private int year;
	private int mobileno;
	private String email;
	private String stream;
	
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMobileno() {
		return mobileno;
	}
	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	
	
	public Student(String studentname, int studentid, int year, int mobileno, String email, String stream) {
		super();
		this.studentname = studentname;
		this.studentid = studentid;
		this.year = year;
		this.mobileno = mobileno;
		this.email = email;
		this.stream = stream;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}