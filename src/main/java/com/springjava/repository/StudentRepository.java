package com.springjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjava.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
