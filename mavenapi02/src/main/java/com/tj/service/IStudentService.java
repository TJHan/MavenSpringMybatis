package com.tj.service;

import java.util.List;

import com.tj.entity.Student;

public interface IStudentService {
	void addStudent(Student student);
	
	Student getStudentById(int id);
	
	List<Student> getAllStudent();
}
