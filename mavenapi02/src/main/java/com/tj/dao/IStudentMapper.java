package com.tj.dao;

import java.util.List;

import com.tj.entity.*;

public interface IStudentMapper {
	Student findStudentById(int id);
	int insertStudent(Student student);
	List<Student> findAllStudents();
}
